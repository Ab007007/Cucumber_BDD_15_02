package util;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeUtils extends DriverUtils
{

	public static void login(String un, String pwd) {
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.id("loginButton")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals("actiTIME - Enter Time-Track", driver.getTitle());

	}
	
	public static void logout()
	{
		driver.findElement(By.id("logoutLink")).click();
	}
	
	
	public static void clickOnCreateCustomer()
	{
		driver.findElement(By.xpath("//div[@class='addNewContainer']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'New Customer')]")).click();
	}

	
	
	public static void createCustomer(String cn, String cd)
	{
		driver.findElement(By.id("customerLightBox_nameField")).sendKeys(cn);
		driver.findElement(By.id("customerLightBox_descriptionField")).sendKeys(cd);
		driver.findElement(By.id("customerLightBox_commitBtn")).click();
	}
	
	
	
	public static void validateToastMessage()
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement ele = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='toast']"))));
	
		System.out.println(ele.getText());
	
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[@class='toast']"))));
	
	
	
	}
}
