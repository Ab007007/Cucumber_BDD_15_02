package stepdefinition.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	// Variables
	@FindBy(id = "username")
	WebElement usrNameTxtBox;
	
	
	@FindBy(name = "pwd")
	WebElement  pwdTxtBox;
	
	
	@FindBy(id = "loginButton")
	WebElement lgnButton;
	
	//Methods
	public void enterUserName(String name)
	{
		usrNameTxtBox.sendKeys(name);
	}
	
	public void enterPassword(String name)
	{
		pwdTxtBox.sendKeys(name);
	}
	
	public void clickOnLogin()
	{
		lgnButton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void login(String un, String pw)
	{
		enterUserName(un);
		enterPassword(pw);
		clickOnLogin();
	}
	
	//Constructor
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
}
