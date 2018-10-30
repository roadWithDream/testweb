package special.soldier.chapter01;

/**
 * hashCode只能说是标识对象，在Hash算法中可以将对象相对离散开，这样在查找数据的时候，就可以根据这个key快速缩小数据的范围
 * 在Hash算法中定位到具体的链表后，需要进一步循环链表，再通过equals()方法对比key值是否一样。
 * 换句话说，一个是为了算法快速定位数据存在的，一个是为了对比真实值存在的。
 * @author lmm
 *
 */
public class StringTest {

	public static void println(Object obj) {
		System.out.println(obj);
	}
	
	public static void main(String []args) {
		test1();
		println("=============");
		test2();
		println("=============");
		test3();
		println("=============");
		testForJDK17();
	}
	/**
	 * 编译时优化，String a = "a" + "b" + 1 会在编译时期，编译为String a = "ab1"；
	 */
	private static void test1() {
		String a = "a" + "b" + 1;
		String b = "ab1";
		String c = new String("ab1");
		println(a == b);
		println(a == c);
	}
	
	private final static String getA() {return "a";}
	public static void test2() {
		String a = "a";
		final String c = "a";
		
		String b = a + "b";
		String d = c + "b";
		String e = getA() + "b";
		
		String compare = "ab";
		/*b = a + "b" 此时a不是常量，虽然a是一个局部变量并且指向一个常量，但在其应用上并未强制约束是不能变的，编译效果如下；
		StringBuilder temp = new StringBuilder();
		temp.append(a).append("b");
		String b = temp.toString();
		*/
		println(b == compare); //false
		//d = c + "b" c有一个final修饰符，从定义上强制约束了c是不允许改变的，等价于一个常量。
		println(d == compare); //true
		//e = getA() + "b"  虽然方法里面返回的是一个常量，但是编译器在编译的时候不会去看方法里面返回的是什么。
		println(e == compare); //false
	}
	
	public static void test3() {
		String a = "a";
		String b = a + "b";
		String c = "ab";
		String d = new String(b);
		println(b == c);//false
		println(c == d);//false
		/*当调用intern方法的时候，JVM会在这个常量池中通过equals()方法查找是否存在等值的String，如果存在
		 * 则返回常量池中这个String对象的地址；如果找不到则创建等值的字符串，再返回这个新创建空间的地址
		*/
		println(c == d.intern());//true
		println(b.intern() == d.intern());//true
	}
	
	/**
	 * 该代码仅仅用于测试JDK1.7
	 * 这里单独用e、f来做的原因是不想和前面的程序已经生成的常量池相互影响
	 */
	public static void testForJDK17() {
		String a = "e";
		String b = "f";
		String c = a + b;
		String d = a + b;
		System.out.println(c == c.intern());
		System.out.println(d == d.intern());
		System.out.println(c == d.intern());
		System.out.println(System.identityHashCode(c));
		System.out.println(System.identityHashCode(d));
		System.out.println(System.identityHashCode(c.intern()));
		System.out.println(System.identityHashCode(d.intern()));
		System.out.println(System.identityHashCode("ef"));
	}
}
