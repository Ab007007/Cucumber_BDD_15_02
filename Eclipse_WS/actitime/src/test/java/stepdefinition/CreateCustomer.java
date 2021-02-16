package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.ActitimeUtils;
import util.DriverUtils;

public class CreateCustomer {

	static WebDriver driver = null;

	@Given("user is on login page")
	public void user_is_on_login_page() {
		driver = DriverUtils.getDriver();
		driver.get("http://localhost/login.do");

	}

	@When("user login with {string} and {string}")
	public void user_login_with_and(String string, String string2) {
		ActitimeUtils.login(string, string2);
	}

	@Then("home page should be displayed")
	public void home_page_should_be_displayed() {
		Assert.assertEquals("actiTIME - Enter Time-Track", driver.getTitle());
	}

	@When("user click on tasks link")
	public void user_click_on_tasks_link() {
		driver.findElement(By.xpath("//div[text()='TASKS']/parent::a")).click();
	}

	@Then("tasks page should be displayed")
	public void tasks_page_should_be_displayed() {
		Assert.assertEquals("actiTIME - Task List", driver.getTitle());
	}

	@When("user click on create customer button")
	public void user_click_on_create_customer_button() {
		ActitimeUtils.clickOnCreateCustomer();
	}

	@When("click create customer by entering {string} and {string}")
	public void create_customer(String cn, String cd) {
		ActitimeUtils.createCustomer(cn, cd);
	}

	@Then("user validates the success message")
	public void user_validates_the_success_message() {
		ActitimeUtils.validateToastMessage();
	}

	@Then("logout of the applicaiton")
	public void logout_of_the_applicaiton() {
		ActitimeUtils.logout();
	}

	@Then("close the browser")
	public void close_the_browser() {
		driver.close();
	}

}
