package gov.mst.automation.ica.testmodel;

/**
 * 
 * @author Nanthini PushpaRaja
 * Created date: Nov 26, 2018
 * Last Edited by: Nanthini PushpaRaja
 * Last Edited date: Nov 26, 2018
 * Description: This LoginTest is used to run the login action
 */ 

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import gov.mst.automation.ica.baseclass.BaseTest;
import gov.mst.automation.ica.excelutility.ExcelUtility;
import gov.mst.automation.ica.pagemodel.EmployersReportForm;


public class EmployersReportFormTest extends BaseTest {
	
	EmployersReportForm employersreporform;
	
	@Test(dataProvider = "EmployerReportForm")
	public void formfill(String LastName, String FirstName, String SocialSecurityNumber, String BirthDate, String HomeAddress, String HomeCity, String HomeState, String HomeZipCode, String HomeTelephone, String Sex, String MaritalStatus, String EmployerName, String FeinNumber, String OficeAddress, String OfficeCity, String OfficeState, String OficeZipCode, String OfficeTelephone, String DateOfInjury, String DateEmployerNotifiedOfInjury, String LastDayOfWorkAfterInjury, String EmployerOccupationWhenInjured, String InjuryOccursOnInjuryPremises, String WhatWasTheInjury, String PartOfBodyInjured, String PartOfBodyInjuryTable, String Fatal, String EmployeeTreatedInEmergencyRoom, String EmployeeHospitalizedOvernight, String ValidityOfClaimDoubted, String WhatHappened, String SubstanceDirectlyHarmedEmployee, String NatureOfInjury, String CauseOfInjury, String EmployeeDoingJustBeforeIncident, String WorkerInEmployWhenInjured, String DateOfLastHire, String GrossEarningsOfEmployeePreceedingInjury, String SubmitterEmailAddress, String UploadFile ) throws Exception
	{		
		employersreporform = new EmployersReportForm();
		employersreporform.formFill(LastName, FirstName, SocialSecurityNumber, BirthDate, HomeAddress, HomeCity, HomeState, HomeZipCode, HomeTelephone, Sex, MaritalStatus, EmployerName, FeinNumber, OficeAddress, OfficeCity, OfficeState, OficeZipCode.toString(), OfficeTelephone, DateOfInjury, DateEmployerNotifiedOfInjury, LastDayOfWorkAfterInjury.toString(), EmployerOccupationWhenInjured.toString(), InjuryOccursOnInjuryPremises, WhatWasTheInjury, PartOfBodyInjured, PartOfBodyInjuryTable, Fatal, EmployeeTreatedInEmergencyRoom, EmployeeHospitalizedOvernight, ValidityOfClaimDoubted, WhatHappened, SubstanceDirectlyHarmedEmployee, NatureOfInjury, CauseOfInjury, EmployeeDoingJustBeforeIncident, WorkerInEmployWhenInjured, DateOfLastHire, GrossEarningsOfEmployeePreceedingInjury, SubmitterEmailAddress, UploadFile);
		employersreporform.thankyouValidation();
		
	}
	
	@DataProvider(name= "EmployerReportForm")
	public Object[][] EmployerReportForm() throws Exception
	{
		ExcelUtility excelutility =new ExcelUtility();
		excelutility.selectSheet("D:\\data.xlsx", "EmployerReportForm");
		return excelutility.getData("TC01");
		
	}
	
	

}
