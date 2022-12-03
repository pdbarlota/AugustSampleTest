package Apartment1;

public class Integer_Wrapper {

	public static void main(String[] args) {
		
		//XXXValue();
		//parseInt
		Integer obj=new Integer(10);
		int f=(int)obj.floatValue();
		System.out.println("value of f"+ f); //10.0
		double t=obj.doubleValue();
		System.out.println("value of t" + t);
		byte p=obj.byteValue();
		
		System.out.println("value of p" + p);
		//obj.parseInt("25");
		
		
		Float t1=new Float(34.3);
	
		
		Integer_Wrapper obj1=new Integer_Wrapper();
		float j=obj1.covertMyValueIntoFloat(obj);
		
		System.out.println("value of J" + j);
		

		int [] a =new int[3];
		a[0]=4; //new Integer(4)
		a[1]=new Integer(2);
		a[2]=5;//new Integer(5);
		

	}
	
	
	public float covertMyValueIntoFloat(int a) {
		return (float)a;
	}

}	
	