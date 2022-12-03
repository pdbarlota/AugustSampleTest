package com.abc.newpackage;

public class Switch_condition {

	public static void main(String[] args) {
		
		int b=56;	//declaration and initilization
		//56%2=0
		switch(b%2) { //we cannot use relational operator in switch condition
				
		case 0 : //10==0
			System.out.println("I am even number");
		
		default :
			System.out.println("number is neither odd or even");
		
		case 1 : //11==0
			System.out.println("I am odd number");
			
		
		}
		
		
	}

}
