package Apartment2;

public class String_Methods {

	public static void main(String[] args) {
	
		String s1="Testing";
				 //0123456
		
		//substring --it will break the string it will retrieve partial string
		
		String S2=s1.substring(2);
		System.out.println(S2);
		
		//starting point ,end 
		
		String s3=s1.substring(2, 6);//retrieve from index equal to 2 and less than 5
		System.out.println(s3);//sti
		
		//To check whether both string are same or not 
		//equal , compareTo ,==
		
		String s4="software testing";
		String s5=new String("software testing");
		System.out.println(s4.equals(s5));//content of string--true
		System.out.println(s4==s5);//it will check whether reference is pointing to same
		//object or not 
		String s6="software testing";
		System.out.println(s4==s6);
		String s7=new String("software testing");
		System.out.println(s7==s5);//false
		
		
		String s8="Pune";
		String s9="pune";
		
		System.out.println(s8.equals(s9));//equal method do content comparasion also case
		System.out.println(s8==s9);
		System.out.println(s8.equalsIgnoreCase(s9));
		
		//TO get the ascii value
		
		System.out.println(s8.codePointAt(0));
		String s10=String.join("&&", s6,s8,s7);
		System.out.println(s10);
		System.out.println(s6.contains("test"));
		String s11="Test";
		System.out.println(s6.contains(s11.toLowerCase()));
		
		//Constructor chaining -->Method chaining
		
		//S8="Pune" //pune
		//System.out.println(.equals(s9));
		
		boolean t=s8.contains("e");//pune
		
		System.out.println(s8.toLowerCase().equals(s9));
		
		System.out.println(s11.endsWith("st")); //true
		System.out.println(s11.startsWith("st"));//false
		
		System.out.println(s11.isEmpty());
		String s12="";
		System.out.println(s12.isEmpty());
		//intern , matches ,split 
		
		String s13="PAne";
		String s14="Pane";
		System.out.println(s13.compareTo(s14));
		

	}

}
