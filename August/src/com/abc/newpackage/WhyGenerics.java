package com.abc.newpackage;

import java.util.ArrayList;

public class WhyGenerics {

	public static void main(String[] args) {
		
		ArrayList<Object> obj=new ArrayList();//arraylist without generics
		
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add("testing");
		
		Integer obj1= (Integer) obj.get(3);
		
		System.out.println(obj1.intValue());
		
		//collection support hetrogeneous object 
		//Arraylist collection -->Integer and String 
		//We are trying to convert String object into Integer 

	}

}
