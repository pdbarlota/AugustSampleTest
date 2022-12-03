package Apartment2;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.WeakHashMap;

public class WeakHashMap_Example {

	public static void main(String[] args) {
		/*HashMap<Testing, Integer> obj=new HashMap<>();

		Testing t1=new Testing();
		obj.put(t1, 12);
		System.out.println(obj);
		t1=null;
		System.gc();
		System.out.println(obj);
	
		
		System.out.println("Weak hashmap");
		
		WeakHashMap<Testing, Integer> obj1=new WeakHashMap<>();

		Testing t2=new Testing();
		obj1.put(t2, 12);
		System.out.println(obj1);
		t2=null;
		System.gc();
		System.out.println(obj1);
*/	
	TreeMap<Object, Object> t1=new TreeMap<>();
	t1.put(1, 1);
	t1.put("String", 1);
	System.out.println(t1);
	
	}

}

class Testing {
	
	@Override
	public String toString() {
		return "Testing";
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method of Testing class ");
	}
}
