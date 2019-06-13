package Com.LetMeCall1.Lib;

import Com.LetMeCall1.Lib.Config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base extends Config {

	@FindBy(xpath = "//h2[text()='Ordering App']")
	WebElement odering_app;

	public Base() {
		PageFactory.initElements(driver, this);
	}

	

	    // Action REusable method
	    public void mouseover(WebElement element)
	{
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}

	   
	    public void readdatafromprop() throws IOException
	    {
	    	FileInputStream fis=new FileInputStream("D:\\New folder\\LMC\\src\\main\\java\\Com\\LetMeCall\\Utilities\\prop.properties");
	        prop= new Properties(); 
	        prop.load(fis);
	         
	    }
	    
	    // Open Browser
		public void setup() throws Exception {
			System.setProperty(chrome_driver, chrome_path);
			driver = new ChromeDriver();
		}

		// Launching application
		public void launchapp() throws Exception {
			PageFactory.initElements(driver, this);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.navigate().to(url);
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement orderadd = wait.until(ExpectedConditions.elementToBeClickable(odering_app));
			orderadd.click();

			System.out.println("success");
		}
		
		public void waitFor(int millisecondsInDuration) throws InterruptedException
		{
			Thread.sleep(millisecondsInDuration);
		}
	
	
	// close Browser
	public void tearDown()
	{
		driver.quit();
	}

}
