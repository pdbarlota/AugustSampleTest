package com.abc.newpackage;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMap_example {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> obj=new LinkedHashMap<>();
		obj.put("One", 10);
		obj.put("two", 10);
		obj.put("three", 10);
		obj.put("four", 30);
		obj.put("One", 110);
		obj.put(null, 23);
		obj.put("test", null);		
		System.out.println(obj);

	}

}
