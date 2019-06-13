package Com.LetMeCall1.LMC;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.LetMeCall.pages.Registration_page;
import Com.LetMeCall1.Lib.Base;
import junit.framework.Assert;

public class Registeration_TC_002 extends Base {
	
	
	@BeforeMethod
	public void reg_steup() throws Exception
	{
	Base bs=new Base();
	bs.setup();
	bs.launchapp();

	}
	@Test
	public void  cust_reg() throws Exception
	{
		Registration_page rs= new Registration_page();
		rs.register();
		
		String title = driver.getTitle();
		Assert.assertEquals(title, "LetMeCall");
		
	}
	
	

}
