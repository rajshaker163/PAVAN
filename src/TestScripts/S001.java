package TestScripts;

import org.testng.annotations.Test;

import com.hrms.lib.SwiggyGeneral;

public class S001 extends SwiggyGeneral {
	@Test
	public void s001()throws Exception
	{
		SwiggyGeneral s1=new SwiggyGeneral();
		s1.open();
		s1.order();
		
	}

}
