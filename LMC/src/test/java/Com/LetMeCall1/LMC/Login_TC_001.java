package Com.LetMeCall1.LMC;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Com.LetMeCall.pages.*;
import Com.LetMeCall1.Lib.Base;



public class Login_TC_001 extends Base {
	
	@BeforeTest
	public void start() throws Exception
	{

    setup();
    launchapp();
    Thread.sleep(1000);
	}
	
	@Test
	public void excutelogin() throws Exception
	{
		Login_page l=new Login_page();
		Thread.sleep(1000);
		l.cust_login();
		Thread.sleep(3000);
		
	}
	@AfterTest
	public  void closeapp()
	{
		Custmor_page cp=new Custmor_page();
		cp.logout();
	}

}
