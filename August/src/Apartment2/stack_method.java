package Apartment2;

import java.util.Stack;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class stack_method {

	public static void main(String[] args) {
		
		Stack Obj=new Stack<>();
		Obj.push(2);
		Obj.push("Testing");
		Obj.push(1);
		
		System.out.println(Obj);
		
		System.out.println(Obj.pop());//retrieve object and also remove from stack 
		
		System.out.println(Obj);
		
	System.out.println(Obj.pop());
		
		System.out.println(Obj);
		
		

	}

}
