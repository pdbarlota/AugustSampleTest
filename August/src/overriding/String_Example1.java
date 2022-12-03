package overriding;

public class String_Example1 {

	public static void main(String[] args) {
		String str="testing"; //str is object
		String str1=new String("test");
		//String is a final class 
		//Two ways to create object
		//final variable,final method ,final class 
		//final variable--constant 
		//final method -->overriding is not possible
		//final class-No can extend this class 
		
		//STRING IS IMMUTABLE IN NATURE 
		
		System.out.println("Value of str " + str);
		String str2=str.concat("software"); //testingsoftware
		//if you try to change the value of string it will create new object
		
		System.out.println("value of str after concat " + str);
		
		//STRING BUFFER IN MUTALBE IN NATURE 
		StringBuffer obj=new StringBuffer("testing");
		
		System.out.println("value of obj "+ obj);
		obj.append("software");
	
		System.out.println("value of obje after append "+ obj);
		
		String str7="pune"; //max one 
		//pune PUNE
		System.out.println(str7.toUpperCase());//1
		String str8="PUNE"; //0
		
		String str9=str8.toLowerCase();
		System.out.println(str9); //0
		
		//concat -it helps to join the two string
		
		String str10=str9.concat("city");//1 
		System.out.println(str10);
	}
	

}
