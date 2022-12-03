package com.abc.newpackage;

public class ExeptionTest {

	static ExeptionTest  e;
	
	public static void main(String[] args) {
		
		int a=10;
		
		System.out.println("message before exception");
		try{
			//e.M1();
			System.out.println(a/0);
		}  catch (Exception p) {
			System.out.println("I am in null pointer catch ");
			}
		
		finally {
			System.out.println("single finally ");
		}
			
		System.out.println("message after exception");//default exception handler
		
//Nested if else statement --> nested try catch 
	}

	public void M1() {
		
	}
}
