package Apartment2;


abstract class ATM {
	
	public abstract int CashWithdraw();
	
		
	
	//Abstract method -method which only has declaration but not implemtation
	
}


public class ICICI extends ATM {

	public static void main(String[] a) {
	
		
	}


	public int CashWithdraw() {
		System.out.println("ICICI Cash withdraw");
		return 0;
	}
}

class HDFC extends ATM{

	@Override
	public int CashWithdraw() {
		System.out.println("HDFC Cash Withdraw");
		return 0;
	}
	
}
