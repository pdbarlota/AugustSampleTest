package Apartment1;

import java.util.ArrayList;

public class List_Methods {

	public static void main(String[] args) {
		
		ArrayList<Object> obj=new ArrayList<>();
		
		obj.add("One");
		obj.add("Two");
		obj.add(1,"Three");
		
		System.out.println(obj);

		//Retrieve specific object from the collection based on index 
		String str=(String) obj.get(1);
		
		System.out.println(str.toUpperCase());
		
		obj.set(1, "Four");
		
		System.out.println(obj.indexOf("Four"));
		
		System.out.println(obj);
		
		obj.add(null);//null insertion
		
		
		System.out.println(obj.size());
		
		// obj.clear();
		//CURD ---> ADD, ADDALL ADDWITHINDEX ,ADDALL WITH INDEX
		//UPDATE --> SET
		//READ -->GET, Readall object 
		//REMOVE --CLEAR ,REMOVEALL ,REMOVE , REMOVE WITH INDEX 
		
		// System.out.println(obj);
		
	}

}
