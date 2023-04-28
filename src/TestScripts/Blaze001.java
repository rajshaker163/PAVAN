package TestScripts;

import org.testng.annotations.Test;

import com.hrms.lib.Blazecode;

public class Blaze001 extends Blazecode {
	@Test
	public void blaze001()throws Exception
	{
		Blazecode b1=new Blazecode();
		b1.open();
		//b1.Googlesearch();
		b1.Register();
	}

}
