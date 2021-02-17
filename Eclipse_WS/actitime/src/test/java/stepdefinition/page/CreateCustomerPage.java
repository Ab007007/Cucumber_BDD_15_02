package stepdefinition.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCustomerPage {
	
	@FindBy(id = "customerLightBox_nameField" )
	WebElement customerNameTxtBox;
	
	@FindBy(id = "customerLightBox_descriptionField")
	WebElement customerDescTxtBox;
	
	@FindBy(id = "customerLightBox_commitBtn")
	WebElement createCustomerBtn;
	
	
	public void createCustomer(String cn, String cd)
	{
		customerNameTxtBox.sendKeys(cn);
		customerDescTxtBox.sendKeys(cd);
		createCustomerBtn.click();
	}
	
	
	public CreateCustomerPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
}
