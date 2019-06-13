package Com.LetMeCall.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.LetMeCall1.Lib.Base;

public class Resturent_page extends Base
{
	@FindBy(xpath="//*[@id='storefound']/div[3]/div[1]/a/img")
	 WebElement hotel;
	
	
	public Resturent_page()
	{
		PageFactory.initElements(driver, this);
	
	}
	
	public void Selectresturtents() throws Exception
	{
	mouseover(hotel);
	Thread.sleep(3000);
	hotel.click();
	Thread.sleep(2000);
	}
}
