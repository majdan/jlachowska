package com.setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDriver {

	static WebDriver driver;

	public static WebDriver getDriver() {
		if (driver == null) {
			driver = new FirefoxDriver(); // can be replaced with HtmlUnitDriver
											// for better performance
		}
		return driver;
	}

	public static void getFrame() {
		driver.switchTo().frame("SabaMain");	
		
	}
}
