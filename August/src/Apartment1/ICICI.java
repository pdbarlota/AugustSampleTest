package Apartment1;


 abstract class ATM{
	
	//within the class you should method implementation 
	public abstract int cashwithdraw(); //method declaration 
	public abstract void ValidatePin();
	
	public double Checkbalance() {
		System.out.println("I am from ATM Class");
		return 100.0;
	}
	
	public static void ATMExample() {
		
	}
}

public abstract class ICICI extends ATM {

	public static void main(String[] args) {
	/*	ATM obj=new ATM(); //you cannot create the object of ATM
		obj.Checkbalance();
*/
		
		//ICICI obj=new ICICI();
		//obj.Checkbalance();
		//obj.cashwithdraw();
		
	}
	
	public void ValidatePin() {
		
	}
}

 class Vendor extends ICICI{

	@Override
	public int cashwithdraw() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}