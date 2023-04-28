package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class OnlineBankingcode extends Onlinebanking  {
	
	public void open()
	{
	System.setProperty("webdriver.chrome.driver","");
	ChromeOptions n=new ChromeOptions();
	n.addArguments("--remote-allow-origin=*");
	driver=new ChromeDriver(n);
	driver.get(Url);
	}
	
	public void Login()
	{
		driver.findElement(By.name(Username)).sendKeys(txt_Username);
		driver.findElement(By.name(Password)).sendKeys(txt_Passsword);
		driver.findElement(By.name(Login)).click();
	}
	public void Details() throws Exception
	{

 WebElement element=driver.findElement(By.linkText("Branches"));
 Actions action=new Actions(driver);
 action.moveToElement(element).perform();
 Thread.sleep(3000);
 
 driver.findElement(By.linkText(" ")).click();
 

	
	
	
		
	}


}