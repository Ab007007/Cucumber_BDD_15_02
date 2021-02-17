package stepdefinition.test;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import stepdefinition.page.CreateCustomerPage;
import stepdefinition.page.DashBoardPage;
import stepdefinition.page.LoginPage;
import stepdefinition.page.TaskPage;

public class CreateCustomerTest {

	WebDriver driver = null;
	LoginPage lp = null;
	DashBoardPage dp = null;
	TaskPage tp = null;
	CreateCustomerPage cp =null ;

	@Given("had all the page Objects")
	public void had_all_the_page_objects() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		lp = new LoginPage(driver);
		dp = new DashBoardPage(driver);
		tp = new TaskPage(driver);
		cp = new CreateCustomerPage(driver);
		
		
	}

	@Given("pomuser is on login page")
	public void pomuser_is_on_login_page() {
		driver.get("http://localhost/login.do");
	}

	@When("pomuser login with {string} and {string}")
	public void pomuser_login_with_and(String string, String string2) {
		lp.login(string, string2);
	}

	@Then("pomuser home page should be displayed")
	public void pomuser_home_page_should_be_displayed() {
		Assert.assertEquals("actiTIME - Enter Time-Track", driver.getTitle());
	}

	@When("pomuser click on tasks link")
	public void pomuser_click_on_tasks_link() {
		dp.clickOnTasks();
	}

	@Then("pomuser tasks page should be displayed")
	public void pomuser_tasks_page_should_be_displayed() {
		Assert.assertEquals("actiTIME - Task List", driver.getTitle());
	}

	@When("pomuser click on create customer button")
	public void pomuser_click_on_create_customer_button() {
		tp.clickOnNewCustomerButton();
	}

	@When("pomuser click create customer by entering {string} and {string}")
	public void pomuser_click_create_customer_by_entering_and(String string, String string2) {
		cp.createCustomer(string, string2);
	}

	@Then("pomuser validates the success message")
	public void pomuser_validates_the_success_message() {
		
		dp.validateToastMessage();
	}

	@Then("pomuser logout of the applicaiton")
	public void pomuser_logout_of_the_applicaiton() {
		dp.logout();
	}
	
	@Then("pomuser close the browser")
	public void pomuser_close_driver() {
		driver.close();
	}

}
