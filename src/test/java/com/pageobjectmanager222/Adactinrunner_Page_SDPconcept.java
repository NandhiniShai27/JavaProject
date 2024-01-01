package com.pageobjectmanager222;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import com.baseclasspractice.BaseClass_Practice;
import com.pageobjectmanagerpractice.Page_Objectmanagerpractice;
import com.pompractice.Pom_Booknowpage;
import com.pompractice.Pom_Loginpage;
import com.pompractice.Pom_Logoutpage;
import com.pompractice.Pom_Myitenarypage;
import com.pompractice.Pom_continuepage;
import com.pompractice.Pom_searchpage;
public class Adactinrunner_Page_SDPconcept extends BaseClass_Practice{
	
	public static WebDriver driver = browserlaunch("chrome");
	   
	public  static Page_Objectmanagerpractice pom = new Page_Objectmanagerpractice(driver);
	  
	  public static void main(String[] args)   {
	//login page 	
		    url("http://adactinhotelapp.com/");
	        valuesonelement(pom.getInstanceLP().getUser(), "NandhiniManikandan");
		    valuesonelement(pom.getInstanceLP().getPass(),"Nandhini@27");
	        buttonclick(pom.getInstanceLP().getLogin());
	//search page        
	        selectbydropdown(pom.getInstanceSP().getLocation(),"index","3");
	        selectbydropdown(pom.getInstanceSP().getHotels(), "text", "Hotel Creek");
		    selectbydropdown(pom.getInstanceSP().getRoom(), "index", "2");
		    selectbydropdown(pom.getInstanceSP().getRommtype(), "index", "2");
	        valuesonelement(pom.getInstanceSP().getCheck(), "13/10/2023");
		    valuesonelement(pom.getInstanceSP().getCheckout(), "14/10/2023");
		    selectbydropdown(pom.getInstanceSP().getAdult(), "index", "2");
	        selectbydropdown(pom.getInstanceSP().getChild(), "index", "1");
	        buttonclick(pom.getInstanceSP().getSearch());     
	//continue page
	        clickonelement(pom.getInstanceCP().getRadio());
	        buttonclick(pom.getInstanceCP().getCont());
	//Booknow page
		     valuesonelement(pom.getInstanceBP().getName(), ("Nandhini"));
		     valuesonelement(pom.getInstanceBP().getLastname(),"Manikandan");
		     valuesonelement(pom.getInstanceBP().getAddress(), "Porur");
		     valuesonelement(pom.getInstanceBP().getCard(), "6532345678912345");
		     selectbydropdown(pom.getInstanceBP().getCc(), "index", "2");
		     selectbydropdown(pom.getInstanceBP().getExp(), "index", "7");
		     selectbydropdown(pom.getInstanceBP().getYear(), "index", "19"); 
		     valuesonelement(pom.getInstanceBP().getCvv(), "234");
		     buttonclick(pom.getInstanceBP().getBook());
		     implicitywaits(10);
	//itinerary page	     
		     buttonclick(pom.getInstanceMP().getNow());
	//logout page
		      clickonelement(pom.getInstanceLGP().getCheckall());
		      clickonelement(pom.getInstanceLGP().getCancelall());
		      simplealert(pom.getInstanceLGP().getCancelall());
		      clickonelement(pom.getInstanceLGP().getLogout());      
	 
	 }
}
