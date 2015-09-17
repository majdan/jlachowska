package com.pageobjects;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class HomePagePko extends PagePko<HomePagePko> {
	
	@Override
	protected ExpectedCondition getPageLoadCondition() {
		return ExpectedConditions.titleContains("GitHub Â· Build software better, together."); // ?
	}
	
	@Override
	public String getPageUrl() {
		return "";
	}

	public LoginPagePko goToLoginPage() {
		return new LoginPagePko().openPage(LoginPagePko.class);
	}

	public HomePagePko open() {
		return new HomePagePko().openPage(HomePagePko.class);
	}

}
