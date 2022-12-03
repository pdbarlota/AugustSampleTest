package com.abc.newpackage;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Spliterator;

public class ListIterator_example {

	public static void main(String[] args) {
	
		ArrayList<Object> k=new ArrayList<>();
		k.add(1);
		k.add(2);
		k.add(1);
		k.add(3);
		k.add(4);
		k.add(5);
		
		System.out.println(k);
		
		ListIterator<Object> p= k.listIterator();
		
		while(p.hasNext()) {
			Integer j=(Integer) p.next();
			System.out.println(j);
			//add /set
			
			if(j.intValue()==4) {
				p.set(44);
			}
			
		}
		System.out.println("backward direction");
		while(p.hasPrevious()) {
			Integer j=(Integer) p.previous();
			System.out.println(j);
		}
		
		Spliterator<Object> a= k.spliterator();
		
		System.out.println("Spliterator ");
		
		a.forEachRemaining(h->{
			System.out.println(h);
		});
		
		k.parallelStream().forEach(t->{
			System.out.print(t);
		});

	}

}
