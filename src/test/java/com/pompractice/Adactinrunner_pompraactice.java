package com.pompractice;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.baseclasspractice.BaseClass_Practice;

public class Adactinrunner_pompraactice extends BaseClass_Practice {
	public static WebDriver driver = browserlaunch("chrome");

	public static void main(String[] args)   {
     Pom_Loginpage lp = new Pom_Loginpage(driver);
	    url("http://adactinhotelapp.com/");
        valuesonelement(lp.getUser(), "Nandhinimanikandan");
        valuesonelement(lp.getPass(), "Nandhini@27");
        buttonclick(lp.getLogin());
      Pom_searchpage sp = new Pom_searchpage(driver);
        selectbydropdown(sp.getLocation(),"index","3");
        selectbydropdown(sp.getHotels(), "text", "Hotel Creek");
	    selectbydropdown(sp.getRoom(), "index", "2");
	    selectbydropdown(sp.getRommtype(), "index", "2");
        valuesonelement(sp.getCheck(), "13/10/2023");
	    valuesonelement(sp.getCheckout(), "14/10/2023");
	    selectbydropdown(sp.getAdult(), "index", "2");
        selectbydropdown(sp.getChild(), "index", "1");
        buttonclick(sp.getSearch());     
      Pom_continuepage cp = new Pom_continuepage(driver);
	    clickonelement(cp.getRadio());
	    buttonclick(cp.getCont());
	  Pom_Booknowpage bp = new Pom_Booknowpage(driver);
	     valuesonelement(bp.getName(), ("Nandhini"));
	     valuesonelement(bp.getLastname(),"Manikandan");
	     valuesonelement(bp.getAddress(), "Porur");
	     valuesonelement(bp.getCard(), "6532345678912345");
	     selectbydropdown(bp.getCc(), "index", "2");
	     selectbydropdown(bp.getExp(), "index", "7");
	     selectbydropdown(bp.getYear(), "index", "19"); 
	     valuesonelement(bp.getCvv(), "234");
	     buttonclick(bp.getBook());
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   Pom_Myitenarypage  mp = new Pom_Myitenarypage(driver);
	     buttonclick(mp.getNow());
	   Pom_Logoutpage lp2 = new Pom_Logoutpage(driver);
	      clickonelement(lp2.getCheckall());
	      clickonelement(lp2.getCancelall());
	      simplealert(lp2.getCancelall());
	      clickonelement(lp2.getLogout());      
 
 }
	      
}
    























//		
//	
//		
//		WebElement checkall = driver.findElement(By.xpath("//input[@name='check_all']"));
//        clickoncheckboxelement(checkall);
//		
//        WebElement cancelall = driver.findElement(By.xpath("//input[@name='cancelall']"));
//        clickonAlerts(cancelall);
//        
//        WebElement logout = driver.findElement(By.xpath("//input[@name='logout']"));
//        Clickonlogout(logout);
//        
//        
//	}
//	
//}
//


