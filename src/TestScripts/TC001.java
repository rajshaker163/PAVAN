package TestScripts;


import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC001 extends General {

	//public static void main(String[] args)throws Exception {
	
	
	// TODO Auto-generated method 
@Test
	public void tc001()
	{
	General g1=new General();
		g1.open();
		//Thread.sleep(3000);
		g1.login();
		
		g1.Logout();
		//Thread.sleep(3000);
		g1.close();
			}

}
