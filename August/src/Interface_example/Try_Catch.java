package Interface_example;

public class Try_Catch {

	static Try_Catch e;
	
	public static void main(String[] args) {
	
		//e=new ArithmeticException();
		
		System.out.println("Before try catch");
		// we cannot write only try block --catch /finally 
		try {
			//e.m1(); //Nullpointer
		System.out.println("Will not print " + (10/0));// new ArithmeticException();
		}
		catch(ArithmeticException e) {
			System.out.println("I am ArithmeticException ");
		} catch(NullPointerException p) {
			System.out.println("I am null pointer");
		}
		finally {
			 //memory release statement 
			System.out.println("After exception");
		} 
		
				
		//try-catch
		//try-finally 
		//try-catch-finally 
		//try finally catch 
		
	}
	
	public void m1() {
		
	}

}
