package stepdefinition.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashBoardPage {

	WebDriver driver;
	@FindBy(xpath = "//div[text()='TASKS']/parent::a")
	WebElement tasksLink;

	@FindBy(xpath = "//div[@class='toast']")
	WebElement toastElemnt;

	@FindBy(id = "logoutLink")
	WebElement logoutlink;

	public void logout() {
		logoutlink.click();
	}

	public void clickOnTasks() {
		tasksLink.click();
	}

	public DashBoardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;

	}

	public void validateToastMessage() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement ele = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='toast']"))));
//		WebElement ele = wait.until(ExpectedConditions.visibilityOf(toastElemnt));

		System.out.println(ele.getText());

		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[@class='toast']"))));

	}

}
