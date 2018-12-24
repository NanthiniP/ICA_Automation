package gov.mst.automation.ica.testmodel;

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
import gov.mst.automation.ica.elements.Object_101_Elements;
import gov.mst.automation.ica.excelutility.ExcelUtility;
import gov.mst.automation.ica.pagemodel.EmployersReportForm;
import gov.mst.automation.ica.pagemodel.LoginPage;
import gov.mst.automation.ica.pagemodel.Object_101;
import gov.mst.automation.ica.report.Report;
import org.testng.annotations.DataProvider;

public class Object_101_Test extends BaseTest{
	
	Object_101_Elements elements;
	Object_101 object_101;
	
	EmployersReportForm employersreporform;
	ExcelUtility excelFile;
	
	// dataProviderClass = EmployersReportFormTest.class
		
	@Test(dataProvider = "EmployerReportFormData", priority = 1)
	public void formValueValidation(String TestID, String Description, String LastName, String FirstName, String SocialSecurityNumber, String BirthDate, String HomeAddress, String HomeCity, String HomeState, String HomeZipCode, String HomeTelephone, String Sex, String MaritalStatus, String EmployerName, String FeinNumber, String OfficeAddress, String OfficeCity, String OfficeState, String OfficeZipCode, String OfficeTelephone, String DateOfInjury, String DateEmployerNotifiedOfInjury, String LastDayOfWorkAfterInjury, String EmployerOccupationWhenInjured, String InjuryOccursOnInjuryPremises, String WhatWasTheInjury, String PartOfBodyInjured, String PartOfBodyInjuryTable, String Fatal, String EmployeeTreatedInEmergencyRoom, String EmployeeHospitalizedOvernight, String ValidityOfClaimDoubted, String WhatHappened, String SubstanceDirectlyHarmedEmployee, String NatureOfInjury, String CauseOfInjury, String EmployeeDoingJustBeforeIncident, String WorkerInEmployWhenInjured, String DateOfLastHire, String GrossEarningsOfEmployeePreceedingInjury, String SubmitterEmailAddress, String UploadFile, String DisplayTextOne, String DisplayTextTwo) throws Exception
	{
		Report.startTest(TestID, Description, "Nanthini", "Smoke");
		
		LoginPage sfloginpage = new LoginPage(driver);
		sfloginpage.login();
		
		elements = elements.elements(driver);
		Thread.sleep(10000);
		elements.menuIcon.click();
		Thread.sleep(10000);
		elements.object_101.click();
		Thread.sleep(5000);
//		elements.listView.click();
//		elements.list_All.click();
		Thread.sleep(5000);
		elements.firstRecord.click();
		
		object_101 = new Object_101(driver);
		object_101.formValueValidation(LastName, FirstName, SocialSecurityNumber, BirthDate, HomeAddress, HomeCity, HomeState, HomeZipCode, HomeTelephone, Sex, MaritalStatus, EmployerName, FeinNumber, OfficeAddress, OfficeCity, OfficeState, OfficeZipCode, OfficeTelephone, DateOfInjury, DateEmployerNotifiedOfInjury, LastDayOfWorkAfterInjury, EmployerOccupationWhenInjured, InjuryOccursOnInjuryPremises, WhatWasTheInjury, PartOfBodyInjured, PartOfBodyInjuryTable, Fatal, EmployeeTreatedInEmergencyRoom, EmployeeHospitalizedOvernight, ValidityOfClaimDoubted, WhatHappened, SubstanceDirectlyHarmedEmployee, NatureOfInjury, CauseOfInjury, EmployeeDoingJustBeforeIncident, WorkerInEmployWhenInjured, DateOfLastHire, GrossEarningsOfEmployeePreceedingInjury, SubmitterEmailAddress, UploadFile);
	}
	
	@DataProvider(name = "EmployerReportFormData")
	 public String[][] EmployerReportForm() throws Exception
	{
		excelFile =new ExcelUtility(ExcelConstants.excelFile);
		excelFile.selectSheet(ExcelConstants.employerReportFormSheet);
		
		int rows = excelFile.getTotalRows();
		
		String[][] result= new String[rows][44];
		
		
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
