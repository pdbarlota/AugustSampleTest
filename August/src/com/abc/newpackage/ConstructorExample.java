package com.abc.newpackage;

public class ConstructorExample {
	
	int a;
	int b;
	
	//Whether method name is same as classname--> Yes
	//whether it has return type--void---Yes
	public ConstructorExample() {
		System.out.println("I am in constructor");
		a=5;
		//b=10;
		//allocate memory and initilize 
	}
	
	//constructor is similar to method but it is not a method
	//constructor name is always same as classname
	//Constructor doesn't have a return type
	

	
	
	public static void main(String[] args) {
		//new -It will create object 
		//JVM will check whether constructor is in program
		//If constructor is present then execute that constructor
		ConstructorExample obj=new ConstructorExample();
		Method_Type test=new Method_Type();
		//Classname objectname=new Constructor();
		System.out.println(obj.a);
		System.out.println(obj.b);
		

	}

}
