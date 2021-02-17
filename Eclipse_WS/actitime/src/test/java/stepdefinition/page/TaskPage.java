package stepdefinition.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {
	
	@FindBy(xpath = "//div[@class='addNewContainer']")
	WebElement addNewButton;
	
	@FindBy(xpath = "//div[contains(text(),'New Customer')]")
	WebElement newCustomerButton;
	
	public void clickOnNewCustomerButton()
	{
		addNewButton.click();
		newCustomerButton.click();
	}
	
	public TaskPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	
	}

}
