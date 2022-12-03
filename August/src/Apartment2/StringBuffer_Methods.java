package Apartment2;

public class StringBuffer_Methods {

	public static void main(String[] args) {
		
		StringBuffer obj=new StringBuffer("software");
		obj.append("testing");
		System.out.println(obj);
		
		obj.insert(2, "check");
		
		System.out.println(obj);
		obj.delete(2, 5);
		System.out.println(obj);
		System.out.println(obj.reverse());
		
		

	}

}
