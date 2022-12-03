package com.abc.newpackage;

public class Method_Type {
	
	public int a;
	private static int b=50;

	
	Method_Type(){
		
	}
	public static void main(String[] args) {
		int c; 

		//to call static method --> Classname.variablename
		System.out.println(Method_Type.b);  
		
		//to call the instance variable -->object
		Method_Type abc=new Method_Type();
		System.out.println(abc.a); //objectname.variable
		Method_Type.m1(); //method calling
		abc.M3();//objectname.methodname
	}
	
	//main --caller method
	//m1 and m2 --calling method 
	
	//Method name -M1
	//return type -void 
	//non-access -static 
	//access- public
	public static void m1() {
		System.out.println("I am in M1");
		System.out.println("this is only for test");
		System.out.println("this is only for test-1");
		System.out.println("this is only for test-2");
		System.out.println("this is only for test-3");
		
	}

	private void M2() {
		System.out.println("I am in M2");
	}
	
	private void M3() {
		System.out.println("I am in M3");
	}
}
