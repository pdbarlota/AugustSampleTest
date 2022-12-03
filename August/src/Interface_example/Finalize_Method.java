package Interface_example;

public class Finalize_Method {//Finalize_method extends Object

	public static void main(String[] args) {
	
		//WebElement t=new WebElement();
		
		Finalize_Method obj=new Finalize_Method();
		System.out.println("before setting it as null");
		obj=null; //finalize method
		Finalize_Method obj1=new Finalize_Method();
		Finalize_Method obj2=new Finalize_Method();
		obj1=null;
		obj2=null;
		System.gc();
		System.out.println("After object deletion");
	}

	//final, finally and finalize 
	//why GC didn't delete the object 
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method call");
	}
	
}