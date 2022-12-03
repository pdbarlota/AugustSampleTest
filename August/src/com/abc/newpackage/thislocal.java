package com.abc.newpackage;

public class thislocal {
	
	int a;
	int b;
	
	//one person ram 

	public static void main(String[] args) {
		thislocal obj=new thislocal(20,100);	//instance variable 
		finalVariable_example test=new finalVariable_example(34);
		test.AreaofCircle(3);

	}
	
	//within the class -4 variable
	//instance -2 instance
	//two local 
	public thislocal(int percentage,int age) { //percentage=20 age=100
		a=percentage;
		b=age;
	}
	
	
	
	

}
