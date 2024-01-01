package com.pageobjectmanager222;
import java.awt.AWTException;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.BaseClass_new.Base_ClassNew;
import com.baseclasspractice.BaseClass_Practice;
import com.pageobjectmanagerpractice.PageObjectManager_OrangeHRM;
import com.pageobjectmoduleSIT.Loginpage_HRM;
import com.pageobjectmoduleSIT.MyInfo_EmergContact;
import com.pageobjectmoduleSIT.MyInfo_PersonalDetails;
import com.pageobjectmoduleSIT.Myinfo_ContactDetails;

import io.github.bonigarcia.wdm.WebDriverManager;
public class OrangeHRM_PageObjectManager_SDPconcept extends BaseClass_Practice {
	public static  WebDriver driver =browserlaunch("chrome");
	public static PageObjectManager_OrangeHRM pom = new PageObjectManager_OrangeHRM(driver);
	
    public static void main(String[] args) throws InterruptedException, AWTException {
   
    url("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	implicitywaits(10);
//loginpage	
	valuesonelement(pom.getInstanceoflp().getUsername(), "Admin");
    valuesonelement(pom.getInstanceoflp().getPassword(), "admin123");
    buttonclick(pom.getInstanceoflp().getLogin());
//Myinfo(PersonalDetails)    
    buttonclick(pom.getInstanceofpd().getMyinfo());
    WebDriverWait wa1 = new WebDriverWait(driver, 10);
    wa1.until(ExpectedConditions.elementToBeClickable(pom.getInstanceofpd().getFirstname()));
     buttonclick(pom.getInstanceofpd().getFirstname());
 
     Robot(KeyEvent.VK_CONTROL, "keypress");
	 Robot(KeyEvent.VK_A, "keypress");
	 Robot(KeyEvent.VK_BACK_SPACE, "keypress");
     Robot(KeyEvent.VK_CONTROL,"keyrelease");
     Robot(KeyEvent.VK_A,"keyRelease");
	 Robot(KeyEvent.VK_BACK_SPACE,"keyRelease");
     valuesonelement(pom.getInstanceofpd().getFirstname(), "Krish");

    buttonclick(pom.getInstanceofpd().getMiddlename());
	Robot(KeyEvent.VK_CONTROL, "keypress");
	Robot(KeyEvent.VK_A, "keypress");
	Robot(KeyEvent.VK_BACK_SPACE, "keypress");
    Robot(KeyEvent.VK_CONTROL,"keyrelease");
    Robot(KeyEvent.VK_A,"keyRelease");
	Robot(KeyEvent.VK_BACK_SPACE,"keyRelease");
    valuesonelement(pom.getInstanceofpd().getMiddlename(), "shai");
 
    buttonclick(pom.getInstanceofpd().getLastname());
    Robot(KeyEvent.VK_CONTROL, "keypress");
	Robot(KeyEvent.VK_A, "keypress");
	Robot(KeyEvent.VK_BACK_SPACE, "keypress");
    Robot(KeyEvent.VK_CONTROL,"keyrelease");
    Robot(KeyEvent.VK_A,"keyRelease");
	Robot(KeyEvent.VK_BACK_SPACE,"keyRelease");
    valuesonelement(pom.getInstanceofpd().getLastname(), "M");
    
    buttonclick(pom.getInstanceofpd().getNickname());
    Robot(KeyEvent.VK_CONTROL, "keypress");
	Robot(KeyEvent.VK_A, "keypress");
	Robot(KeyEvent.VK_BACK_SPACE, "keypress");
    Robot(KeyEvent.VK_CONTROL,"keyrelease");
    Robot(KeyEvent.VK_A,"keyRelease");
	Robot(KeyEvent.VK_BACK_SPACE,"keyRelease");
    valuesonelement(pom.getInstanceofpd().getNickname(), "Hari");
    
    buttonclick(pom.getInstanceofpd().getEmpid());
    Robot(KeyEvent.VK_CONTROL, "keypress");
    Robot(KeyEvent.VK_A, "keypress");
    Robot(KeyEvent.VK_BACK_SPACE, "keypress");
    Robot(KeyEvent.VK_CONTROL,"keyrelease");
    Robot(KeyEvent.VK_A,"keyRelease");
    Robot(KeyEvent.VK_BACK_SPACE,"keyRelease");
    valuesonelement(pom.getInstanceofpd().getEmpid(), "921500");
   
    buttonclick(pom.getInstanceofpd().getOtherid());
    Robot(KeyEvent.VK_CONTROL, "keypress");
    Robot(KeyEvent.VK_A, "keypress");
    Robot(KeyEvent.VK_BACK_SPACE, "keypress");
    Robot(KeyEvent.VK_CONTROL,"keyrelease");
    Robot(KeyEvent.VK_A,"keyRelease");
    Robot(KeyEvent.VK_BACK_SPACE,"keyRelease");
    valuesonelement(pom.getInstanceofpd().getOtherid(), "2150");
   
    buttonclick(pom.getInstanceofpd().getLicenseno());
    Robot(KeyEvent.VK_CONTROL, "keypress");
    Robot(KeyEvent.VK_A, "keypress");
    Robot(KeyEvent.VK_BACK_SPACE, "keypress");
    Robot(KeyEvent.VK_CONTROL,"keyrelease");
    Robot(KeyEvent.VK_A,"keyRelease");
    Robot(KeyEvent.VK_BACK_SPACE,"keyRelease");
    valuesonelement(pom.getInstanceofpd().getLicenseno(), "NAM0 92178367890");
    
    buttonclick(pom.getInstanceofpd().getExpdate());
    Robot(KeyEvent.VK_CONTROL, "keypress");
    Robot(KeyEvent.VK_A, "keypress");
	Robot(KeyEvent.VK_BACK_SPACE, "keypress");
    Robot(KeyEvent.VK_CONTROL,"keyrelease");
    Robot(KeyEvent.VK_A,"keyRelease");
	Robot(KeyEvent.VK_BACK_SPACE,"keyRelease");
    valuesonelement(pom.getInstanceofpd().getExpdate(),"2031-12-12");
    
    buttonclick(pom.getInstanceofpd().getSsn());
    clearonelement(pom.getInstanceofpd().getSsn());
    valuesonelement(pom.getInstanceofpd().getSsn(), "34567898993");
    
    buttonclick(pom.getInstanceofpd().getSin());
    clearonelement(pom.getInstanceofpd().getSin());
    valuesonelement(pom.getInstanceofpd().getSin(), "45678998292");
    
    clickonelement(pom.getInstanceofpd().getNationality());
    WebDriverWait wa2 = new WebDriverWait(driver,20);
    clickonelement(pom.getInstanceofpd().getAlgerian());
    
    clickonelement(pom.getInstanceofpd().getStatus());
    WebDriverWait wa3= new WebDriverWait(driver,10);
    clickonelement(pom.getInstanceofpd().getStatus2());
    
    clickonelement(pom.getInstanceofpd().getDob());
    Robot(KeyEvent.VK_CONTROL, "keypress");
    Robot(KeyEvent.VK_A, "keypress");
    Robot(KeyEvent.VK_BACK_SPACE, "keypress");
    Robot(KeyEvent.VK_CONTROL,"keyrelease");
    Robot(KeyEvent.VK_A,"keyRelease");
    Robot(KeyEvent.VK_BACK_SPACE,"keyRelease");
    valuesonelement(pom.getInstanceofpd().getDob(), "1998-10-23");
    
    clickonelement(pom.getInstanceofpd().getGender());
    
    buttonclick(pom.getInstanceofpd().getMilitary());
    Robot(KeyEvent.VK_CONTROL, "keypress");
    Robot(KeyEvent.VK_A, "keypress");
    Robot(KeyEvent.VK_BACK_SPACE, "keypress");
    Robot(KeyEvent.VK_CONTROL,"keyrelease");
    Robot(KeyEvent.VK_A,"keyRelease");
    Robot(KeyEvent.VK_BACK_SPACE,"keyRelease");
    valuesonelement(pom.getInstanceofpd().getMilitary(), "No");
    
    buttonclick(pom.getInstanceofpd().getSmoker());
    
    buttonclick(pom.getInstanceofpd().getSave());
    
    clickonelement(pom.getInstanceofpd().getBloodtype());
    clickonelement(pom.getInstanceofpd().getPositive());
    
    buttonclick(pom.getInstanceofpd().getSave2());
  //contactdetails
    WebDriverWait wa = new WebDriverWait(driver, 15);
    wa.until(ExpectedConditions.elementToBeClickable(pom.getInstanceofcd().getContactdetails()));
    buttonclick(pom.getInstanceofcd().getContactdetails());
    buttonclick(pom.getInstanceofcd().getStreet1());
    valuesonelement(pom.getInstanceofcd().getStreet1(), "No.10, Ambedkar Street");
    buttonclick(pom.getInstanceofcd().getStreet2());
    valuesonelement(pom.getInstanceofcd().getStreet2(), "GandhiNagar, Velachery");
    buttonclick(pom.getInstanceofcd().getCity());
    valuesonelement(pom.getInstanceofcd().getCity(), "Chennai");
    buttonclick(pom.getInstanceofcd().getState());
    valuesonelement(pom.getInstanceofcd().getState(), "TamilNadu");
    buttonclick(pom.getInstanceofcd().getZipcode());
    valuesonelement(pom.getInstanceofcd().getZipcode(), "6000098");
    buttonclick(pom.getInstanceofcd().getCountry());
    buttonclick(pom.getInstanceofcd().getIndia());
    buttonclick(pom.getInstanceofcd().getHome());
    valuesonelement(pom.getInstanceofcd().getHome(), "9568456589");
    buttonclick(pom.getInstanceofcd().getMobile());
    valuesonelement(pom.getInstanceofcd().getMobile(), "9845356879");
    buttonclick(pom.getInstanceofcd().getWork());
    Robot(KeyEvent.VK_CONTROL, "keypress");
	 Robot(KeyEvent.VK_A, "keypress");
	 Robot(KeyEvent.VK_BACK_SPACE, "keypress");
    Robot(KeyEvent.VK_CONTROL,"keyrelease");
    Robot(KeyEvent.VK_A,"keyRelease");
	 Robot(KeyEvent.VK_BACK_SPACE,"keyRelease");
	 valuesonelement(pom.getInstanceofcd().getWork(), "0445678238");
    buttonclick(pom.getInstanceofcd().getWorkmail());
    Robot(KeyEvent.VK_CONTROL, "keypress");
	 Robot(KeyEvent.VK_A, "keypress");
	 Robot(KeyEvent.VK_BACK_SPACE, "keypress");
    Robot(KeyEvent.VK_CONTROL,"keyrelease");
    Robot(KeyEvent.VK_A,"keyRelease");
	 Robot(KeyEvent.VK_BACK_SPACE,"keyRelease");
	 valuesonelement(pom.getInstanceofcd().getWorkmail(), "najhdinaid@2389");
    buttonclick(pom.getInstanceofcd().getMail());
    Robot(KeyEvent.VK_CONTROL, "keypress");
	 Robot(KeyEvent.VK_A, "keypress");
	 Robot(KeyEvent.VK_BACK_SPACE, "keypress");
    Robot(KeyEvent.VK_CONTROL,"keyrelease");
    Robot(KeyEvent.VK_A,"keyRelease");
	 Robot(KeyEvent.VK_BACK_SPACE,"keyRelease");
	 valuesonelement(pom.getInstanceofcd().getMail(), "najuakauhanja@5689");
    buttonclick(pom.getInstanceofcd().getSave3());
//Emergencycontact
implicitywaits(10);
    clickonelement(pom.getInstanceofec().getEmgcontact());
    clickonelement(pom.getInstanceofec().getAdd());
    clickonelement(pom.getInstanceofec().getName());
    valuesonelement(pom.getInstanceofec().getName(),"Mahi");
    clickonelement(pom.getInstanceofec().getRelationship());
    valuesonelement(pom.getInstanceofec().getRelationship(), "Father");
    clickonelement(pom.getInstanceofec().getEmgphone());
    valuesonelement(pom.getInstanceofec().getEmgphone(), "8928475958");
    clickonelement(pom.getInstanceofec().getEmgmob());
    valuesonelement(pom.getInstanceofec().getEmgmob(), "9999955555");
    clickonelement(pom.getInstanceofec().getEmgwork());
    valuesonelement(pom.getInstanceofec().getEmgwork(), "04455598961");
    clickonelement(pom.getInstanceofec().getSave4());

    
    
    
   }
}


