package com.threatconnect.sandbox.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.threatconnect.sandbox.Pages.CreateHostPage;
import com.threatconnect.sandbox.Pages.DetailsPage; 
import com.threatconnect.sandbox.Pages.HomePage;
import com.threatconnect.sandbox.Pages.LoginPage;
import com.threatconnect.sandbox.Pages.SignInPage;


public class HostIndicatorTest extends BaseTest {

	@Test
	public void createHostIndicator() throws InterruptedException {
        SignInPage st = new SignInPage(driver);
		LoginPage lp = new LoginPage(driver);
		HomePage hp = new HomePage(driver);
		CreateHostPage chp = new CreateHostPage(driver);
		DetailsPage dp = new DetailsPage(driver);

		// Verify the text of "SignIn to Threatconnect"
		boolean signInToThreatConnectTextVisible =st.signInText().isDisplayed();
		Assert.assertTrue(signInToThreatConnectTextVisible);
		
		// Loggging into ThreatConnect
		lp.loginTest();
		
		//Verify the text of "My Dash Board"
		boolean myDashBoardTextVisible = hp.getMyDashBoardText().isDisplayed();
		Assert.assertTrue(myDashBoardTextVisible);

		WebElement browse = driver.findElement(By.cssSelector("#main-menu > li:nth-child(4) > a"));
		WebElement indicator = driver.findElement(By.cssSelector("#main-menu > li:nth-child(4) > ul > li:nth-child(1) > a"));
		WebElement create = driver.findElement(By.cssSelector("#main-menu > li:nth-child(6) > a"));
		WebElement indicators = driver.findElement(By.cssSelector("#main-menu > li:nth-child(6) > ul > li:nth-child(1) > a"));
		Actions action = new Actions(driver);
		
		//Hovering over browse menu
		action.moveToElement(browse).build().perform();
		
		//Hovering over indictor menu
		action.moveToElement(indicator).build().perform();
		Thread.sleep(2000);
		
		//Hovering over create menu
		action.moveToElement(create).build().perform();
		Thread.sleep(2000);
		action.moveToElement(indicators).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#main-menu > li:nth-child(6) > ul > li:nth-child(1) > ul > li:nth-child(4) > a")).click();
		
		// Create HostIndicator
		chp.createHost();
		Thread.sleep(2000); 
		
		// Navigate back to browse-> indicator
		driver.navigate().back();
		driver.findElement(By.cssSelector("#main-menu > li:nth-child(4) > a")).click();
		
		//Hovering over returned result
		WebElement result = driver.findElement(By.cssSelector("#mainContent > div > div > div > div > tc-browse-app > div > div.ContentSideSections.Implementation > div.tableContainer > p-datatable > div > div.ui-datatable-tablewrapper > table > tbody > tr:nth-child(1) > td.summaryCol > span.ui-cell-data > span > span.flex-text-summary.truncate-ellipsis"));
		action.moveToElement(result).perform();
		
		// Clicking on commnad menu
		driver.findElement(By.cssSelector("#mainContent > div > div > div > div > tc-browse-app > div > div.ContentSideSections.Implementation > div.tableContainer > p-datatable > div > div.ui-datatable-tablewrapper > table > tbody > tr:nth-child(1) > td.summaryCol > span.ui-cell-data > span > span.flex-action-icon")).click();
		
		// Verify the name of created indicator
		boolean indicatorTextVisible = dp.indicatorText().isDisplayed();
		Assert.assertTrue(indicatorTextVisible);
		
		//Logout
		WebElement menu = driver.findElement(By.cssSelector("#main-menu > li:nth-child(9) > a"));
		action.moveToElement(menu).perform();
		driver.findElement(By.id("form:j_idt81")).click();
		
	}

}
