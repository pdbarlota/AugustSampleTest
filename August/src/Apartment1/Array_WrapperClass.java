package Apartment1;

public class Array_WrapperClass {

	public static void main(String[] args) {
	
		int [] a =new int[10];
		
		Array_WrapperClass obj=new Array_WrapperClass();
		
		Car [] p=new Car[2];
		
		Car obj1=new Car();
		Car obj2=new Car();
		
		p[0]=obj1;
		p[1]=obj2;
		
		//primitive data type
		int b=1;
		int c=2;
		int d=3;
		int [] e=new int[3];//Integer
		e[0]=1;//e[0]=new Integer(1)
		e[1]=2;
		
		
		Integer t=new Integer(10);
		e[2]=t;
		//Array is homogenous data 
		Car car1=new Car();
		Car car2=new Car();
		Car car3=new Car();
		
		//Non-primitive
		Car [] car4=new Car[3];
		car4[0]=new Car();
		car4[1]=new Car();
		car4[2]=new Car();
		
		//Automatic conversion of primitive data type into non primitive -Autoboxing
		
		
	}

}
