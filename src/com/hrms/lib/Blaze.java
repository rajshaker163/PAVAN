package com.hrms.lib;

import org.openqa.selenium.WebDriver;


public class Blaze {
	
WebDriver driver;

	public String url="https://blazedemo.com/register";
	//public String url="https://www.google.com/search?q=Blazedemo&oq=Blazedemo&aqs=chrome..69i57j0i20i263i512l2j0i512j0i10i30j69i60l3.855j0j15&sourceid=chrome&ie=UTF-8";
	//public String googlesearch_txt="Blazedemo" ;
	public String Name_txt="Rajshaker";
	public String Company_txt="ABC";
	public String Email_txt="rajseleniumAuto@gmail.com";
	public String Password_txt="8553359453@Raj";
	public String conform_txt="8553359453@Raj";
	
	//
	
//	public String googlesearch="/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input";
	public String Name="//input[@id='name']";
	public String Company="//input[@id='company']";
	public String Email="//input[@id='email']";
	public String Password="//input[@id='password']";
	public String Conformpassword="//input[@id='password-confirm']";
	public String Register_button="//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[6]/div/button";
	
			
	
	
	

}
