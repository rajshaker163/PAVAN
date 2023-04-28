package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test
public class General extends Global {
	@BeforeClass
	public void open()
	{
		
			System.setProperty("webdriver.chrome.driver","C:\\GD\\ch\\chromedriver.exe");
					
					ChromeOptions n=new ChromeOptions();
					n.addArguments("--remote-allow-origins=*");
					driver=new ChromeDriver(n);
                    driver.get(url);
	}
	@AfterClass
	public void close()
	{
		driver.close();
		
	}
	public void login()
	{
		driver.findElement(By.name(login)).sendKeys(un);
		driver.findElement(By.name(password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		Reporter.log("login");
	}
	public void Logout()
	{
		driver.findElement(By.linkText(btn_logout)).click();
	Reporter.log("logout");
	}
	
	public void Enter()
	{
		driver.switchTo().frame(Frame);
		Reporter.log("entered");
	}
	public void Exit()
	{
		driver.switchTo().defaultContent();
		Reporter.log("exit");
	}

	public void searchBy()
	{
		driver.findElement(By.name(txt_search)).sendKeys(search);
	}
	
	public void Add()
	{
		
		driver.findElement(By.xpath(btn_add)).click();
		driver.findElement(By.name(txt_code)).clear();
		driver.findElement(By.name(txt_code)).sendKeys(code);
		driver.findElement(By.name(txt_fname)).sendKeys(Fname);
		driver.findElement(By.name(txt_lname)).sendKeys(Lname);
		driver.findElement(By.name(txt_Mname)).sendKeys(Mname);
		driver.findElement(By.name(txt_nick)).sendKeys(Nickname);
		driver.findElement(By.xpath(file)).sendKeys(txtfile);
		driver.findElement(By.id(save_btn)).click();
		Reporter.log("enter details sucesssfully");
	}
	
	public void searchfor()
	{
	//if(driver.findElement(By.name(search_for)).sendKeys(searchcode))
	///{
	//else
	//}
      driver.findElement(By.name(search_for)).sendKeys(searchcode);
	}
	public void seachbtn()
	{
		driver.findElement(By.xpath(btn_serach)).click();
	}
	public void Radiobutton()
	{
		driver.findElement(By.xpath(btn_radio)).click();
	}
	public void Delete()
	{
		driver.findElement(By.xpath(btn_delete)).click();
	}
	public void Next()
	{
		driver.findElement(By.linkText(click_next)).click();
	}
	public void Last()
	{
		driver.findElement(By.linkText(click_Last)).click();
	}
}

