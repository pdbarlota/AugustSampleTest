package Apartment3;


class A{
	
	public void msg() {
		System.out.println("I am from Claass A");
	}
}

class B{
	public void msg() {
		System.out.println("I am from Claass B");
	}
}


public class C extends A{ //c extends A,B

	public static void main(String[] args) {
		C obj=new C();
		obj.msg();//method 
		

	}

}
