package Apartment2;

import java.util.ArrayList;
import java.util.HashSet;

public class Student_collection {

	public static void main(String[] args) {
	
		ArrayList<Integer> obj=new ArrayList();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		//obj.add("test");
		
		Integer t= (Integer) obj.get(3);
		
		System.out.println(t.intValue());
		System.out.println(obj);

	}

}
