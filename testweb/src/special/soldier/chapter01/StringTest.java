package special.soldier.chapter01;

/**
 * hashCodeֻ��˵�Ǳ�ʶ������Hash�㷨�п��Խ����������ɢ���������ڲ������ݵ�ʱ�򣬾Ϳ��Ը������key������С���ݵķ�Χ
 * ��Hash�㷨�ж�λ��������������Ҫ��һ��ѭ��������ͨ��equals()�����Ա�keyֵ�Ƿ�һ����
 * ���仰˵��һ����Ϊ���㷨���ٶ�λ���ݴ��ڵģ�һ����Ϊ�˶Ա���ʵֵ���ڵġ�
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
	 * ����ʱ�Ż���String a = "a" + "b" + 1 ���ڱ���ʱ�ڣ�����ΪString a = "ab1"��
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
		/*b = a + "b" ��ʱa���ǳ�������Ȼa��һ���ֲ���������ָ��һ��������������Ӧ���ϲ�δǿ��Լ���ǲ��ܱ�ģ�����Ч�����£�
		StringBuilder temp = new StringBuilder();
		temp.append(a).append("b");
		String b = temp.toString();
		*/
		println(b == compare); //false
		//d = c + "b" c��һ��final���η����Ӷ�����ǿ��Լ����c�ǲ�����ı�ģ��ȼ���һ��������
		println(d == compare); //true
		//e = getA() + "b"  ��Ȼ�������淵�ص���һ�����������Ǳ������ڱ����ʱ�򲻻�ȥ���������淵�ص���ʲô��
		println(e == compare); //false
	}
	
	public static void test3() {
		String a = "a";
		String b = a + "b";
		String c = "ab";
		String d = new String(b);
		println(b == c);//false
		println(c == d);//false
		/*������intern������ʱ��JVM���������������ͨ��equals()���������Ƿ���ڵ�ֵ��String���������
		 * �򷵻س����������String����ĵ�ַ������Ҳ����򴴽���ֵ���ַ������ٷ�������´����ռ�ĵ�ַ
		*/
		println(c == d.intern());//true
		println(b.intern() == d.intern());//true
	}
	
	/**
	 * �ô���������ڲ���JDK1.7
	 * ���ﵥ����e��f������ԭ���ǲ����ǰ��ĳ����Ѿ����ɵĳ������໥Ӱ��
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
