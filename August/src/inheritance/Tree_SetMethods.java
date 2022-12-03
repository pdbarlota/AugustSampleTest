package inheritance;

import java.util.TreeSet;

public class Tree_SetMethods {

	public static void main(String[] args) {
		
		TreeSet<Object> obj=new TreeSet<>();
		obj.add(2);
		obj.add(1);
		obj.add(1);
		obj.add(4);
		obj.add(6);
		obj.add(7);
		
		System.out.println(obj); //based on some sorting order--ascending

		//sorted set -->first 
		
		System.out.println(obj.first()); //give me first object of collection -1
		//it is similar to getfirst method of linked list 
		
		System.out.println(obj.last()); //getlast of linkedlist
		
		System.out.println(obj.headSet(4)); //give me list of object which less than 4
		
		System.out.println(obj.tailSet(4)); //which are equal to 4 or greater than 4
		
		System.out.println(obj.subSet(2, 6));//equal to or greaten lower object 2
		//and less than 6  >=2 and <6
		
		//Navigable Set 
		
		System.out.println("ceiling "+ obj.ceiling(8)); //equal to 3 if not greater than 3
		System.out.println("floor " + obj.floor(5)); //equal to 3 if not less than 3 
		System.out.println("higher " + obj.higher(4)); //greater than respective object 
		System.out.println("lower" + obj.lower(4)); //lower than respective object
		System.out.println(obj.higher(7));
		
		System.out.println("My Set " + obj);
		//System.out.println(obj.pollFirst());//retrieve the first object and remove that object from set
		System.out.println(obj.first());
		System.out.println("After poll Set " + obj);
		
		//obj.add(null);//NPE
		
		System.out.println("Descending order " + obj.descendingSet());
	}

}
