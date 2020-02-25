package cucumberbasics.stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	@Given("^User navigates to StackOverflow website$")
	public void user_navigates_to_StackOverflow_website() throws Throwable {
	   System.out.println("user_navigates_to_StackOverflow_website");
	}

	@Given("^User clicks on the login button$")
	public void user_clicks_on_the_login_button() throws Throwable {
		System.out.println("user_clicks_on_the_login_button");
	}

	@Given("^User enters the valid username$")
	public void user_enters_the_valid_username() throws Throwable {
		System.out.println("user_enters_the_valid_username");
	}

	@Given("^User enters the valid password$")
	public void user_enters_the_valid_password() throws Throwable {
		System.out.println("user_enters_the_valid_password");
	}

	@When("^User clicks the login button$")
	public void user_clicks_the_login_button() throws Throwable {
		System.out.println("user_clicks_the_login_button");
	}

	@Then("^User should be taken to successful login page$")
	public void user_should_be_taken_to_successful_login_page() throws Throwable {
		System.out.println("user_should_be_taken_to_successful_login_page");
	}

}
