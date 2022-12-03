package Apartment3;


class Animal {
	
	int a; //animal class constructor -Animal
	
		
	public Animal(int i) {
		System.out.println("I am animal constrcutor-parameter");
	}
	
	public void M1() {
		System.out.println("I am from Animal class");
	}
	
	public static void main(String[] args) {
		
	}
}

//Child class -Cat
//Paent Class -Animal
public class Cat extends Animal {

	int b; //cat class constructor -Cat constructor 
	
	//we create object of class whose method we have to call 
	public static void main(String[] args) {
		Cat obj=new Cat();
		obj.M1(); //inheritance --obtaining data member and method from one class to another
		Animal obj1=new Animal(1);
		System.out.println("obj.a" + obj.a); //0 //0 
		
		

	}
	// if you want to call same class constructor --this
	//if you want to call parent class cosntrcutor --super
	
	//this is should be first statement 
	public Cat() { //constructor without parameter
		this(1);
		System.out.println("I am child class constructor");
		//can i call parent and child class constructor within one constructor 
		//parent -->super
		//same class --this
		
		//this is to be written first line
		//super has to be written first line 
		
	}
	
	public Cat(int i) { //constructor with parameter
		super(1);
		System.out.println("I am child class constrcutor with parameer");
	}
	
	public void M2() {
		System.out.println("I am from child class");
	}

}
