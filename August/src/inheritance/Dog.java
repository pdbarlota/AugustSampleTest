package inheritance;


class Animal_New{
	
	
	public void eat() {
		System.out.println("I am eat method");
	}
	public Animal_New() {
		System.out.println("I am parent class constructor");
	}
}


public class Dog extends Animal_New {

	//instance method -we need object to call instance method
	public void walk() {
		this.eat();
		this.Bark();
		System.out.println("I am walk method");
	}
	
	public void Bark() {
		System.out.println("I am bark method");
	}
	
	public void eat() {
		System.out.println("I am eat method from dog class");
	}
	
	public static void main(String[] args) {
		Dog tipu=new Dog();// default constructor - parent class constructor
		tipu.walk();
	}
	
}
