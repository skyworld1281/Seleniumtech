package Com.LetMeCall.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.LetMeCall1.Lib.Base;



public class Login_page extends Base
{
	

	@FindBy(xpath="//*[@class='profile-dropdown']/descendant::li/a/span[1]")                                              
	 WebElement loginbtn;

	@FindBy(id="j_username")
	 public WebElement login_username;
	

	@FindBy(id="j_password")
	 public WebElement login_pwd;
	
	@FindBy(id="login")
	 public WebElement login_signup;
	
	
	public Login_page()
	{
		PageFactory.initElements(driver, this);
	
	}
	
		
	public void cust_login() throws  Exception
	{
    PageFactory.initElements(driver, this);
	System.out.println("Yes");
	Thread.sleep(5000);
	loginbtn.click();
	Thread.sleep(1000);
	readdatafromprop();
	login_username.sendKeys(prop.getProperty("email"));
	login_pwd.sendKeys(prop.getProperty("pwd"));
	login_signup.click();
    Thread.sleep(2000);
 }
}