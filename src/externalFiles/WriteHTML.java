package externalFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class WriteHTML {

	public static void main(String[] args) throws IOException {
		SimpleDateFormat formatter = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");  
		Date date = new Date();
		String StartTime = formatter.format(date);
		//System.out.println(StartTime);
		
		String path = "data\\myNewFile" + StartTime + ".html"; //Relative File Path
		
		//File
		File f = new File(path);
		
		//Write the File
		FileWriter fw = new FileWriter(f, true);
		
		//Buffered Write - to Write characters
		BufferedWriter bfw = new BufferedWriter(fw);
		
		bfw.write("<html><head><title>MyFirstWebsite</title></head><body bgcolor=\"skyblue\"><h1>Hello World!</h1><p>");
		
		
		for(int i=0; i<500; i++){
			bfw.write(getRandomNumberInRange(100, 999) + "");
			bfw.write("<br>");
		}
		
		bfw.write("</p></body></html>");
		bfw.newLine();
		
		
		bfw.close();

	}
	
	public static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

}
