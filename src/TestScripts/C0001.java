package TestScripts;


import org.testng.annotations.Test;

import com.hrms.lib.code;

public class C0001 extends code {
	@Test
	public void c0001()throws Exception
	{
	code c1=new code();
	c1.open();
	
	c1.login();
	c1.feilds();
	c1.SecondFeild();
	}

}
