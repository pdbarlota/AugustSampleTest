package Apartment2;

import java.util.TreeSet;

public class TreeSet_Example {

	public static void main(String[] args) {
		
		TreeSet<Object> p =new TreeSet<>();
		p.add(1);
		p.add(3);
		p.add(4);
		p.add(2);
		p.add(6);
		p.add(7);
		
		System.out.println(p);
		
		//sorted set 
		System.out.println(p.first()); //1
		System.out.println(p.last()); //7
		
		//headset
		
		System.out.println(p.headSet(4));//less than current object
		
		System.out.println(p.tailSet(4));//equal to or greater than 
		
		System.out.println(p.ceiling(4)); //equal or greate than object
		
		System.out.println(p.floor(10));//equal or less than 
		
		System.out.println(p.higher(4)); //greater than 
		
		System.out.println(p.lower(4));//less than
		
		System.out.println(p.subSet(2, 6));//equal to lower object and less than higher 
	}

}
