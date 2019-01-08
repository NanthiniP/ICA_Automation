package gov.mst.automation.ica.regressiontestmodel;

/*
	* Author	 				: Nanthini PushpaRaja
	* Created date			: Nov 26, 2018
	* Last Edited by		: Nanthini PushpaRaja
	* Last Edited date		: Dec 08, 2018
	* Description			: Class is used to login into Sales force
*/

import org.testng.annotations.Test;
import gov.mst.automation.ica.baseclass.BaseTest;
import gov.mst.automation.ica.pagemodel.LoginPageModel;
import gov.mst.automation.ica.report.Report;

public class LoginPageTest extends BaseTest{
	
	
	// Test is used to login into salesforce
	@Test
	public void loginValidation() throws Exception
	{
		
		Report.startTest("TC002", "Login", "Nanthini", "Regression");		
		LoginPageModel sfloginpage = new LoginPageModel(driver);
		sfloginpage.login();
		Report.testStepStatus("Login Successful", "Pass", " ");
		
	}

}
