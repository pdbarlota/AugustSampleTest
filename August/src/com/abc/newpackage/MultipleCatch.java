package com.abc.newpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MultipleCatch {

	public static void main(String[] args) throws FileNotFoundException {
		ReadTheFile obj=new ReadTheFile();
		obj.readFile();
	
}

	public void readFile() {
	
	// Checked excepton and unchecked exception 
	try {
		FileReader reader=new FileReader(new File("path of the file"));
	} /*catch(FileNotFoundException j){
		
	}	
	catch(IOException p) {
		
	} */
	
	
	
	catch( IOException | ArithmeticException p ) {
		
	}
}

}
