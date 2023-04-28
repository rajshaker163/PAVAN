package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SwiggyGeneral extends SwiggyGlobal {
	
public void open()
{
	System.setProperty("webdriver.chrome.driver", "C:\\GD\\ch\\chromedriver.exe");
	ChromeOptions n=new ChromeOptions();
	n.addArguments("--remote-allows-origins=");
	driver=new ChromeDriver(n);
	driver.get(url);
			
}
public void order()throws Exception
{
	driver.findElement(By.xpath(Loaction)).sendKeys(txt_Location);
	driver.findElement(By.xpath(search1)).click();
	Thread.sleep(3000);

	driver.findElement(By.xpath(searchforfood)).sendKeys(txt_searchforfood1);
	Thread.sleep(3000);

	driver.findElement(By.xpath(press_enter)).click();
	Thread.sleep(3000);

	driver.findElement(By.xpath(press_dominopizza)).click();
	Thread.sleep(3000);

	driver.findElement(By.xpath(Add_button)).click();
	Thread.sleep(3000);

	driver.findElement(By.xpath(Ratio_button)).click();
	Thread.sleep(3000);

	driver.findElement(By.xpath(continue_button)).click();
	Thread.sleep(3000);

	driver.findElement(By.xpath(Continue_buttton1)).click();
	Thread.sleep(3000);

	driver.findElement(By.xpath(radio_button1)).click();
	Thread.sleep(3000);

	driver.findElement(By.xpath(Additem_button)).click();
}
}
