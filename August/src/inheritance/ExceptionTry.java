package inheritance;

public class ExceptionTry {
	static ExceptionTry p;

	public static void main(String[] args) {

		int a = 10;

		System.out.println("Print statement before exception");
		try {
			
			 
				p.m1(); //null pointer 			
			System.out.println("Division" + a / 0); //

		}
		catch (ArithmeticException e) {
			 System.out.println("I am in arithmetic exception");
		}  catch (Exception p) {
			System.out.println("Exception parent object");
		}
		
		finally {

		System.out.println("Print statement after exception");
		}// try cannot be used without catch and vice versa
	}

	public void m1() {

	}
}
