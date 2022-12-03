package typecasting;

public class Array_Example {
	
	//non-static array 
	public int [] a; //single dimensional array
	
	//static array 
	public static int [] b= {10,20,30,40,50,60};//0,1,2,3,4,5

	
	public static int [] c [];//two dimensional array
	
	public static int [] [] p= {{100,200},{300,400}};
	
	public static void main(String[] args) {
	
		//If we try to access the array without initlization -Nullpointer 
		
		//Arrayname=new datatype[size]
		
		Array_Example t=new Array_Example();
		t.a=new int[10];
		
		//How i can get the size
		System.out.println("Size of a " + t.a.length);
		
		for(int j=0;j<t.a.length;j++) {
			System.out.println("value of a" + t.a[j]);
		}
		
		//first iteration j=0 condition 0<9  value of a t.a[0]
		//second condition 1<9  value of a t.a[1]
		
		//for each is used to iterate through each and every element of array
		for(int i:b) {
			System.out.println(i);
		}
		//first iteration --> i will represent index 0 -->i=t.a[0]
		//second iteration --> i will represent value at index 1 t=t.a[1]
		
		//for(variabledeclaration:arrayname)
		
		c=new int[20][2]; //no of value array can store 2*2=4
		
		//Accessing value of array c
		System.out.println(c[0][0]);
		System.out.println(c[0][1]);
		System.out.println(c[1][0]);
		System.out.println(c[1][1]);
		
		for(int k=0;k<2;k++) {
			for(int j=0;j<2;j++) {
				System.out.println("value of c " + p[k][j]);
			}
		}
		
		
		System.out.println("dimension of c" + c.length);//it will represent first dimension
		System.out.println("dimension of c at index" + c[0].length);
		
		
		
	}
	
	//how to use the length in two dimensional array 
	
	
}
