package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

public class Swiggycode extends Swiggy{
	
	public void open()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\GD\\ch\\chromedriver.exe");

		ChromeOptions n = new ChromeOptions();
		n.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(n);
		driver.get(url);
		Reporter.log("opened");
	}
	public void Login()
	{
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.xpath(phonenumber)).sendKeys(txt_phoneno);
		driver.findElement(By.xpath("//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div/div/form/div[2]/a")).click();
		driver.findElement(By.xpath(otp)).sendKeys(txt_otp);
		driver.findElement(By.linkText("VERIFY OTP")).click();
	}
	

}
