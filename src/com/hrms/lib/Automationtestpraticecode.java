package com.hrms.lib;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class Automationtestpraticecode extends Automationtestpratice {
	
public void Open()
{
	System.setProperty("webdriver.chrome.driver","C:\\GD\\ch\\chromedriver.exe");
	ChromeOptions n=new ChromeOptions();
	n.addArguments("--remote-allow-origin=*");
	driver=new ChromeDriver(n);
	driver.get(Url);
	Reporter.log("loginsucessfully");
}

public void Details() throws Exception
{
	driver.findElement(By.name(txt_firstname)).sendKeys(Firstname);
	Thread.sleep(3000);
	driver .findElement(By.name(txt_Lastname)).sendKeys(Lastname);
	Thread.sleep(3000);

	driver.findElement(By.id(Radio_Male)).click();
	Thread.sleep(3000);

	driver.findElement(By.id(txt_YearsofExperince)).click();
	Thread.sleep(3000);

	driver.findElement(By.id(txt_date)).sendKeys(date);
	
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	r.keyPress(KeyEvent.VK_SPACE);
	r.keyRelease(KeyEvent.VK_SPACE);
	




	//driver.findElement(By.id(txt_Profession)).click();
	//Thread.sleep(3000);

	driver.findElement(By.id(txt_AutomationTools)).click();
	Thread.sleep(3000);


	Select drop=new Select(driver.findElement(By.xpath(txt_Continents)));
	drop.selectByVisibleText(Continents);
	Thread.sleep(3000);

	
	Select drop1=new Select(driver.findElement(By.xpath(txt_SeleniumCommands)));
	drop1.selectByVisibleText(SeleniumCommands);
	Thread.sleep(3000);

	
	WebElement File =driver.findElement(By.xpath(txt_upload));
	File.sendKeys(upload);
	Thread.sleep(3000);
	
	driver.findElement(By.linkText("Click here to Download File")).click();
	Alert a=driver.switchTo().alert();
	a.dismiss();
	
	driver.findElement(By.xpath(Button)).click();
	Reporter.log("Details entered sucessfully");

	
	//driver.findElement(By.)
}

}
