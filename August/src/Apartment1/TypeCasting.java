package Apartment1;

public class TypeCasting {

	public static void main(String[] args) {
		int a=300;
		float b;
		double c;
		byte d; 

		b=a;
		c=a;
		d=(byte)a;
		
		System.out.println("value of b "+ b);
		System.out.println("value of c "+ c);
		System.out.println("value of d "+ d);
		
		//you assign higher data type value into lower 
		//127 (n+1)*2=256 (n+1)*2
		//200-256
	}

}
