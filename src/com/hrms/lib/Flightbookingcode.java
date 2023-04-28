package com.hrms.lib;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.Screen;

public class Flightbookingcode extends FlightBookingform  {
	
	public void Open()
	{
		System.setProperty("webdriver.chrome.driver","C:\\GD\\ch\\chromedriver.exe");
		ChromeOptions n=new ChromeOptions();
		n.addArguments("--remote-allow-origin=*");
		driver=new ChromeDriver(n);
		driver.get(Url);
		
	}
	
	public void Details() throws Exception
	{
		//driver.findElement(By.xpath(OnwayTripRadio_button)).click();

		Screen sc=new Screen();
		sc.click("C:\\Users\\ADMIN\\Pictures\\Book_Img.PNG");
		Thread.sleep(3000);
		
		Screen sc1=new Screen();
		sc1.click("C:\\Users\\ADMIN\\Pictures\\From.PNG");
		Thread.sleep(3000);
		
		//Screen sc2=new Screen();
		//sc2.click("C:\\Users\\ADMIN\\Pictures\\From2.PNG");
		//Thread.sleep(3000);
		

			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);

			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		
		
		

		
		Screen sc2=new Screen();
		sc2.click("C:\\Users\\ADMIN\\Pictures\\TO.PNG");
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);

		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		//Thread.sleep(3000);
		
		

		//Screen sc3=new Screen();
		//sc3.click("C:\\Users\\ADMIN\\Pictures\\Airline1.PNG");
		Robot r1=new Robot();
r1.keyPress(KeyEvent.VK_TAB);
r1.keyRelease(KeyEvent.VK_TAB);

		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyPress(KeyEvent.VK_DOWN);

	  r1.keyRelease(KeyEvent.VK_DOWN);
	//	Thread.sleep(3000);
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);

	
		//Thread.sleep(3000);
		//driver.switchTo().frame(form);
		
		//driver.findElement(By.id(OnwayTripRadio_button)).click();
		//Select drop=new Select(driver.findElement(By.id(From)));
		//drop.selectByVisibleText(txt_from);
		//Thread.sleep(3000);
		
	//	Robot r=new Robot();
		//r.keyPress(KeyEvent.VK_TAB);
		//r.keyRelease(KeyEvent.VK_TAB);
		//Robot r=new Robot();
	//	r.keyPress(KeyEvent.VK_ENTER);
//	r.keyRelease(KeyEvent.VK_ENTER);
  // r.mousePress(2);  
   //r.mouseRelease(0);

		//driver.findElement(By.xpath("//*[@id='input_4']")).click();    
		//((JavascriptExecutor)driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//*[@id='input_4']/option[3]")));

		//driver.findElement(By.id(From)).sendKeys(Keys.);


	//	Select drop1=new Select(driver.findElement(By.xpath(To)));
		
		//drop1.selectByIndex(1);
		//Thread.sleep(3000);

		
		//Select s1=new Select(driver.findElement(By.xpath(Airline)));
		//s1.selectByVisibleText(txt_Airline);
		//Thread.sleep(3000);

r1.keyPress(KeyEvent.VK_TAB);
r1.keyRelease(KeyEvent.VK_TAB);
		//r1.keyPress(KeyEvent.VK_ACCEPT);
Thread.sleep(3000);
		
		

r1.keyPress(KeyEvent.VK_TAB);
r1.keyRelease(KeyEvent.VK_TAB);
Thread.sleep(3000);
		//driver.findElement(By.xpath(Departure)).sendKeys(txt_Departure) ;
		//Thread.sleep(3000);

		//driver.findElement(By.xpath(Return)).sendKeys(txt_Return) ;
		//Thread.sleep(3000);

r1.keyPress(KeyEvent.VK_TAB);
r1.keyRelease(KeyEvent.VK_TAB);
Thread.sleep(3000);

		//driver.findElement(By.name(Adults)).sendKeys(txt_Adults) ;
		//Thread.sleep(3000);

		driver.findElement(By.xpath(Next_button)).click();





		
	}

}
