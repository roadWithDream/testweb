package designpattern.interfaceisolation;

public class Searcher extends AbstractSearcher {

	public Searcher(IGoodBodyGirl goodBodyGirl) {
		super(goodBodyGirl);
		// TODO Auto-generated constructor stub
	}
	public Searcher(IGreatTemperamentGirl greatTemperamentGirl) {
		super(greatTemperamentGirl);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("--------��Ů����Ϣ���£�---------------");
		//չʾ����
	//	super.iGoodBodyGirl.goodLooking();
		//չʾ���
	//	super.iGoodBodyGirl.niceFigure();
		//չʾ����
		super.iGreatTemperamentGirl.greatTemperament();
	}

}
