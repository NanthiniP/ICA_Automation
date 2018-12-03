package gov.mst.automation.ica.testmodel;

import org.testng.annotations.Test;

import gov.mst.automation.ica.baseclass.BaseTest;
import gov.mst.automation.ica.pagemodel.SFLoginPage;

public class SFLoginPageTest extends BaseTest{
	
	@Test
	public void loginValidation() throws Exception
	{
				
		SFLoginPage sfloginpage = new SFLoginPage();
		sfloginpage.login();
	}

}
