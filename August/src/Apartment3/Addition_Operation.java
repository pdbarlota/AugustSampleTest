package Apartment3;

public class Addition_Operation {

	public static void main(String[] args) { //caller method --main
		
		int e=Addition_Operation.add(55, 45); //int e=61
		System.out.println("value of e "+ e);
		Addition_Operation obj=new Addition_Operation();
		//obj.multiplication(d);
	}

	//method type -static 
	//Method implementaton 
	public static int add(int a ,int b) {
		System.out.println("value of a" + a);
		System.out.println("value of b" + b);
		int c=a+b;//55+6
		System.out.println("value of c"+ c);
		return c; //61
	}
	
	//if you have return type other than void then writing return is mandatory 
	//return type is nothing but data type 
	//you always has to written value as per return type otherwise compilation error
	//it is not mandatory for caller method to catch the value
	
	public void multiplication(int a) {
		System.out.println("multiplication " + (a*5));//11*5
	}
	
	//public static void add(int a ,int b); //method declaration 
}
