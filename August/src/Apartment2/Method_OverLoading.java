package Apartment2;

public class Method_OverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_OverLoading obj=new Method_OverLoading();
		obj.add(1, 4);
		obj.add(4, 4.5f);
		obj.add(4.5f, 7);
	}
	//Signature -Method Name+Paramter 
	public int add(int a ,int b) {
		System.out.println("I am in two parameter int");
		return a+b;
	}
	
	//main is method --method overloading 
	public static void main() {
		
	}
	
	//mETHOD OVERLOADING -WHEN TWO OR MORE METHODS HAVING SAME NAME BUT
	//DIFFERENT SIGNATURE 
	
	public int add(int a ,float b) {
		System.out.println("I am in two parameter int+float");
		return 1;
	}
	
	public int add(float a ,int b) {
		System.out.println("I am in two parameter float+int");
		return 1;
	}
	
	public int add(int a ,float b,int c) {
		return 1;
	}
	
	//Different signature but method name is same
	//diferent days of making different parameter 
		//A. change the data type
	    //B no of parameter 
	   // C. sequence of data type  

}
