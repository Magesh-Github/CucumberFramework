package com.qa.utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.constants.Constants;

public class CommonUtils {
	
	private static final Logger LOGGER= LogManager.getLogger(CommonUtils.class);

	public void loadProperties() {
		LOGGER.info("Load Properties");
		Properties properties = new Properties();

		try {
			properties.load(getClass().getResourceAsStream("/config.properties"));;
		} catch (IOException e) {
			e.printStackTrace();
		}

		Constants.App_App_URL = properties.getProperty("App_URL");

	}

}
