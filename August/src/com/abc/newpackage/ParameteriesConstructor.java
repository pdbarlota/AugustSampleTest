package com.abc.newpackage;

public class ParameteriesConstructor {

	
	int c;
	int d;
	int e;
	
	public ParameteriesConstructor(int a,int b) {
		c=a;
		d=b;
		e=a;
	}
	
	//When you call one constructor from another constructor --Constructor Chaining
	
	//if you class is having parameterized constructor only ,
	//can we create object with no parameterized constructor
	public static void main(String[] args) {
	
		ParameteriesConstructor obj1=new ParameteriesConstructor(67,5);
		System.out.println(obj1.e);
		ParameteriesConstructor obj2=new ParameteriesConstructor(167,555);
		System.out.println(obj2.e);
		System.out.println(obj1.e);
	}

}
