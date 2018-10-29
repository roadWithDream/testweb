package designpattern.interfaceisolation;

public class PettyGirl implements IGoodBodyGirl, IGreatTemperamentGirl {
	private String name;

	public PettyGirl(String _name) {
		this.name = _name;
	}
	public void goodLooking() {
		// TODO Auto-generated method stub
		System.out.println(this.name + "---������Ư��!");
	}

	public void niceFigure() {
		// TODO Auto-generated method stub
		System.out.println(this.name + "---��ķǳ���!");
	}

	public void greatTemperament() {
		// TODO Auto-generated method stub
		System.out.println(this.name + "---���ʷǳ���!");	
	}

}
