package gov.mst.automation.ica.pagemodel;

/*
* Author	 				: Nanthini PushpaRaja
* Created date			: Dec 08, 2018
* Last Edited by		: Nanthini PushpaRaja
* Last Edited date		: Dec 24, 2018
* Description			: Class is used to define the actions in Employer Report Form Submission page
*/

import org.openqa.selenium.WebDriver;

import gov.mst.automation.ica.commonutility.ValidationActions;
import gov.mst.automation.ica.elements.FormSubmissionPage;
import gov.mst.automation.ica.report.Log;
import gov.mst.automation.ica.report.Report;

public class FormSubmissionPageModel {
	
	WebDriver driver;
	FormSubmissionPage formSubmissionPage;
	
	
	// Constructor is used to initialize the browser
	
	public FormSubmissionPageModel(WebDriver driver)
	{
		this.driver = driver;
		formSubmissionPage = FormSubmissionPage.elements(driver);
	}
	
	
	// Method is used to validate whether "Thank You"text is displayed once the Employer Report form is submitted

		public void thankYouValidation(String expectedText) throws Exception 
		{
			boolean result = ValidationActions.textValidation(formSubmissionPage.thankYou, expectedText);
			Log.info("Got the result by validating the text");
			if (result == true) 
			{
				Report.testStepStatus("Thank You message is correctly displayed", "Pass", "");
			} 
			else 
			{
				Report.testStepStatus("Message is incorrect", "Fail", formSubmissionPage.thankYou.getText());
			}
			
		}

		
		// Method is used to validate whether "Important Note"content is displayed once the Employer Report form is submitted
		
		public void importantNoteValidation(String expectedText) throws Exception 
		{
			boolean result = ValidationActions.textValidation(formSubmissionPage.importantNote, expectedText);
			Log.info("Got the result by validating the text");
			if (result ==true) 
			{
				Report.testStepStatus("Important Note content is correctly displayed", "Pass", "");
			} 
			else 
			{
				Report.testStepStatus("Content is incorrect", "Fail", formSubmissionPage.importantNote.getText());
			}
			
		}

}
