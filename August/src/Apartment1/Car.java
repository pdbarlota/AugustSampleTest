package Apartment1;


 interface fourWheeler{
	
	void fourwheels(); //public abstract void fourwheels();
	void color();
	
	default void Tyre() {
		System.out.println("I am default method");
	}
	
	default void CarType() {
		System.out.println("i am from fourwheeler");
	}
	
	static void newmethod() {
		System.out.println("Motor static method");
	}
}
interface  motor {
	
	void speed();//public abstract void speed();
	void color();
	
	default void CarType() { //non-static method
		System.out.println("i am from motor");
	}
	
	static void newmethod() {
		System.out.println("Motor static method");
	}
}

public class Car implements fourWheeler,motor {
	
	public static void main(String[] ars) {
		Car obj=new Car();
		obj.fourwheels();
		obj.speed();
		obj.Tyre();
		obj.CarType();
		motor.newmethod();
		fourWheeler.newmethod();
	}

	@Override
	public void speed() {
		System.out.println("I am from speed");
		
	}

	@Override
	public void fourwheels() {
		System.out.println("I am from four wheeler");
		
	}

	@Override
	public void color() {
		// TODO Auto-generated method stub
		
	}
		
	@Override
	public void CarType() {
		System.out.println("car cartype");
	}
	
	static void newmethod() { //method hiding 
		System.out.println("car static method");
	}

	

}
