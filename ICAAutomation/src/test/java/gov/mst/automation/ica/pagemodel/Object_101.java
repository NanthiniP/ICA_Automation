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
import gov.mst.automation.ica.elements.Object_101_Elements;
import gov.mst.automation.ica.report.Report;


public class Object_101 {
	
	WebDriver driver;
	Object_101_Elements elements;
	
	
	// Constructor is used to initialize the browser
	
	public Object_101(WebDriver driver)
	{
		this.driver = driver;
	}
		
	
	// Method is used to validate whether all the values are properly mapped from Employer form to objecy_101 
	
	public void formValueValidation(String LastName, String FirstName, String SocialSecurityNumber, String BirthDate, String HomeAddress, String HomeCity, String HomeState, String HomeZipCode, String HomeTelephone, String Sex, String MaritalStatus, String EmployerName, String FeinNumber, String OfficeAddress, String OfficeCity, String OfficeState, String OfficeZipCode, String OfficeTelephone, String DateOfInjury, String DateEmployerNotifiedOfInjury, String LastDayOfWorkAfterInjury, String EmployerOccupationWhenInjured, String InjuryOccursOnInjuryPremises, String WhatWasTheInjury, String PartOfBodyInjured, String PartOfBodyInjuryTable, String Fatal, String EmployeeTreatedInEmergencyRoom, String EmployeeHospitalizedOvernight, String ValidityOfClaimDoubted, String WhatHappened, String SubstanceDirectlyHarmedEmployee, String NatureOfInjury, String CauseOfInjury, String EmployeeDoingJustBeforeIncident, String WorkerInEmployWhenInjured, String DateOfLastHire, String GrossEarningsOfEmployeePreceedingInjury, String SubmitterEmailAddress, String UploadFile) throws Exception
	{
		elements = Object_101_Elements.elements(driver);
		
		
		// Last Name value validation
				
		if(ValidationActions.textValidation(elements.lastName, LastName)==true)
		{
			Report.testStepStatus("Last name value is correct", "Pass", "");
		}
		else
		{
			Report.testStepStatus("Last name value is incorrect", "Fail", "Expected  : "+ LastName+ ".	Actual  :   " +CommonActions.getElementText(elements.lastName));
		}
		
		
		// First Name value validation
		
		if(ValidationActions.textValidation(elements.firstName,FirstName)==true)
		{
			Report.testStepStatus("First name value is correct", "Pass", "");
		}
		else
		{
			Report.testStepStatus("Last name value is incorrect", "Fail", "Expected  : "+ FirstName+ ".	Actual  :   " +CommonActions.getElementText(elements.firstName));
		}
		
		
		// Social Security Number value validation
		
		if(ValidationActions.textValidation(elements.socialSecurityNumber, SocialSecurityNumber)==true)
		{
			Report.testStepStatus("Social Security Number value is correct", "Pass", "");
		}
		else
		{
			Report.testStepStatus("Social Security Number value is incorrect", "Fail", "Expected  : "+ SocialSecurityNumber+ ".	Actual  :   " +CommonActions.getElementText(elements.socialSecurityNumber));
		}
		
		
		// Date of Birth value validation
		
		if(ValidationActions.textValidation(elements.dateOfBirth, BirthDate)==true)
		{
			Report.testStepStatus("Date of Birth value is correct", "Pass", "");
		}
		else
		{
			Report.testStepStatus("Date of Birth value is incorrect", "Fail", "Expected  : "+ BirthDate+ ".	Actual  :   " +CommonActions.getElementText(elements.dateOfBirth));
		}
		
		
		// Home Address value validation
		
		if(ValidationActions.textValidation(elements.homeAddress, HomeAddress)==true)
		{
				Report.testStepStatus("Home Address value is correct", "Pass", "");
		}
		else
		{
				Report.testStepStatus("Home Address value is incorrect", "Fail", "Expected  : "+ HomeAddress+ ".	Actual  :   " +CommonActions.getElementText(elements.homeAddress));
		}
		
				
		// Home City value validation
				
				if(ValidationActions.textValidation(elements.homeCity, HomeCity)==true)
				{
					Report.testStepStatus("Home City value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("Home City value is incorrect", "Fail", "Expected  : "+ HomeCity+ ".	Actual  :   " +CommonActions.getElementText(elements.homeCity));
				}
				
				
				// Home State value validation
				
				if(ValidationActions.textValidation(elements.homeState, HomeState)==true)
				{
					Report.testStepStatus("Home State value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("Home State value is incorrect", "Fail", "Expected  : "+ HomeState+ ".	Actual  :   " +CommonActions.getElementText(elements.homeState));
				}
				
				
				// Home Zip Code value validation
				
				if(ValidationActions.textValidation(elements.homeZipCode, HomeZipCode)==true)
				{
					Report.testStepStatus("Home Zip Code value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("Home Zip Code value is incorrect", "Fail", "Expected  : "+ HomeZipCode+ ".	Actual  :   " +CommonActions.getElementText(elements.homeZipCode));
				}
				
				
				
				// Home Telephone value validation
				
				if(ValidationActions.textValidation(elements.homeTelephone, HomeTelephone)==true)
				{
					Report.testStepStatus("Home Telephone value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("Home Telephone value is incorrect", "Fail", "Expected  : "+ HomeTelephone+ ".	Actual  :   " +CommonActions.getElementText(elements.homeTelephone));
				}
				
				
				// Sex value validation
				
				if(ValidationActions.textValidation(elements.sex, Sex)==true)
				{
					Report.testStepStatus("Sex value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("Sex value is incorrect", "Fail", "Expected  : "+ Sex+ ".	Actual  :   " +CommonActions.getElementText(elements.sex));
				}
				
				// Marital Status value validation
				
				if(ValidationActions.textValidation(elements.maritalStatus, MaritalStatus)==true)
				{
					Report.testStepStatus("Marital Status value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("Marital Status value is incorrect", "Fail", "Expected  : "+ MaritalStatus+ ".	Actual  :   " +CommonActions.getElementText(elements.maritalStatus));
				}
				
				
				// Employer Name value validation
				
				if(ValidationActions.textValidation(elements.employerName, EmployerName)==true)
				{
					Report.testStepStatus("Employer Name value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("Employer Name value is incorrect", "Fail", "Expected  : "+ EmployerName+ ".	Actual  :   " +CommonActions.getElementText(elements.employerName));
				}
				
				
				// Fein Number value validation
				
				if(ValidationActions.textValidation(elements.feinNumber, FeinNumber)==true)
				{
					Report.testStepStatus("Fein Number value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("Fein Number value is incorrect", "Fail", "Expected  : "+ FeinNumber+ ".	Actual  :   " +CommonActions.getElementText(elements.feinNumber));
				}
				
				
				
				// Office Address value validation
				
				if(ValidationActions.textValidation(elements.officeAddress, OfficeAddress)==true)
				{
					Report.testStepStatus("Ofice Address value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("Ofice Address value is incorrect", "Fail", "Expected  : "+ OfficeAddress+ ".	Actual  :   " +CommonActions.getElementText(elements.officeAddress));
				}
				
				
				
				// Office City value validation
				
				if(ValidationActions.textValidation(elements.officeCity, OfficeCity)==true)
				{
					Report.testStepStatus("Office City value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("Office City value is incorrect", "Fail", "Expected  : "+ OfficeCity+ ".	Actual  :   " +CommonActions.getElementText(elements.officeCity));
				}
				
				
				
				// Office State value validation
				
				if(ValidationActions.textValidation(elements.officeState, OfficeState)==true)
				{
					Report.testStepStatus("Office State value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("Office State value is incorrect", "Fail", "Expected  : "+ OfficeState+ ".	Actual  :   " +CommonActions.getElementText(elements.officeState));
				}
				
				
				// Office ZipCode value validation
				
				if(ValidationActions.textValidation(elements.officeZipCode, OfficeZipCode)==true)
				{
					Report.testStepStatus("Office ZipCode value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("Office ZipCode value is incorrect", "Fail", "Expected  : "+ OfficeZipCode+ ".	Actual  :   " +CommonActions.getElementText(elements.officeZipCode));
				}
				
				
				// Office Telephone value validation
				
				if(ValidationActions.textValidation(elements.officeTelephone, OfficeTelephone)==true)
				{
					Report.testStepStatus("Office Telephone value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("Office Telephone value is incorrect", "Fail", "Expected  : "+ OfficeTelephone+ ".	Actual  :   " +CommonActions.getElementText(elements.officeTelephone));
				}
				
				
				// Date Of Injury value validation
				
				if(ValidationActions.textValidation(elements.dateOfInjury, DateOfInjury)==true)
				{
					Report.testStepStatus("Date Of Injury value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("Date Of Injury value is incorrect", "Fail", "Expected  : "+ DateOfInjury+ ".		Actual  :   " +CommonActions.getElementText(elements.dateOfInjury));
				}
				
				
				// Date Employer Notified Of Injury value validation
				
				if(ValidationActions.textValidation(elements.dateEmployerNotifiedofInjury, DateEmployerNotifiedOfInjury)==true)
				{
					Report.testStepStatus("DateEmployerNotifiedOfInjury value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("DateEmployerNotifiedOfInjury value is incorrect", "Fail", "Expected  : "+ DateEmployerNotifiedOfInjury+ ".	Actual  :   " +CommonActions.getElementText(elements.dateEmployerNotifiedofInjury));
				}
				
				
				// LastDayOfWorkAfterInjury value validation
				
				if(ValidationActions.textValidation(elements.lastDayOfWorkAfterInjury, LastDayOfWorkAfterInjury)==true)
				{
					Report.testStepStatus("LastDayOfWorkAfterInjury value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("LastDayOfWorkAfterInjury value is incorrect", "Fail", "Expected  : "+ LastDayOfWorkAfterInjury+ ".	Actual  :   " +CommonActions.getElementText(elements.lastDayOfWorkAfterInjury));
				}
				
				
				// EmployerOccupationWhenInjured value validation
				
				if(ValidationActions.textValidation(elements.employeeJobTitle, EmployerOccupationWhenInjured)==true)
				{
					Report.testStepStatus("EmployerOccupationWhenInjured value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("EmployerOccupationWhenInjured value is incorrect", "Fail", "Expected  : "+ EmployerOccupationWhenInjured+ ".	Actual  :   " +CommonActions.getElementText(elements.employeeJobTitle));
				}
				
				
				// InjuryOccursOnInjuryPremises value validation
				
				if(ValidationActions.textValidation(elements.injuryOccurOnEmployerPremises, InjuryOccursOnInjuryPremises)==true)
				{
					Report.testStepStatus("InjuryOccursOnInjuryPremises value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("InjuryOccursOnInjuryPremises value is incorrect", "Fail", "Expected  : "+ InjuryOccursOnInjuryPremises+ ".	Actual  :   " +CommonActions.getElementText(elements.injuryOccurOnEmployerPremises));
				}
				
				
				// WhatWasTheInjury value validation
				
				if(ValidationActions.textValidation(elements.whatWasTheInjury, WhatWasTheInjury)==true)
				{
					Report.testStepStatus("WhatWasTheInjury value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("WhatWasTheInjury value is incorrect", "Fail", "Expected  : "+ WhatWasTheInjury+ ".	Actual  :   " +CommonActions.getElementText(elements.whatWasTheInjury));
				}
				
				// PartOfBodyInjured value validation
				
				if(ValidationActions.textValidation(elements.partOfBodyInjured, PartOfBodyInjured)==true)
				{
					Report.testStepStatus("PartOfBodyInjured value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("PartOfBodyInjured value is incorrect", "Fail", "Expected  : "+ PartOfBodyInjured+ ".	Actual  :   " +CommonActions.getElementText(elements.partOfBodyInjured));
				}
				
				
				// PartOfBodyInjuryTable value validation
				
				if(ValidationActions.textValidation(elements.partOfBodyLookupTable, PartOfBodyInjuryTable)==true)
				{
					Report.testStepStatus("PartOfBodyInjuryTable value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("PartOfBodyInjuryTable value is incorrect", "Fail", "Expected  : "+ PartOfBodyInjuryTable+ ".	Actual  :   " +CommonActions.getElementText(elements.partOfBodyLookupTable));
				}
				
				
				// Fatal value validation
				
				if(ValidationActions.textValidation(elements.fatal, Fatal)==true)
				{
					Report.testStepStatus("Fatal value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("Fatal value is incorrect", "Fail", "Expected  : "+ Fatal+ ".	Actual  :   " +CommonActions.getElementText(elements.fatal));
				}
				
				
				// EmployeeTreatedInEmergencyRoom value validation
				
				if(ValidationActions.textValidation(elements.treatedInEmergencyRoom, EmployeeTreatedInEmergencyRoom)==true)
				{
					Report.testStepStatus("EmployeeTreatedInEmergencyRoom value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("EmployeeTreatedInEmergencyRoom value is incorrect", "Fail", "Expected  : "+ EmployeeTreatedInEmergencyRoom+ ".	Actual  :   " +CommonActions.getElementText(elements.treatedInEmergencyRoom));
				}
				
				
				// EmployeeHospitalizedOvernight value validation
				
				if(ValidationActions.textValidation(elements.hospitalizedOvernight, EmployeeHospitalizedOvernight)==true)
				{
					Report.testStepStatus("EmployeeHospitalizedOvernight value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("EmployeeHospitalizedOvernight value is incorrect", "Fail", "Expected  : "+ Sex+ ".	Actual  :   " +CommonActions.getElementText(elements.hospitalizedOvernight));
				}
				
				
				// ValidityOfClaimDoubted value validation
				
				if(ValidationActions.textValidation(elements.validityOfClaimDoubted, ValidityOfClaimDoubted)==true)
				{
					Report.testStepStatus("ValidityOfClaimDoubted value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("ValidityOfClaimDoubted value is incorrect", "Fail", "Expected  : "+ Sex+ ".	Actual  :   " +CommonActions.getElementText(elements.validityOfClaimDoubted));
				}
				
				
				// WhatHappened value validation
				
				if(ValidationActions.textValidation(elements.whatHappened, WhatHappened)==true)
				{
					Report.testStepStatus("WhatHappened value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("WhatHappened value is incorrect", "Fail", "Expected  : "+ WhatHappened+ ".	Actual  :   " +CommonActions.getElementText(elements.whatHappened));
				}
				
				
				// SubstanceDirectlyHarmedEmployee value validation
				
				if(ValidationActions.textValidation(elements.substanceHarmedTheEmployee, SubstanceDirectlyHarmedEmployee)==true)
				{
					Report.testStepStatus("SubstanceDirectlyHarmedEmployee value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("SubstanceDirectlyHarmedEmployee value is incorrect", "Fail", "Expected  : "+ SubstanceDirectlyHarmedEmployee+ ".	Actual  :   " +CommonActions.getElementText(elements.substanceHarmedTheEmployee));
				}
				
				
				// NatureOfInjury value validation
				
				if(ValidationActions.textValidation(elements.natureOfInjuryLookup, NatureOfInjury)==true)
				{
					Report.testStepStatus("NatureOfInjury value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("NatureOfInjury value is incorrect", "Fail", "Expected  : "+ NatureOfInjury+ ".	Actual  :   " +CommonActions.getElementText(elements.natureOfInjuryLookup));
				}
				
				
				
				// CauseOfInjury value validation
				
				if(ValidationActions.textValidation(elements.causeOfInjuryLookup, CauseOfInjury)==true)
				{
					Report.testStepStatus("CauseOfInjury value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("CauseOfInjury value is incorrect", "Fail", "Expected  : "+ CauseOfInjury+ ".	Actual  :   " +CommonActions.getElementText(elements.causeOfInjuryLookup));
				}
				
				
				// EmployeeDoingJustBeforeIncident value validation
				
				if(ValidationActions.textValidation(elements.employeeDoingJustBeforeIncident, EmployeeDoingJustBeforeIncident)==true)
				{
					Report.testStepStatus("EmployeeDoingJustBeforeIncident value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("EmployeeDoingJustBeforeIncident value is incorrect", "Fail", "Expected  : "+ EmployeeDoingJustBeforeIncident+ ".	Actual  :   " +CommonActions.getElementText(elements.employeeDoingJustBeforeIncident));
				}
				
				
				// WorkerInEmployWhenInjured value validation
				
				if(ValidationActions.textValidation(elements.yourEmployWhenInjured, WorkerInEmployWhenInjured)==true)
				{
					Report.testStepStatus("WorkerInEmployWhenInjured value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("WorkerInEmployWhenInjured value is incorrect", "Fail", "Expected  : "+ WorkerInEmployWhenInjured+ ".	Actual  :   " +CommonActions.getElementText(elements.yourEmployWhenInjured));
				}
				
				
				
				// DateOfLastHire value validation
				
				if(ValidationActions.textValidation(elements.dateOfLastHire, DateOfLastHire)==true)
				{
					Report.testStepStatus("DateOfLastHire value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("DateOfLastHire value is incorrect", "Fail", "Expected  : "+ DateOfLastHire+ ".	Actual  :   " +CommonActions.getElementText(elements.dateOfLastHire));
				}
				
				
				
				// GrossEarningsOfEmployeePreceedingInjury value validation
				
				if(ValidationActions.textValidation(elements.grossEarningsOfEmployee, GrossEarningsOfEmployeePreceedingInjury)==true)
				{
					Report.testStepStatus("GrossEarningsOfEmployeePreceedingInjury value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("GrossEarningsOfEmployeePreceedingInjury value is incorrect", "Fail", "Expected  : "+ GrossEarningsOfEmployeePreceedingInjury+ ".	Actual  :   " +CommonActions.getElementText(elements.grossEarningsOfEmployee));
				}
				
								
				// SubmitterEmailAddress value validation
				
				if(ValidationActions.textValidation(elements.submitterEmailAddress, SubmitterEmailAddress)==true)
				{
					Report.testStepStatus("SubmitterEmailAddress value is correct", "Pass", "");
				}
				else
				{
					Report.testStepStatus("SubmitterEmailAddress value is incorrect", "Fail", "Expected  : "+ SubmitterEmailAddress+ ".	Actual  :   " +CommonActions.getElementText(elements.submitterEmailAddress));
				}
				
	}

}
