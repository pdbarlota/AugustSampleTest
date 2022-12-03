package Apartment1;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayList_methods {

	public static void main(String[] args) {
	
		ArrayList<Object> obj=new ArrayList();
		obj.add("One");
		obj.add("Two");
		obj.add("three");
		obj.add("four");
		obj.add("seven ");
		obj.add("four");
		obj.add(1, "five");
		
		System.out.println(obj);
		
		//Addall method -adding one collection within another
		
		ArrayList<Object> obj1=new ArrayList();
		obj1.add(1);
		obj1.add(2);
		obj1.add(3);
		obj1.add(4);
		
		System.out.println(obj1);
		
		//Add obj1 collection in obj
		
		/*obj.addAll(obj1);
		
		System.out.println(obj);*/
		
		obj.addAll(2, obj1);
		
		System.out.println(obj);
		
		obj.remove(10);
		
	
		
		System.out.println(obj);
		
		//get --->to retrieve specific from collection
		
		String str=(String) obj.get(1);
		System.out.println(str);
		//CURD --> 
		//C-->ADD,ADDALL
		//R-->GET
		//D-->REMOVE REMOVEALL ,CLEAR
		//U-->SET
		
		obj.set(2, "newvalue");
		
		System.out.println(obj);
		System.out.println(obj.indexOf("Two"));
		
		System.out.println("size " + obj.size());
		obj.add(null);
		obj.add(null);
		obj.add(null);//duplicates allowed 
		System.out.println(obj);
		System.out.println("size " + obj.size());
		
		
		LinkedList<Object> t=new LinkedList<>();
		t.add("one");
		t.add("two");
		t.addFirst("three");
		
		System.out.println(t);
		
		System.out.println(t.getLast());
		

	}

}
