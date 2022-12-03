package Apartment2;

public class Array_Example {

	//variable declara

	public int a; //variable declaraation 
	public static int [] b; //colllection of homogenous data //array declaration
	public int c[];
	public byte[] e;
	public int []f;
	
	//public [] int d;
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//Array initialization
		//1. To intialization array we have to use new keyword 
		b=new int[10];
		// new <typeofdata> [noof values to be store];
		
		//Step -allocate the memory 4*10
		//It will initlized with default value for all 10 
		
		//initilization instance array 
		Array_Example obj=new Array_Example();
		obj.c=new int[25];// 25
		
		//obj.e=new int[100];//complication array-array support only homogeneous 
		
		
		//How to access each and every value from array 
		
		System.out.println("value of b at index o " + b[0]);
		
		b[1]=25;
		
		//array index out of bound exception 
		//System.out.println("value of b at index 10" + b[10]);
		
		//Java throws null pointer exception if you try to access array without 
		//initilization 
		//System.out.println("value of f at index 0" + obj.f[0]);
		
		
		//Declaration and initliation in one line 
		
		int [] p=new int[300];
		
		System.out.println("size of p " + p.length);
		//Arrays 
		
		System.out.println(p[0]);
		System.out.println(p[1]);
		System.out.println(p[2]);
		System.out.println(p[3]);
		System.out.println(p[4]);

		int l=25;
		l=27;
		
		p[2]=34;
		
		for (int i=0;i<p.length;i++) {
			System.out.println("value of p " + p[i]); //p[]
		}
		
		for(int i=0;i<200;i++) {
			System.out.println("value of p " + p[i]);
		}
		
	// how to print value of array from large index to small
		
		int [] k=new int[0];
		System.out.println("size of k is " + k.length);
		//System.out.println(k[0]);
		
		/*int [] j=new int[-1];
		System.out.println("size of k is " + j.length);*/
		
		
	}

}
