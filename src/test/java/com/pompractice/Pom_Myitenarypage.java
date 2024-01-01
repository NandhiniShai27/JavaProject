package com.pompractice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Pom_Myitenarypage {
	public void setNow(WebElement now) {
		this.now = now;
	}
public WebElement getNow() {
		return now;
	}
static WebDriver driver;
@FindBy(id=("my_itinerary"))
WebElement now;


public Pom_Myitenarypage(WebDriver abc) {
	this.driver=abc;
	PageFactory.initElements(driver, this);
	
}
}
