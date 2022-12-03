package Apartment2;


class test{
	
	private int a;
	private int b;
	
	
	
	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	
	
	public int getA() {
		return a;
	}
	
	public void setA(int p) {
			a=p;
		
	}
}

public class Datahiding {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test obj=new test();
		obj.setA(55);
		System.out.println(obj.getA());
		System.out.println(obj.getB());
	}

}

