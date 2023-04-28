package TestScripts;

import org.testng.annotations.Test;

import com.hrms.lib.Swaglabcode;

public class SwagLab001 extends Swaglabcode {
	@Test
	public void SwagLab_001() throws Exception
	{
		Swaglabcode s1=new Swaglabcode();
		s1.Open();
		Thread.sleep(3000);
		s1.LoginDetails();
	}

}
