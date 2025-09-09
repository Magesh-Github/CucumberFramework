package com.qa.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.utilities.CommonUtils;


public class LoginPage extends CommonUtils{
	
	  private WebDriver driver;


	  public LoginPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	
	public void clickMobileInHomePage() {
		clickTheElement(home_Mobile,"Mobile in Home Page");
	}
	
    
	@FindBy(xpath="//*[text()='Mobiles']")
	private WebElement home_Mobile;
}
