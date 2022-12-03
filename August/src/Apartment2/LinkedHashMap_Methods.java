package Apartment2;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMap_Methods {

	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> obj=new LinkedHashMap<>();
		obj.put("One", 1);
		obj.put("two", 12);
		obj.put("three", 13);
		obj.putIfAbsent("One", 14);
		obj.put("four", 14);
		
		System.out.println(obj);
		

	}

}
