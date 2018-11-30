package gov.mst.automation.ica.pagemodel;

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
import gov.mst.automation.ica.excelutility.ExcelUtility;

public class LoginPage extends BaseTest{
	
	@FindBy(how=How.XPATH,using=".//*[@id='username']")
	public WebElement username;
	
	@FindBy(how=How.XPATH,using=".//*[@id='password']")
	public WebElement password;

	@FindBy(how=How.XPATH,using=".//*[@id='Login']")
	public WebElement login;

	public static void login() throws Exception {
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.username.sendKeys(ExcelUtility.excelData("Contact", "TC01", "username"));
		loginpage.password.sendKeys(ExcelUtility.excelData("Contact", "TC01", "password"));
		loginpage.login.click();
		
	}
}
