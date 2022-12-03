package com.abc.newpackage;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.Vector;

public class Enumeration_Example {

	public static void main(String[] args) {
		
		Vector<Object> obj=new Vector<>();
		obj.add(12);
		obj.addElement(23);
		obj.add(2);
		
		System.out.println(obj);
		
		//second is retrieve the objec
		
		for(int i=0;i<obj.size(); i++) {
			System.out.println(obj.get(i));
		}

		//we can use cursor concept 
		
		Enumeration<Object> test=obj.elements();
		
		while(test.hasMoreElements()) {
			System.out.println(test.nextElement()); //2
		}
		
		System.out.println("Iterator implementation");
		
		Iterator<Object> iterator=obj.iterator(); //12 23 2
		
		while(iterator.hasNext()) {
			Integer t=(Integer) iterator.next(); //12
			System.out.println(t); //we can remove the object from collection
			if(t>20) {
				iterator.remove();
			}
		}
		
		System.out.println(obj);
		
		System.out.println("List Iterator");
		
		ListIterator<Object> listiterator =obj.listIterator();
		
		while(listiterator.hasNext()) {
			Integer p=(Integer) listiterator.next();
			System.out.println(p);
			if(p>10) {
				listiterator.set(25);
			}
		}
		System.out.println(obj);
		
	//	obj.stream().spliterator()
		
		Spliterator<Object> itr= obj.spliterator();
		System.out.println(itr.characteristics());
		itr.forEachRemaining(ob->{
			System.out.println(ob);
		}
		);
	}

}
