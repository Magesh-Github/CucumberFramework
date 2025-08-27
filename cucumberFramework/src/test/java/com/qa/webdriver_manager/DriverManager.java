package com.qa.webdriver_manager;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.qa.constants.Constants;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DriverManager {
	
	private static final Logger LOGGER= LogManager.getLogger(DriverManager.class);
	
	private static WebDriver driver=null;
	
	public static WebDriver getDriver() {
		return driver;
	}

	public static void launchBrower() {
		try {
			switch (Constants.Browser) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				break;
			case "edge":
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
				break;
			default:
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				break;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
