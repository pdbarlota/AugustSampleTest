package Apartment1;


interface one {
	
	//abstract method
	void mymethod();
	//default method
	default void myimplementationmethod() {
		System.out.println("Interface one default method");
	}
	//static method 
	static void mystaticmetod() {
		System.out.println("Interface one static method ");
	}
}

interface two {
	
	//abstract method
	void mymethod();
	//default method
	default void myimplementationmethod() {
		System.out.println("Interface two default method");
	}
	//static method 
	static void mystaticmetod() { //method hiding 
		System.out.println("Interface two static method ");
	}
}




public class InterfaceStatic implements one,two{

	public static void main(String[] args) {
		InterfaceStatic obj=new InterfaceStatic();
		obj.mymethod();
		obj.myimplementationmethod();
		
		//interface static method cannot be called by class object
		//interface static method cannot be called by class name
		one.mystaticmetod(); //static method of interface can be called by interface name only

	}

	@Override
	public void mymethod() {
		System.out.println("My method from class");
		
	}
	
	@Override
	public void myimplementationmethod() {
		// TODO Auto-generated method stub
		one.super.myimplementationmethod();
	}

	public static void testing() {
		
	}

}
