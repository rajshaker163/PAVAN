package TestScripts;



import org.testng.annotations.Test;

import com.hrms.lib.Flightbookingcode;

public class Flightbooking0001 extends Flightbookingcode {
	
	@Test
	public void Flightbooking_00() throws  Exception
	{
		Flightbookingcode f1=new Flightbookingcode();
		f1.Open();
		Thread.sleep(2000);
		f1.Details();
		
	}

}