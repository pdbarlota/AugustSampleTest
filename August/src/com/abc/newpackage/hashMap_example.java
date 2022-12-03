package com.abc.newpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class hashMap_example {

	public static void main(String[] args) {
		
		HashMap<String, Integer> obj=new HashMap<>();
		obj.put("One", 10);
		obj.put("two", 10);
		obj.put("three", 10);
		obj.put("four", 30);
		obj.put("One", 110);
		obj.put(null, 23);
		obj.put("test", null);		
		System.out.println(obj);
		
		HashMap<String, Integer> obj1=new HashMap<>();
		obj1.put("One1", 10);
		obj1.put("two2", 10);
		obj1.put("three3", 10);
		obj1.put("four4", 30);
		
		HashMap<String, Integer> obj2=new HashMap<>();
		obj2.put("One1", 10);
		obj2.put("two2", 10);
		obj2.put("three3", 10);
		obj2.put("four4", 30);
		
		System.out.println(obj1.equals(obj2));
		
		System.out.println(obj1==obj2);
		
		obj.putAll(obj1);
		
		System.out.println(obj);
		
		obj.putIfAbsent("One3", 220);
		
		System.out.println(obj);
		
		obj.remove("One");
		System.out.println(obj);
		
		obj.remove("two2", 10);
		System.out.println(obj);
		
		System.out.println(obj.containsKey("test"));
		System.out.println(obj.containsValue(10));
		
		System.out.println(obj);
		
		System.out.println(obj.get("four"));
		System.out.println(obj.getOrDefault("four12", 0));
		
		Set<String> t=obj.keySet();
		Collection<Integer> t1=obj.values();
		
		System.out.println(t);
		System.out.println(t1);
	}

}
