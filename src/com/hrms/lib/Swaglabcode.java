package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Swaglabcode extends SwagLab {
	
	public void Open()
	{
		System.setProperty("webdriver.chrome.driver","C:\\GD\\ch\\chromedriver.exe");
		ChromeOptions n=new ChromeOptions();
		n.addArguments("--remote-allow-origin=*");
		driver=new ChromeDriver(n);
		driver.get(Url);
		
	}
	public void LoginDetails() throws Exception
	{
		driver.findElement(By.xpath(Username)).sendKeys(txt_username);
		Thread.sleep(2000);
		driver.findElement(By.xpath(Password)).sendKeys(txt_password);
		Thread.sleep(2000);

		driver.findElement(By.xpath(Login_button)).click();
		Thread.sleep(2000);


		driver.findElement(By.xpath(Addtocart_click)).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath(Bag_click)).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath(Remove_button)).click();
		Thread.sleep(2000);

		

		driver.findElement(By.xpath(Menuopen_click)).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Logout")).click();
		
	}

}
