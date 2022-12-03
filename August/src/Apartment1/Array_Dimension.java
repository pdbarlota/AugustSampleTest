package Apartment1;

public class Array_Dimension {
	
	static int [] a; //single dimensional array and we have declare
	static int [] b= {10,20,30,40,50};//declare +inilization it will not value
	int [][] c;//two dimensional -declaration
	
	
	public static void main(String [] abc) {
		a=new int[5] ; //initilization at another location
		int [] d=new int[5];
		Array_Dimension obj=new Array_Dimension();
		obj.c=new int[2][2];
		
		
		//Approach 1- if d is having five elements
		
		System.out.println(d[0]);
		System.out.println(d[1]);
		System.out.println(d[2]);
		System.out.println(d[3]);
		System.out.println(d[4]);
		
		//Approach 2 - used for for loop
		
		for(int i=0;i<d.length;i++) {
			System.out.println("Value of d " +d[i]);
		}
		
		//Approach 3- for each loop 
		for(int j:d) { 
			System.out.println("value of j" + j);
		}
		
		float [] p=new float[10];
		
		
		for(float k:p) {
			System.out.println("float value "+ k);
		}
		
		obj.c[0][0]=2;
		obj.c[0][1]=4;
		obj.c[1][0]=6;
		obj.c[1][1]=8;
		
		for(int j=0;j<obj.c.length;j++) {
			for (int k=0;k<obj.c[j].length;k++) {
				System.out.println(obj.c[j][k]);
			}
		}
		
	}
	

}
