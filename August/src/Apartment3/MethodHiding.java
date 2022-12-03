package Apartment3;


class ParentMethodHiding{
	
	public static int M2() {
		System.out.println("I am from parent class");
		return 1;
	}
	
	
}
public class MethodHiding extends ParentMethodHiding {

	public static void main(String[] args) {
		
		ParentMethodHiding obj=new ParentMethodHiding();
		obj.M2();
		
		MethodHiding obj1=new MethodHiding();
		obj1.M2();
		
		ParentMethodHiding obj2=new MethodHiding();
		obj2.M2();

	}
	
	public static int M2() {
		System.out.println("I am from parent class");
		return 1;
	}

}
