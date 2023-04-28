package TestScripts;

import org.testng.annotations.Test;

import com.hrms.lib.Amazoncode;

public class Amazon001 extends Amazoncode {

	@Test
	public void amazon_001()throws Exception

{
	Amazoncode ac1=new Amazoncode();
	ac1.openApplication();
	ac1.createAccount();
		
}
}
