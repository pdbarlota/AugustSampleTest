package com.abc.newpackage;

import java.util.Enumeration;
import java.util.Vector;

public class SplitIterator_example {

	public static void main(String[] args) {
		
		Vector<Object> obj=new Vector<>();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(1);
		obj.add(4);
		obj.add(5);
		
		System.out.println(obj);
		
		//for loop
		for(int i=0; i<obj.size();i++) {
			System.out.println(obj.get(i));
		}
		System.out.println("For each loop");
		for(Object t: obj) {
			System.out.println(t);
		}
		
		System.out.println("Cursors");
		
		 Enumeration<Object> p= obj.elements();
		 
		 //hasmoreelement nextelements
		 //[1, 2, 3, 1, 4, 5]
		 while(p.hasMoreElements()) {
			 Integer k= (Integer) p.nextElement(); //k=2
			 System.out.println(k.intValue());
		 }

	}

}
