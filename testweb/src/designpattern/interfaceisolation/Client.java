package designpattern.interfaceisolation;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义一个美女
		IGreatTemperamentGirl yanYan = new PettyGirl("嫣嫣");
		AbstractSearcher searcher = new Searcher(yanYan);
		searcher.show();
	}

}
