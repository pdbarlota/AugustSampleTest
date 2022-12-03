package Interface_example;

public interface MySecondInterface {
	
	int a=90; //public static final int a; 
	
	//access modifier -public
	//non-modifier - static 
	
	public abstract void M1();//each and every method is abstract
	//public abstract void M1()

	void M2();
	//Method Syntax 
	//<AccessModifier><nonAccessModifier><returntype><methodName>()
	
	
	//ACCESSModifer- public
	//Non-abstract
	//return type -void
	//method name -M1()
}



abstract class TestingOne implements MySecondInterface {

	@Override
	public void M1() {
		System.out.println("this is test");
		
	}

	
	
}
class Testchild extends TestingOne{
	
	@Override
	public void M2() {
		System.out.println("this is test");
		
	}

}




class testtwo implements MySecondInterface{

	@Override
	public void M1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void M2() {
		// TODO Auto-generated method stub
		
	}
	
}
	