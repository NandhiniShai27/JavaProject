package com.orangehrmPractice;
import java.awt.AWTException;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.BaseClass_new.Base_ClassNew;
import com.baseclasspractice.BaseClass_Practice;
import com.pageobjectmoduleSIT.Loginpage_HRM;
import com.pageobjectmoduleSIT.MyInfo_EmergContact;
import com.pageobjectmoduleSIT.MyInfo_PersonalDetails;
import com.pageobjectmoduleSIT.Myinfo_ContactDetails;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Orange_HRM extends BaseClass_Practice{
	public static  WebDriver driver =browserlaunch("chrome");
	
    public static void main(String[] args) throws InterruptedException, AWTException {
    Loginpage_HRM lp = new Loginpage_HRM(driver);
    url("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	implicitywaits(10);
//logipage
	valuesonelement(lp.getUsername(), "Admin");
    valuesonelement(lp.getPassword(), "admin123");
    buttonclick(lp.getLogin());
//PersonalDetails    
    MyInfo_PersonalDetails pd = new MyInfo_PersonalDetails(driver);
    buttonclick(pd.getMyinfo());
    implicitywaits(10);
     buttonclick(pd.getFirstname());
     Robot(KeyEvent.VK_CONTROL, "keypress");
	 Robot(KeyEvent.VK_A, "keypress");
	 Robot(KeyEvent.VK_BACK_SPACE, "keypress");
     Robot(KeyEvent.VK_CONTROL,"keyrelease");
     Robot(KeyEvent.VK_A,"keyRelease");
	 Robot(KeyEvent.VK_BACK_SPACE,"keyRelease");
     valuesonelement(pd.getFirstname(), "Krish");

    buttonclick(pd.getMiddlename());
	Robot(KeyEvent.VK_CONTROL, "keypress");
	Robot(KeyEvent.VK_A, "keypress");
	Robot(KeyEvent.VK_BACK_SPACE, "keypress");
    Robot(KeyEvent.VK_CONTROL,"keyrelease");
    Robot(KeyEvent.VK_A,"keyRelease");
	Robot(KeyEvent.VK_BACK_SPACE,"keyRelease");
    valuesonelement(pd.getMiddlename(), "shai");
 
    buttonclick(pd.getLastname());
    Robot(KeyEvent.VK_CONTROL, "keypress");
	Robot(KeyEvent.VK_A, "keypress");
	Robot(KeyEvent.VK_BACK_SPACE, "keypress");
    Robot(KeyEvent.VK_CONTROL,"keyrelease");
    Robot(KeyEvent.VK_A,"keyRelease");
	Robot(KeyEvent.VK_BACK_SPACE,"keyRelease");
    valuesonelement(pd.getLastname(), "M");
    
    buttonclick(pd.getNickname());
    Robot(KeyEvent.VK_CONTROL, "keypress");
	Robot(KeyEvent.VK_A, "keypress");
	Robot(KeyEvent.VK_BACK_SPACE, "keypress");
    Robot(KeyEvent.VK_CONTROL,"keyrelease");
    Robot(KeyEvent.VK_A,"keyRelease");
	Robot(KeyEvent.VK_BACK_SPACE,"keyRelease");
    valuesonelement(pd.getNickname(), "Hari");
    
    buttonclick(pd.getEmpid());
    Robot(KeyEvent.VK_CONTROL, "keypress");
    Robot(KeyEvent.VK_A, "keypress");
    Robot(KeyEvent.VK_BACK_SPACE, "keypress");
    Robot(KeyEvent.VK_CONTROL,"keyrelease");
    Robot(KeyEvent.VK_A,"keyRelease");
    Robot(KeyEvent.VK_BACK_SPACE,"keyRelease");
    valuesonelement(pd.getEmpid(), "921500");
   
    buttonclick(pd.getOtherid());
    Robot(KeyEvent.VK_CONTROL, "keypress");
    Robot(KeyEvent.VK_A, "keypress");
    Robot(KeyEvent.VK_BACK_SPACE, "keypress");
    Robot(KeyEvent.VK_CONTROL,"keyrelease");
    Robot(KeyEvent.VK_A,"keyRelease");
    Robot(KeyEvent.VK_BACK_SPACE,"keyRelease");
    valuesonelement(pd.getOtherid(), "2150");
   
    buttonclick(pd.getLicenseno());
    Robot(KeyEvent.VK_CONTROL, "keypress");
    Robot(KeyEvent.VK_A, "keypress");
    Robot(KeyEvent.VK_BACK_SPACE, "keypress");
    Robot(KeyEvent.VK_CONTROL,"keyrelease");
    Robot(KeyEvent.VK_A,"keyRelease");
    Robot(KeyEvent.VK_BACK_SPACE,"keyRelease");
    valuesonelement(pd.getLicenseno(), "NAM0 92178367890");
    
    buttonclick(pd.getExpdate());
    Robot(KeyEvent.VK_CONTROL, "keypress");
    Robot(KeyEvent.VK_A, "keypress");
	Robot(KeyEvent.VK_BACK_SPACE, "keypress");
    Robot(KeyEvent.VK_CONTROL,"keyrelease");
    Robot(KeyEvent.VK_A,"keyRelease");
	Robot(KeyEvent.VK_BACK_SPACE,"keyRelease");
    valuesonelement(pd.getExpdate(),"2031-12-12");
    
    buttonclick(pd.getSsn());
    clearonelement(pd.getSsn());
    valuesonelement(pd.getSsn(), "34567898993");
    
    buttonclick(pd.getSin());
    clearonelement(pd.getSin());
    valuesonelement(pd.getSin(), "45678998292");
    
    clickonelement(pd.getNationality());
    WebDriverWait wa2 = new WebDriverWait(driver,20);
    clickonelement(pd.getAlgerian());
    
    clickonelement(pd.getStatus());
    clickonelement(pd.getStatus2());
    
    clickonelement(pd.getDob());
    Robot(KeyEvent.VK_CONTROL, "keypress");
    Robot(KeyEvent.VK_A, "keypress");
    Robot(KeyEvent.VK_BACK_SPACE, "keypress");
    Robot(KeyEvent.VK_CONTROL,"keyrelease");
    Robot(KeyEvent.VK_A,"keyRelease");
    Robot(KeyEvent.VK_BACK_SPACE,"keyRelease");
    valuesonelement(pd.getDob(), "1998-10-23");
    
    clickonelement(pd.getGender());
    
    buttonclick(pd.getMilitary());
    Robot(KeyEvent.VK_CONTROL, "keypress");
    Robot(KeyEvent.VK_A, "keypress");
    Robot(KeyEvent.VK_BACK_SPACE, "keypress");
    Robot(KeyEvent.VK_CONTROL,"keyrelease");
    Robot(KeyEvent.VK_A,"keyRelease");
    Robot(KeyEvent.VK_BACK_SPACE,"keyRelease");
    valuesonelement(pd.getMilitary(), "No");
    
    buttonclick(pd.getSmoker());
    
    buttonclick(pd.getSave());
    
    clickonelement(pd.getBloodtype());
    clickonelement(pd.getPositive());
    
    buttonclick(pd.getSave2());
//contactdetails
    Myinfo_ContactDetails cd = new Myinfo_ContactDetails(driver);
    buttonclick(cd.getContactdetails());
    buttonclick(cd.getStreet1());
    valuesonelement(cd.getStreet1(), "No.10, Ambedkar Street");
    buttonclick(cd.getStreet2());
    valuesonelement(cd.getStreet2(), "GandhiNagar, Velachery");
    buttonclick(cd.getCity());
    valuesonelement(cd.getCity(), "Chennai");
    buttonclick(cd.getState());
    valuesonelement(cd.getState(), "TamilNadu");
    buttonclick(cd.getZipcode());
    valuesonelement(cd.getZipcode(), "6000098");
    buttonclick(cd.getCountry());
    buttonclick(cd.getIndia());
    buttonclick(cd.getHome());
    valuesonelement(cd.getHome(), "9568456589");
    buttonclick(cd.getMobile());
    valuesonelement(cd.getMobile(), "9845356879");
    buttonclick(cd.getWork());
    Robot(KeyEvent.VK_CONTROL, "keypress");
	 Robot(KeyEvent.VK_A, "keypress");
	 Robot(KeyEvent.VK_BACK_SPACE, "keypress");
    Robot(KeyEvent.VK_CONTROL,"keyrelease");
    Robot(KeyEvent.VK_A,"keyRelease");
	 Robot(KeyEvent.VK_BACK_SPACE,"keyRelease");
	 valuesonelement(cd.getWork(), "0445678238");
    buttonclick(cd.getWorkmail());
    Robot(KeyEvent.VK_CONTROL, "keypress");
	 Robot(KeyEvent.VK_A, "keypress");
	 Robot(KeyEvent.VK_BACK_SPACE, "keypress");
    Robot(KeyEvent.VK_CONTROL,"keyrelease");
    Robot(KeyEvent.VK_A,"keyRelease");
	 Robot(KeyEvent.VK_BACK_SPACE,"keyRelease");
	 valuesonelement(cd.getWorkmail(), "najhdinaid@2389");
    buttonclick(cd.getMail());
    Robot(KeyEvent.VK_CONTROL, "keypress");
	 Robot(KeyEvent.VK_A, "keypress");
	 Robot(KeyEvent.VK_BACK_SPACE, "keypress");
    Robot(KeyEvent.VK_CONTROL,"keyrelease");
    Robot(KeyEvent.VK_A,"keyRelease");
	 Robot(KeyEvent.VK_BACK_SPACE,"keyRelease");
	 valuesonelement(cd.getMail(), "najuakauhanja@5689");
    buttonclick(cd.getSave3());
//Emergencycontact
    MyInfo_EmergContact ec = new MyInfo_EmergContact(driver);
    clickonelement(ec.getEmgcontact());
    clickonelement(ec.getAdd());
    clickonelement(ec.getName());
    valuesonelement(ec.getName(),"Mahi");
    clickonelement(ec.getRelationship());
    valuesonelement(ec.getRelationship(), "Father");
    clickonelement(ec.getEmgphone());
    valuesonelement(ec.getEmgphone(), "8928475958");
    clickonelement(ec.getEmgmob());
    valuesonelement(ec.getEmgmob(), "9999955555");
    clickonelement(ec.getEmgwork());
    valuesonelement(ec.getEmgwork(), "04455598961");
    clickonelement(ec.getSave4());
   
   }
}
