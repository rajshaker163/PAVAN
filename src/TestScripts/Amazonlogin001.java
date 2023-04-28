package TestScripts;

import org.testng.annotations.Test;

import com.hrms.lib.Amazonlogincode;

public class Amazonlogin001 extends Amazonlogincode{
@Test
	public void amazonlogin001() throws Exception
	{
		Amazonlogincode ac1=new Amazonlogincode();
		ac1.open();
		ac1.Login();
		ac1.searchitem();
	}
}
