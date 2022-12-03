package inheritance;

import java.util.HashMap;

public class HashMap_Example {

	public static void main(String[] args) {
		
		HashMap<String, Integer> obj=new HashMap<>();
		obj.put("one", 11);
		obj.put("two", 12);
		obj.put("three", 11);
		obj.put("one", 13);
		obj.put(null, 15);
		obj.put("five", null);
		obj.put(null, 25);
		//value can be duplicate but key cannot
		//if we try to add duplication key --it override the existing value 
		System.out.println(obj);
				//data structute --hasttable 
				//duplicates -->key cannot be duplication
				//insertion order ->not preserved 
				//when we should go for hashmap -->search
			

	}

}
