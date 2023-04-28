package TestScripts;

import org.testng.annotations.Test;

import com.hrms.lib.Xyzbankcode;

public class Xyzbankcode0001 extends Xyzbankcode{
	@Test
	public void Xyzbankcode_0001() throws Exception
	{
		Xyzbankcode x1=new Xyzbankcode();
		
		x1.open();
		Thread.sleep(3000);
		x1.Details();
	}

}
