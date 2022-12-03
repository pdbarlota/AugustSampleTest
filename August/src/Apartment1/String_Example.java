package Apartment1;

public class String_Example {

	//One String object -you can also create object by using literal
	public String var="test";// it will also create object --var is string object
	
	public static void main(String[] args) {
		
		
		String_Example t=new String_Example();
		//String declaration
		//by using new keyword 
		String var1=new String("TEsting");
		
		//String is immutable --
		System.out.println("Value of var1 " + var1);
		
		String var2=var1.concat("Software"); //TestingSoftware
		
		//String is immutable -it won't change the value 
		//but if you try to change it , it will create new object
		System.out.println("Value of var1 after concat " +var1);
		System.out.println(var2);
		
		//StringBuffer is mutable in nature
		StringBuffer obj1=new StringBuffer("Testing");
		obj1.append("Software"); //TestingSoftware
		System.out.println("String Buffer" + obj1);
		
		
	}

}
