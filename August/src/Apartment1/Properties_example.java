package Apartment1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties_example {

	public static void main(String[] args) throws IOException {
	
		Properties prop=new Properties();
		FileInputStream t=new FileInputStream(".\\test.properties");
		//. present current workspace+project
		prop.load(t);
		//prop.load
		
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("username"));
		
		
		prop.setProperty("browser", "test");
		
		FileOutputStream out=new FileOutputStream(".\\test.properties");
		
		prop.store(out, "writing in properties file");
		
		System.out.println(prop.getProperty("browser"));

	}

}
