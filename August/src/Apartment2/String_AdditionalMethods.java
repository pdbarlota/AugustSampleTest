package Apartment2;

public class String_AdditionalMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="testing";
		
		String s2="tEsting";
		
		//to get the ascii value of char at specific index 
		System.out.println(s1.codePointAt(0));
		
		int a=s1.compareTo(s2);

		System.out.println("value of a "+ a);
		System.out.println(s1.contains("test"));
		
		System.out.println(s1.endsWith("ing"));//true
		System.out.println(s1.startsWith("ing"));//false
		
		System.out.println(s1.isEmpty());
		
		String s3="";
		System.out.println(s3.isEmpty());
		
		String s4="This is only for the purpose of split";
		//reverse the word 
		//split of purpose the for only is this
		
		String [] S6=s4.split(" ");
		
		for(int i=S6.length-1;i>=0;i--) {
			System.out.print(S6[i]+ " ");
		}
		System.out.println();
		String s7=String.valueOf(2);
		
		String s8="Novermber";
		String s9=s8.intern();
		
		String s10=new String ("Novermber");
		
		String s11=s10;//s10.intern();
		
		System.out.println("value of s11");
		System.out.println(s11);
		
		System.out.println(s11==s10);
		System.out.println(s9==s8);
		
		
		//System.out.println(s7);
		
	}

}
