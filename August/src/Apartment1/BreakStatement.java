package Apartment1;

public class BreakStatement {

	public static void main(String[] args) {
	 
		for(int a=1;a<100;a++) { //interation with a=1 will end when a=100
			System.out.println("valu of a is " + a);
			if(BreakStatement.add(a)==21) {
				continue;
			}
			System.out.println("I am after if");
		}
		

	}
	
	//Iteration 1 : - intilization a=1
		//it will check condition
	  // it will execute for loop  value of a is 1 I am after if
	 // increment by 1
	
	//iteration 2 :  2<100
	//value of a is 1 	System.out.println("I am after if");

	public static int add(int p) {
		return p+10; 
	}
}
