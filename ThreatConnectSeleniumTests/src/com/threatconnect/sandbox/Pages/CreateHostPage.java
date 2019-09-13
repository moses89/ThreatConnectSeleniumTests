package com.threatconnect.sandbox.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateHostPage {

	@FindBy(xpath = "/html/body/div[1]/div[1]/div[@class='ui-dialog-content ui-widget-content']//input[@role='textbox']")
	private WebElement hostNameTextBox;

	@FindBy(css = "[onclick] .ui-button-text")
	private WebElement saveButton;

	// Constructor
	public CreateHostPage(WebDriver driver) {

		// Initialize Elements
		PageFactory.initElements(driver, this);

	}

	public void createHost() throws InterruptedException {

		hostNameTextBox.sendKeys("mosesisinc.com");
		saveButton.click();

	}

}
