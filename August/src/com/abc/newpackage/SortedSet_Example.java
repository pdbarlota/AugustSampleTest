package com.abc.newpackage;

import java.util.HashSet;
import java.util.TreeSet;

public class SortedSet_Example {

	public static void main(String[] args) {
		// when we want to represent group of object as single entity but we want to store object in 
		//some sorting order 
		
		TreeSet<Object> obj=new TreeSet<>();
		obj.add(2);
		obj.add(1);
		obj.add(1); //duplicated
		obj.add(3);
		obj.add(4);
		obj.add(6);
		obj.add(7);
		obj.add("String"); //
		
		System.out.println(obj);
		//default sorting order -ascending 
	/*	
		
		System.out.println(obj.first()); // it will retrieve first object from set
		System.out.println(obj.last());//it will retrieve last object from set
		
		//some method which helps to retrieve the subset 
		System.out.println(obj);
		
		System.out.println(obj.pollFirst()); //it retrieve object and remove from collection
		
		System.out.println(obj);
		System.out.println(obj.pollLast());
		System.out.println(obj);
		
		System.out.println(obj.descendingSet());
		
		System.out.println(obj.subSet(2,6));//2 will included but 6 will not 
		
		System.out.println(obj.subSet(2, false, 6, false));*/

	}

}
