package stepdefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {

	WebDriver driver = null;
	@Given("user is on google page")
	public void user_is_on_google_page() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.get("http://google.com/");
	}


	@When("user enter {} in the search box")
	public void user_enter_in_the_search_box(String text) {
	   driver.findElement(By.name("q")).sendKeys(text);
	    
	}
	
	@Then("application should dispaly suggestions")
	public void application_should_dispaly_suggestions() {
	   
		List<WebElement> suggetions = driver.findElements(By.xpath("//ul/li[@role='presentation']//span"));
	    Assert.assertTrue(suggetions.size()>0);
	}
	@Then("user will print all suggestions to console")
	public void user_will_print_all_suggestions_to_console() {
		List<WebElement> suggetions = driver.findElements(By.xpath("//ul/li[@role='presentation']//span"));
		 
		for (WebElement suggestion : suggetions) 
		{
			System.out.println(suggestion.getText());
		}
	    
	}
	
	@When("click on Serch button")
	public void click_on_serch_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}



	@Then("application should dispaly more/no result(s)")
	public void application_should_dispaly_more_result() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	



	@Then("close the driver")
	public void close_the_driver() {
	   
	    driver.close();
	}
}
