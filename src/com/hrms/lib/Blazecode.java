package com.hrms.lib;

import java.io.File;
import java.io.IOException;

import org.checkerframework.checker.initialization.qual.Initialized;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.UnknownKeyFor;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

import com.google.common.io.Files;

public class Blazecode extends Blaze {
	
	public void open()
	{	System.setProperty("webdriver.chrome.driver","C:\\GD\\ch\\chromedriver.exe");
	
	ChromeOptions n=new ChromeOptions();
	n.addArguments("--remote-allow-origins=*");
	driver=new ChromeDriver(n);
	driver.get(url); 
	Reporter.log("opened");
		
		}
	//public void Googlesearch()
//	{
	//	driver.findElement(By.xpath(googlesearch)).sendKeys(googlesearch_txt);
		//driver.findElement(By.linkText("Register")).click();
		//Reporter.log("searched");
	
//	}
	public void Register() throws Exception
	{
			
		driver.findElement(By.xpath(Name)).sendKeys(Name_txt);
		driver.findElement(By.xpath(Company)).sendKeys(conform_txt);
		driver.findElement(By.xpath(Email)).sendKeys(Email_txt);
		driver.findElement(By.xpath(Password)).sendKeys(Password_txt);
		driver.findElement(By.xpath(Conformpassword)).sendKeys(conform_txt);
		driver.findElement(By.xpath(Register_button)).click();

		  File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  Files.copy(f1,new File("D:\\screenshoot\\result9.png"));
	   Reporter.log("Registered");


	}
	}


