package stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.datatable.DataTable;
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

	@When("click create customer by entering {} and {}")
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
	
	
	
	@When("click create customer by entering customer details from datatable")
	public void click_create_customer_by_entering_customer_details_from_datatable(DataTable dataTable)
	{
	    	List<Map<String, String>> data = dataTable.asMaps();
	    	System.out.println("Total element in list " + data.size());
	    	String cn,cd;
	    	for (int i = 0; i < data.size(); i++)
	    	{
				cn = data.get(i).get("customer_name");
				cd = data.get(i).get("customer_desc");
				ActitimeUtils.clickOnCreateCustomer();
				ActitimeUtils.createCustomer(cn, cd);
				ActitimeUtils.validateToastMessage();
				
			}
	}
	
	@When("click create customer by entering customer details from list datatable")
	public void click_create_customer(DataTable dataTable) 
	{

		List<List<String>> data = dataTable.asLists();
		String cn,cd;
		for (int i = 0; i < data.size(); i++) 
		{
			cn = data.get(i).get(0);
			cd = data.get(i).get(1);
			ActitimeUtils.clickOnCreateCustomer();
			ActitimeUtils.createCustomer(cn, cd);
			ActitimeUtils.validateToastMessage();
		}
	}


	@Then("user search for a customer {} in Customer and project search box")
	public void user_search_for_a_customer_in_customer_and_project_search_box(String cn) throws InterruptedException {
	  driver.findElement(By.xpath("//div[@id='cpTreeBlock']//input[@type='text']")).sendKeys(cn);
	}

	@Then("user click of settings icon from the searchlist")
	public void user_click_of_settings_icon_from_the_searchlist() throws InterruptedException {
		 Actions act = new Actions(driver);
		  act.moveToElement(driver.
				  findElement(By.xpath
						  ("//div[@class='node allCustomersNode selected']/following-sibling::div"))).perform();
		  Thread.sleep(2000);
		  act.click(driver.findElement(By.xpath("//div[@class='node allCustomersNode selected']/following-sibling::div/div[@class='editButton available']"
				  ))).perform();
	}
	@When("user click on delete button present inside action")
	public void user_click_on_delete_button_present_inside_action() {
	   WebDriverWait wait  = new WebDriverWait(driver, 15);
	   WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='edit_customer_sliding_panel sliding_panel']//div[text()='ACTIONS']")));
	
	   ele.click();
	   driver.findElement(By.xpath("//div[@class='edit_customer_sliding_panel sliding_panel']//div[text()='Delete']")).click();
	}
	@When("click on delete permanently")
	public void click_on_delete_permanently() {
	   
		driver.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
	}


}
