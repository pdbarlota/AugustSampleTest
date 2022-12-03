package Apartment2;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSet_Example {

	public static void main(String[] args) {
	
		
		HashSet<Object> t=new HashSet<>();
		t.add(1);
		t.add(1);
		t.add(2);
		t.add(4);
		t.add(3);
		t.add(6);
		
		System.out.println(t);
		
		HashSet<Object> t1=(HashSet<Object>) t.clone();
		
		System.out.println(t1);


		LinkedHashSet<Object> t2=new LinkedHashSet<>();
		t2.add(1);
		t2.add(1);
		t2.add(2);
		t2.add(4);
		t2.add(3);
		t2.add(6);
		
		System.out.println(t2);
		
		


	}

}
