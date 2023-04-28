package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazoncode extends Amazon{
	
	public void openApplication()
	{
		System.setProperty("webdriver.Firefox.driver", "C:\\GD\\geckodriver.exe");
		//ChromeOptions n=new ChromeOptions();
	    //n.addArguments("-remote--allow--origin=*");
	    driver= new FirefoxDriver();
	    driver.get(url);
	    
	}
	
	public void createAccount() throws Exception
	{
		//driver.findElement(By.linkText("Hello, sign in")).click();
		driver.findElement(By.linkText("Create your Amazon account")).click();
		driver.findElement(By.xpath(your_name)).sendKeys(name);
		driver.findElement(By.xpath(email)).sendKeys(txt_email);
		driver.findElement(By.xpath(password)).sendKeys(txt_password);
		driver.findElement(By.xpath(Conform_password)).sendKeys(txt_conform_password);
		driver.findElement(By.xpath(continue_button)).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath(event)).click();
	}

}
