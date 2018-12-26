package gov.mst.automation.ica.testmodel;

/*
 	* Author	 				: Nanthini PushpaRaja
 	* Created date			: Nov 26, 2018
 	* Last Edited by		: Nanthini PushpaRaja
 	* Last Edited date		: Dec 08, 2018
 	* Description			: Class is used to execute the action in Employer Report Form
*/ 

import org.testng.annotations.Test;
import gov.mst.automation.ica.baseclass.BaseTest;
import gov.mst.automation.ica.commonutility.Log;
import gov.mst.automation.ica.constant.ExcelConstants;
import gov.mst.automation.ica.excelutility.ExcelUtility;
import gov.mst.automation.ica.pagemodel.EmployersReportFormModel;
import gov.mst.automation.ica.pagemodel.FormSubmissionPageModel;
import gov.mst.automation.ica.report.Report;
import org.testng.annotations.DataProvider;

public class EmployersReportFormTest  extends BaseTest{
	
	
	EmployersReportFormModel employersreporform;
	FormSubmissionPageModel formSubmissionPage;

	
	// Test is used to validate when the Employer report Form is submitted successfully
	
	@Test(dataProvider = "employerReportFormSubmission",priority = 1)
	public void employerReportFormSubmission(String TestID, String Description, String LastName, String FirstName, String SocialSecurityNumber, String BirthDate, String HomeAddress, String HomeCity, String HomeState, String HomeZipCode, String HomeTelephone, String Sex, String MaritalStatus, String EmployerName, String FeinNumber, String OfficeAddress, String OfficeCity, String OfficeState, String OfficeZipCode, String OfficeTelephone, String DateOfInjury, String DateEmployerNotifiedOfInjury, String LastDayOfWorkAfterInjury, String EmployerOccupationWhenInjured, String InjuryOccursOnInjuryPremises, String WhatWasTheInjury, String PartOfBodyInjured, String PartOfBodyInjuryTable, String Fatal, String EmployeeTreatedInEmergencyRoom, String EmployeeHospitalizedOvernight, String ValidityOfClaimDoubted, String WhatHappened, String SubstanceDirectlyHarmedEmployee, String NatureOfInjury, String CauseOfInjury, String EmployeeDoingJustBeforeIncident, String WorkerInEmployWhenInjured, String DateOfLastHire, String GrossEarningsOfEmployeePreceedingInjury, String SubmitterEmailAddress, String UploadFile, String ThankYou, String ImportantNote) throws Exception
	{		
		Log.startTestCase(TestID+"  "+Description);
		Report.startTest(TestID, Description, "Nanthini", "Smoke");
		employersreporform = new EmployersReportFormModel(driver);
		formSubmissionPage = new FormSubmissionPageModel(driver);
		employersreporform.formFill(LastName, FirstName, SocialSecurityNumber, BirthDate, HomeAddress, HomeCity, HomeState, HomeZipCode, HomeTelephone, Sex, MaritalStatus, EmployerName, FeinNumber, OfficeAddress, OfficeCity, OfficeState, OfficeZipCode.toString(), OfficeTelephone, DateOfInjury, DateEmployerNotifiedOfInjury, LastDayOfWorkAfterInjury.toString(), EmployerOccupationWhenInjured.toString(), InjuryOccursOnInjuryPremises, WhatWasTheInjury, PartOfBodyInjured, PartOfBodyInjuryTable, Fatal, EmployeeTreatedInEmergencyRoom, EmployeeHospitalizedOvernight, ValidityOfClaimDoubted, WhatHappened, SubstanceDirectlyHarmedEmployee, NatureOfInjury, CauseOfInjury, EmployeeDoingJustBeforeIncident, WorkerInEmployWhenInjured, DateOfLastHire, GrossEarningsOfEmployeePreceedingInjury, SubmitterEmailAddress, UploadFile);
		formSubmissionPage.thankYouValidation(ThankYou);	
		formSubmissionPage.importantNoteValidation(ImportantNote);
		Report.testStepStatus("Employer Report Form is submitted successfully", "Pass", "");
		Log.endTestCase();
	}
		
	
	// Data Provider returns the data to fill the Employer Report Form
	
	@DataProvider(name = "employerReportFormSubmission")
	 public static String[][] employerReportFormSubmission() throws Exception
	{
		ExcelUtility excelFile =new ExcelUtility(ExcelConstants.excelFile);
		
		class Local {};
		excelFile.selectSheet(Local.class.getEnclosingMethod().getName());
		
		int rows = excelFile.getTotalRows();
		int cols = excelFile.getTotalColumns(0);
		
		String[][] result= new String[rows][cols];
				
		for(int i=1;i<=rows;i++)
		{
			int col = excelFile.getTotalColumns(i);
			
			for(int j=0;j<col;j++)
			{	
				
				result[i-1][j] = excelFile.getStringData(i, j);
							
			}
		}
		
		return result;
	}
			
	
}
