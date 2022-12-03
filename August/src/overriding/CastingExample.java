package overriding;

public class CastingExample {

	public static void main(String[] args) {
		
		//First statement 
		byte a=34;
		//Second statement 
		int c=a ;
		
		//but we are converting lower data type into higher ---Java 
		
		System.out.println(c);

		short d =(short)c ; //Converting one data type into another 
		
		//when we convert higher data type into lower ---it will not be taken care by java 
		
		System.out.println("value of d" + d);
		
		//In some situation there will be data loss --explicit casting 
		
		c=120;
		byte e=(byte)c;
		
		//max size of byte 127 
		//formula (2*(n+1)) =(2*127+2)=256
		System.out.println("value of e" + e);
		
	}

}
