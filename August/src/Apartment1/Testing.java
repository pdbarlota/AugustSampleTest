package Apartment1;

public class Testing {
	
	public static void main(String[] t) {
		Testing obj=new Testing();
		Testing obj1=obj.M1();
		if(obj1 !=null) {
		System.out.println(obj1.toString());
		} else {
			System.out.println("Object is null");
		}
	}

	
	public Testing M1() {
		Testing p = null;
		boolean flag=true;
		if(flag) {
			p=new Testing();			
		}
		return p;
		}
	
}
