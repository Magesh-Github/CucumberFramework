package com.qa.utilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.qa.constants.Constants;
import com.qa.webdriver_manager.DriverManager;

public class CommonUtils {
	
	private static final Logger LOGGER= LogManager.getLogger(CommonUtils.class);
	WebDriverWait wait=new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(20));

	public void loadProperties() {
		LOGGER.info("Load Properties");
		Properties properties = new Properties();

		try {
			properties.load(getClass().getResourceAsStream("/config.properties"));;
		} catch (IOException e) {
			e.printStackTrace();
		}

		Constants.App_URL = properties.getProperty("App_URL");

	}
	
	public void clickTheElement(WebElement element,String msg) {
		
		try {
			WebElement ele=	wait.until(ExpectedConditions.elementToBeClickable(element));
			ele.click();
			LOGGER.info("Click the Element"+ msg);
		} catch (Exception e) {
			Assert.fail("Failed to click on element: " + element + " due to: " + e.getMessage());
			LOGGER.info("Unable to Click the Element"+ msg);
			LOGGER.error(e);
			takeSnap();
		}
	}
	
	public void takeSnap() {
		File scr= ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scr, (new File("screenschot.png")));
		} catch (IOException e) {
			LOGGER.info(e);
			LOGGER.error(e);
			e.printStackTrace();
		}
	}

}
