package com.orangehrmPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.baseclasspractice.BaseClass_Practice;
public class Difficult_orangehrmleave extends BaseClass_Practice{
public static WebDriver driver;
public static void main(String[] args) {
	driver = browserlaunch("chrome");
	 url("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 implicitywaits(10);
	 WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
	 valuesonelement(username, "Admin");
	 WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	 valuesonelement(password, "admin123");
	 WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
	 buttonclick(login);
//leave
	 WebElement leavetab = driver.findElement(By.xpath("//span[text()='Leave']"));
     leavetab.click();
     WebElement leave = driver.findElement(By.xpath("//a[text()='My Leave']"));
     leave.click();
     WebElement leavestatus = driver.findElement(By.xpath("//label[text()='Show Leave with Status']/parent::div/following-sibling::div/div/div[2]/span"));
     leavestatus.click();
     WebElement reje = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div[2]/span[1]"));
     reje.click();
     WebElement rejected = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div[2]/span[1]/i"));
     rejected.click();
     WebElement reje2 = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div[2]/span[2]"));
     reje2.click();
     WebElement cancelled2 = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div[2]/span[2]/i"));
     cancelled2.click();
     WebElement reje3 = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div[2]/span[3]"));
     reje3.click();
     WebElement pending = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div[2]/span[3]/i"));
     pending.click();
   
}
}
