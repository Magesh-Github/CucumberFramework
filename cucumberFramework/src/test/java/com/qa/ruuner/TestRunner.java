package com.qa.ruuner;


import com.qa.webdriver_manager.DriverManager;

import io.cucumber.java.Before;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features = "scr/test/resources/feature",
glue = {"com.qa.step_def"},
monochrome = true,
dryRun = false,
tags = "regression"
)
public class TestRunner{
	
	@Before
	public void beforeclass() {
		if (DriverManager.getDriver()==null) {
			DriverManager.launchBrower();
		}
	}

}
	