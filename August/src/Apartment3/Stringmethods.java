package Apartment3;

public class Stringmethods {

	public static void main(String[] args) {
		
		String s1="this is example string";
		
		//string example is this
		String[] s2=s1.split(" ");
		
		System.out.println(s2.length);
		
		System.out.println(s2[0]);
		System.out.println(s2[1]);
		
		for(int i=s2.length-1;i>=0;i--) { //i=2 3>0 s2[2]
			System.out.print(s2[i]+ " ");
		}

		
		//TO get ascii value of specific character
		System.out.println(s1.codePointAt(2));
		
		String s3=s1.intern();
		
		String s4=new String("test");
		String s5=s4;//s4.intern()
		
		String s8=String.valueOf(34.34);
		
		//s1.mat
	}

}
