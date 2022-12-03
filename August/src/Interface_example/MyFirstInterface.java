package Interface_example;

public interface MyFirstInterface {
	int a=45; //public static final int a;
	//by default each and every variable within the interface is final
	public abstract void M1(); 
	//you don't to mention interface as abstract
	//interface are created specificially method declaration
	//we cannot create object of interface
	void M2(); //within the interface if you don't write accessmo
	//public abstract void M2();
	//<Access modifier> <non-access> return type method();
	
	//private abstract void M3();

}


abstract class Testing{
	int a; //default non-static int a;
	public abstract void M1();
	//if class is abstract we  cannot create the object 
	//void M2();

}