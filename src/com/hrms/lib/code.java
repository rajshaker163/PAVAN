package com.hrms.lib;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class code extends Adication {

	// public WebDriver driver;

	public void open() {

		System.setProperty("webdriver.chrome.driver", "C:\\GD\\ch\\chromedriver.exe");

		ChromeOptions n = new ChromeOptions();
		n.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(n);
		driver.get(url);
		Reporter.log("opened");
	}

	public void login() throws Exception {
		driver.findElement(By.name(txt_un)).sendKeys(un);
		driver.findElement(By.name(txt_pw)).sendKeys(pw);
		driver.findElement(By.name(Login_btn)).click();
		Reporter.log("Login");

	}

	public void feilds() throws Exception {
		Select drop = new Select(driver.findElement(By.name(txt_Location)));
		drop.selectByVisibleText(Location);
		Thread.sleep(3000);

		Select drop1 = new Select(driver.findElement(By.name(txt_hotel)));
		drop1.selectByVisibleText(Hotels);
		// Thread.sleep(3000);

		Select drop2 = new Select(driver.findElement(By.name(txt_RoomRype)));
		drop2.selectByVisibleText(RoomType);
		// Thread.sleep(3000);

		Select drop3 = new Select(driver.findElement(By.name(txt_NumberofRooms)));
		drop3.selectByVisibleText(NumberofRooms);
		// Thread.sleep(3000);

		WebElement box = driver.findElement(By.xpath(txt_CheckInDate));
		box.sendKeys(CheckInDate);
		// Thread.sleep(3000);

		driver.findElement(By.xpath(txt_CheckOutDate)).clear();

		WebElement box1 = driver.findElement(By.xpath(txt_CheckOutDate));
		box1.sendKeys(CheckOutDate);
		// Thread.sleep(3000);

		Select drop4 = new Select(driver.findElement(By.name(txt_AdultsperRoom)));
		drop4.selectByVisibleText(AdultsperRoom);
		// Thread.sleep(3000);

		Select drop5 = new Select(driver.findElement(By.name(txt_ChildrenperRoom)));
		drop5.selectByVisibleText(ChildrenperRoom);
		// Thread.sleep(3000);

		driver.findElement(By.name(Serach_Btn)).click();
		driver.findElement(By.name(Radio_btn)).click();
		driver.findElement(By.name(Conitnue_btn)).click();
		Reporter.log("first feilds");

	}

	public void SecondFeild() throws AWTException, Exception {
		driver.findElement(By.name(Firstname)).sendKeys(First_name);
		driver.findElement(By.name(Lastname)).sendKeys(Last_name);
		driver.findElement(By.name(BillingAddress)).sendKeys(Billing_Address);
		driver.findElement(By.name(credit)).sendKeys(credit_no);

		Select drop6 = new Select(driver.findElement(By.xpath(cardType)));
		drop6.selectByVisibleText(card_type);

		Select drop7 = new Select(driver.findElement(By.xpath(Expiry)));
		drop7.selectByVisibleText(Expiry_month);

		Select drop8 = new Select(driver.findElement(By.xpath(Year)));
		drop8.selectByVisibleText(Expiry_year);

		driver.findElement(By.name(CVVNo)).sendKeys(CVV_No);
		driver.findElement(By.name(BookNow_btn)).click();

		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		 js.executeScript("window.scrollTo(0,300)");

		System.out.println("javaScriptExceutor");
		Thread.sleep(3000);
		WebElement obj = driver.findElement(By.xpath("//input[@type='button'][@id='my_itinerary']"));
		obj.click();

		Thread.sleep(3000);
		
		driver.findElement(By.xpath(SearchId)).sendKeys(Search_id);
		Thread.sleep(3000);
		driver.findElement(By.xpath(Go_botton)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(radio_button)).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(cancle)).click();
		Thread.sleep(3000);
		Alert a = driver.switchTo().alert();
        System.out.println(a.getText());
	    a.accept();
		Reporter.log("second feilds");

	    
	    driver.findElement(By.linkText("Logout")).click();
	    
	}

}
