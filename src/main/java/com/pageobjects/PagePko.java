package com.pageobjects;

import static com.setup.SeleniumDriver.getDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public abstract class PagePko<T> {
	
	private static final String BASE_URL = "http://172.30.4.167/Saba/Web/Main";
	private static final int LOAD_TIMEOUT = 30;
	private static final int REFRESH_RATE = 2;
	
	public T openPage(Class<T> clazz) {
		T page = PageFactory.initElements(getDriver(), clazz);
		getDriver().get(BASE_URL + getPageUrl());
		ExpectedCondition pageLoadCondition = ((PagePko) page).getPageLoadCondition();
		waitForPageToLoad(pageLoadCondition);
		return page;
	}
	
	private void waitForPageToLoad(ExpectedCondition pageLoadCondition) {
		Wait wait = new FluentWait(getDriver())
				.withTimeout(LOAD_TIMEOUT, TimeUnit.SECONDS)
				.pollingEvery(REFRESH_RATE, TimeUnit.SECONDS);

		wait.until(pageLoadCondition);
	}

	protected abstract ExpectedCondition getPageLoadCondition();
	
	public abstract String getPageUrl();


}
