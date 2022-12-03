package overriding;

//Method Overloading -
//1. within the class
//2. method name is same but signature is different
//3. Access modifier doesn't play any role 
//4. Return type also doesn't play any role 
class Animal{
	
	public void walk() {
		System.out.println("I am walk method of Animal");
	}
	
	
	
	protected void Sound() {
		System.out.println("Sound of animal");
	}
	
	public void Sound(int i) {
		System.out.println("Sound is something different");
	}
	
}
//Method Overriding -
//1. within parent child relation
//2. Signature should be same as parent class method
//3. Access modifier play very important role in overriding
public class Cat extends Animal{

	//Sound method with no parameter is override 
	protected void Sound() {
		System.out.println("I am cat class sound");
	}
	
	//this is not overrided method 
	public void Sound(double p) {
		System.out.println("cat class specific method");
	}
	
	//we should have parent 
	//method signature should same 
	//access modifier -either it should same or it should more accessible
	
	//private-->default-->protected-->public
	 public void walk() {
		System.out.println("Child class walk");
	}
	
	
	public static void main(String[] args) {
		
		Cat obj=new Cat();
		obj.Sound(1);
		obj.Sound();
		
		Animal obj1=new Animal();
		obj1.Sound();
		obj1.Sound(2);

	}

}
