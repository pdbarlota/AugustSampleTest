package Apartment1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class MultipleCatch implements AutoCloseable {

	public static void main(String[] args) {
		
		
		try {
			System.out.println("I am before exception");
			System.out.println(10/0); //arithmetic 
		}catch(ArithmeticException p) {
			
		} catch(NullPointerException p) {
			
		} 
		
         //try with resourcs
		try (	MultipleCatch t=new MultipleCatch())  {
			
			System.out.println("I am before exception");
			System.out.println(10/0);
		}catch(ArithmeticException | NullPointerException  p) {
			
		} catch(Exception p) {
			
		}
	}

	@Override
	public void close() throws Exception {
		
	}

}
