package Apartment2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Map_methods {

	public static void main(String[] args) {
		
		HashMap<String, Integer> obj=new HashMap<>();
		obj.put("One", 1);
		obj.put("two", 12);
		obj.put("three", 13);
		obj.putIfAbsent("One", 14);
		obj.put("four", 14);
		
		HashMap<String, Integer> obj1=new HashMap<>();
		obj1.put("One1", 1);
		obj1.put("two2", 12);
		obj1.put("three2", 13);
		//obj1.put("One1", 14);
		obj1.put("four4", 14);
		
		obj.putAll(obj1);
		
		//duplicate key is not allow , if you add it it will replace existing value
		// add particular key if it not present 
		
		System.out.println(obj);
		
		obj.remove("One");
		System.out.println(obj);
		
		obj.remove("four", 14); //remove if there is key called four and its value 12
		System.out.println(obj);
		
		Set<String> t= obj.keySet();
		System.out.println(t);
		
		Collection<Integer> t1= obj.values();
		System.out.println(t1);
		
		System.out.println(obj.containsKey("two"));
		System.out.println(obj.containsValue(12));
		

		HashMap<String, Integer> obj2=new HashMap<>();
		obj2.put("One1", 1);
		obj2.put("two2", 12);
		obj2.put("three2", 13);
		//obj1.put("One1", 14);
		obj2.put("four4", 14);
		
		
		System.out.println(obj1.equals(obj2));//true
		System.out.println(obj1==obj2);//false

		System.out.println(obj.get("two")); //it will retrive the value of particular key
		System.out.println(obj.getOrDefault("twotwo", 30));
	}

}
