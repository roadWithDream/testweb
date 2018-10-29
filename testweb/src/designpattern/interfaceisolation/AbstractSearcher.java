package designpattern.interfaceisolation;

public abstract class AbstractSearcher {
	protected IGoodBodyGirl iGoodBodyGirl;
	protected IGreatTemperamentGirl iGreatTemperamentGirl;
	
	public AbstractSearcher(IGoodBodyGirl iGoodBodyGirl){
	this.iGoodBodyGirl = iGoodBodyGirl;
	}
	
	public AbstractSearcher(IGreatTemperamentGirl iGreatTemperamentGirl){
		this.iGreatTemperamentGirl = iGreatTemperamentGirl;
		}
	//������Ů���г���Ů��Ϣ
	public abstract void show();
}
