package externalFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ExternalFiles {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		
		//Properties: filename.properties
		//Text: filename.txt
		//Java: filename.java
		//html: filename.html
		//xml: filename.xml
		
		int a = 10;
		System.out.println(a);
		
		String b = "bye";
		System.out.println(b);
		
		String path = "data\\test.properties";
		
		Properties prop = new Properties();
		//FileInputStream fis = new FileInputStream("D:\\Java Work\\April2020\\ClassNine\\data\\test.properties"); //location of the file
		FileInputStream fis = new FileInputStream(path); //location of the file
		prop.load(fis);
		
		
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("grade"));
		System.out.println(prop.getProperty("course"));
		
	}

}
