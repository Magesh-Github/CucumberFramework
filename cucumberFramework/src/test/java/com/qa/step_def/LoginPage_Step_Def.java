package com.qa.step_def;

import java.io.IOException;

import com.qa.constants.Constants;
import com.qa.page_object.LoginPage;
import com.qa.utilities.CommonUtils;
import com.qa.webdriver_manager.DriverManager;

import io.cucumber.java.en.*;

public class LoginPage_Step_Def {
	LoginPage loginPage=new LoginPage(DriverManager.getDriver());

	    @Given("I am on the Amazon homepage")
	    public void i_am_on_the_amazon_homepage() {
	        DriverManager.getDriver().get("https://www.amazon.in/");
	    }

	    @When("I search for {string}")
	    public void i_search_for(String product) {
	       loginPage.clickMobileInHomePage();
	    }

	    @When("I click on the search button")
	    public void i_click_on_the_search_button() {
           DriverManager.getDriver().navigate().back();
	    }

	    @Then("I should see a list of mobile phones displayed")
	    public void i_should_see_a_list_of_mobile_phones_displayed() {
	    	 DriverManager.getDriver().navigate().forward();
	    }
	
}
