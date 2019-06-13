 package Com.LetMeCall1.LMC;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Com.LetMeCall.pages.Cart;
import Com.LetMeCall.pages.Custmor_page;
import Com.LetMeCall.pages.Login_page;
import Com.LetMeCall.pages.Oder_page;
import Com.LetMeCall.pages.Res_order_menu_page;
import Com.LetMeCall.pages.Resturent_page;
import Com.LetMeCall1.Lib.Base;

public class OrderFood_TC_003 extends Base

{
	@BeforeTest 
		public void validatelogin() throws Exception
		{
			setup();
			launchapp();
			Login_page lp=new Login_page();
			lp.cust_login();
			
		}

@Test
public void validatefoodorder() throws Exception
{
	
	Custmor_page cp= new Custmor_page();
	cp.search_location();
	Resturent_page res=new Resturent_page();
	res.Selectresturtents();
	Res_order_menu_page menu=new Res_order_menu_page();
	menu.setdatetoder();
	menu.selectitem();
	Oder_page oder=new Oder_page();
	oder.orderfood();
	Cart c=new Cart();
	c.cart();
	c.checkout();
}
	
	

}


