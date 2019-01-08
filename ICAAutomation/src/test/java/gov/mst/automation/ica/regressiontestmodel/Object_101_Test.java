package gov.mst.automation.ica.regressiontestmodel;

/*
	* Author	 				: Nanthini PushpaRaja
	* Created date			: Dec 25, 2018
	* Last Edited by		: Nanthini PushpaRaja
	* Last Edited date		: Dec 25, 2018
	* Description			: Class is used to execute the actions for Object_101
*/ 
import org.testng.annotations.DataProvider;

/*
	* Author	 				: Nanthini PushpaRaja
	* Created date			: Dec 15, 2018
	* Last Edited by		: Nanthini PushpaRaja
	* Last Edited date		: Dec 15, 2018
	* Description			: Class is used to execute the actions in the Object_101 
*/ 

import org.testng.annotations.Test;
import gov.mst.automation.ica.baseclass.BaseTest;
import gov.mst.automation.ica.constant.ExcelConstants;
import gov.mst.automation.ica.excelutility.ExcelUtility;
import gov.mst.automation.ica.pagemodel.EmployersReportFormModel;
import gov.mst.automation.ica.pagemodel.FormSubmissionPageModel;
import gov.mst.automation.ica.pagemodel.LoginPageModel;
import gov.mst.automation.ica.pagemodel.Object_101_Model;
import gov.mst.automation.ica.report.Log;
import gov.mst.automation.ica.report.Report;

public class Object_101_Test extends BaseTest{
	
	EmployersReportFormModel employersreporform;
	FormSubmissionPageModel formSubmissionPage;
	LoginPageModel sfloginpage;
	Object_101_Model object_101;
	
						
	@Test(dataProvider = "formValueValidation")
	public void formValueValidation(String TestID, String Description, String LastName, String FirstName, String SocialSecurityNumber, String BirthDate, String HomeAddress, String HomeCity, String HomeState, String HomeZipCode, String HomeTelephone, String Sex, String MaritalStatus, String EmployerName, String FeinNumber, String OfficeAddress, String OfficeCity, String OfficeState, String OfficeZipCode, String OfficeTelephone, String DateOfInjury, String DateEmployerNotifiedOfInjury, String LastDayOfWorkAfterInjury, String EmployerOccupationWhenInjured, String InjuryOccursOnInjuryPremises, String WhatWasTheInjury, String PartOfBodyInjured, String PartOfBodyInjuryTable, String Fatal, String EmployeeTreatedInEmergencyRoom, String EmployeeHospitalizedOvernight, String ValidityOfClaimDoubted, String WhatHappened, String SubstanceDirectlyHarmedEmployee, String NatureOfInjury, String CauseOfInjury, String EmployeeDoingJustBeforeIncident, String WorkerInEmployWhenInjured, String DateOfLastHire, String GrossEarningsOfEmployeePreceedingInjury, String SubmitterEmailAddress, String UploadFile, String ThankYou, String ImportantNote) throws Exception
	{
		Log.startTestCase(TestID+"  "+Description);
		Report.startTest(TestID, Description, "Nanthini", "Regression");
		employersreporform = new EmployersReportFormModel(driver);
		formSubmissionPage = new FormSubmissionPageModel(driver);
		sfloginpage = new LoginPageModel(driver);
		object_101 = new Object_101_Model(driver);
		employersreporform.formFill(LastName, FirstName, SocialSecurityNumber, BirthDate, HomeAddress, HomeCity, HomeState, HomeZipCode, HomeTelephone, Sex, MaritalStatus, EmployerName, FeinNumber, OfficeAddress, OfficeCity, OfficeState, OfficeZipCode.toString(), OfficeTelephone, DateOfInjury, DateEmployerNotifiedOfInjury, LastDayOfWorkAfterInjury.toString(), EmployerOccupationWhenInjured.toString(), InjuryOccursOnInjuryPremises, WhatWasTheInjury, PartOfBodyInjured, PartOfBodyInjuryTable, Fatal, EmployeeTreatedInEmergencyRoom, EmployeeHospitalizedOvernight, ValidityOfClaimDoubted, WhatHappened, SubstanceDirectlyHarmedEmployee, NatureOfInjury, CauseOfInjury, EmployeeDoingJustBeforeIncident, WorkerInEmployWhenInjured, DateOfLastHire, GrossEarningsOfEmployeePreceedingInjury, SubmitterEmailAddress, UploadFile);
		formSubmissionPage.thankYouValidation(ThankYou);	
		formSubmissionPage.importantNoteValidation(ImportantNote);
		sfloginpage.login();
		object_101.formValueValidation(LastName, FirstName, SocialSecurityNumber, BirthDate, HomeAddress, HomeCity, HomeState, HomeZipCode, HomeTelephone, Sex, MaritalStatus, EmployerName, FeinNumber, OfficeAddress, OfficeCity, OfficeState, OfficeZipCode, OfficeTelephone, DateOfInjury, DateEmployerNotifiedOfInjury, LastDayOfWorkAfterInjury, EmployerOccupationWhenInjured, InjuryOccursOnInjuryPremises, WhatWasTheInjury, PartOfBodyInjured, PartOfBodyInjuryTable, Fatal, EmployeeTreatedInEmergencyRoom, EmployeeHospitalizedOvernight, ValidityOfClaimDoubted, WhatHappened, SubstanceDirectlyHarmedEmployee, NatureOfInjury, CauseOfInjury, EmployeeDoingJustBeforeIncident, WorkerInEmployWhenInjured, DateOfLastHire, GrossEarningsOfEmployeePreceedingInjury, SubmitterEmailAddress, UploadFile);
		sfloginpage.logout();
		Log.endTestCase();
	}
	
	
	// Data Provider returns the data to fill the Employer Report Form and to validate whether the values are properly mapped into SF object
	
		@DataProvider(name = "formValueValidation")
		 public static String[][] formValueValidation() throws Exception
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
