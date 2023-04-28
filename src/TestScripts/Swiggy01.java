package TestScripts;

import org.testng.annotations.Test;

import com.hrms.lib.Swiggy;
import com.hrms.lib.Swiggycode;

public class Swiggy01 extends Swiggy {
@Test
	public void swiggy()throws Exception
	{
		Swiggycode s1=new Swiggycode();
		s1.open();
		s1.Login();
		
	}
}
