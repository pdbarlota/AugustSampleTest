package Apartment2;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSet_Method {

	public static void main(String[] args) {
		
		HashSet<Object> obj=new HashSet<>();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.add(1);
		obj.add(null);
		obj.add(3);
		obj.add(null);
		
		//arraylist --hashset
		
		System.out.println(obj);
		
		HashSet<Object> obj1= (HashSet<Object>) obj.clone();
		
		System.out.println(obj1);
		
		LinkedHashSet<Object> obj2=new LinkedHashSet<>();
		obj2.add(1);
		obj2.add(2);
		obj2.add(3);
		obj2.add(4);
		obj2.add(1);
		obj2.add(null);
		obj2.add(3);
		obj2.add(null);
		
		//arraylist --hashset
		
		System.out.println(obj2);
		

	}

}
