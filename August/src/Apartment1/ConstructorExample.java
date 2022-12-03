package Apartment1;

public class ConstructorExample {

	public static void main(String[] args) {
		
		ConstructorExample obj=new ConstructorExample(1,2);
		ConstructorExample obj1=new ConstructorExample();

	}
	
	public void ConstructorExample() {
		System.out.println("I am in constructor");
	}
	
	//if you class is having constructor then java will add 
	public ConstructorExample(int a,int b) {
		System.out.println("I am another constructor");
	}
	
	public ConstructorExample() {
		System.out.println("No parameter");
	}

}
