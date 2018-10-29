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
	//搜索美女，列出美女信息
	public abstract void show();
}
