package Com.LetMeCall.pages;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.LetMeCall1.Lib.Base;

public class Registration_page extends Base {
	
	
	@FindBy(xpath="//A[contains(text(),'Register')]")
	private WebElement Register_btn;
	
	
	@FindBy(xpath="//INPUT[contains(@id, 'firstName')]")
	private WebElement Register_Firstname;
	
	@FindBy(id="emailAddress")
	private WebElement Register_Email;
	
	@FindBy(id="phoneNo")
	private WebElement Register_phoneno;
	
	@FindBy(id="password")
	private WebElement Register_password;
	
	@FindBy(id="zipcode")
	private WebElement Register_zipcode;
	
	@FindBy(xpath="//*[@id='bt_signup']")
	private WebElement Register_signup;
	
	
	
	
	public Registration_page ()
	{
		PageFactory.initElements(driver, this);
	}
	//registration of user
	public void register() throws Exception
	{
		 Register_btn.click();
		File src = new File("C:\\Users\\ADMIN\\Desktop\\registration.xlsx");
		FileInputStream fls = new FileInputStream(src);
		System.out.println("sumanthsdlkjcfkslj");
	
		XSSFWorkbook wb1 = new XSSFWorkbook(fls);
		XSSFSheet sheet1 = wb1.getSheet("Sheet3");

		String name = sheet1.getRow(0).getCell(0).getStringCellValue();
		Register_Firstname.sendKeys(name);

		String Email = sheet1.getRow(1).getCell(0).getStringCellValue();
		Register_Email.sendKeys(Email);

		String phoneno = sheet1.getRow(2).getCell(0).getStringCellValue();
		Register_phoneno.sendKeys(phoneno);

		String pwd = sheet1.getRow(3).getCell(0).getStringCellValue();
		Register_password.sendKeys(pwd);
		Thread.sleep(2000);
		
		String zipcode = sheet1.getRow(4).getCell(0).getStringCellValue();
		Register_zipcode.sendKeys(zipcode);

		Register_signup.click();
		

}
}
