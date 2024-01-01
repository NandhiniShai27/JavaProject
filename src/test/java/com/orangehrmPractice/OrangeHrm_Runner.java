package com.orangehrmPractice;
import java.awt.AWTException;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.baseclasspractice.BaseClass_Practice;
public class OrangeHrm_Runner extends BaseClass_Practice{
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
//implicitywaits(10);
		 WebDriverWait wa1= new WebDriverWait(driver, 20);
		 WebElement firstname = wa1.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='firstName']")));
// WebElement firstname = driver.findElement(By.xpath("//input[@name='firstName']"));
		 buttonclick(firstname);
	     clearonelementbyrobot(firstname);
//		 Robot(KeyEvent.VK_CONTROL, "keypress");
//		 Robot(KeyEvent.VK_A, "keypress");
//		 Robot(KeyEvent.VK_BACK_SPACE, "keypress");
//	     Robot(KeyEvent.VK_CONTROL,"keyrelease");
//	     Robot(KeyEvent.VK_A,"keyRelease");
//    	 Robot(KeyEvent.VK_BACK_SPACE,"keyRelease");
    	 valuesonelement(firstname, "Shai");
    	 
		 WebElement middlename = driver.findElement(By.xpath("//input[@name='middleName']"));
		 buttonclick(middlename);
		 Robot(KeyEvent.VK_CONTROL, "keypress");
		 Robot(KeyEvent.VK_A, "keypress");
		 Robot(KeyEvent.VK_BACK_SPACE, "keypress");
	     Robot(KeyEvent.VK_CONTROL,"keyrelease");
	     Robot(KeyEvent.VK_A,"keyRelease");
    	 Robot(KeyEvent.VK_BACK_SPACE,"keyRelease");
		 valuesonelement(middlename, "Krishna");
		 
         WebElement lastname = driver.findElement(By.xpath("//input[@name='lastName']"));
         buttonclick(lastname);
         Robot(KeyEvent.VK_CONTROL, "keypress");
		 Robot(KeyEvent.VK_A, "keypress");
		 Robot(KeyEvent.VK_BACK_SPACE, "keypress");
	     Robot(KeyEvent.VK_CONTROL,"keyrelease");
	     Robot(KeyEvent.VK_A,"keyRelease");
    	 Robot(KeyEvent.VK_BACK_SPACE,"keyRelease");
	     valuesonelement(lastname, "M");
	     
	     WebElement nickname = driver.findElement(By.xpath("//label[text()='Nickname']/parent::div/following-sibling::div/input"));
	     buttonclick(nickname);
	     Robot(KeyEvent.VK_CONTROL, "keypress");
		 Robot(KeyEvent.VK_A, "keypress");
		 Robot(KeyEvent.VK_BACK_SPACE, "keypress");
	     Robot(KeyEvent.VK_CONTROL,"keyrelease");
	     Robot(KeyEvent.VK_A,"keyRelease");
    	 Robot(KeyEvent.VK_BACK_SPACE,"keyRelease");
	     valuesonelement(nickname, "Hari");
	    Thread.sleep(1000);
	     WebElement empid = driver.findElement(By.xpath("//label[text()='Employee Id']//following::input[1]"));
	     buttonclick(empid);
	     Robot(KeyEvent.VK_CONTROL, "keypress");
		 Robot(KeyEvent.VK_A, "keypress");
		 Robot(KeyEvent.VK_BACK_SPACE, "keypress");
	     Robot(KeyEvent.VK_CONTROL,"keyrelease");
	     Robot(KeyEvent.VK_A,"keyRelease");
    	 Robot(KeyEvent.VK_BACK_SPACE,"keyRelease");
    	 valuesonelement(empid,"921500");
    	 
    	 WebElement otherid = driver.findElement(By.xpath("//label[text()='Other Id']//following::input[1]"));
    	 buttonclick(otherid);
    	 Robot(KeyEvent.VK_CONTROL, "keypress");
		 Robot(KeyEvent.VK_A, "keypress");
		 Robot(KeyEvent.VK_BACK_SPACE, "keypress");
	     Robot(KeyEvent.VK_CONTROL,"keyrelease");
	     Robot(KeyEvent.VK_A,"keyRelease");
    	 Robot(KeyEvent.VK_BACK_SPACE,"keyRelease");
	     valuesonelement(otherid, "2150");
	     
	     WebElement licenseno = driver.findElement(By.xpath("(//label[@class='oxd-label'])[4]//following::input[1]"));
	     buttonclick(licenseno);
	     Robot(KeyEvent.VK_CONTROL, "keypress");
		 Robot(KeyEvent.VK_A, "keypress");
		 Robot(KeyEvent.VK_BACK_SPACE, "keypress");
	     Robot(KeyEvent.VK_CONTROL,"keyrelease");
	     Robot(KeyEvent.VK_A,"keyRelease");
    	 Robot(KeyEvent.VK_BACK_SPACE,"keyRelease");
	     valuesonelement(licenseno, "NAM0 92178367890");
	     
	     WebElement expdate = driver.findElement(By.xpath("(//input[@placeholder='yyyy-mm-dd'])[1]"));
	     buttonclick(expdate);
	     Robot(KeyEvent.VK_CONTROL, "keypress");
		 Robot(KeyEvent.VK_A, "keypress");
		 Robot(KeyEvent.VK_BACK_SPACE, "keypress");
	     Robot(KeyEvent.VK_CONTROL,"keyrelease");
	     Robot(KeyEvent.VK_A,"keyRelease");
    	 Robot(KeyEvent.VK_BACK_SPACE,"keyRelease");
	     valuesonelement(expdate, "2031-12-12");
	   
	     WebElement ssn = driver.findElement(By.xpath("//label[text()='SSN Number']//following::input[1]"));
	     buttonclick(ssn);
	     Robot(KeyEvent.VK_CONTROL, "keypress");
		 Robot(KeyEvent.VK_A, "keypress");
		 Robot(KeyEvent.VK_BACK_SPACE, "keypress");
	     Robot(KeyEvent.VK_CONTROL,"keyrelease");
	     Robot(KeyEvent.VK_A,"keyRelease");
    	 Robot(KeyEvent.VK_BACK_SPACE,"keyRelease");
	     valuesonelement(ssn,"34567898993");
	     
	     WebElement sin = driver.findElement(By.xpath("//label[text()='SIN Number']//following::input[1]"));
	     buttonclick(sin);
	     Robot(KeyEvent.VK_CONTROL, "keypress");
		 Robot(KeyEvent.VK_A, "keypress");
		 Robot(KeyEvent.VK_BACK_SPACE, "keypress");
	     Robot(KeyEvent.VK_CONTROL,"keyrelease");
	     Robot(KeyEvent.VK_A,"keyRelease");
    	 Robot(KeyEvent.VK_BACK_SPACE,"keyRelease");
	     valuesonelement(sin, "45678998292");
	     	    
	     WebElement nationality = driver.findElement(By.xpath("//label[text()='Nationality']/parent::div/following-sibling::div/div/div/div"));
         clickonelement(nationality);
         WebDriverWait wa = new WebDriverWait(driver,20); 
         WebElement Algeria = wa.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Algerian']")));
	     clickonelement(Algeria);
	   
	     WebElement status =driver.findElement(By.xpath("//label[text()='Marital Status']/parent::div/following-sibling::div/div/div/div[@tabindex='0']"));
	     clickonelement(status);
	     WebElement status2 = wa.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Single']")));
	    // WebElement status2= driver.findElement(By.xpath("//*[text()='Single']"));
	     clickonelement(status2);
	     
	     WebElement dob = driver.findElement(By.xpath("(//input[@placeholder='yyyy-mm-dd'])[2]"));
	     clickonelement(dob);
	     Robot(KeyEvent.VK_CONTROL, "keypress");
		 Robot(KeyEvent.VK_A, "keypress");
		 Robot(KeyEvent.VK_BACK_SPACE, "keypress");
	     Robot(KeyEvent.VK_CONTROL,"keyrelease");
	     Robot(KeyEvent.VK_A,"keyRelease");
    	 Robot(KeyEvent.VK_BACK_SPACE,"keyRelease");
	     valuesonelement(dob, "1998-10-23");	     
	     
	     WebElement gender = driver.findElement(By.xpath("(//span[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input'])[1]"));
	     clickonelement(gender);
	     
	     WebElement military = driver.findElement(By.xpath("//label[text()='Military Service']/parent::div/following-sibling::div/input"));
	     buttonclick(military);
//	     WebElement military = driver.findElement(By.xpath("//*[@class='oxd-input oxd-input--active'])[10]"));
//	     buttonclick(military);
	     Robot(KeyEvent.VK_CONTROL, "keypress");
		 Robot(KeyEvent.VK_A, "keypress");
		 Robot(KeyEvent.VK_BACK_SPACE, "keypress");
	     Robot(KeyEvent.VK_CONTROL,"keyrelease");
	     Robot(KeyEvent.VK_A,"keyRelease");
    	 Robot(KeyEvent.VK_BACK_SPACE,"keyRelease");
	     valuesonelement(military, "No");
	     
	     WebElement smoker = driver.findElement(By.xpath("//label[text()='Smoker']/parent::div/following-sibling::div/div/label/input/following-sibling::span"));
	     buttonclick(smoker);
	     
	     WebElement save = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
	     buttonclick(save);
	     
	     //WebElement bloodtype =driver.findElement(By.xpath("//label[text()='Blood Type']/following::div[4]"));
	     //clickonelement(bloodtype);
	     
	     WebElement bloodtype =driver.findElement(By.xpath("//label[text()='Blood Type']/following::div[4]"));
	     clickonelement(bloodtype);
	     WebElement positive = driver.findElement(By.xpath("//*[text()='A+']"));
         clickonelement(positive);
         
	     WebElement save2 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	     buttonclick(save2);
//contanct details
	     implicitywaits(20);
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
	     WebElement country = driver.findElement(By.xpath("//label[text()='Country']/parent::div/following-sibling::div/div/div/div[text()='India']"));
	     buttonclick(country);
	     WebElement countrie = driver.findElement(By.xpath("//*[text()='India']"));
	     buttonclick(countrie);
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
	     buttonclick(save3);
//Emergencycontact
	     implicitywaits(10);
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
	}
	     
	}

