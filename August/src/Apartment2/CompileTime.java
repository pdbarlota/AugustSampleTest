package Apartment2;

public class CompileTime {
	
	
	public void M1() {
		
	}
	
	public void M1(int i) {
		
	}

	public static void main(String[] args) {
		CompileTime obj=new CompileTime();
		obj.M1(); //method binding at compile time 
		

	}

}
