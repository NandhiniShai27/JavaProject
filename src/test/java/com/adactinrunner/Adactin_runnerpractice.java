package com.adactinrunner;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import com.baseclasspractice.BaseClass_Practice;


public class Adactin_runnerpractice extends BaseClass_Practice {
	public static WebDriver driver;

	public static void main(String[] args)  {
	

	driver = browserlaunch("chrome");
	
	url("http://adactinhotelapp.com/");
    
    WebElement user = driver.findElement(By.xpath("//input[@id='username']"));;
    valuesonelement(user, "Nandhinimanikandan");
    
    WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
    valuesonelement(pass, "Nandhini@27");
    
    WebElement login = driver.findElement(By.xpath("//input[@id='login']"));
    buttonclick(login);
   
    WebElement location = driver.findElement(By.xpath("//select[@name='location']"));      
    selectbydropdown(location, "index", "1");

    WebElement hotels = driver.findElement(By.xpath("//select[@name='hotels']"));
    selectbydropdown(hotels, "text", "Hotel Creek");
    
    WebElement room = driver.findElement(By.xpath("//select[@name='room_type']"));
    selectbydropdown(room, "index", "2");
    
    WebElement rommtype = driver.findElement(By.xpath("//select[@name='room_nos']"));
    selectbydropdown(rommtype, "index", "2");

    WebElement check = driver.findElement(By.xpath("//input[@id='datepick_in']"));
    clearonelement(check);
    valuesonelement(check, "11/10/2023");
	
	WebElement checkout = driver.findElement(By.xpath("//input[@id='datepick_out']"));
	clearonelement(checkout);
	valuesonelement(checkout, "12/10/2023");
	
	WebElement adult = driver.findElement(By.xpath("//select[@id='adult_room']"));
    selectbydropdown(adult, "index", "2");
	
    WebElement child = driver.findElement(By.xpath("//select[@id='child_room']"));
    selectbydropdown(child, "index", "1");
	
    WebElement search = driver.findElement(By.xpath("//input[@id='Submit']"));
	buttonclick(search);
	
	WebElement radio = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
	buttonclick(radio);
	
	WebElement cont = driver.findElement(By.xpath("//input[@id='continue']"));
	buttonclick(cont);
	
	WebElement name = driver.findElement(By.xpath("//input[@name='first_name']"));
	valuesonelement(name, "Nandhini");
	
	WebElement lastname = driver.findElement(By.xpath("//input[@name='last_name']"));
	valuesonelement(lastname, "Manikandan");
	
	WebElement address = driver.findElement(By.xpath("//textarea[@name='address']"));
	valuesonelement(address, "Porur,Tamilnadu");
	
	WebElement card = driver.findElement(By.xpath("//input[@name='cc_num']"));
	valuesonelement(card, "6532345678912345");
	
	 WebElement cc = driver.findElement(By.xpath("//select[@name='cc_type']"));
	 selectbydropdown(cc, "index", "1");
	 
	 WebElement exp = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
	 selectbydropdown(exp, "index", "7");
	
	 WebElement year = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
	 selectbydropdown(year, "index", "19");
	 
		WebElement cvv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		valuesonelement(cvv, "234");
		
		WebElement book = driver.findElement(By.xpath("//input[@name='book_now']"));
		buttonclick(book);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement now = driver.findElement(By.id("my_itinerary"));
		buttonclick(now);
		
		WebElement checkall = driver.findElement(By.xpath("//input[@name='check_all']"));
        clickonelement(checkall);
		
        WebElement cancelall = driver.findElement(By.xpath("//input[@name='cancelall']"));
        buttonclick(cancelall);
        
//        WebElement cancelall1 =driver.findElement(By.name("cancelall1"));
        simplealert(cancelall);
        
        WebElement logout = driver.findElement(By.xpath("//input[@name='logout']"));
        Clickonlogout(logout);
        }
	
}
