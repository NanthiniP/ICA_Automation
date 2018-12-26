package gov.mst.automation.ica.elements;

/*
	* Author	 				: Nanthini PushpaRaja
	* Created date			: Nov 26, 2018
	* Last Edited by		: Nanthini PushpaRaja
	* Last Edited date		: Dec 08, 2018
	* Description			: Class is used to define the elements in the Login page
*/

import org.openqa.selenium.WebDriver;

/*
 	* Author	 				: Nanthini PushpaRaja
 	* Created date			: Nov 26, 2018
 	* Last Edited by		: Nanthini PushpaRaja
 	* Last Edited date		: Dec 08, 2018
 	* Description			: This Constant is used to define the constant values for the project
 */ 

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	//	LOGIN
		
	@FindBy(how=How.XPATH,using=".//*[@id='username']")
	public WebElement username;
	
	@FindBy(how=How.XPATH,using=".//*[@id='password']")
	public WebElement password;

	@FindBy(how=How.XPATH,using=".//*[@id='Login']")
	public WebElement login;
	
	@FindBy(how=How.XPATH,using=".//span[text()='Home']")
	public WebElement homeTab;
	
	@FindBy(how=How.XPATH,using=".//header/div[2]//li[9]/button")
	public WebElement userIcon;
	
	@FindBy(how=How.XPATH,using=".//a[text()='Log Out']")
	public WebElement logOut;
		
	
	//	Method is used to initialize and returns all the elements in the Login Page
	
	public static LoginPage elements(WebDriver driver)										
	{
		LoginPage elements = PageFactory.initElements(driver, LoginPage.class);
		return elements;
	}
	

}
