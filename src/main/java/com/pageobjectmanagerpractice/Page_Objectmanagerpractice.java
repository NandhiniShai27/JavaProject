package com.pageobjectmanagerpractice;
import org.openqa.selenium.WebDriver;
import com.pompractice.Page_Booknowpage;
import com.pompractice.Page_Logoutpage;
import com.pompractice.Page_Myitenarypage;
import com.pompractice.Page_continuepage;
import com.pompractice.Page_loginpage;
import com.pompractice.Page_searchpage;
public class Page_Objectmanagerpractice {
	 static WebDriver driver;
	   
	  private Page_loginpage lp;              //class variable --null
	    public Page_loginpage getInstanceLP() {      //instance of class
		   if (lp==null) {
			   lp= new Page_loginpage(driver);      //memory allocate
			   }
	      return lp;                                //return the loginpage memory
	        }
	  private Page_searchpage sp; 
	     public Page_searchpage getInstanceSP() {
		    if (sp==null) {
			sp= new Page_searchpage(driver);
		    }
		   return sp;
	       }
	   private Page_continuepage cp;
	      public Page_continuepage getInstanceCP() {
	       if (cp==null) {
			cp= new Page_continuepage(driver);
		    }
		  return cp;
	       }
	   private Page_Booknowpage bp;
	      public Page_Booknowpage getInstanceBP() {
	    	  if (bp==null) {
				bp= new Page_Booknowpage(driver);
			}
			return bp;
	      }
	    private Page_Myitenarypage mp;
	        public  Page_Myitenarypage getInstanceMP() {
			   if (mp==null) {
				 mp= new Page_Myitenarypage(driver);
			}
			return mp;
	     }
	   private Page_Logoutpage lgp;
	        public  Page_Logoutpage getInstanceLGP() {
		        if (lgp==null) {
					lgp = new Page_Logoutpage(driver);
				}
				return lgp;
		        }
	   
	   public Page_Objectmanagerpractice(WebDriver abc) {
		this.driver=abc;
	}
}
