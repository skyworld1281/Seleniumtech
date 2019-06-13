package Com.LetMeCall.pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.LetMeCall1.Lib.Base;

public class Custmor_page extends Base
{   
	String location="L. B. Nagar, Hyderabad, Telangana, India";
	
	
	@FindBy(id="searchbox")
	 WebElement Searchbox;
	
	@FindBy(id="//a[contains(@class='dropdown-toggle shortcut')]")
	 WebElement loginusername;
	
	@FindBy(id="//*[@id='menuProfile']/div/div/ul/li[4]/a")
	 WebElement logout;
	
	public Custmor_page()
	{
		PageFactory.initElements(driver, this);
	
	}
	
	public void search_location() throws Exception
	{
	Thread.sleep(5000);
	
	Searchbox.click();
	Searchbox.sendKeys(location);
	Thread.sleep(2000);
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(3000);
	
	}
public void logout()

{
loginusername.click();
mouseover(logout);
logout.click();
}
}
