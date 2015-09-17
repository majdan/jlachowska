package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

// kopia z Basement
/*import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;
//*********************************************
 */


public class LoginPagePko extends PagePko<LoginPagePko> {
	
	//public WebDriver driver;
	
	/*public LoginPagePko(WebDriver driver){
		this.driver = driver;
	}*/


	@FindBy(name = "j_username")
	WebElement loginField;
	
	@FindBy(name = "j_password")
	WebElement passwordField;

	@FindBy(className = "sbDummy")  // zamiast name = "commit" -> className = "sbDummy"
	WebElement commitButton;
	
	@FindBy(className = "flash-error")
	WebElement errorBox;
	
	

	@Override
	protected ExpectedCondition getPageLoadCondition() {
		return ExpectedConditions.visibilityOf(loginField);
	}

	@Override
	public String getPageUrl() {
		return "/login";
	}
	
	public void login(String login, String password) {
		
		loginField.sendKeys("mokon");
		passwordField.sendKeys("welcome");
		commitButton.click();
	}

	public boolean isLoginError() {
		return errorBox.isDisplayed();
	}

	public String getErrorMessage() {
		return errorBox.getText();
	}
}

