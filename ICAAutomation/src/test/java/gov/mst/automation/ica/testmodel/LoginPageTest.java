package gov.mst.automation.ica.testmodel;

/*
	* Author	 				: Nanthini PushpaRaja
	* Created date			: Nov 26, 2018
	* Last Edited by		: Nanthini PushpaRaja
	* Last Edited date		: Dec 08, 2018
	* Description			: Class is used to define the actions in Employer Report Form
*/

import org.testng.annotations.Test;

import gov.mst.automation.ica.baseclass.BaseTest;
import gov.mst.automation.ica.pagemodel.LoginPage;

public class LoginPageTest extends BaseTest{
	
	@Test
	public void loginValidation() throws Exception
	{
				
		LoginPage sfloginpage = new LoginPage(driver);
		sfloginpage.login();
	}

}
