package Apartment1;

public class Constructor_Method {
	int a;
	int b;

	public static void main(String[] args) {
		//constructor will get called automatically when object is created
		Constructor_Method obj=new Constructor_Method();
			System.out.println(obj.a);
			System.out.println(obj.b);
			
		Constructor_Method obj1=new Constructor_Method();
		Constructor_Method obj2=new Constructor_Method();
	}
	
	public Constructor_Method() {
		
	}

	//Method name -> should be class name Constructor_Method
	// it should have return type
	
	/*public Constructor_Method() {
		System.out.println("I am in constructor");
		a=5;
		b=10;
	}*/
	
	public void Constructor_Method() {
		System.out.println("I am in constructor");
	}
}
