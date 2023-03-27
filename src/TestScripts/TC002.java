package TestScripts;

import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC002 {
	@Test	
	public void tc002(){

		General g2=new General();
		g2.open();
		//Thread.sleep(300);
		g2.login();
		//Thread.sleep(300);
		g2.Enter();
		//Thread.sleep(300);
		g2.searchBy();
		//Thread.sleep(300);
		g2.searchfor();
		//Thread.sleep(300);
		g2.seachbtn();
		//Thread.sleep(300);
		g2.Radiobutton();
		//Thread.sleep(300);
		g2.Delete();
		//Thread.sleep(300);
		g2.Exit();
		//Thread.sleep(300);
		g2.Logout();
		g2.close();
		
		
	}
}
