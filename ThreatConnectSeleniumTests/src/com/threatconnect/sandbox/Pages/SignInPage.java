package com.threatconnect.sandbox.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

	@FindBy(css = ".White")
	private WebElement signInToThreatConnectText;

	// Constructor
	public SignInPage(WebDriver driver) {

		// Initialize Elements
		PageFactory.initElements(driver, this);
	}

	public WebElement signInText() {

		return signInToThreatConnectText; 

	}

}