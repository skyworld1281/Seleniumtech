package Com.LetMeCall.pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.LetMeCall1.Lib.Base;

public class Res_order_menu_page extends Base {

	

@FindBy(xpath = "//*[@id='skuitem-main']/div/div[2]/div[2]/div/div/a")
WebElement addtocart_res;

@FindBy(xpath = ("//button[@class='btn btn-primary dropdown-toggle']"))
WebElement setdateoder;
	




public Res_order_menu_page() {
		PageFactory.initElements(driver, this);

	}

	public void setdatetoder() throws Exception 
	{
		setdateoder.click();
		Thread.sleep(5000);
		Robot dp = new Robot();
		dp.keyPress(KeyEvent.VK_DOWN);
		dp.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		dp.keyPress(KeyEvent.VK_ENTER);
		dp.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("good");
		Thread.sleep(3000);
	}
	// clicking on addcart to select the item
	public void selectitem() throws Exception
	{
		
		
		addtocart_res.click();
		Thread.sleep(2000);
	}


	}

