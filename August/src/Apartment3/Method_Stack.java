package Apartment3;

public class Method_Stack {

	public static void main(String[] args) {
		Method_Stack obj=new Method_Stack();
		obj.m1(); //caller method is main for m1
		System.out.println("i am back in main");
	}
	
	private void m1() {
		System.out.println("i am in m1");
		m2(); //caller method is m1
		System.out.println("i am bck in m1");
	}
	
	void m2() {
		System.out.println("i am in m2");
	}

}
