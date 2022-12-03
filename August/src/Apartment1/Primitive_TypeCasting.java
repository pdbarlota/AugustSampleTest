package Apartment1;


//Casting -converting one data type into another
//implicit- converting lower data type into higher

//byte-short-int-long-float-double

//casting is not applicable for char and boolean
public class Primitive_TypeCasting {

	public static void main(String[] args) {
		
		byte a=100;
		int b=a;//RHS -int and LHS-byte
		System.out.println("There is no data loss " + b);
		
		float c=45.4f;
		double d=c;
		System.out.println("there is no data loss "+ d);
		
		char e='a';
		boolean g=true;
		int f=e;
		System.out.println("value of f " + f);

	}

}
