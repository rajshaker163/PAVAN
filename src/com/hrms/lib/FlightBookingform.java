package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class FlightBookingform {
	
	WebDriver driver;
	
	public String Url="https://www.jotform.com/form-templates/flight-booking-form";
	public String txt_from="Airport 3";
	public String txt_To="Airport 3";
	public String txt_Airline="Airline 2";
	public String txt_Departure="24/04/2023";
	public String txt_Return="25/04/2023";
	public String txt_Adults="3";

	
	//
	
	public String Onewaytrip="//*[@id=\"label_input_3_1\"]";
	public String From="input_4";
	public String To="//*[@id=\"input_5\"]";
	public String Airline="//*[@id=\"input_22\"]";
	public String Departure="/html/body/form/div/ul[1]/li[6]/div/div/span/input";
	public String Return="//*[@id=\"lite_mode_7\"]";
	public String Adults="q8_adults16";
	public String Next_button="//*[@id=\"form-pagebreak-next_10\"]";
}
