package inheritance;

//Parent Class 
public class Animal {
	
	int weight ;

	
	public Animal() {
		System.out.println("I am from Animal class");
	}
	
	public Animal (int a) {
		System.out.println("Parent single parameter");
	}
	
	public void Eat() {
		System.out.println("I am from parent class--Eat method");
	}
	
	//I have only one method -Eats
}
