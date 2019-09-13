package com.threatconnect.sandbox.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(css = "#mainContent > div > div > div > div > tc-dashboard-app > div > div.dashboard-header > h2 > span")
	private WebElement myDashBoardText;

	// Constructor
	public HomePage(WebDriver driver) {

		// Initialize Elements
		PageFactory.initElements(driver, this);

	}

	public WebElement getMyDashBoardText() {

		return myDashBoardText;

	}

}
