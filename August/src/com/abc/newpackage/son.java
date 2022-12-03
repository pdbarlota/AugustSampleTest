package com.abc.newpackage;


class grandparent {
	
	public void car() {
		System.out.println("grandparent car method");
	}
}
class kaka extends grandparent{
	

}



//one parent-child 
//parent is child class
//grandparent is parent class 
class parent extends grandparent {
	
	public void bike() {
		System.out.println("parent bike");
	}
	
}

//for parent child -we use extends keyword
//if you have single parent child relation then it is called single inheritance 
//if you have more than one parent child then it is called multilevel
public class son extends parent{

	public static void main(String[] args) {
	 son sonobj=new son();
	 

	}

}
