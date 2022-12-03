package overriding;


class RBI{
	
	protected int CashWithDraw() {
		System.out.println("I am from RBI class ");
		return 500;
	}
}

//Parent child relation 
public class ICICI extends RBI{
	
	//we will override the cashwithdraw method 
	
	public int CashWithDraw(){
		System.out.println("I am from ICICI");
		return 2000;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
