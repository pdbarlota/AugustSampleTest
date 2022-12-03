package Apartment1;

public class String_SomeMethods {

	public static void main(String[] args) {
		
		String s1="abc";
		String s2=new String ("abc");
		System.out.println(s1==s2);
		
		String s3=s1.intern();
		System.out.println(s3==s1);
		String s4=s2.intern();
		System.out.println(s4==s2);
		
		System.out.println(s1.codePointAt(0));//97
		
		System.out.println(s1.contains("bd"));//to check whether string is present
		
		String s5="testing software";
		System.out.println(s5.endsWith("software"));
		
		String s6="this is single ";
		String s7=String.join(",", s6,s5);
		System.out.println(s7);
			
		

	}

}
