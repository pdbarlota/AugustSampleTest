package Apartment3;


class Car {

	public static void Fourwheeler() {
	
		System.out.println("car class fourwheeler");
	}

	public int speedlimit() {
		System.out.println("Speed limit of car is 100");
		return 100;
	}
}

public class Tata extends Car{
	
	public static void main(String[] args) {
		
		Car obj=new Tata();
		obj.speedlimit();
		obj.Fourwheeler();

	}
	
	//instance method- you need object to call method
	public int speedlimit() {
		System.out.println("Tata car limit is 120");
		return 120;
	}
	
	//static method - it is class level
	public static void Fourwheeler() {
		
		System.out.println("tata class fourwheeler");
	}
}

class Maruthi extends Car{
	
}
	

