package Apartment3;


class mobile{
	
	void calling() {
		System.out.println("Mobile calling");
	}
	
	private void AndroidOperatingSystem() {
		System.out.println("Mobile OS");
	}
	
	protected void Messaging() {
		System.out.println("Mobile messaging");
	}
	
	public void Camera() {
		System.out.println("Mobile camera");
	}
	
}


//Parent-child relation 
public class iphone extends mobile{

	public static void main(String[] args) {
	
		//mobileobj is reference of mobile class and
		//it is pointing to mobile class object
		mobile mobileobj=new mobile();
		mobileobj.calling(); //parent
		
		
		//iphoneobj is referenece of iphone class and 
		//it is pointing to iphone class object
		iphone iphoneobj=new iphone();
		iphoneobj.calling(); //child class
		iphoneobj.Messaging();

		
		//obj is reference of iphone class 
		//it is pointing to mobile class object
		/*iphone obj=new mobile();
		obj.calling();*/
		
		//obj1 is reference of mobile class
		//it is pointing to iphone class object
		mobile obj1=new iphone();
		obj1.calling(); //parent class
		//obj1.sound();
		//method binding happens at runtime
	}

	//1. Parent -child relation
	//2. Method signature should be same
	//3. It should be same or more accessible-default,protected,public
	//4. Return type -primitive -it should be same 
					 //non-primitive- it can be same or it can be its child class
	
	
	public void calling() {
		System.out.println("Iphone calling");
	}
	
	public void sound() {
		System.out.println("iphone sound");
	}
}
