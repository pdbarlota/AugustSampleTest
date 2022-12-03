package Apartment1;

public class DownCating_Primitive {

//casting- converting one data type into another
//downcasting/explicit - converting higher data type into lower one
// data loss 
	public static void main(String[] args) {
		
		byte a;
		int b=50000;
		//we are trying to put int value in byte
		//converting higher data type into lower 
		a=(byte)b;
		
		//when we convert data from higher to lower there is 
		//possibility of data loss 
		short p;
		//as int b is having value which is in the range of byte 
		//so no data loss
		System.out.println("value of a "+ a);

		int c=320;
		a=(byte)c;//250-256 512
		System.out.println("value of a "+ a);
		
		p=(short)b; 
		
		System.out.println("value of p" + p);
	
	
	}

}
