package Apartment1;

import java.util.Stack;

public class Stack_Method {

	public static void main(String[] args) {
		
		Stack<Object> obj =new Stack<>();
		obj.push("test");
		obj.push("test1");
		obj.push("test2");
		
		System.out.println(obj);
		
		System.out.println(obj.pop());
		
		System.out.println(obj);

	}

}
