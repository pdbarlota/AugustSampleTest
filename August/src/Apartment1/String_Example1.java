package Apartment1;

public class String_Example1 {

	public static void main(String[] args) {
	
		String s1="testing"; //one object in scp
		String s2=new String("new string");
		
		//if you want to convert string from lower case to upper case 
		
		String s3=s1.toUpperCase();
		System.out.println(s3);
		
		String s4="SOFTWARE";
		
		String s5=s4.toLowerCase();
		System.out.println(s5);
		
		//to check the length of the string
		
		System.out.println("Length of string "+s1.length());
		
		//To get the specific character from the string
		char p=s1.charAt(2);//t=0 e=1 s=2
		System.out.println(p);
		
		//print the string in reverse gnitest
		
		for(int i=s1.length()-1;i>=0;i--) {
			System.out.print(s1.charAt(i));
		}

		System.out.println();
		
		//to remove the extra space from both side 
		
		String s6="remove spaces";
		System.out.println(s6);
		System.out.println(s6.trim());
		
		//to get the index of specific char in string 
		
		String s7="pankaj";
		         //0123456 
		System.out.println(s7.indexOf('a'));//search strt from 0
		System.out.println(s7.lastIndexOf('a'));//5 search start from last index
		System.out.println(s7.indexOf('a', 2));//3 search start specific index
		
		//concat --> join the two string 
		
		String s8=s7.concat("jain");
		
		System.out.println(s8);
		//pankajjain 
		//0123456789
		
		//replace --if you want to replace specific char from the string
		
		String s9=s8.replace('a', 'k');
		System.out.println(s9);
		
		String s10=s8.replace("pan", "tat");
		System.out.println(s10);
		
		//Substring 
		String s11=s8.substring(4);//start from index 4 and it will retrieve till the end
		System.out.println(s11);
		
		String s12=s8.substring(4, 6); //starting index 4 and end index 6
		System.out.println(s12);//equal to starting index and less than end index
		
		
		//equals ,compareto ==
		
		String s13="pune";
		String s14="pune";
		String s15=new String ("Pune");
		
		System.out.println(s13.equals(s14));
		System.out.println(s13.equals(s15));//false
		System.out.println(s13.equalsIgnoreCase(s15));//true
		
		System.out.println(s13==s14);//true
		System.out.println(s13==s15);//false
		
		
	}

}
