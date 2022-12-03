package com.abc.newpackage;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTable_Example {

	public static void main(String[] args) {
		
		HashMap<String, Integer> obj=new HashMap<>();
		obj.put("One", 1);
		obj.put("One", 11);
		obj.put("two", 12);
		obj.put("three", 13);
		
		System.out.println(obj);
		
		obj.put(null, 34);
		
		System.out.println(obj);

	}

}
