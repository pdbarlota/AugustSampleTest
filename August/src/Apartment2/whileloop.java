package Apartment2;

public class whileloop {

	public static void main(String[] args) {
	
		//while(condition){
			//statement 
	     //}
		int i=0;
		boolean flag=false;
		 //1
		while(flag) {
			System.out.println("I am in while loop");
			i=whileloop.add(i);
			if(i>10) //1>10
				flag=false;
			System.out.println("I am print statement");
		
		}
		 
		System.out.println("I am outside");
		
		
	}

	
	public static int add(int a) {
		return a+1;
	}
}
