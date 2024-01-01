package com.adactinvariables;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Staticvariable_adactinproject {
       
		public static WebDriver driver;
		
		public static void browserlaunch() {
			WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://adactinhotelapp.com/");
	    }
		public static void user_name() {
			WebElement user = driver.findElement(By.xpath("//input[@id='username']"));;
		    user.sendKeys("NandhiniManikandan");
		}
	public static void password() {
		WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
	    pass.sendKeys("Nandhini@27");
	}
	public static void loginbutton() {
		WebElement login = driver.findElement(By.xpath("//input[@id='login']"));
	    login.click();
	}
	public static void select_location() {
		WebElement location = driver.findElement(By.xpath("//select[@name='location']"));      
	    Select a = new Select(location);
	    a.selectByVisibleText("London");

	}
	public static void hotels()  {
		 WebElement hotels = driver.findElement(By.xpath("//select[@name='hotels']"));
		    Select b = new Select(hotels);
		    b.selectByIndex(2);
		    
	}
	public static void room()  {
		WebElement room = driver.findElement(By.xpath("//select[@name='room_type']"));
	    Select c = new Select(room);
	    c.selectByVisibleText("Double");
	   

	}
	public static void roomtype()  {
		WebElement rommtype = driver.findElement(By.xpath("//select[@name='room_nos']"));
	    Select d = new Select(rommtype);
	    d.selectByIndex(3);
	   }
	public static void check_indate() throws AWTException {
		WebElement check = driver.findElement(By.xpath("//input[@id='datepick_in']"));
	    check.click();
	    Robot ac= new Robot();
	    ac.keyPress(KeyEvent.VK_CONTROL);
	    ac.keyPress(KeyEvent.VK_A);
	    ac.keyPress(KeyEvent.VK_BACK_SPACE);
	    ac.keyRelease(KeyEvent.VK_CONTROL);
	    ac.keyRelease(KeyEvent.VK_A);
	    ac.keyRelease(KeyEvent.VK_BACK_SPACE);
	    check.sendKeys("10/10/2023");

	}
	public static void check_outdate() throws AWTException  {
		WebElement checkout = driver.findElement(By.xpath("//input[@id='datepick_out']"));
	    checkout.click();
	    Robot ad= new Robot();
	    ad.keyPress(KeyEvent.VK_CONTROL);
	    ad.keyPress(KeyEvent.VK_A);
	    ad.keyPress(KeyEvent.VK_BACK_SPACE);
	    ad.keyRelease(KeyEvent.VK_CONTROL);
	    ad.keyRelease(KeyEvent.VK_A);
	    ad.keyRelease(KeyEvent.VK_BACK_SPACE);
	    checkout.sendKeys("12/10/2023");

	}
	public static void adult_room() {
		WebElement adult = driver.findElement(By.xpath("//select[@id='adult_room']"));
	    Select f = new Select(adult);
	    f.selectByIndex(2);

	}
	public static void child_room() {
		WebElement child = driver.findElement(By.xpath("//select[@id='child_room']"));
	    Select g = new Select(child);
	    g.selectByIndex(2);

	}
	public static void search_button() {
		 WebElement search = driver.findElement(By.xpath("//input[@id='Submit']"));
		    search.click();

	}
	public static void radio_button() {
		WebElement radio = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
	    radio.click();

	}
	public static void conti() {
		WebElement cont = driver.findElement(By.xpath("//input[@id='continue']"));
	    cont.click();

	}
	public static void first_name() {
		WebElement name = driver.findElement(By.xpath("//input[@name='first_name']"));
	    name.sendKeys("Nandhini");

	}
	public static void last_name() {
		WebElement lastname = driver.findElement(By.xpath("//input[@name='last_name']"));
	    lastname.sendKeys("Manikandan");

	}
	public static void address() {
		WebElement address = driver.findElement(By.xpath("//textarea[@name='address']"));
	    address.sendKeys("Porur, Tamilnadu");

	}
	public static void card_details() {
		WebElement card = driver.findElement(By.xpath("//input[@name='cc_num']"));
	    card.sendKeys("6532345678912345");
	}
	public static void card_type() {
		  WebElement cc = driver.findElement(By.xpath("//select[@name='cc_type']"));
		    Select i = new Select(cc);
		    i.selectByIndex(1);
	}
	public static void card_expdate() {
		WebElement exp = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
	    Select j= new Select(exp);
	    j.selectByIndex(7);

	}
	public static void exp_year() {
		WebElement year = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
	    Select k = new Select(year);
	    k.selectByIndex(19);

	}
	public static void cvv() {
		WebElement cvv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
	    cvv.sendKeys("2345");

	}
	public static void book() {
		 WebElement book = driver.findElement(By.xpath("//input[@name='book_now']"));
		    book.click(); 

	}
	public static void iteniary() {
		 WebElement now = driver.findElement(By.id("my_itinerary"));
		    now.click();

	}
	public static void check_all() {
		WebElement checkall = driver.findElement(By.xpath("//input[@name='check_all']"));
	    checkall.click();
	}
	public static void cancel_all() {
		WebElement cancelall = driver.findElement(By.xpath("//input[@value='Cancel Selected']"));
	    cancelall.click();

	}
	public static void alert() {
		Alert a2 = driver.switchTo().alert();
	    a2.accept();  
	}
	public static void logout() {
		WebElement logout = driver.findElement(By.xpath("//input[@name='logout']"));
	    logout.click();
	}
	public static void takescreenshot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File screen = ts.getScreenshotAs(OutputType.FILE);
		File convert = new File("C://Users//ADMIN//eclipse-workspace//Mavenproject//Screenshot//adactin.png");
	    FileHandler.copy(screen, convert);
	}
	public static void main(String[] args) throws AWTException, IOException {
		browserlaunch();
		user_name();
	    password();
	    loginbutton();
	    select_location();
	    hotels();
	    room();    
	    roomtype();
	    check_indate();
	    check_outdate();
	    adult_room();
	    child_room();
	    search_button();
	    radio_button();
	    conti();
	    first_name();
	    last_name();
	    address();
	    card_details();
	    card_type();
	    card_expdate();
	    exp_year();
	    cvv();
	    book();
	    driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	    iteniary();
	    check_all();
	    cancel_all();
	    alert();
	    logout();
	    takescreenshot();
	}


	}


