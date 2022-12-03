package Apartment2;

abstract class GrandPa{
	int a;
	
	public GrandPa() {
		
	}
	private void purchaseLand() { //unreachable
		System.out.println("Land is purchase for complex");
	}
	
	public abstract int BuildComplex(); 
	public abstract int CollectMoney(); 
	
}

abstract class Parent extends GrandPa{
	
	public int CollectMoney() {
		return 10000000;
	}
	
}


public class GrandSon extends Parent {

	public static void main(String[] args) {
		GrandPa obj=new GrandSon();
		obj.BuildComplex();

	}

	
	public int BuildComplex() {
		// TODO Auto-generated method stub
		return 0;
	}

}
