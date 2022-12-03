package overriding;

//Type of inheritance -hie
class Tata{
	
	//data type variable name
	int a;
	FourWheeler obj1; 
	
	//Access modifier -public
	//Return type -FourWheeler
	
	//Acces Modifer returntype Methodname()
	//primitive data type -Non-primitive 
	
	//return - it should remain same 
	 FourWheeler getWheels() {
		FourWheeler obj=new FourWheeler();
		return obj;
	}
	
	//signatue - getWheels()
	//access modifier - same or more accessible , 
		//default ,protected public
	//return type - Non-primitive FourWheeler
		//Non-primitive -it should remain same FourWheeler
		// but you  can also use fourwheeler child class as return type
	//method name -test
	//return type-int -primitive
	public int test() {
		return 8;
	}
	
	
	//Signature -->signature is same test()
	//Access modififer -same or more access public
	//Return type
		//primitive --it should be same int
	
	private int speed() {
		return 10;
	}
}

public class Nexon extends Tata {

	public static void main(String[] args) {
		Nexon obj=new Nexon();
		obj.test();

	}
	
	public TwoWheeler getWheels() {
		TwoWheeler obj=new TwoWheeler();
		return obj;
	}
	

	private int speed() {
		return 10;
	}

}

class Safari extends Tata{
	
	
	
	
}
