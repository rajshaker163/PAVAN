package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class XyzBank {
	
	WebDriver driver;
	
	public String Url="https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login";
	public String First_name="Rajshaker";
	public String Last_name="shaker";
	public String Post_code="583013";
	public String txt_Customername="Rajshaker shaker";
	public String txt_Currency="Dollar";
	public String txt_searchcustomer="1016";
	
//
	
	//public String BankManagerlogin="/html/body/div/div/div[2]/div/div[1]/div[2]";

	public String AddCustomer="/html/body/div/div/div[2]/div/div[1]/button[1]";

	public String Firstname="/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input";
	public String Lastname="//input[@type='text'][@placeholder='Last Name']";
	public String postCode="//input[@type='text'][@placeholder=\"Post Code\"]";
	public String AddCustomer_button1="/html/body/div/div/div[2]/div/div[2]/div/div/form/button";
	public String Openaccount_click="/html/body/div/div/div[2]/div/div[1]/button[2]";
	public String CustomerName="//*[@id=\"userSelect\"]";
	public String Currency="//*[@id=\"currency\"]";
	public String Process_button="/html/body/div/div/div[2]/div/div[2]/div/div/form/button";
	public String Customers="/html/body/div/div/div[2]/div/div[1]/button[3]";
	public String searchcustomer="/html/body/div/div/div[2]/div/div[2]/div/form/div/div/input";
	public String Delete_button="/html/body/div/div/div[2]/div/div[2]/div/div/table/tbody/tr/td[5]/button";
	
	
	
}
