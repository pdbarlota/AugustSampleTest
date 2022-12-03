package Apartment1;

public class ifcondition {

	public static void main(String[] args) {
		int percentage = 34;

		if (percentage >= 60 && percentage < 75) {
			System.out.println("congration your are in first class");
		} else if (percentage >= 55 && percentage < 60) {
			System.out.println("Congratulation you are itn second grade");
		} else if (percentage < 55 && percentage >= 35) {
			System.out.println("Hard luck try next time you are in third grade");
		} else 	if (percentage >= 75) {
			System.out.println("you are in distinction");
		} else {
			System.out.println("you are fail");
		} 
	}
	
	//else will be maximun for each if conditon 
	//else else if 

}
