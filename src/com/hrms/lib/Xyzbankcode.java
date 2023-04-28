package com.hrms.lib;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.guide.ClickableWindow;
import org.sikuli.script.Screen;
import org.testng.Reporter;

public class Xyzbankcode extends XyzBank {
	
	public void open()
	{
		System.setProperty("webdriver.chrome.driver","C:\\GD\\ch\\chromedriver.exe");
		ChromeOptions n= new ChromeOptions();
		n.addArguments("--remote-allow-origin=*");
		driver=new ChromeDriver();
		driver.get(Url);
	}
 
	public void Details() throws Exception
	{
		
		//Robot r=new Robot();
		//r.keyPress(KeyEvent.VK_TAB);	
		//r.keyRelease(KeyEvent.VK_TAB);

		//r.keyPress(KeyEvent.VK_ENTER);	
		//r.keyRelease(KeyEvent.VK_ENTER);
		//System.out.println("performed");
		
Screen sc=new Screen();
sc.click("C:\\Users\\ADMIN\\Pictures\\Capture.PNG");
Reporter.log("Action");

		
		//driver.findElement(By.tagName("button")).click();
		//element.click();
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath(AddCustomer)).click();
		Thread.sleep(3000);
		Reporter.log("Add");

		

//Screen sc1=new Screen();
//sc1.click("C:\\Users\\ADMIN\\Pictures\\screen.PNG");
//((WebElement) sc1).sendKeys(First_name);


		//Robot r=new Robot();
		//r.keyPress(KeyEvent.VK_TAB);
		//Thread.sleep(3000);
		//r.keyPress(KeyEvent.VK_TAB);	
		//Thread.sleep(3000);

		//r.keyPress(KeyEvent.VK_TAB);
		//Thread.sleep(3000);

		//r.keyPress(KeyEvent.VK_TAB);
		//Thread.sleep(3000);

		
		//r.keyPress(KeyEvent.VK_TAB);
		//Thread.sleep(3000);

		//r.keyPress(KeyEvent.VK_TAB);


		
        //r.keyRelease(KeyEvent.VK_TAB);
        //r.keyPress(KeyEvent.VK_ENTER);
        //r.keyRelease(KeyEvent.VK_ENTER);
        //Thread.sleep(3000);
        //WebElement element = driver.findElement(By.name("q"));

		//((WebElement) r).sendKeys("");
		driver.findElement(By.xpath(Firstname)).sendKeys(First_name);
		Thread.sleep(3000);
		Reporter.log("RAj");


		driver.findElement(By.xpath(Lastname)).sendKeys(Last_name);
		Reporter.log("Shaker");

		driver.findElement(By.xpath(postCode)).sendKeys(Post_code);
		Reporter.log("583015");
		Thread.sleep(3000);
		driver.findElement(By.xpath(AddCustomer_button1)).click();
		Reporter.log("Button");
		Thread.sleep(3000);
		Alert a=driver.switchTo().alert();
		a.accept();
		driver.findElement(By.xpath(Openaccount_click)).click();
		Thread.sleep(3000);
		Select drop=new Select(driver.findElement(By.xpath(CustomerName)));
		drop.selectByVisibleText(txt_Customername);
		Thread.sleep(3000);
		Select drop2=new Select(driver.findElement(By.xpath(Currency)));
		drop2.selectByVisibleText(txt_Currency);
		Thread.sleep(3000);
		driver.findElement(By.xpath(Process_button)).click();
		Thread.sleep(3000);
		Alert a1=driver.switchTo().alert();
		a1.accept();
		Thread.sleep(3000);
	driver.findElement(By.xpath(Customers)).click();
	Thread.sleep(3000);

	driver.findElement(By.xpath(searchcustomer)).sendKeys(txt_searchcustomer);
	Thread.sleep(3000);

	driver.findElement(By.xpath(Delete_button)).click();
		
	}
}
