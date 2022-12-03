package Apartment3;

public class String_Buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer obj=new StringBuffer("software");
		System.out.println(obj);
		obj.append("testing");
		System.out.println(obj);
		
		obj.insert(7, "course");
		
		System.out.println(obj);
		
		System.out.println(obj.deleteCharAt(0));
		
		System.out.println(obj.delete(0, 7));
		
		System.out.println(obj.reverse());
		
		

	}
	
	
	synchronized void m1() {
		
	}


}
