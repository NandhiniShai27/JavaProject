package com.BaseClass_new;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Base_ClassNew {
	static WebDriver driver;
public static WebDriver browserlaunch(String browser) {
if (browser.equalsIgnoreCase("chrome")) {
	WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
}	
else if (browser.equalsIgnoreCase("firefox")) {
	WebDriverManager.chromedriver().setup();
	 driver = new FirefoxDriver();	
}
else if (browser.equalsIgnoreCase("edge")) {
	WebDriverManager.chromedriver().setup();
	 driver = new EdgeDriver();
	}
driver.manage().window().maximize();
return driver;
}
public static void getmethods(String url) {
	driver.get(url);
}
public static void navigates(String value, String url) {
	if (value.equalsIgnoreCase("refresh")) {
		driver.navigate().refresh();
	}
	else if (value.equalsIgnoreCase(url)) {
		driver.navigate().to(url);
	}

}



public static void navigaterefresh() {
	driver.navigate().refresh();
}
public static void Navigatetourl(String Url) {
	driver.navigate().to(Url);
}
public static void Navigatebacktourl() {
	driver.navigate().back();
}
public static void Navigateforwardtourl() {
	driver.navigate().forward();
}


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




