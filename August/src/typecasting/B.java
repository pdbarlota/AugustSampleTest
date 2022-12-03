package typecasting;

import Apartment1.BreakStatement;
import Apartment2.*;




class A {
private float number;
private float percentage; //fully encapusalte

public void Result(){
System.out.println("I am result method ");
}

public float getNumber() {
	return number;
}

public void setNumber(float a) {
	if(a>50) {
	number=a;
	}
}

public float getPercentage() {
	return percentage;
}

}

public class B {

public static void main(String[] a){
	
BreakStatement obj1=new BreakStatement();
Apartment2.Flat1 obj2=new Apartment2.Flat1();
Datahiding ty=new Datahiding();
 A obj=new A();
 Flat1 t=new Flat1();
 ICICI t2=new ICICI();
 obj.setNumber(34.56f);
 System.out.println(obj.getNumber()); //0
 System.out.println(obj.getPercentage());//0.0
 obj.Result();//I am result method 
 Typecastingexample t45=new Typecastingexample();
}
}