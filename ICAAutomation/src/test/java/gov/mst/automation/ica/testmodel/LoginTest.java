package gov.mst.automation.ica.testmodel;

/**
 * 
 * @author Nanthini PushpaRaja
 * Created date: Nov 26, 2018
 * Last Edited by: Nanthini PushpaRaja
 * Last Edited date: Nov 26, 2018
 * Description: This LoginTest is used to run the login action
 */ 

import org.testng.annotations.Test;
import gov.mst.automation.ica.baseclass.BaseTest;
import gov.mst.automation.ica.pagemodel.LoginPage;

public class LoginTest extends BaseTest{
	
	@Test
	public void loginValidation() throws Exception
	{
		System.out.println("Login");
		LoginPage.login();
	}

}
