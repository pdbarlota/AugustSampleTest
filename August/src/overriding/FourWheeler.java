package overriding;

public class FourWheeler {
	
	
	public FourWheeler(){
		System.out.println("I am from fourwheeler");
	}

}


class TwoWheeler extends FourWheeler {
	
	public TwoWheeler(){
		System.out.println("I am from TwoWheeler");
	}

	
}