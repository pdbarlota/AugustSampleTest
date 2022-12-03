package Apartment3;

class RBI {
	
	public void InterestPercentage() { //overriden -method which override by child class 
		System.out.println("Interest percentage is 6.5");
	}
	public void BankHoliday() {
		System.out.println("As per RBI");
	}
	
	
}


public class ICICI extends RBI{
	
	//method overriding---When icici doesn't like the implementation of parent method
	public void InterestPercentage() { // overriding method 
		System.out.println("Interest percentage is 9");
	}

	public static void main(String[] args) {
		
		ICICI obj=new ICICI();
		obj.InterestPercentage(); //preference is given child class 
		obj.BankHoliday();
		RBI obj1=new RBI();
		obj1.InterestPercentage();//prefe

	}

}
