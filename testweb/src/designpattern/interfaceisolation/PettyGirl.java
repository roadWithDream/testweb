package designpattern.interfaceisolation;

public class PettyGirl implements IGoodBodyGirl, IGreatTemperamentGirl {
	private String name;

	public PettyGirl(String _name) {
		this.name = _name;
	}
	public void goodLooking() {
		// TODO Auto-generated method stub
		System.out.println(this.name + "---脸蛋很漂亮!");
	}

	public void niceFigure() {
		// TODO Auto-generated method stub
		System.out.println(this.name + "---身材非常棒!");
	}

	public void greatTemperament() {
		// TODO Auto-generated method stub
		System.out.println(this.name + "---气质非常好!");	
	}

}
