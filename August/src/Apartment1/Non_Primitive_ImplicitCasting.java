package Apartment1;


class Parent_Non_Primitive{
	
	public void M1() {
		System.out.println("I am from parent");
	}
	
}

public class Non_Primitive_ImplicitCasting extends Parent_Non_Primitive {

	public static void main(String[] args) {
		
		Non_Primitive_ImplicitCasting obj=new Non_Primitive_ImplicitCasting();
		
		obj.M1();
		obj.M2();
		
		
		
		Parent_Non_Primitive obj1=new Parent_Non_Primitive();//no need of casting
		
		
		obj1.M1();
		
		
		Parent_Non_Primitive obj2=new Non_Primitive_ImplicitCasting();
		
		obj2.M1();
		
		
		Non_Primitive_ImplicitCasting obj4=(Non_Primitive_ImplicitCasting) obj2;

			obj4.M2();
		
		
	}
	
	public void M2() {
		System.out.println("I am from child");
	}

}
