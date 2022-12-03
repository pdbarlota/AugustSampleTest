package Apartment1;

import java.util.ArrayList;
import java.util.HashSet;

public class Collection_Array  { //object 

	public static void main(String[] args) {
		
		
		int [] a=new int [10]; 
		a[0]=5;
		a[1]=10;
		long c=4;
		//a[2]=c; //homogenous 
		
		a[2]=new Integer(23);
		//	a[11]=34;
		
		ArrayList<Object> obj=new ArrayList<>();
		Integer ob=new Integer(25);
		Integer ob1=new Integer(35);
		Integer ob2=new Integer(45);
		//add(Object a); Object a=new Integer(25)
		obj.add(ob); 
		obj.add(ob1);
		obj.add(ob2);
		obj.add(ob1); //obj1
		obj.add(ob2); //obj2
	
		System.out.println(obj);
		
		HashSet<Object> obj2=new HashSet<>();
		obj2.add(ob); //insert order is not preserve
		obj2.add(ob1);//duplicates not allocated
		obj2.add(ob2);
		obj2.add(ob1); //obj1
		obj2.add(ob2); //obj2
		
		System.out.println("set "+obj2);
	}

}

class test extends Collection_Array {
	
	public void m1() {
		test obj=new test();
		//obj.
	}
}
