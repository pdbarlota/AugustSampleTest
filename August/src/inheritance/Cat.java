package inheritance;

//Child class 
//1. to create parent child relation we use extends keywords
// Class A and B 
// public class A extends B
public class Cat extends Animal {
	
	int colour;
	
	public Cat() { //child class constructor will 
		//automatically call parent class constructor
		super(1); //it will call parent class single parameter constructor
		//super()
		System.out.println("I am from cat class");
	}

	// Cat class is not having any method apart from main
	public static void main(String[] args) {
		
		Cat catobject=new Cat();
		catobject.Eat(); //parent class method by using child class object
		catobject.sound();//child class method call by using child class object
		//catobject.weight=45;
		System.out.println("Weight of the cat " + catobject.weight); //child class can access data member of parent class
		Animal animalobject=new Animal();
		animalobject.Eat();//parent class not have access to child class method
		System.out.println(animalobject.weight);

		// we have two data member -weight , colour 
	}
	
	//This is method from child class 
	public void sound() {
		System.out.println("Sound of cat");
	}
	
	//Two method - one method from its own class --> Sound
	//Another method from parent class--Eat();

}
