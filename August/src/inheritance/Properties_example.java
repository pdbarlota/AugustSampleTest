package inheritance;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties_example {

	public static void main(String[] args) throws IOException {
		
		Properties prop=new Properties();
		
		//We have to load that property file 
		
		
		//data is coming from file into program -->Stream --inputstream
		
		FileInputStream in =new FileInputStream(".\\resources\\sampletest.properties");
		
		//. ==workspace path+projectname
		prop.load(in);
		
		System.out.println(prop.getProperty("browsername"));
		
		prop.setProperty("browsername", "edge");
		
		System.out.println(prop.getProperty("browsername"));
		
		FileOutputStream out=new FileOutputStream(".\\resources\\sampletest.properties");
		prop.store(out, "New value updated");

	}

}
