package Apartment1;

public class String_methods {

	public static void main(String[] args) {
	
		String str="testing";
		String str1=new String("testing software");
		
		//lowercase -->small caps
		
		//Touppercase 
		String str3=str.toUpperCase();
		System.out.println(str3);//String is immutable and java is case
		System.out.println(str3.toLowerCase());
		System.out.println(str1.length());
		
		String str4=str.concat("software");
		System.out.println(str4);
		
		char p=str4.charAt(0); //to retrive specific char from string
		System.out.println(p);
		
		for(int i=0;i<str4.length();i++) {
			System.out.print(str4.charAt(i));
		}
		System.out.println();
		for(int j=str4.length()-1;j>=0;j--) {
			System.out.print(str4.charAt(j));
		}
		System.out.println();
		String Str6=" spaces";
		
		System.out.println(Str6.length());
		System.out.println(Str6);
		
		String str7=Str6.trim();
		System.out.println(str7.length());
		System.out.println(str7);
		
		//str7=spaces  taaces
		String Str8=str7.replace('s', 't');
		System.out.println(Str8);
		
		String Str9=str7.replace("sp", "ta");
		System.out.println(Str9);
		
		//Str9=taaces
		System.out.println(Str9.indexOf('c'));
		
		String str10="Baralota";
		System.out.println(str10.codePointAt(1));
		System.out.println(String.valueOf(10));
		System.out.println(String.join("-", "Testing","software"));
		System.out.println(str10.indexOf('a'));
		System.out.println(str10.lastIndexOf('a'));
		
		System.out.println(str10.indexOf('j'));//if respective character is not present in string -1
		System.out.println(str10.indexOf('a', 2));
		//str1
		
		//indexof===>it start from first character --from zero index
		//lastindexof---from last chractr
		
		
	}

}
