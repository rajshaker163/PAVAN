package TestScripts;

import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC002 {
	@Test	
	public void tc002()throws Exception{

		General g2=new General();
		g2.open();
		Thread.sleep(3000);
		g2.login();
		Thread.sleep(3000);
		g2.Enter();
		Thread.sleep(3000);
		g2.searchBy();
		Thread.sleep(3000);
		g2.searchfor();
		Thread.sleep(3000);
		g2.seachbtn();
		Thread.sleep(3000);
		g2.Radiobutton();
		Thread.sleep(3000);
		g2.Delete();
		Thread.sleep(3000);
		g2.Exit();
		Thread.sleep(3000);
		g2.Logout();
		g2.close();
		
		
	}
}
