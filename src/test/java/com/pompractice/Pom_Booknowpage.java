package com.pompractice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Pom_Booknowpage {
	static WebDriver driver;
	  
	  public void setName(WebElement name) {
		this.name = name;
	}

	public void setLastname(WebElement lastname) {
		this.lastname = lastname;
	}

	public void setAddress(WebElement address) {
		this.address = address;
	}

	public void setCard(WebElement card) {
		this.card = card;
	}

	public void setCc(WebElement cc) {
		this.cc = cc;
	}

	public void setExp(WebElement exp) {
		this.exp = exp;
	}

	public void setYear(WebElement year) {
		this.year = year;
	}

	public void setCvv(WebElement cvv) {
		this.cvv = cvv;
	}

	public void setBook(WebElement book) {
		this.book = book;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCard() {
		return card;
	}

	public WebElement getCc() {
		return cc;
	}

	public WebElement getExp() {
		return exp;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBook() {
		return book;
	}

	@FindBy(xpath=("//input[@name='first_name']"))
	  WebElement name;
	  
	  @FindBy(xpath=("//input[@name='last_name']"))
	  WebElement lastname;

	  @FindBy(xpath=("//textarea[@name='address']"))
	  WebElement address;

	  @FindBy(xpath=("//input[@name='cc_num']"))
	  WebElement card; 

	  @FindBy(xpath=("//select[@name='cc_type']"))
	  WebElement cc; 

	  @FindBy(xpath=("//select[@name='cc_exp_month']"))
	  WebElement exp; 

	  @FindBy(xpath=("//select[@name='cc_exp_year']"))
	  WebElement year; 

	  @FindBy(xpath=("//input[@name='cc_cvv']"))
	  WebElement cvv; 
		
	  @FindBy(xpath=("//input[@name='book_now']"))
	  WebElement book;
			
	  public Pom_Booknowpage(WebDriver abc) {
	  this.driver=abc;
	  PageFactory.initElements(driver, this);
	  }
}
