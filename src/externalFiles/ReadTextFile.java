package externalFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadTextFile {

	public static void main(String[] args) throws IOException {
		
		String path = "data\\textFile.txt"; //Relative File Path
		
		//File
		File f = new File(path);
		
		//Read the File
		FileReader fr = new FileReader(f);
		
		//BufferedReader - to read characters
		BufferedReader bfr = new BufferedReader(fr);
		
		//System.out.println(bfr.readLine());
		//System.out.println(bfr.readLine());
		
		List<String> textLine = new ArrayList<String>();
		
		String line = null;
		while( (line=bfr.readLine()) != null ){
			//System.out.println(line);
			textLine.add(line);
		}
		
		System.out.println(textLine.size());
		
		System.out.println(textLine.get(2));

	}

}
