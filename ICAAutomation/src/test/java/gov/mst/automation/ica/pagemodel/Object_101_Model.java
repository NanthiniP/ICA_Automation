package gov.mst.automation.ica.pagemodel;

/*
 	* Author	 				: Nanthini PushpaRaja
 	* Created date			: Dec 15, 2018
 	* Last Edited by		: Nanthini PushpaRaja
 	* Last Edited date		: Dec 15, 2018
 	* Description			: Class is used to define the actions for Object_101
*/ 

import org.openqa.selenium.WebDriver;

import gov.mst.automation.ica.commonutility.CommonActions;
import gov.mst.automation.ica.commonutility.ValidationActions;
import gov.mst.automation.ica.elements.Object_101;
import gov.mst.automation.ica.report.Log;
import gov.mst.automation.ica.report.Report;

public class Object_101_Model {
	
	WebDriver driver;
	Object_101 object_101;
	
	
	// Constructor is used to initialize the browser
	
	public Object_101_Model(WebDriver driver)
	{
		this.driver = driver;
	}
		
	
	// Method is used to validate whether all the values are properly mapped from Employer form to object_101 
	
	public void formValueValidation(String LastName, String FirstName, String SocialSecurityNumber, String BirthDate, String HomeAddress, String HomeCity, String HomeState, String HomeZipCode, String HomeTelephone, String Sex, String MaritalStatus, String EmployerName, String FeinNumber, String OfficeAddress, String OfficeCity, String OfficeState, String OfficeZipCode, String OfficeTelephone, String DateOfInjury, String DateEmployerNotifiedOfInjury, String LastDayOfWorkAfterInjury, String EmployerOccupationWhenInjured, String InjuryOccursOnInjuryPremises, String WhatWasTheInjury, String PartOfBodyInjured, String PartOfBodyInjuryTable, String Fatal, String EmployeeTreatedInEmergencyRoom, String EmployeeHospitalizedOvernight, String ValidityOfClaimDoubted, String WhatHappened, String SubstanceDirectlyHarmedEmployee, String NatureOfInjury, String CauseOfInjury, String EmployeeDoingJustBeforeIncident, String WorkerInEmployWhenInjured, String DateOfLastHire, String GrossEarningsOfEmployeePreceedingInjury, String SubmitterEmailAddress, String UploadFile) throws Exception
	{
		object_101 = Object_101.elements(driver);
		
			
		object_101.appLauncherIcon.click();
		Log.info("Clicked on App launcher icon");
		
		CommonActions.wait(driver, object_101.appLauncherWindow);
		object_101.object_101.click();
		Log.info("Selected object 101");
		
		CommonActions.wait(driver, object_101.recentlyView);
		object_101.listView.click();
		object_101.list_All.click();
		Log.info("Select All option from list view");
		
		Thread.sleep(5000);
		object_101.firstRecord.click();
		Log.info("First record selected");
		
		// Last Name value validation
				
		if(ValidationActions.textValidation(object_101.lastName, LastName)==true)
		{
			Report.testStepStatus("Last name value is correct", "Pass", "");
		}
		else
		{
			Report.testStepStatus("Last name value is incorrect", "Fail", "Expected  : "+ LastName+ ".	Actual  :   " +object_101.lastName.getText());
		}
		
		
		// First Name value validation
		
		if(ValidationActions.textValidation(object_101.firstName,FirstName)==true)
		{
			Report.testStepStatus("First name value is correct", "Pass", "");
		}
		else
		{
			Report.testStepStatus("Last name value is incorrect", "Fail", "Expected  : "+ FirstName+ ".	Actual  :   " +object_101.firstName.getText());
		}
		Log.info("First Name value validation done");
		
		
		// Social Security Number value validation
		
		if(ValidationActions.textValidation(object_101.socialSecurityNumber, SocialSecurityNumber)==true)
		{
			Report.testStepStatus("Social Security Number value is correct", "Pass", "");
		}
		else
		{
			Report.testStepStatus("Social Security Number value is incorrect", "Fail", "Expected  : "+ SocialSecurityNumber+ ".	Actual  :   " +object_101.socialSecurityNumber.getText());
		}
		Log.info("Social Security Number value validation done");
		
		
		// Date of Birth value validation
		
		if(ValidationActions.textValidation(object_101.dateOfBirth, BirthDate)==true)
		{
			Report.testStepStatus("Date of Birth value is correct", "Pass", "");
		}
		else
		{
			Report.testStepStatus("Date of Birth value is incorrect", "Fail", "Expected  : "+ BirthDate+ ".	Actual  :   " +object_101.dateOfBirth.getText());
		}
		Log.info("Date of Birth value validation done");
		
		
		// Home Address value validation
		
		if(ValidationActions.textValidation(object_101.homeAddress, HomeAddress)==true)
		{
				Report.testStepStatus("Home Address value is correct", "Pass", "");
		}
		else
		{
				Report.testStepStatus("Home Address value is incorrect", "Fail", "Expected  : "+ HomeAddress+ ".	Actual  :   " +object_101.homeAddress.getText());
		}
		Log.info("Home Address value validation done");
		
				
		// Home City value validation
				
				if(ValidationActions.textValidation(object_101.homeCity, HomeCity)==true)
				{
					Report.testStepStatus("Home City value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("Home City value is incorrect", "Fail", "Expected  : "+ HomeCity+ ".	Actual  :   " +object_101.homeCity.getText());
				}
				Log.info("Home City value validation done");	
				
				
				// Home State value validation
				
				if(ValidationActions.textValidation(object_101.homeState, HomeState)==true)
				{
					Report.testStepStatus("Home State value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("Home State value is incorrect", "Fail", "Expected  : "+ HomeState+ ".	Actual  :   " +object_101.homeState.getText());
				}
				Log.info("Home state value validation done");
				
				
				// Home Zip Code value validation
				
				if(ValidationActions.textValidation(object_101.homeZipCode, HomeZipCode)==true)
				{
					Report.testStepStatus("Home Zip Code value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("Home Zip Code value is incorrect", "Fail", "Expected  : "+ HomeZipCode+ ".	Actual  :   " +object_101.homeZipCode.getText());
				}
				Log.info("Home zip code value validation done");
				
				
				// Home Telephone value validation
				
				if(ValidationActions.textValidation(object_101.homeTelephone, HomeTelephone)==true)
				{
					Report.testStepStatus("Home Telephone value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("Home Telephone value is incorrect", "Fail", "Expected  : "+ HomeTelephone+ ".	Actual  :   " +object_101.homeTelephone.getText());
				}
				Log.info("Home telephone value validation done");
				
				
				// Sex value validation
				
				if(ValidationActions.textValidation(object_101.sex, Sex)==true)
				{
					Report.testStepStatus("Sex value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("Sex value is incorrect", "Fail", "Expected  : "+ Sex+ ".	Actual  :   " +object_101.sex.getText());
				}
				Log.info("Sex value validation done");
				
				
				// Marital Status value validation
				
				if(ValidationActions.textValidation(object_101.maritalStatus, MaritalStatus)==true)
				{
					Report.testStepStatus("Marital Status value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("Marital Status value is incorrect", "Fail", "Expected  : "+ MaritalStatus+ ".	Actual  :   " +object_101.maritalStatus.getText());
				}
				Log.info("Marital status value validation done");
				
				
				// Employer Name value validation
				
				if(ValidationActions.textValidation(object_101.employerName, EmployerName)==true)
				{
					Report.testStepStatus("Employer Name value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("Employer Name value is incorrect", "Fail", "Expected  : "+ EmployerName+ ".	Actual  :   " +object_101.employerName.getText());
				}
				Log.info("Employer Name value validation done");
				
				
				// Fein Number value validation
				
				if(ValidationActions.textValidation(object_101.feinNumber, FeinNumber)==true)
				{
					Report.testStepStatus("Fein Number value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("Fein Number value is incorrect", "Fail", "Expected  : "+ FeinNumber+ ".	Actual  :   " +object_101.feinNumber.getText());
				}
				Log.info("Fein Number value validation done");
				
				
				// Office Address value validation
				
				if(ValidationActions.textValidation(object_101.officeAddress, OfficeAddress)==true)
				{
					Report.testStepStatus("Ofice Address value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("Ofice Address value is incorrect", "Fail", "Expected  : "+ OfficeAddress+ ".	Actual  :   " +object_101.officeAddress.getText());
				}
				Log.info("Office Address value validation done");
				
				
				// Office City value validation
				
				if(ValidationActions.textValidation(object_101.officeCity, OfficeCity)==true)
				{
					Report.testStepStatus("Office City value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("Office City value is incorrect", "Fail", "Expected  : "+ OfficeCity+ ".	Actual  :   " +object_101.officeCity.getText());
				}
				Log.info("Office City value validation done");
				
				
				// Office State value validation
				
				if(ValidationActions.textValidation(object_101.officeState, OfficeState)==true)
				{
					Report.testStepStatus("Office State value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("Office State value is incorrect", "Fail", "Expected  : "+ OfficeState+ ".	Actual  :   " +object_101.officeState.getText());
				}
				Log.info("Office State value validation done");
				
				
				// Office ZipCode value validation
				
				if(ValidationActions.textValidation(object_101.officeZipCode, OfficeZipCode)==true)
				{
					Report.testStepStatus("Office ZipCode value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("Office ZipCode value is incorrect", "Fail", "Expected  : "+ OfficeZipCode+ ".	Actual  :   " +object_101.officeZipCode.getText());
				}
				Log.info("Office Zipcode value validation done");
				
				
				// Office Telephone value validation
				
				if(ValidationActions.textValidation(object_101.officeTelephone, OfficeTelephone)==true)
				{
					Report.testStepStatus("Office Telephone value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("Office Telephone value is incorrect", "Fail", "Expected  : "+ OfficeTelephone+ ".	Actual  :   " +object_101.officeTelephone.getText());
				}
				Log.info("Office telephone value validation done");
				
				
				// Date Of Injury value validation
				
				if(ValidationActions.textValidation(object_101.dateOfInjury, DateOfInjury)==true)
				{
					Report.testStepStatus("Date Of Injury value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("Date Of Injury value is incorrect", "Fail", "Expected  : "+ DateOfInjury+ ".		Actual  :   " +object_101.dateOfInjury.getText());
				}
				Log.info("DAte of Injury value validation done");
				
				
				// Date Employer Notified Of Injury value validation
				
				if(ValidationActions.textValidation(object_101.dateEmployerNotifiedofInjury, DateEmployerNotifiedOfInjury)==true)
				{
					Report.testStepStatus("DateEmployerNotifiedOfInjury value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("DateEmployerNotifiedOfInjury value is incorrect", "Fail", "Expected  : "+ DateEmployerNotifiedOfInjury+ ".	Actual  :   " +object_101.dateEmployerNotifiedofInjury.getText());
				}
				Log.info("Date Employer Notified Of Injury value validation done");
				
				
				// LastDayOfWorkAfterInjury value validation
				
				if(ValidationActions.textValidation(object_101.lastDayOfWorkAfterInjury, LastDayOfWorkAfterInjury)==true)
				{
					Report.testStepStatus("LastDayOfWorkAfterInjury value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("LastDayOfWorkAfterInjury value is incorrect", "Fail", "Expected  : "+ LastDayOfWorkAfterInjury+ ".	Actual  :   " +object_101.lastDayOfWorkAfterInjury.getText());
				}
				Log.info("LastDayOfWorkAfterInjury value validation done");
				
				
				// EmployerOccupationWhenInjured value validation
				
				if(ValidationActions.textValidation(object_101.employeeJobTitle, EmployerOccupationWhenInjured)==true)
				{
					Report.testStepStatus("EmployerOccupationWhenInjured value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("EmployerOccupationWhenInjured value is incorrect", "Fail", "Expected  : "+ EmployerOccupationWhenInjured+ ".	Actual  :   " +object_101.employeeJobTitle.getText());
				}
				Log.info("EmployerOccupationWhenInjured value validation done");
				
				
				// InjuryOccursOnInjuryPremises value validation
				
				if(ValidationActions.textValidation(object_101.injuryOccurOnEmployerPremises, InjuryOccursOnInjuryPremises)==true)
				{
					Report.testStepStatus("InjuryOccursOnInjuryPremises value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("InjuryOccursOnInjuryPremises value is incorrect", "Fail", "Expected  : "+ InjuryOccursOnInjuryPremises+ ".	Actual  :   " +object_101.injuryOccurOnEmployerPremises.getText());
				}
				Log.info("InjuryOccursOnInjuryPremises value validation done");
				
				
				// WhatWasTheInjury value validation
				
				if(ValidationActions.textValidation(object_101.whatWasTheInjury, WhatWasTheInjury)==true)
				{
					Report.testStepStatus("WhatWasTheInjury value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("WhatWasTheInjury value is incorrect", "Fail", "Expected  : "+ WhatWasTheInjury+ ".	Actual  :   " +object_101.whatWasTheInjury.getText());
				}
				Log.info("WhatWasTheInjury value validation done");
				
				
				// PartOfBodyInjured value validation
				
				if(ValidationActions.textValidation(object_101.partOfBodyInjured, PartOfBodyInjured)==true)
				{
					Report.testStepStatus("PartOfBodyInjured value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("PartOfBodyInjured value is incorrect", "Fail", "Expected  : "+ PartOfBodyInjured+ ".	Actual  :   " +object_101.partOfBodyInjured.getText());
				}
				Log.info("PartOfBodyInjured value validation done");
				
				
				// PartOfBodyInjuryTable value validation
				
				if(ValidationActions.textValidation(object_101.partOfBodyLookupTable, PartOfBodyInjuryTable)==true)
				{
					Report.testStepStatus("PartOfBodyInjuryTable value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("PartOfBodyInjuryTable value is incorrect", "Fail", "Expected  : "+ PartOfBodyInjuryTable+ ".	Actual  :   " +object_101.partOfBodyLookupTable.getText());
				}
				Log.info("PartOfBodyInjuryTable value validation done");
				
				
				// Fatal value validation
				
				if(ValidationActions.textValidation(object_101.fatal, Fatal)==true)
				{
					Report.testStepStatus("Fatal value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("Fatal value is incorrect", "Fail", "Expected  : "+ Fatal+ ".	Actual  :   " +object_101.fatal.getText());
				}
				Log.info("Fatal value validation done");
				
				
				// EmployeeTreatedInEmergencyRoom value validation
				
				if(ValidationActions.textValidation(object_101.treatedInEmergencyRoom, EmployeeTreatedInEmergencyRoom)==true)
				{
					Report.testStepStatus("EmployeeTreatedInEmergencyRoom value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("EmployeeTreatedInEmergencyRoom value is incorrect", "Fail", "Expected  : "+ EmployeeTreatedInEmergencyRoom+ ".	Actual  :   " +object_101.treatedInEmergencyRoom.getText());
				}
				Log.info("EmployeeTreatedInEmergencyRoom value validation done");
				
				
				// EmployeeHospitalizedOvernight value validation
				
				if(ValidationActions.textValidation(object_101.hospitalizedOvernight, EmployeeHospitalizedOvernight)==true)
				{
					Report.testStepStatus("EmployeeHospitalizedOvernight value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("EmployeeHospitalizedOvernight value is incorrect", "Fail", "Expected  : "+ Sex+ ".	Actual  :   " +object_101.hospitalizedOvernight.getText());
				}
				Log.info("EmployeeHospitalizedOvernight value validation done");
				
				
				// ValidityOfClaimDoubted value validation
				
				if(ValidationActions.textValidation(object_101.validityOfClaimDoubted, ValidityOfClaimDoubted)==true)
				{
					Report.testStepStatus("ValidityOfClaimDoubted value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("ValidityOfClaimDoubted value is incorrect", "Fail", "Expected  : "+ Sex+ ".	Actual  :   " +object_101.validityOfClaimDoubted.getText());
				}
				Log.info("ValidityOfClaimDoubted value validation done");
				
				
				// WhatHappened value validation
				
				if(ValidationActions.textValidation(object_101.whatHappened, WhatHappened)==true)
				{
					Report.testStepStatus("WhatHappened value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("WhatHappened value is incorrect", "Fail", "Expected  : "+ WhatHappened+ ".	Actual  :   " +object_101.whatHappened.getText());
				}
				Log.info("WhatHappened value validation done");
				
				
				// SubstanceDirectlyHarmedEmployee value validation
				
				if(ValidationActions.textValidation(object_101.substanceHarmedTheEmployee, SubstanceDirectlyHarmedEmployee)==true)
				{
					Report.testStepStatus("SubstanceDirectlyHarmedEmployee value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("SubstanceDirectlyHarmedEmployee value is incorrect", "Fail", "Expected  : "+ SubstanceDirectlyHarmedEmployee+ ".	Actual  :   " +object_101.substanceHarmedTheEmployee.getText());
				}
				Log.info("SubstanceDirectlyHarmedEmployee value validation done");
				
				
				// NatureOfInjury value validation
				
				if(ValidationActions.textValidation(object_101.natureOfInjuryLookup, NatureOfInjury)==true)
				{
					Report.testStepStatus("NatureOfInjury value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("NatureOfInjury value is incorrect", "Fail", "Expected  : "+ NatureOfInjury+ ".	Actual  :   " +object_101.natureOfInjuryLookup.getText());
				}
				Log.info("NatureOfInjury value validation done");
				
				
				// CauseOfInjury value validation
				
				if(ValidationActions.textValidation(object_101.causeOfInjuryLookup, CauseOfInjury)==true)
				{
					Report.testStepStatus("CauseOfInjury value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("CauseOfInjury value is incorrect", "Fail", "Expected  : "+ CauseOfInjury+ ".	Actual  :   " +object_101.causeOfInjuryLookup.getText());
				}
				Log.info("CauseOfInjury value validation done");
				
				
				// EmployeeDoingJustBeforeIncident value validation
				
				if(ValidationActions.textValidation(object_101.employeeDoingJustBeforeIncident, EmployeeDoingJustBeforeIncident)==true)
				{
					Report.testStepStatus("EmployeeDoingJustBeforeIncident value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("EmployeeDoingJustBeforeIncident value is incorrect", "Fail", "Expected  : "+ EmployeeDoingJustBeforeIncident+ ".	Actual  :   " +object_101.employeeDoingJustBeforeIncident.getText());
				}
				Log.info("EmployeeDoingJustBeforeIncident value validation done");
				
				
				// WorkerInEmployWhenInjured value validation
				
				if(ValidationActions.textValidation(object_101.yourEmployWhenInjured, WorkerInEmployWhenInjured)==true)
				{
					Report.testStepStatus("WorkerInEmployWhenInjured value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("WorkerInEmployWhenInjured value is incorrect", "Fail", "Expected  : "+ WorkerInEmployWhenInjured+ ".	Actual  :   " +object_101.yourEmployWhenInjured.getText());
				}
				Log.info("WorkerInEmployWhenInjured value validation done");
				
				
				// DateOfLastHire value validation
				
				if(ValidationActions.textValidation(object_101.dateOfLastHire, DateOfLastHire)==true)
				{
					Report.testStepStatus("DateOfLastHire value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("DateOfLastHire value is incorrect", "Fail", "Expected  : "+ DateOfLastHire+ ".	Actual  :   " +object_101.dateOfLastHire.getText());
				}
				Log.info("DateOfLastHire value validation done");
				
				
				// GrossEarningsOfEmployeePreceedingInjury value validation
				
				if(ValidationActions.textValidation(object_101.grossEarningsOfEmployee, GrossEarningsOfEmployeePreceedingInjury)==true)
				{
					Report.testStepStatus("GrossEarningsOfEmployeePreceedingInjury value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("GrossEarningsOfEmployeePreceedingInjury value is incorrect", "Fail", "Expected  : "+ GrossEarningsOfEmployeePreceedingInjury+ ".	Actual  :   " +object_101.grossEarningsOfEmployee.getText());
				}
				Log.info("GrossEarningsOfEmployeePreceedingInjury value validation done");
				
								
				// SubmitterEmailAddress value validation
				
				if(ValidationActions.textValidation(object_101.submitterEmailAddress, SubmitterEmailAddress)==true)
				{
					Report.testStepStatus("SubmitterEmailAddress value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("SubmitterEmailAddress value is incorrect", "Fail", "Expected  : "+ SubmitterEmailAddress+ ".	Actual  :   " +object_101.submitterEmailAddress.getText());
				}
				Log.info("SubmitterEmailAddress value validation done");
				
	}

}
