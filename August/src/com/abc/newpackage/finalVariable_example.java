package com.abc.newpackage;

public class finalVariable_example {
	
	final double pi=3.14; //instance variable 
	//whenever you want to treat a variable as constant
	//we use final as keyword to treat variable as constant 
	
	final int a=30; //initilize final variable at the time of declaration 
	//if you make a variable as constant so even it is global variable it is mandatory initilize 

	final int c; //declaration at line number 12
	
	public finalVariable_example(int p) {
		c=p; //initilization within constructor 
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		finalVariable_example obj=new finalVariable_example(56);
		System.out.println(obj.pi); //3.14
		System.out.println("Area of circle"+obj.AreaofCircle(2));
		//obj.pi=33.4;
		System.out.println("Area of circle"+obj.AreaofCircle(2));
		System.out.println(obj.pi);

	}
	
	//No constructor -default 
	//Object -1
	
	public double AreaofCircle(int r) { //local variable  r
		
		return (pi*r*r); //3.14*2*2 //33.4*2*2
		
	}

}
