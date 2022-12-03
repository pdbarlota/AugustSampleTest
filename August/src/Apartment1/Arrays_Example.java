package Apartment1;

import java.util.Arrays;

public class Arrays_Example {

	public static void main(String[] args) {

		int [] a = {4,5,1,2,7,3};
		
		System.out.println("Before sorting ");
		
		for(int i: a) {
			System.out.println(i);
		}
		Arrays.sort(a);
		//1,2,3,4,5,7
		
		System.out.println("After sorting ");
		
		for(int i: a) {
			System.out.println(i);
		}
		//Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));

	}

}
