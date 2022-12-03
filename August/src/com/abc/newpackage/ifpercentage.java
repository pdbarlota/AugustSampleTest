package com.abc.newpackage;

public class ifpercentage {
	
	
	public static void main(String[] args) {
	int percentage=75;
	int rollnumber=5;
	if(percentage>60 && rollnumber==5) { 
		if(percentage>75) { //nested if condition 75>75 false
			System.out.println("Congrulation you got distinction");
		} else {
		System.out.println("Congraulation --You are in 1st Class grade");
		}
	}else if(percentage<60 && percentage>35 && rollnumber==5) {
		System.out.println("Congratulation --You got 2nd grade");
	} else if (percentage<35 && rollnumber==5) {
		System.out.println("Hard luck --Try next time");
	}else {
		System.out.println("Plese check the details");
	}
	}

	
	

}
