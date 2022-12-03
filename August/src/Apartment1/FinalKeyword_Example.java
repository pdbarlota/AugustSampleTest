package Apartment1;

public class FinalKeyword_Example {
	
	final double pi=3.14; //no one should change the value of pi variable
	//i want to treate pi variable as constant
	int b; //declaration and initilization is not mandatory 
	
	final int k=9; //if variable is final then it is mandatory to initilize it 
	
	final int p; 
	
	public FinalKeyword_Example(int a) {
			p=a;
	}

	public static void main(String[] args) {
		int a=0;
		FinalKeyword_Example obj=new FinalKeyword_Example(34);
		System.out.println(obj.p); //k=9 and p=34
		FinalKeyword_Example obj1=new FinalKeyword_Example(45);
		System.out.println(obj1.p);//k=9 p=45
		
	}

	
	//instance variable --> initilization is not mandatory 
	//local variable --> initilization is mandatory before use
	//final variable --> when you declare we have to initlise 
}
