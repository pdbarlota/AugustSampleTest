package Apartment2;


class A{

	public void M1() {
		System.out.println("from M1");
	}
	
	public void M3() {
		System.out.println("M3");
	}
}

class B{
	public void M2() {
		System.out.println("From M2");
	}
	

	public void M3() {
		System.out.println("M3");
	}
}


public class C extends A { //,B

	public static void main(String[] args) {
	 C obj=new C();
	 obj.M1();
	 obj.M3();
	 //obj.M2();

	}

}
