package Com.LetMeCall.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.LetMeCall1.Lib.Base;


public class Cart extends Base {

	@FindBy(xpath = "//*[@id='cart-btn']")
	WebElement cartbtn;

	@FindBy(xpath = "//*[@id='cart-checkoutbtn']")
	WebElement checkoutbtn;

	public Cart() throws Exception {
		PageFactory.initElements(driver, this);

	}
    //method to click on cart
	public void cart() throws Exception {
		mouseover(cartbtn);
		cartbtn.click();
		Thread.sleep(2000);
	}
    //method to checkout in the cart
	public void checkout() throws Exception {
		mouseover(checkoutbtn);
		checkoutbtn.click();
		Thread.sleep(2000);

	}
}