package TestScripts;

import org.testng.annotations.Test;

import com.hrms.lib.Gmailcode;

public class Gmailtc001 extends Gmailcode {

	@Test
public void gmail_tc001() throws Exception
{
	Gmailcode g1=new Gmailcode();
	g1.Open();
	Thread.sleep(3000);
	g1.details();
}
}
