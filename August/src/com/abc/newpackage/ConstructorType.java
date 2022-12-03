package com.abc.newpackage;

import Apartment1.WhileCondition;

public class ConstructorType {
	
	int a;
	int b;

	//No parameter constructor- it is similar to default constructor
	public ConstructorType() {
		System.out.println("I am in constructor");
		a=5;
		b=10;
	}
	
	//Parameterized constructor
	public ConstructorType(int c,int d) {
		System.out.println("I am in parameterized constructor");
		a=c;
		b=d;
	}
	
	public static void main(String[] args) {
		//No-parameterized constructor
		WhileCondition t=new WhileCondition();
		t.add(4);
		ConstructorType obj=new ConstructorType();
		//new will create object
		//constructor will get called --> java will add default constructor
		System.out.println(obj.a);
		System.out.println(obj.b);
		obj.M1();
		//No-parameterized constructor
		ConstructorType obj1=new ConstructorType();
		//new will create object
		//constructor will get called --> java will add default constructor
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		//parameterized constructor
		ConstructorType obj2=new ConstructorType(50, 50);
		System.out.println(obj2.a);
		System.out.println(obj2.b);
		
		ConstructorType obj3=new ConstructorType(250, 150);
		System.out.println(obj3.a);
		System.out.println(obj3.b);

	}

	public void M1() {
		System.out.println("I am in m1");
	}
}
