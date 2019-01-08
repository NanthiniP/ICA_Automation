package gov.mst.automation.ica.pagemodel;

/*
 	* Author	 				: Nanthini PushpaRaja
 	* Created date			: Nov 26, 2018
 	* Last Edited by		: Nanthini PushpaRaja
 	* Last Edited date		: Dec 08, 2018
 	* Description			: Class is used to define the method to login the page
*/ 

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import gov.mst.automation.ica.commonutility.ValidationActions;
import gov.mst.automation.ica.constant.Constants;
import gov.mst.automation.ica.elements.LoginPage;
import gov.mst.automation.ica.report.Log;
import gov.mst.automation.ica.report.Report;

public class LoginPageModel {
	
	WebDriver driver;
	LoginPage loginPage;
	
	
	// Constructor is used to initialize the driver
	
	public LoginPageModel(WebDriver driver)
	{
		this.driver = driver;
		loginPage = PageFactory.initElements(driver, LoginPage.class);
	}
	
	
	// Method is used to login the sales force
	
	public void login() throws Exception 
	{
		try
		{
			driver.get(Constants.sfUrl);
			Log.info("URL navigated");
			
			loginPage.username.sendKeys(Constants.sfUserName);
			Log.info("Username entered");
			
			loginPage.password.sendKeys(Constants.sfPassword);
			Log.info("Password entered");
			
			loginPage.login.click();
			Log.info("Login button clicked");
			
			Thread.sleep(15000);
			
			if(ValidationActions.elementDisplayed(driver, loginPage.homeTab) == true)
			{
				Report.testStepStatus("Login into Salesforce successfully", "Pass", "");
			}
			else
			{
				Report.testStepStatus("Unable to login into Salesforce", "Fail", "");
				
			}
		}
		catch(NoSuchElementException e)
		{
			Report.testStepStatus("Exception while finding an element", "Fail", e.getMessage());
			
		}
		catch(Exception e)
		{
			Report.testStepStatus("Exception while login into salesforce", "Fail", e.getMessage());
			throw new Exception("Invalid Credentials");
		}
		
	}
	
	public void logout() throws InterruptedException
	{
		loginPage.userIcon.click();
		Thread.sleep(5000);
		loginPage.logOut.click();
		Thread.sleep(10000);
	}
	
	
}
