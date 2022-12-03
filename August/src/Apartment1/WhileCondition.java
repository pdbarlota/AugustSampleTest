package Apartment1;

public class WhileCondition {

	public static void main(String[] args) {
		WhileCondition test=new WhileCondition();
		int var =110;
		
		while(var<=100) { //110<100
			
			System.out.println("I am in while loop " +var);//90
			var=test.add(var); //110
		}
	
		
		//syntax of while - You don't have initilization/increment like for loop
		//it will have only condition part
		/*
		 * While(condition) { 
		 * 
		 * //if condition is true then run the loop else go out of it
		 * }
		 */
		
		
		
	}

	public int add(int a) {
		this.add(3); //it will represent whilecondition class object
		return a+20; //30 50
	}

}
