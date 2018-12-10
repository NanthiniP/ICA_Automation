package gov.mst.automation.ica.pagemodel;

/*
 	* Author	 				: Nanthini PushpaRaja
 	* Created date			: Nov 26, 2018
 	* Last Edited by		: Nanthini PushpaRaja
 	* Last Edited date		: Dec 08, 2018
 	* Description			: Class is used to define the method to login the page
*/ 

import org.openqa.selenium.WebDriver;

/**
 * 
 * @author Nanthini PushpaRaja
 * Created date: Nov 26, 2018
 * Last Edited by: Nanthini PushpaRaja
 * Last Edited date: Nov 26, 2018
 * Description: This LoginPage is used to define the elements on the home page and the login action
 */ 


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import gov.mst.automation.ica.baseclass.BaseTest;
import gov.mst.automation.ica.constant.Constants;
import gov.mst.automation.ica.elements.LoginPageElements;

public class LoginPage {
	
	WebDriver driver;
	LoginPageElements loginpage;
	
	
	// Constructor is used to initialize the driver
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	// Method is used to login the sales force
	
	public void login() throws Exception 
	{
		loginpage = PageFactory.initElements(driver, LoginPageElements.class);
		driver.get(Constants.sfUrl);
		loginpage.username.sendKeys(Constants.sfUserName);
		loginpage.password.sendKeys(Constants.sfPassword);
		loginpage.login.click();
		
	}
	
	
}
