package Apartment1;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class System_Class {
	
	//a is variable and representing int which primitive 
	int a; //instance variable
	static int b; //static variable 
	static Car out1; //out is static variable and representing Car class
	static PrintStream out;

	public static void main(String[] args) {

		System_Class.out1=new Car();
		System_Class.out1.CarType();
		
		System.out.println("I am print method with new line ");
		System.out.print("i am print method without new line");
		System.out.println("Testing");
		System.out.print(45);
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<=i;j++) {
			System.out.print("* ");
			}
			System.out.println();
			
		}
		
		System.out.println("Take the number from console");
		Scanner obj=new Scanner(System.in);
	     float p=obj.nextFloat();
		System.out.println("value of p" + p);
		
		// * 
		// * * 
		// * * *
		

	}
}
	

