package Com.LetMeCall.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.LetMeCall1.Lib.Base;

public class Oder_page extends Base {

	@FindBy(xpath = ("//*[@id='mCSB_1_container']/div[2]/div[1]/button"))
	WebElement addtoorder;

	// WebElement addtoorder;
	public Oder_page() {
		PageFactory.initElements(driver, this);

	}

	public void orderfood() throws Exception {

		waitFor(2000);
		addtoorder.click();
		Thread.sleep(2000);
		System.out.println("added to cart");
	}
}