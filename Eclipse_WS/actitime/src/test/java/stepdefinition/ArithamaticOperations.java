package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ArithamaticOperations {
	int num1,num2;;
	
	@Given("User enters {int} and {int}")
	public void user_enters_and(Integer int1, Integer int2) {
	  num1  = int1;
	  num2 = int2;
	}


	@When("user perform {string}")
	public void user_perform(String string) {
	    System.out.println("perforimg " + string);
	}
	
	@Then("sum of two numbers will be displayed")
	public void sum_of_two_numbers_will_be_displayed() {
	    System.out.println(num1 + num2);
	}
	
	@Then("substraction of two numbers will be displayed")
	public void sub_of_two_numbers_will_be_displayed() {
	    System.out.println(num1 - num2);
	}

}
