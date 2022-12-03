package inheritance;


class RBI{
	//we have one parent constructor with single parameter 
	public RBI(int i) {
		System.out.println("I am in RBI constructor");
	}
}

//one java file can multiple class 
//name of file should same as public class 
public class HDFC extends RBI  {

	//this -//it will call same class constructor
	//and super -//it will call parent class constructor
	public HDFC() {
		this(1); //same class constructor with singlep parent
		//it also has to be at first line
		System.out.println("I am in no parameter constructor");
		
	}
	
	//it is mandatory to call parent constructor
	public HDFC(int i) {
		this(1,2); //same class constructor with two parameter
		System.out.println("I am in  parameter constructor");
	}
	
	
	public HDFC(int a,int b) {
		super(3);
		
	}
	
	public static void main(String[] args) {
		HDFC obj=new HDFC();

	}

}
