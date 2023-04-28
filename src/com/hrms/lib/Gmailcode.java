package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

public class Gmailcode extends Gmail {

	public void Open()
	{
		System.setProperty("webdriver.Firefox.driver","C:\\GD\\geckodriver.exe");
		
		//ChromeOptions n=new ChromeOptions();
		//n.addArguments("--remote-allow-origins=*");
		driver=new FirefoxDriver();
		driver.get(Url); 
		Reporter.log("opened");
		
		
}
	
	public void details() throws Exception
	{
		driver.findElement(By.xpath(email)).sendKeys(txt_email);
		Thread.sleep(3000);

		driver.findElement(By.xpath(Next_btn)).click();
		Thread.sleep(3000);
		driver.findElement(By.name(password)).sendKeys(txt_password);
		driver.findElement(By.xpath(radio_showpassword)).click();
		driver.findElement(By.xpath(Next_btn1)).click();
		
		Reporter.log("sucessfully loged");
		
	}
}
	