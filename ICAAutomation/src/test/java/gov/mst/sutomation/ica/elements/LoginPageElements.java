package gov.mst.sutomation.ica.elements;

/*
	* Author	 				: Nanthini PushpaRaja
	* Created date			: Nov 26, 2018
	* Last Edited by		: Nanthini PushpaRaja
	* Last Edited date		: Dec 08, 2018
	* Description			: Class is used to define the actions in Employer Report Form
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

public class LoginPageElements {
	
	
	//	LOGIN
	
	
	@FindBy(how=How.XPATH,using=".//*[@id='username']")
	public WebElement username;
	
	@FindBy(how=How.XPATH,using=".//*[@id='password']")
	public WebElement password;

	@FindBy(how=How.XPATH,using=".//*[@id='Login']")
	public WebElement login;
	
	
	//	Method is used to initialize all the elements in the Login Window and returns all the elements
	
	public static LoginPageElements elements(WebDriver driver)										
	{
		LoginPageElements loginPage = PageFactory.initElements(driver, LoginPageElements.class);
		return loginPage;
	}
	

}
