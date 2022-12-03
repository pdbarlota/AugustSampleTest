package Apartment1;

import java.util.LinkedList;

public class LinkedList_MEthods {

	public static void main(String[] args) {
		
		LinkedList<Object> obj=new LinkedList<>();
		obj.add(1);//1
		obj.add(2);//2
		obj.addFirst(10);
		
		System.out.println(obj);
		
		//to retrive the object --List get 
		System.out.println(obj.getLast());
		
		obj.removeFirst();
		
		System.out.println(obj);
		
		

	}

}
