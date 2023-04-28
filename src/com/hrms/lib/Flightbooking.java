package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Flightbooking {
	
	WebDriver driver;
	
	public String Url="https://www.jotform.com/form-templates/flight-booking-form";
	public String txt_From="Airport 3";
	public String txt_To="Airport 2";
	public String txt_Airline="Airline 3";
	public String txt_Departure="";
	public String txt_return="30/04/2023";
	public String txt_Adults="5";
	
	//
	//public String form="//*[@id='outlineArea']";
	public String  OnwayTripRadio_button="label_input_3_0";
	public String From="q4_from";
	public String To="//*[@id='input_5']";
	public String Airline="//*[@id='input_22']";
	public String Departure="//input[@id='lite_mode_6']";
	public String Return="//input[@id='lite_mode_7']";
	public String Adults="//input[@id='input_8']";
	public String Next_button="//*[@id='form-pagebreak-next_10']";
	
	
	

}
