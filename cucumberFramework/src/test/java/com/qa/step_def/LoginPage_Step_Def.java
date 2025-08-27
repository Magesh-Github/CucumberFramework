package com.qa.step_def;

import io.cucumber.java.en.*;

public class LoginPage_Step_Def {
	
	@Given("User is on the Login page")
	public void user_is_on_the_login_page() {
	  System.out.println("User is on the Login page");
	}

	@When("User enters wrongUser and pass123")
	public void user_enters_wrong_user_and_pass123() {
	 
	}

	@When("clicks on the Login button")
	public void clicks_on_the_login_button() {
	  
	}

	@Then("An error message should be displayed")
	public void an_error_message_should_be_displayed() {
	   
	}

	@When("User enters testUser and wrongPass")
	public void user_enters_test_user_and_wrong_pass() {
	 
	}

	@When("User enters admin123 and admin123")
	public void user_enters_admin123_and_admin123() {
	   
	}

}
