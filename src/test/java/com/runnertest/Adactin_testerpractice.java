package com.runnertest;
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
public class Adactin_testerpractice  {
	public static void main(String[] args)throws InterruptedException, AWTException, IOException {
		
	System.setProperty("webdriver.chrome.driver", "C://Users//ADMIN//eclipse-workspace//Mavenproject//Driver//chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://adactinhotelapp.com/");
    WebElement user = driver.findElement(By.xpath("//input[@id='username']"));;
    user.sendKeys("NandhiniManikandan");
    WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
    pass.sendKeys("Nandhini@27");
    WebElement login = driver.findElement(By.xpath("//input[@id='login']"));
    login.click();
    WebElement location = driver.findElement(By.xpath("//select[@name='location']"));      
    Select a = new Select(location);
    a.selectByVisibleText("London");
    WebElement hotels = driver.findElement(By.xpath("//select[@name='hotels']"));
    Select b = new Select(hotels);
    b.selectByIndex(2);
    Thread.sleep(2000);
    WebElement room = driver.findElement(By.xpath("//select[@name='room_type']"));
    Select c = new Select(room);
    c.selectByVisibleText("Double");
    Thread.sleep(2000);
    WebElement rommtype = driver.findElement(By.xpath("//select[@name='room_nos']"));
    Select d = new Select(rommtype);
    d.selectByIndex(3);
    Thread.sleep(1000);
    WebElement check = driver.findElement(By.xpath("//input[@id='datepick_in']"));
    check.click();
    Thread.sleep(1000);
//keyboard action
    Robot ac= new Robot();
    ac.keyPress(KeyEvent.VK_CONTROL);
    ac.keyPress(KeyEvent.VK_A);
    ac.keyPress(KeyEvent.VK_BACK_SPACE);
    ac.keyRelease(KeyEvent.VK_CONTROL);
    ac.keyRelease(KeyEvent.VK_A);
    ac.keyRelease(KeyEvent.VK_BACK_SPACE);
    check.sendKeys("10/10/2023");
    
    WebElement checkout = driver.findElement(By.xpath("//input[@id='datepick_out']"));
    checkout.click();
    ac.keyPress(KeyEvent.VK_CONTROL);
    ac.keyPress(KeyEvent.VK_A);
    ac.keyPress(KeyEvent.VK_BACK_SPACE);
    ac.keyRelease(KeyEvent.VK_CONTROL);
    ac.keyRelease(KeyEvent.VK_A);
    ac.keyRelease(KeyEvent.VK_BACK_SPACE);
    checkout.sendKeys("12/10/2023");
    
    WebElement adult = driver.findElement(By.xpath("//select[@id='adult_room']"));
    Select f = new Select(adult);
    f.selectByIndex(2);
    WebElement child = driver.findElement(By.xpath("//select[@id='child_room']"));
    Select g = new Select(child);
    g.selectByIndex(2);
    WebElement search = driver.findElement(By.xpath("//input[@id='Submit']"));
    search.click();
    WebElement radio = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
    radio.click();
    WebElement cont = driver.findElement(By.xpath("//input[@id='continue']"));
    cont.click();
    WebElement name = driver.findElement(By.xpath("//input[@name='first_name']"));
    name.sendKeys("Nandhini");
    WebElement lastname = driver.findElement(By.xpath("//input[@name='last_name']"));
    lastname.sendKeys("Manikandan");
    WebElement address = driver.findElement(By.xpath("//textarea[@name='address']"));
    address.sendKeys("Porur, Tamilnadu");
    WebElement card = driver.findElement(By.xpath("//input[@name='cc_num']"));
    card.sendKeys("6532345678912345");
    WebElement cc = driver.findElement(By.xpath("//select[@name='cc_type']"));
    Select i = new Select(cc);
    i.selectByIndex(1);
    WebElement exp = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
    Select j= new Select(exp);
    j.selectByIndex(7);
    WebElement year = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
    Select k = new Select(year);
    k.selectByIndex(19);
    WebElement cvv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
    cvv.sendKeys("2345");
    WebElement book = driver.findElement(By.xpath("//input[@name='book_now']"));
    book.click(); 
//implicity waits
    driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    WebElement now = driver.findElement(By.id("my_itinerary"));
    now.click();
    Thread.sleep(2000);
    WebElement checkall = driver.findElement(By.xpath("//input[@name='check_all']"));
    checkall.click();
    WebElement cancelall = driver.findElement(By.xpath("//input[@value='Cancel Selected']"));
    cancelall.click();
//alert    
    Alert a2 = driver.switchTo().alert();
    a2.accept();  
    WebElement logout = driver.findElement(By.xpath("//input[@name='logout']"));
    logout.click();
//screenshot
    TakesScreenshot ts = (TakesScreenshot)driver;
    File screen = ts.getScreenshotAs(OutputType.FILE);
    File convert = new File("C://Users//ADMIN//eclipse-workspace//Mavenproject//Screenshot//Adactintest.png");
    FileHandler.copy(screen, convert);
	
	
}
}
