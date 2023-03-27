package com.hrms.lib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.checkerframework.checker.initialization.qual.Initialized;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.UnknownKeyFor;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class code extends Adication {

	//public WebDriver driver;
	@BeforeClass
	public void open()
	{
		
			System.setProperty("webdriver.chrome.driver","C:\\GD\\ch\\chromedriver.exe");
					
					ChromeOptions n=new ChromeOptions();
					n.addArguments("--remote-allow-origins=*");
					driver=new ChromeDriver(n);
                    driver.get(url);
	}
	
	
	public void login()
	{
		driver.findElement(By.name(txt_un)).sendKeys(un);
		driver.findElement(By.name(txt_pw)).sendKeys(pw);
		driver.findElement(By.name(Login_btn)).click();
	}
	@AfterClass
	public void feilds()
	{
		try
		{
			
		
		driver.findElement(By.name(Location)).sendKeys(Location);
		driver.findElement(By.name(txt_hotel)).sendKeys(Hotels);
		driver.findElement(By.name(txt_RoomRype)).sendKeys(RoomType);
		driver.findElement(By.name(txt_NumberofRooms)).sendKeys(NumberofRooms);
		driver.findElement(By.name(CheckInDate)).sendKeys(CheckInDate);
		driver.findElement(By.name(CheckOutDate)).sendKeys(CheckOutDate);
		driver.findElement(By.name(txt_AdultsperRoom)).sendKeys(AdultsperRoom);
		driver.findElement(By.name(txt_ChildrenperRoom)).sendKeys(ChildrenperRoom);
		driver.findElement(By.name(Serach_Btn)).click();
		driver.findElement(By.name(Radio_btn)).click();
		driver.findElement(By.name(Conitnue_btn)).click();
		}
		catch(Exception e)
		{
			File f1=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(f1,new File("D:\\screenshoot\\234.png"));
			} catch (@UnknownKeyFor @NonNull @Initialized IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		driver.close();
		
	
	}
	}
	

