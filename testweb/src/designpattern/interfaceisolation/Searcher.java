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
		System.out.println("--------美女的信息如下：---------------");
		//展示面容
	//	super.iGoodBodyGirl.goodLooking();
		//展示身材
	//	super.iGoodBodyGirl.niceFigure();
		//展示气质
		super.iGreatTemperamentGirl.greatTemperament();
	}

}
