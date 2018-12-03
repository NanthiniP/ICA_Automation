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
import gov.mst.automation.ica.constant.Constant;


public class SFLoginPage extends BaseTest{
	
	SFLoginPage loginpage;
	
	@FindBy(how=How.XPATH,using=".//*[@id='username']")
	public WebElement username;
	
	@FindBy(how=How.XPATH,using=".//*[@id='password']")
	public WebElement password;

	@FindBy(how=How.XPATH,using=".//*[@id='Login']")
	public WebElement login;
	
	
	public void login() throws Exception {
		loginpage = PageFactory.initElements(driver, SFLoginPage.class);
		driver.get(Constant.SFUrl);
		loginpage.username.sendKeys(Constant.SFUserame);
		loginpage.password.sendKeys(Constant.SFPassword);
		loginpage.login.click();
		
	}
	
	
}
