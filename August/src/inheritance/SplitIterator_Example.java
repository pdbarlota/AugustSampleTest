package inheritance;

import java.util.HashSet;
import java.util.Spliterator;

public class SplitIterator_Example {

	public static void main(String[] args) {
		
		
		HashSet<Object> obj=new HashSet<>();
		
		obj.add(12);
		obj.add(23);
		obj.add("String");
		
		System.out.println(obj);
		
		Spliterator<Object> p= obj.spliterator();
		
		p.forEachRemaining(j->{
			System.out.println(j);
		});
	}

}
