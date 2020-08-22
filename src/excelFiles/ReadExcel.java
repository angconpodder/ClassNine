package excelFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		
		String path = "data\\RandomValues.xlsx"; //Relative File Path
		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = WorkbookFactory.create(fis);
		
		XSSFSheet s1 = (XSSFSheet) wb.getSheetAt(0);
		
		int rowCount = s1.getPhysicalNumberOfRows();
		
		Row r1 = s1.getRow(0);
		
		int colCount = r1.getPhysicalNumberOfCells();
		
		Cell cA = r1.getCell(1);
		
		System.out.println(cA);
		System.out.println(rowCount);
		System.out.println(colCount);
		
		fis.close();
		

	}

}
