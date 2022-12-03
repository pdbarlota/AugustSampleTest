package overriding;

public class NonPrimitiveCastingChild extends NonPrimitiveCastingParent{

	//Implicit Casting -->
		//Primitive --converting lower data type into higher data type 
	    //Non-Primitive- super class holding the object of child class 
	//Explicit Casting 
	
	public static void main(String[] args) {
		
		byte b=56;
		int c=b; //implicit primitive casting 
		
		NonPrimitiveCastingParent parent=new NonPrimitiveCastingChild(); //implicit non-primitive casting
		parent.M1();
		
		
		//explicit casting 
			//primitive - higher data type into lower 
			//non-primitive
		
		short d=(short)c;//explicit primitive casting 
		
		//explicit non-primitive casting 
		//when child class reference is pointin to parent class object
		
		NonPrimitiveCastingChild child=(NonPrimitiveCastingChild) parent;
		
		child.M1();

			//a=b; parent=new NonPrimitiveCastingChild()
			//c=a NonPrimitiveCastingChild child=parent
		   //c=b
		
		int p='c';
		
		char k=(char)p;
		
		System.out.println(p);
		System.out.println(k);
	
	}
	
	public void M1() {
		System.out.println("I am from Child");
	}

}


class NonPrimitiveCastingParent{
	
	public void M1() {
		System.out.println("I am from Parent");
	}
	
}