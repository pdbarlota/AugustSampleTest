package overriding;

import java.util.Scanner;

public class Scanner_Example {

	public static void main(String[] args) {
		
		System.out.println("Please enter the number which you want to check for odd and even");
		Scanner sc=new Scanner(System.in);
		String p=sc.next();
		System.out.println("p value " + p);
		if(sc.hasNextInt()) {//false
			int a=sc.nextInt();
			//if reminder is zero if you divide by 2
			if(a%2==0) {
				System.out.println("Number is even");
			} else 
				System.out.println("It is odd number");

		} else {
			System.out.println("Please enter the numeric value");
		}
		
	}

}
