package Apartment1;

public class FinalzeMethodTest {

	public static void main(String[] args) {
		FinalzeMethodTest p=new FinalzeMethodTest();
		FinalzeMethodTest p1=new FinalzeMethodTest();
		FinalzeMethodTest p2=new FinalzeMethodTest();
		p=null;//jvm will gc at that moment
		p1=null;
		p2=null;
		System.gc();
		System.out.println("after finalize method call");

		//final, finally and finalize 
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("I am finalize method");
	}
}
