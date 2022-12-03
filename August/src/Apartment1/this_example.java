package Apartment1;
public class this_example {

	int a; //instance variable
	//static method 
	public static void main(String[] args) {
		
		this_example obj=new this_example(); 
		System.out.println(obj.a);	//0
		obj.M1(10); //this will represent obj
		System.out.println(obj.a);

		this_example obj1=new this_example(); 
		System.out.println(obj1.a);	
		obj1.M1(20);//this will represent obj1
		System.out.println(obj1.a);	
	//within static method if you non-static method method
		//it is mandatory to call it by object
		
	}
	
	
	
	//instance method -->to call it we need object
	public void M1(int a) { //this -->obj
		System.out.println("M1");
		//if you are calling any instance method without object
		  M2(a); // this.M2();
		  //this will current object of class 
		//if any other instance method is called within instance method
		  
		
	}
	
	//non-static method -call by object 
	public void M2(int p) {
		a=p; //this.a=5
		System.out.println("M2");
	}

	public void M3() {
		a=5;
		System.out.println("M2");
	}

}
