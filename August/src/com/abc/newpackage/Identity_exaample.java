package com.abc.newpackage;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class Identity_exaample {

	public static void main(String[] args) {
		
		HashMap<String, Integer> obj=new HashMap<>();
		String s1="One"; //SCP
		String s2=new String("One");
		obj.put(s1, 1);
		obj.put("two", 12);
		obj.put("three", 13);
		obj.put("four", 14);
		obj.put(s2, 14);
		
		System.out.println(obj); //equals-->content 
		
		IdentityHashMap<String, Integer> obj1=new IdentityHashMap<>();
		obj1.put(s1, 1);
		obj1.put("two", 12);
		obj1.put("three", 13);
		obj1.put("four", 14);
		obj1.put(s2, 14); //== --whether refer is pointing same object or not 
		
		System.out.println(obj1);

	}

}
