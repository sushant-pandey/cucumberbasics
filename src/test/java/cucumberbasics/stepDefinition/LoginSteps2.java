package cucumberbasics.stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps2 {
	
	@Given("^User navigates to StackOverflow website(\\d+)$")
	public void user_navigates_to_StackOverflow_website(int arg1) throws Throwable {
	    System.out.println("user_navigates_to_StackOverflow_website-2");
	}

	@Given("^User clicks on the login button(\\d+)$")
	public void user_clicks_on_the_login_button(int arg1) throws Throwable {
		System.out.println("user_clicks_on_the_login_button-2");
	}

	@Given("^User enters the valid username(\\d+)$")
	public void user_enters_the_valid_username(int arg1) throws Throwable {
		System.out.println("user_enters_the_valid_username-2");
	}

	@Given("^User enters the valid password(\\d+)$")
	public void user_enters_the_valid_password(int arg1) throws Throwable {
		System.out.println("user_enters_the_valid_password-2");
	}

	@When("^User clicks the login button(\\d+)$")
	public void user_clicks_the_login_button(int arg1) throws Throwable {
		System.out.println("user_clicks_the_login_button-2");
	}

	@Then("^User should be taken to successful login page(\\d+)$")
	public void user_should_be_taken_to_successful_login_page(int arg1) throws Throwable {
		System.out.println("user_should_be_taken_to_successful_login_page-2");
	}
}
