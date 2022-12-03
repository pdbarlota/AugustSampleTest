package Apartment1;

import java.util.Scanner;

public class System_Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the value which you want to check for odd and even");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a%2==0) {
			System.out.println("It is even number" + a);
		} else {
			System.out.println("It is odd number "+ a);
		}

	}

}
