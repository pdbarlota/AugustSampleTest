package Interface_example;

import java.util.Scanner;

public class Exception_Example {

	public static void main(String[] args) {
			
		Exception_Example obj=new Exception_Example();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int firstnumber=sc.nextInt();
		System.out.println("Enter second number number");
		int secondnumber=sc.nextInt();
		System.out.println("Enter third number number");
		int thirdnumber=sc.nextInt();
		int division=0;
		try {
		//Exception_Example obj=new Exception_Example();
		int output=obj.Substraction(firstnumber, secondnumber);
		
		System.out.println("Substraction vaalue " + output);
		division=obj.division(thirdnumber,output);
		} catch (ArithmeticException e) {
			
		}
		
		System.out.println("Divison vaalue " + division);
		
	
	} 
	
	public int Substraction(int a, int b) {
		return a-b;
	}
	
	public int division (int a, int b) {
		
		return a/b;
	}
}