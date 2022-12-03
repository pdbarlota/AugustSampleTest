package Apartment1;

public class NewArray {
	
	static float [] a;
	//array can used for primitive and non-primitive as well
	
	 Car [] b; //name of array -b

	public static void main(String[] args) {
		
		NewArray obj=new NewArray();
		//arrayname=new datatypeofarray[size];
		a=new float[20];		
		obj.b=new Car[10];

		//mentioning size is mandatory
		//int [] k=new int[];
		//we can create aray with size 0
		//int [] k=new int[0];
		//System.out.println(k[0]);
		//int [] k=new int[-1];
		System.out.println("test");
		int [] k=new int['a'];
		
		System.out.println(k.length);
		
		//
		//System.out.println(k[0]);
	}

}
