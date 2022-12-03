package inheritance;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTable_Example {

	public static void main(String[] args) {
		 HashMap<String, Integer> t=new HashMap<>();
		//Hashtable<String, Integer> t=new Hashtable<>();
		 t.put("One", 1);
		 t.put("two", 22);
		 
		 System.out.println(t);
		 //synchronzied -->Hashtable
		 //Either key or value will be null 
		 t.put("three", null);
		 
		 System.out.println(t);

	}

}
