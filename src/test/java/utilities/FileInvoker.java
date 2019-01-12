package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

 

public class FileInvoker {
	public static void printAllSheetData(String fileName) throws Exception  {
		
		File excelFile = new File(fileName);		
		Workbook wb  = WorkbookFactory.create(excelFile);
		Sheet sheet = wb.getSheetAt(0);
		int rowCount = sheet.getPhysicalNumberOfRows();
		int colCount = sheet.getRow(0).getLastCellNum();
		for (int i = 0; i <rowCount; i++) {
			System.out.println("row number: "+i);
			for (int j = 0; j < colCount; j++) {
				Cell cell = sheet.getRow(i).createCell(j);
				System.out.print(cell);
			}
			System.out.println();
		}
		
			wb.close();
		}
		
		
		
		public static String[][] printAllSheetData(String filePath,String sheetName) throws Exception  {
		
		FileInputStream fis = new FileInputStream(filePath);
		Workbook wb =WorkbookFactory.create(fis);
		
		Sheet sheet =wb.getSheet(sheetName);
		int rowCount = sheet.getPhysicalNumberOfRows();
		int colCount = sheet.getRow(0).getLastCellNum();
		String[][] data =new String[rowCount][colCount];
		for (int i = 0; i <rowCount; i++) {
		  
			for (int j = 0; j < colCount; j++) {
				Cell cell = sheet.getRow(i).createCell(j);
				 data[i][j]=cell.toString();
			}
		
			
		}
		fis.close();
		wb.close();
		return data;
		
		}

}
