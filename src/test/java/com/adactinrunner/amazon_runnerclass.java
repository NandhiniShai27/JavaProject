package com.adactinrunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.baseclasspractice.BaseClass_Practice;

public class amazon_runnerclass extends BaseClass_Practice{
	 public static WebDriver driver;
		public static void main(String[] args){
			driver =browserlaunch("chrome");
//			url("https://www.amazon.in/");
	////WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));		
	////elementisenabled(mobile, "mobiles");
////			
//			
			url("https://www.leafground.com/alert.xhtml");
//	      
////			WebElement alt = driver.findElement(By.xpath("(//span[text()='Show'])[1]"));	
////			Thread.sleep(2000);
////			clickonAlerts(alt);
//////			alt.click();
//					
//			navigaterefresh();
//			//quitbrowser();
//			
//			Navigatetourl("https://www.amazon.in/");
//			Navigatebacktourl();
//		}
	//	
			driver.get("https://letcode.in/dropdowns");
			WebElement select = driver.findElement(By.xpath("//select[@id='superheros']"));
			select.click();
		selectbydropdown(select, "index", "3");
		selectbydropdown(select, "text", "Aquaman");
	    

		}
	}	
//			
//			a.selectByIndex(0);
//			Thread.sleep(2000);
//			a.selectByValue("aq");
//			Thread.sleep(1000);
//			a.selectByVisibleText("The Avengers");
//			Thread.sleep(1000);
//			
//			List<WebElement> options = a.getOptions();
//			for(int i =0; i <options.size(); i++) {
//				WebElement element1 = options.get(i);
//		        String text = element1.getText();
//			System.out.println(text);
//			}
//			
//			//methodsofmultipledropdown
//			a.deselectByIndex(2);
//		    Thread.sleep(1000);
////		    a.deselectAll();
//			
//			List<WebElement> allSelectedOptions = a.getAllSelectedOptions();
//			for(int j=0; j<allSelectedOptions.size(); j++) {
//				WebElement element2 = allSelectedOptions.get(j);
//			String text2 = element2.getText();	
//			System.out.println(text2);
//			}
//			
//			WebElement firstSelectedOption = a.getFirstSelectedOption();
//			String text3 = firstSelectedOption.getText();
//			System.out.println(text3);
//			
//			boolean multiple2 = a.isMultiple();
//			System.out.println(multiple2);
//			Thread.sleep(1000);
//			
//			}	
//}
