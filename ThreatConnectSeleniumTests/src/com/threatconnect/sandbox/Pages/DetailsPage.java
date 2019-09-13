package com.threatconnect.sandbox.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DetailsPage {

	@FindBy(css = "#form\\:pageHeader > h1")
	private WebElement createdIndicatorText;

	// Constructor
	public DetailsPage(WebDriver driver) {

		// Initialize Elements
		PageFactory.initElements(driver, this);
	}

	public WebElement indicatorText() {

		return createdIndicatorText;

	}

	
	
}
