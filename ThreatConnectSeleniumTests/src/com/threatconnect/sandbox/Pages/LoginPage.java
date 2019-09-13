package com.threatconnect.sandbox.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
    
	@FindBy(id = "form:email")
	private WebElement emailTextBox;

	@FindBy(id = "form:password")
	private WebElement passwordTextBox;

	@FindBy(id = "form:signInBtn")
	private WebElement signInButton;

	// Constructor
	public LoginPage(WebDriver driver) {

		// Initialize Elements
		PageFactory.initElements(driver, this);

	}

	public void loginTest() {

		emailTextBox.sendKeys("moses@qa1.com");
		passwordTextBox.sendKeys("Password1!");
		signInButton.click();
	}

	
	
}
