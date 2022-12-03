package com.abc.newpackage;

public class WithoutLoop {

	public static void main(String[] args) {
		//int b=51; declaration+initilization
	/*	for(int i=51;i<=100;i++){
			if(i%2==0) {
				System.out.println("Number is even "+i);
			}

		}*/
		
		//Note 1 - Variable declaration can be possile outside of for loop
			//but initilization has to be inside the for loop
		/*
		int a=1;//declaration 
		for (a;a<10;a++) {
			
		}*/
		
		//Note 2 :- Writing initilization,condition and increment is not mandatory
		
		/*for(;;) {
			System.out.println("I am in for loop");
		}*/
		
		//Note 3- use the char instead of interger value
		
		/*for (int a='A';a<100;a++) {
			System.out.println("value of a is " + a);
		}*/
	
		//Note 4- you can increment value by any numer
		/*for (int a=1;a<100;a=a+5) {
			System.out.println("value of a is " + a);
		}*/
		
		//iteration 1 a=1  a<100 it will print the value
			//a=6
		//interation 6<100 it will print the value 
			//a=11
		
		//Note 5: prefix and postfix doesn't play role
		/*for (int a=1;a<5; a++) {
			System.out.println("value of a is " + a);
		}*/
		//iteration 1- initilization 
					//condition
					//for loop execution
					//increment/decrement
	
		//iteration 2 - //condition
						//for loop execute
		               //increment
	
		/*for(int a=10;a>0;a--) {
			System.out.println("value of a is "+ a );
		}*/
		
		for (char a='A';a<100;a++) {
			System.out.println("Increment in for loop "+ a);
				
		}
	}

}
