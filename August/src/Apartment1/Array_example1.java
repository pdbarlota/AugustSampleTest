package Apartment1;

public class Array_example1 extends Array_example2  {

	public static void main(String[] args) {
		
		Array_example1 obj=new Array_example1();
		Array_example1 obj1=new Array_example1();
		Array_example1 obj2=obj;
		System.out.println("output"+obj.equals(obj1));
		System.out.println(obj.equals(obj2));

	}

	public void m1() {
		
	}
}

class example2 extends Array_example1{
	
	public void M2() {
		example2 obj=new example2();
		//obj.
	}
	
	public void M3() {
		
	}
}

class Array_example2{
	
}
