package Apartment3;

public class Exception_example {

	public static void main(String[] args) {
	
		
		String[] s1= {"one","two","three"};
		try {
		System.out.println(s1[0]);
		System.out.println(s1[3]);//unwanted event your normal flow execution
		System.out.println(s1[1]);
		System.out.println(s1[2]);
		} catch(ArrayIndexOutOfBoundsException p) {
			System.out.println("Index is not present");
		}
	}

}
