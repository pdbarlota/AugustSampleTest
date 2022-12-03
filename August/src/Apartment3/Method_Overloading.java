package Apartment3;

public class Method_Overloading {

	public static void main(String[] args) {
		
		Method_Overloading obj=new Method_Overloading();
		obj.add();
		obj.add(1);

	}

	//method olv
	//method name is same but different signature
	//within the class 
	
	public void add() {
		System.out.println("add method without parameter");
	}
	
	public void add(int a) {
		System.out.println("add with single parameter");
	}
	
	public int add(int a,int b) {
		return a+b;
	}
}
