package com.abc.newpackage;


class parentComplex{
	
	public void BuildComplex() {
		
		System.out.println("purchase the land");
	}
	 
	public int cash() {
		return 1000000;
	}
	
	//Access modifier -public 
	//return type -ICICI
	//Access modifir return type 
	//method name-getLoan()
	public ICICI getLoan() {
		ICICI newloan=new ICICI();
		return newloan;
	}
	//access modifier- it can be same or more accessible 
	//if it is default --default or protected or public
	
	//return type --
		//primitive data type - it should be same in child class 
		//non-primitive -it can remain same /it also allow to run child class
}


public class SonBunglow extends parentComplex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public privatebank getLoan() { //ICICI /privatebank
		privatebank loan=new privatebank();
		return loan;
	}
	
	public void BuildComplex() {
		System.out.println("Lets build Bunglow");
	}
	
	//method overiding 
	 //A. parent child sonBunglow 
	 //B. signture should be same Method+Parameter
	 //c. it should be same or more accessible 
	 //D. return type -primitie type 
	
	 public int cash() {
		 return 10000;
	 }
}


class RBI{
	
	public void RepoRate() {
		System.out.println("Repo rate is 6.5");
	}
	
}

class ICICI extends RBI{
	
	public void LoanInterest() {
		System.out.println("Interest rate is 8");
	}
}

class privatebank extends ICICI{
	

}
