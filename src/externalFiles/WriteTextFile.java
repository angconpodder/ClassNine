package externalFiles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WriteTextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		SimpleDateFormat formatter = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");  
		Date date = new Date();
		String StartTime = formatter.format(date);
		//System.out.println(StartTime);
		
		String path = "data\\myNewFile" + StartTime + ".txt"; //Relative File Path
		
		//File
		File f = new File(path);
		
		//Write the File
		FileWriter fw = new FileWriter(f, true);
		
		//Buffered Write - to Write characters
		BufferedWriter bfw = new BufferedWriter(fw);
		
		bfw.write("Hello");
		bfw.newLine();
		
		bfw.close();
	}

}
