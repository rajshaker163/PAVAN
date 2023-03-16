package TestScripts;

import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC001 extends General {

	//public static void main(String[] args)throws Exception {
	
	
	// TODO Auto-generated method 
	@Test
	public void tc001()throws Exception
	{
	General g1=new General();
		g1.open();
		Thread.sleep(3000);
		g1.login();
		
		Thread.sleep(3000);
		g1.Enter();
	//	g1.searchBy();
		Thread.sleep(3000);
	
		Thread.sleep(3000);
		g1.Add();
		g1.Exit();
		Thread.sleep(3000);
		g1.Logout();
		Thread.sleep(3000);
		g1.close();
			}

}
