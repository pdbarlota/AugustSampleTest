package Apartment1;

class Test{

	int a;

public Test(int a){
 a=5;
System.out.println("I am in single parameter constructor");

}
//calling one constructor within another

public Test(){
//calling single parameter constructor 
this(2);
a=10;
System.out.println("I am in no parameter constructor");
}

//signature --Method name + Parameter 
private Test(int a,int b) {
	this(1);
	a=25;
	System.out.println("I am in two parameter constructor");

}
//JVM will call main 
//main will no parameter constructor
//no parameter constructor-two parameter const
//two parameter -single parameter 
public static void main(String[] args){
	Test obj=new Test();
	System.out.println(obj.a);
}


}
