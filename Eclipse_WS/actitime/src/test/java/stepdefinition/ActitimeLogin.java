package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ActitimeLogin {

	WebDriver driver = null;
	@Given("user is on actitime login page")
	public void user_is_on_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
	
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
	    driver.findElement(By.id("username")).sendKeys("admin");
	    driver.findElement(By.name("pwd")).sendKeys("manager");
	    
	}

	@And("click on login button")
	public void click_on_login_button() throws InterruptedException {
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
	}

	@Then("user will be navigated to home page")
	public void user_will_be_navigated_to_home_page() {
		Assert.assertEquals("actiTIME - Enter Time-Track", driver.getTitle());
	}

	@And("logout of applicaiton")
	public void logout_of_applicaiton() {
		driver.findElement(By.id("logoutLink")).click();
	}
	@When("user enter invalid username and password")
	public void user_enter_invalid_username_and_password() {
		driver.findElement(By.id("username")).sendKeys("admin1");
	    driver.findElement(By.name("pwd")).sendKeys("manager1");
	
	}

	@Then("user will stay on login page")
	public void user_will_stay_on_login_page() throws InterruptedException {
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
		Assert.assertEquals("actiTIME - Login", driver.getTitle());
	}
}
