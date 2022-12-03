package com.abc.newpackage;

import java.util.HashSet;
import java.util.Iterator;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Iterator_example {

	public static void main(String[] args) {
	
		HashSet<Object> t=new HashSet<>();
		t.add(1);
		t.add(2);
		t.add(1);
		t.add(3);
		t.add(4);
		t.add(5);
		
		System.out.println(t);
		
	
		
		// for loop / for each
		
		Iterator<Object> p=t.iterator();

		while(p.hasNext()) {
			Integer j=(Integer) p.next();
			System.out.println(j);
			if(j.intValue()==3) {
				p.remove();
			}
		}
		
		System.out.println(t);
		
		//remove method
	}

}
