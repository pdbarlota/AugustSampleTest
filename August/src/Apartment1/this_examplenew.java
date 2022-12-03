package Apartment1;

public class this_examplenew {
	
	int a;
	int b;
	int k;

	//he will default constructor 
	//this is current instance of class ---> current object
	public static void main(String[] args) {
		this_examplenew obj=new this_examplenew();
		obj.getpercentage(30); //this will represent obj
		this_examplenew obj1=new this_examplenew();
		obj1.getpercentage(20); //this will repreent obj1
		this_examplenew obj2=new this_examplenew();
		obj2.getpercentage(44);//this will represent obj2

	}
	
	
	public void getpercentage(int k) {
		int l=calculatepercentage(k); //this.calculatepercentage(k);
		System.out.println("percentage is " +l);
	}
	
	
	public int calculatepercentage(int p) {
		return p*2;
	}
	
	public void assignvalue(int a,int b,int c) {
		//we have two local variable with name a and b
		//we have two instance variable witn name a and b
		
		//writing this is mandatory if name of instance variable and local variable is same
		//you have to write this to 
		this.a=a;
		this.b=b;
		k=c;//this.k=c;
	}

}
