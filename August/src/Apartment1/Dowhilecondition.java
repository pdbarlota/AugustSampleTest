package Apartment1;

public class Dowhilecondition {

	public static void main(String[] args) {
		int a = 5;
		
		//it will first check condition if it is true then only
		//it will execute statement 
		while (a > 10) { 
			System.out.println("value of a is " + a);
			a--;
		}
		System.out.println("i am outside of while loop");
		
		//it will execute the statement first then check for condition 
		do {
			System.out.println("I am inside the do loop" +a);
		}while(a>10);
		
		System.out.println("I am outside do while loop");
		
		
	}

}
