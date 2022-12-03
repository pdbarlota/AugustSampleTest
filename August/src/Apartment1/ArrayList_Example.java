package Apartment1;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayList_Example {

	public static void main(String[] args) {

		ArrayList<Object> obj = new ArrayList<>();
		
		Integer one = new Integer(25);
		Integer two = new Integer(35);
		Integer three = new Integer(45);
		// Add object in collection
		obj.add(one);
		obj.add(two);
		obj.add(three);
		obj.add(one);
		obj.add(two); // Duplicates are allowed

		System.out.println(obj); // insertion order preserve
		
		//Integer four = new Integer(100);
		
		String four="Testing";
		
		obj.add(four);
		
		System.out.println(obj); 
		
		obj.remove(0);//based 
		obj.remove(four);//object
		obj.remove(two);
		
		System.out.println(obj); //three object 
		
		//AddAll--to added one collection within another collection
		
		ArrayList<Object> obj1=new ArrayList<>(); //second collection
		obj1.add("one");
		obj1.add("two");
		obj1.add("three");
		
		System.out.println("Second collection "+obj1);//three object 
		
		obj.addAll(obj1);
		
		System.out.println("After adding "+ obj);//six object
		
		obj.removeAll(obj1);
		
		System.out.println(obj);

	}

}
