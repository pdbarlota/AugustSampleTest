package Apartment1;

public class MultipleIFElseStatement {
	

	// If a person get mark above 90 --- A++
	//If person get mark above 70 and below or equal 90 --- A+
	//If person get mark above 60 and below/equal 70 --- A
	//If person get mark above 50 and below/equal 60--B
	//If person gt mark below 50 --C 
	// else person failed ---fail

	public static void main(String[] args) {
		int marks=91;
		
		
		// If a person get mark above 90 --- A++   
		//condition --marks>90
		//if condition is true ---print A++
		if(marks>90) {  //90>90
			System.out.println("Congratulations Your grade is A++");
			//this is called  Nested if condition --as this is if is in another if condition
			if(marks>95) { //91>95
				System.out.println("Sponsorship is approved");
			} else if (marks<95) {
				System.out.println("Sorry your sponsorship is not approved");
			}
		} 
		//If person get mark above 70 and below or equal 90 --- A+
		//condition marks>70 and marks<=90
		else if(marks>70 && marks<=90 ) { //90>70 && 90<=90
			System.out.println("Congratulations Your grade is A+");
		} 
		//If person get mark above 60 and below/equal 70
		//condition marks>60 and marks<=70  
		else if(marks>60 && marks<=70 ) { //90>60 && 90<=70
			System.out.println("Congratulations Your grade is A");
		} 
		//If person get mark above 50 and below/equal 60--B
		//condition marks>50 and marks<=60  
		else if(marks>50 && marks<=60 ) { //90>50 && 90<=60
			System.out.println("Congratulations Your grade is B");
		}
		//If person get mark below 50 --C
		//condition marks<50
		else if(marks<50 && marks>0 ) {  //90<50
			System.out.println("Congratulations Your grade is C");
		} else {
			System.out.println("Hard Luck---No worries better luck next time");
		}
		
	
		
		
		
	}


}
