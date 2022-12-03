package Apartment1;

class dataHiding {
	
	//each and every variable should be private 
	
	private int a=67;
	private int b;
	private float c;
	private int d;
	private dataHiding obj;
	
	
	public dataHiding getObj() {
		return obj;
	}
	
	public void setObj(dataHiding obj1) {
		this.obj=obj1;
	}
	public int getB() {//to read the value of variable
		return b;
	}
	public void setB(int b) {//to change the value of variable
		if(b>50) {
		this.b = b;
		}
	}
	public float getC() {
		return c;
	}
	public void setC(float c) {
		this.c = c;
	}
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
	public int getA() {
		return a;
	}
	
	
	

	
}


public class dataimplementaion {
	public static void main(String[] args) {
		
		dataHiding obj=new dataHiding();
		  //i am able to access outside the class 
		//obj.setA(45);
		//System.out.println(obj.getA()); //
	

	}
}