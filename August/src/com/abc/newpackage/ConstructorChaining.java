package com.abc.newpackage;

import inheritance.Animal;

public class ConstructorChaining {
	
	int money;
	int age;
	
	//No Parameter constructor
	public ConstructorChaining() {
		this(3); //calling another constructor
		System.out.println("I am in no parameter constructor");
		//calling one constructor from another
	}
	
	//Parameterized constructor -Single PArameter
	private ConstructorChaining(int a) {
		this(a,30);
		money=a;
		System.out.println("Parameterized constructor -Single PArameter");
	}
	
	//Parameterized constructor -two PArameter
	protected ConstructorChaining(int a,int b) {
		this(23.4,5);
		money=a;
		age=b;
		System.out.println("Parameterized constructor -two PArameter");
		
	}
	
	/*private void ConstructorChaining(int a) {
		money=a;
	}*/

	//Parameterized constructor -two PArameter
	protected ConstructorChaining(double a,int b) {
		age=b;
		System.out.println("Parameterized constructor -two PArameter with double");
	}
	public static void main(String[] args) {
	
		ConstructorChaining obj=new ConstructorChaining();
		System.out.println(obj.money);
		ConstructorChaining obj1=new ConstructorChaining(34);
		System.out.println(obj.money);
	
		//ConstructorChaining obj1=new ConstructorChaining(5);
		
		//Constructor chaining-Calling one constructor from another constructor

	}

}
