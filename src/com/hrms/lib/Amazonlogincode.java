package com.hrms.lib;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazonlogincode extends AmazonLogin {
	
	public void open()
	{
		System.setProperty("webdriver.chrome.driver"," C:\\GD\\geckodriver.exe");
		driver=new FirefoxDriver();
	    driver.get(url);
		
	}

	public void Login()
	{
		driver.findElement(By.xpath(signin)).sendKeys(txt_signin);
		driver.findElement(By.xpath(continue_btn)).click();
		driver.findElement(By.xpath(password)).sendKeys(txt_password);
		driver.findElement(By.xpath(signin_button)).click();
	}

	public void searchitem()throws Exception
	{
		driver.findElement(By.xpath(search)).sendKeys(search_txt);
		Thread.sleep(3000);
		driver.findElement(By.xpath(searchclick)).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath(redmicheckbox)).click();
		Thread.sleep(3000);

		//driver.findElement(By.xpath(min)).sendKeys(min_price);
		Thread.sleep(3000);

		//driver.findElement(By.xpath(max)).sendKeys(max_price);
		Thread.sleep(3000);

		//driver.findElement(By.xpath(Go_click)).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath(Android_click)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(selectphone)).click();
		Thread.sleep(3000);
		//driver.findElement(By.linkText("See more product details")).click();
		//Thread.sleep(3000);
		//driver.findElement(By.linkText("Redmi A1+ (Light Green, 2GB RAM, 32GB Storage)")).click();
		//System.out.println("redmi");
		//Thread.sleep(3000);
		//System.out.println("addeed");
		//driver.findElement(By.xpath(processedtoby)).click();
		//System.out.println("processedtoby");
		//driver.findElement(By.linkText(" See All Buying Options ")).click();
		//Thread.sleep(3000);
		//driver.findElement(By.xpath(addtocart)).click();
		//Thread.sleep(3000);
		//driver.findElement(By.xpath(processedtoby)).click();
		Thread.sleep(3000);
		//driver.findElement(By.linkText(" See All Buying Options ")).click();
		//driver.findElement(By.xpath(close_click)).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath(cart)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(Addressclick)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(usethisaddressclick)).click();

		
		}
}
