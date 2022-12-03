package com.abc.newpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadTheFile {

	public static void main(String[] args) throws FileNotFoundException {

			ReadTheFile obj=new ReadTheFile();
			obj.readFile();
			obj.M1();
	}
	
	public void readFile() throws FileNotFoundException {
		
		FileReader reader=new FileReader(new File("path of the file"));
	}

	public void M1() throws FileNotFoundException {
		readFile();
		
	}
	
	public void M2() throws FileNotFoundException {
		readFile();
	}
	
	public void M3() {
		//M2();
	}
}
