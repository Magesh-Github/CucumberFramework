package com.qa.step_def.Hooks;

import org.openqa.selenium.WebDriver;

import com.qa.utilities.CommonUtils;
import com.qa.webdriver_manager.DriverManager;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	public static WebDriver driver;
	CommonUtils commonUtils= new CommonUtils();
	 @Before
	    public void setup() {
	        System.out.println("===== Starting Test Execution =====");
	        DriverManager.launchBrower();
	        commonUtils.loadProperties();
	    }

	    @After
	    public void teardown() {
	        System.out.println("===== Ending Test Execution =====");
	        DriverManager.getDriver().quit();
	    }

}
