package com.orangehrmPractice;

import java.awt.AWTException;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseclasspractice.BaseClass_Practice;

public class OrangeHRM2 extends BaseClass_Practice {
	public static WebDriver driver;
	public static void main(String[] args) throws AWTException, InterruptedException {
		driver = browserlaunch("chrome");
		 url("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 implicitywaits(10);
		 WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		 valuesonelement(username, "Admin");
		 WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		 valuesonelement(password, "admin123");
		 WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		 buttonclick(login);
		 
		 WebElement Myinfo = driver.findElement(By.xpath("//span[text()='My Info']"));
		 buttonclick(Myinfo);
		//contanct details
	     WebElement contactdetails = driver.findElement(By.xpath("//a[text()='Contact Details']"));
         buttonclick(contactdetails);
         WebElement street1 = driver.findElement(By.xpath("//label[text()='Street 1']/parent::div/following-sibling::div/input"));
	     buttonclick(street1);
	     valuesonelement(street1, "No.10, Ambedkar Street");
	     WebElement street2 = driver.findElement(By.xpath("//label[text()='Street 2']/parent::div/following-sibling::div/input"));
	     buttonclick(street2);
         valuesonelement(street2, "GandhiNagar, Velachery");
         WebElement city = driver.findElement(By.xpath("//label[text()='City']/parent::div/following-sibling::div/input"));
	     buttonclick(city);
	     valuesonelement(city, "Chennai");
	     WebElement state = driver.findElement(By.xpath("//label[text()='State/Province']/parent::div/following-sibling::div/input"));
	     buttonclick(state);
	     valuesonelement(state, "TamilNadu");
	     WebElement Zipcode = driver.findElement(By.xpath("//label[text()='Zip/Postal Code']/parent::div/following-sibling::div/input"));
	     buttonclick(Zipcode);
	     valuesonelement(Zipcode, "6000098");
	     WebElement country = driver.findElement(By.xpath("//label[text()='Country']/parent::div/following-sibling::div/div/div/div[1]"));
	     buttonclick(country);
	     WebDriverWait wa = new WebDriverWait(driver, 20);
	     WebElement india = wa.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='India']"))); 
	     buttonclick(india);
	     WebElement home = driver.findElement(By.xpath("//label[text()='Home']/parent::div/following-sibling::div/input"));
	     buttonclick(home);
	     valuesonelement(home, "9568456589");
	     WebElement mobile = driver.findElement(By.xpath("//label[text()='Mobile']/parent::div/following-sibling::div/input"));
	     buttonclick(mobile);
	     valuesonelement(mobile, "9845356879");
	     WebElement work = driver.findElement(By.xpath("//label[text()='Work']/parent::div/following-sibling::div/input"));
	     buttonclick(work);
	     Robot(KeyEvent.VK_CONTROL, "keypress");
		 Robot(KeyEvent.VK_A, "keypress");
		 Robot(KeyEvent.VK_BACK_SPACE, "keypress");
	     Robot(KeyEvent.VK_CONTROL,"keyrelease");
	     Robot(KeyEvent.VK_A,"keyRelease");
    	 Robot(KeyEvent.VK_BACK_SPACE,"keyRelease");
    	 valuesonelement(work, "0445678238");
	     WebElement workmail = driver.findElement(By.xpath("//label[text()='Work Email']/parent::div/following-sibling::div/input"));
	     buttonclick(workmail);
	     Robot(KeyEvent.VK_CONTROL, "keypress");
		 Robot(KeyEvent.VK_A, "keypress");
		 Robot(KeyEvent.VK_BACK_SPACE, "keypress");
	     Robot(KeyEvent.VK_CONTROL,"keyrelease");
	     Robot(KeyEvent.VK_A,"keyRelease");
    	 Robot(KeyEvent.VK_BACK_SPACE,"keyRelease");
    	 valuesonelement(workmail, "najhdinaid2389@gmail.com");
    	 WebElement mail = driver.findElement(By.xpath("//label[text()='Other Email']/parent::div/following-sibling::div/input"));
	     buttonclick(mail);
	     Robot(KeyEvent.VK_CONTROL, "keypress");
		 Robot(KeyEvent.VK_A, "keypress");
		 Robot(KeyEvent.VK_BACK_SPACE, "keypress");
	     Robot(KeyEvent.VK_CONTROL,"keyrelease");
	     Robot(KeyEvent.VK_A,"keyRelease");
    	 Robot(KeyEvent.VK_BACK_SPACE,"keyRelease");
    	 valuesonelement(mail, "najuakauhanja5689@gmail.com");
    	 WebElement save3 = driver.findElement(By.xpath("//button[@type='submit']"));
	     clickonelement(save3);
//Emergencycontact
	     WebElement emgcontact = driver.findElement(By.xpath("//a[text()='Emergency Contacts']"));
	     clickonelement(emgcontact);
	     WebElement add = driver.findElement(By.xpath("(//button[@type='button' and @class='oxd-button oxd-button--medium oxd-button--text'])[1]"));
	     clickonelement(add);
	     WebElement name = driver.findElement(By.xpath("//label[text()='Name']//parent::div/following-sibling::div/input"));
	     clickonelement(name);
	     valuesonelement(name,"Mahi");
	     WebElement relationship = driver.findElement(By.xpath("//label[text()='Relationship']//parent::div/following-sibling::div/input"));
	     clickonelement(relationship);
	     valuesonelement(relationship, "Father");
	     WebElement emgphone = driver.findElement(By.xpath("//label[text()='Home Telephone']//parent::div/following-sibling::div/input"));
	     clickonelement(emgphone);
	     valuesonelement(emgphone, "8928475958");
	     WebElement emgmob = driver.findElement(By.xpath("//label[text()='Mobile']//parent::div/following-sibling::div/input"));
	     clickonelement(emgmob);
	     valuesonelement(emgmob, "9999955555");
	     WebElement emgwork = driver.findElement(By.xpath("//label[text()='Work Telephone']//parent::div/following-sibling::div/input"));
	     clickonelement(emgwork);
	     valuesonelement(emgwork, "04455598961");
	     WebElement save4 = driver.findElement(By.xpath("//button[@type='submit']"));
	     clickonelement(save4);
	   //Attachment
	    // WebElement attachments = driver.findElement(By.xpath("//h6[text()='Attachments']/following::button[@type='button']"));
	     //attachments.click();
	     //driver.findElement(By.xpath("//input[@type='file']")) .sendKeys("C:\\Users\\ADMIN\\eclipse-workspace\\Mavenproject\\Myfiles\\Break_Statement.txt");
	     
	}
	
}
