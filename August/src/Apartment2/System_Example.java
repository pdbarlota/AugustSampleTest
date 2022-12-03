package Apartment2;

public class System_Example {

	public static void main(String[] args) {
		
	  System.out.println("Get the current directory " + System.getProperty("user.dir"));
	  System.out.println("line separator" + System.lineSeparator());
	  System.out.println(System.getProperty("os.name"));  
	  System.out.println(System.getProperty("user.name"));
	  System.setProperty("browser.name", "Chrome");
	  
	System.err.print("This is error ");
	  
	  
	}

}
