package com.abc.newpackage;

public class DataType {
	
	boolean a=true;
	boolean b=true;
	char c;
	String d="pankaj";
	byte e=127; //0
	short f=32767;//0
	int g; //0
	long h; //0 
	float j=3.4343434343432432432424324324f;//0.0
	double k=45; //0.0

	
	public static void main(String[] args) {
		DataType obj=new DataType();
		System.out.println("value of a " +obj.a);
		System.out.println("value of b "+ obj.b);
		System.out.println("value of c " + obj.c);
		System.out.println("value of e " + obj.e);
		System.out.println("value of f " + obj.f);
		System.out.println("value of g " + obj.g);
		System.out.println("value of h " + obj.h);
		System.out.println("value of j " + obj.j);
		System.out.println("value of k " + obj.k);

	}

}
