package com.BaseClass_new;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
public class DataDrivern_BaseClass {
//	public static void fileconversion(String excelpath, String filename, String value) throws IOException {
//		File f = new File(excelpath);
//		FileInputStream fis = new FileInputStream(filename);
//		if (value.equals("XSSF")) {
//			Workbook wb = new XSSFWorkbook(fis);	
//		}
//		else if (value.equals("HSSF")) {
//			Workbook wb = new HSSFWorkbook(fis);	
//		}
//		return fileconversion;
//	}
	public static String particulardata(String excelpath, String sheetname,int rowvalue, int columnvalue) throws IOException {
		String data = null;
		File f = new File(excelpath);
		FileInputStream fis = new FileInputStream(f);	
		Workbook wb = new XSSFWorkbook(fis);
	    Sheet sheet = wb.getSheet(sheetname);
        Row row = sheet.getRow(rowvalue);
        Cell cell = row.getCell(columnvalue);
        CellType cellType = cell.getCellType();    
	    if (cellType.equals(CellType.STRING)) {
	    	 data = cell.getStringCellValue();     //if we take a return type for getstring cell//we get string
		    System.out.println(data); //just data printed in console. If we change the string means username passed in the url
	    }
	    else if (cellType.equals(CellType.NUMERIC)) {
			double ncv = cell.getNumericCellValue();
		     data = Double.toString(ncv);
		     System.out.println(data);
	    }
	return data;
	}
	
	
	}
	
	
	
	
	
	
	
 	
  	
	

