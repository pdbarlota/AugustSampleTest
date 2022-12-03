package Apartment2;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentitiyHashmap_Methods {

	public static void main(String[] args) {
		
		String s1="One";
		String s2=new String("One");
		
		System.out.println(s1.equals(s2));
		HashMap<String, Integer> obj=new HashMap<>();
		obj.put(s1, 1);
		obj.put("two", 12);
		obj.put("three", 13);
		obj.put(s2, 14);
		obj.put("four", 14);
		
		//checking whether key is duplicate or not we use content comparasion 
		//equal methods 
		System.out.println(obj); 
		
		//checking whether key is duplicate only if key is pointing to same object 
		//== methods 
		IdentityHashMap<String, Integer> obj1=new IdentityHashMap<>();
		
		
		String s3="One";
		System.out.println(s1==s2);
		obj1.put(s1, 1);
		obj1.put("two", 12);
		obj1.put("three", 13);
		obj1.put(s2, 14);//key is strin , scp 
		obj1.put("four", 14);
		obj1.put(s3, 14222);
		
		System.out.println(obj1);
		

	}

}
