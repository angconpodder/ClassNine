package excelFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws IOException {
		
		//.doc (HSSF) // .docx (XSSF)
		//.xls (HSSF) // .xlsx
		
		
		XSSFWorkbook wb = new XSSFWorkbook();
		
		XSSFSheet s1 = wb.createSheet("RandomNumber");
		//XSSFSheet s2 = wb.createSheet("Drinks");
		
		/*
			Row r1 = s1.createRow(0);
			Row r2 = s1.createRow(1);
			
			Cell cA = r2.createCell(0);
			
			cA.setCellValue("Taco");
		*/
		
		
		s1.createRow(0).createCell(0).setCellValue("No");
		s1.getRow(0).createCell(1).setCellValue("Random");
		
		
		for(int i=1; i<=500; i++){
			s1.createRow(i).createCell(0).setCellValue(i);
			s1.getRow(i).createCell(1).setCellValue(getRandomNumberInRange(100, 999));
		}

		String path = "data\\RandomValues.xlsx"; //Relative File Path
		File f = new File(path);
		FileOutputStream fos = new FileOutputStream(f);
		
		
		wb.write(fos);
		fos.close();


	}
	
	public static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

}
