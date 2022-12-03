package Interface_example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AutoClosable_Resources implements AutoCloseable{

	public static void main(String[] args) throws Exception {

		try (
				AutoClosable_Resources t1=new AutoClosable_Resources();
				FileReader reader = new FileReader(new File(""));
				BufferedReader t=new BufferedReader(reader); //unreachable
				) {
		
			
		} catch (FileNotFoundException |ArithmeticException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
	}

	@Override
	public void close() throws Exception {
	System.out.println("close method is called");
		
	}

}
