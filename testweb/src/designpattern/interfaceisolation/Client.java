package designpattern.interfaceisolation;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ����Ů
		IGreatTemperamentGirl yanYan = new PettyGirl("����");
		AbstractSearcher searcher = new Searcher(yanYan);
		searcher.show();
	}

}
