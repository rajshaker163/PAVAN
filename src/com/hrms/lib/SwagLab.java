package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class SwagLab {
	
	WebDriver driver;
	
	public String Url="https://www.saucedemo.com/";
	public String txt_username="standard_user"; 
	public String txt_password="secret_sauce";
	
	
	

	
	
	public String Username="//input[@id=\"user-name\"]";
	public String Password="//input[@id=\"password\"]";
	public String Login_button="//input[@id=\"login-button\"]";
	public String Menuopen_click="//*[@id=\"react-burger-menu-btn\"]";
	//by.linktext=All Items;
	public String Addtocart_click="//*[@id=\"add-to-cart-sauce-labs-backpack\"]";
	public String Bag_click="//*[@id=\"item_4_title_link\"]/div";
	public String Remove_button="//*[@id=\"remove-sauce-labs-backpack\"]";
}
