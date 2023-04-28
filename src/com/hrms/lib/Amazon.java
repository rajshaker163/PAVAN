package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Amazon {
	
	public WebDriver driver;
	
	public String url="https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&";
	public String name="selenium";
	public String txt_email="rajseleniumauto@gmail.com";
	public String txt_password="8553359453@Raj";
	public String txt_conform_password="8553359453@Raj";
	
	

	
	public String your_name="//input[@id='ap_customer_name']";
	public String email="//input[@id='ap_email']";
	public String password="//input[@id='ap_password']";
	public String Conform_password="//input[@id='ap_password_check']";
	public String continue_button="//input[@id='continue']";
	public String event="/html/body/div[1]/div/div/div/div/div[2]/div/div/form/div[2]/div/canvas";
	
	
	
}
