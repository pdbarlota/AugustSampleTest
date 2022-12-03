package Apartment2;

import Apartment1.BreakStatement; //package.classname
import Apartment3.*;


class Mobile {
	
	
	private void calling() {
		
	}
	
	public void OperatingSystem() {
		System.out.println("Mobile Operating System");
	}
	
	public final void Message() {
		System.out.println("Mobile Messaging");
	}
	
	public static void camera() {
		System.out.println("Normal camera");
	}
}

public class Apple extends Mobile {

	public static void main(String[] args) {
		BreakStatement obj11=new BreakStatement();
		Flat1 test=new Flat1();
		Flat2 t=new Flat2();
		Mobile obj=new Mobile();
		obj.OperatingSystem();
		obj.camera();
		
		Apple appleobj=new Apple();
		appleobj.OperatingSystem();
		appleobj.camera();
		
		Apartment3.iphone t1=new Apartment3.iphone();
		GrandSon te=new GrandSon();
		//ICICI
		Method_Stack g=new Method_Stack();
		
		Mobile obj1=new Apple();
		obj1.OperatingSystem();
		obj1=new Mobile();
		obj1.OperatingSystem();
		obj1.Message();
		obj1.camera(); 
		//To call static method whether object is important
		//Apple is object
		//reference -Mobile

	}
	
	public void OperatingSystem() {
		System.out.println("Apple Operating System");
	}
		
	private int Calling() {
		return 1;
	}
	
	public static void camera() {
		System.out.println("Apple camera");
	}

	

	}
