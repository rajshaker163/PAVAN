package com.hrms.lib;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Flipkartcode extends Flipkart{
	
	public void open()
	{
		System.setProperty("webdriver.chrome.driver","C:\\GD\\ch\\chromedriver.exe");
		
		ChromeOptions n=new ChromeOptions();
		n.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(n);
        driver.get(Url);
		
	}
	public void  Account() throws Exception
	{
		driver.findElement(By.xpath(close)).click();
		//driver.findElement(By.xpath(My_account)).click();
		//driver.findElement(By.linkText("Logout")).click();
		//driver.findElement(By.xpath(close)).click();
		//driver.findElement(By.linkText("Login")).click();
		//hread.sleep(3000);
		driver.findElement(By.xpath(Mobile)).click();
		
		

		//Robot r=new Robot();
		//r.keyPress(KeyEvent.VK_DOWN);
		//r.keyRelease(KeyEvent.VK_DOWN);


		
		//Thread.sleep(3000);
	

		//Robot r1=new Robot();
		//r1.keyPress(KeyEvent.VK_ENTER);
		//r1.keyRelease(KeyEvent.VK_ENTER);
	//	System.out.println("executed");
		//driver.findElement(By.xpath(search_symbol)).click();
		
		//Select drop=new Select(driver.findElement(By.xpath(min)));
	//	drop.selectByVisibleText(min_txt);
		
		//Select drop1=new Select(driver.findElement(By.xpath(Max)));
		//drop1.selectByVisibleText(Max_txt);
		//driver.findElement(By.xpath(search)).sendKeys(search_txt);

		
		driver.findElement(By.xpath(Radio_button)).click();
		driver.findElement(By.xpath(Radio1_buttton)).click();
		driver.findElement(By.xpath(Ramradio_button)).click();
		
	}

}
