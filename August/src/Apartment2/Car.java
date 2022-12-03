package Apartment2;


interface fourwheeler{
	
	void fourwheel(); //public abstract void fourwheel
	void speed();
	public  default void m1() {
		System.out.println("m1");
	}
	
	public default void m4() {
		
	}
}


interface Motor{
	
	void engine();
	void speed();

	public default void m5() {
		
	}
	
	public default void m4() {
		
	}
}

public class Car implements fourwheeler,Motor {

	public static void main(String[] args) {
		Car obj=new Car();
		obj.fourwheel();
		obj.engine();
		obj.speed();
		obj.m1();
		obj.m5();
		obj.m4();

	}
	
	public void fourwheel() {
		System.out.println("If any vehicle having four wheeler can be called as car");
	}

	public void engine() {
		System.out.println("engine");
	}
	
	public void speed() {
		System.out.println("speed");
		
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		fourwheeler.super.m4();
		
	
	}

	

	
	
	
	
}
