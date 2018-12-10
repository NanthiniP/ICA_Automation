package gov.mst.automation.ica.pagemodel;

/*
	* Author	 				: Nanthini PushpaRaja
	* Created date			: Nov 26, 2018
	* Last Edited by		: Nanthini PushpaRaja
	* Last Edited date		: Dec 08, 2018
	* Description			: Class is used to define the actions for Employer Report Form
*/ 

import org.openqa.selenium.WebDriver;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;

import gov.mst.automation.ica.commonutility.CommonActions;
import gov.mst.automation.ica.commonutility.ValidationActions;
import gov.mst.automation.ica.constant.Constants;
import gov.mst.automation.ica.elements.EmployerReportFormElements;
import gov.mst.automation.ica.report.Report;

public class EmployersReportForm  {
		
	WebDriver driver;
	 EmployerReportFormElements employerreport;
		
	// Constructor is used to initialize the browser
	
	public EmployersReportForm(WebDriver driver)
	{
		this.driver = driver;
	}
		
	
	// Method is used to fill the Employer Report Form
	
	public void formFill(String LastName, String FirstName, String SocialSecurityNumber, String BirthDate, String HomeAddress, String HomeCity, String HomeState, String HomeZipCode, String HomeTelephone, String Sex, String MaritalStatus, String EmployerName, String FeinNumber, String OficeAddress, String OfficeCity, String OfficeState, String OficeZipCode, String OfficeTelephone, String DateOfInjury, String DateEmployerNotifiedOfInjury, String LastDayOfWorkAfterInjury, String EmployerOccupationWhenInjured, String InjuryOccursOnInjuryPremises, String WhatWasTheInjury, String PartOfBodyInjured, String PartOfBodyInjuryTable, String Fatal, String EmployeeTreatedInEmergencyRoom, String EmployeeHospitalizedOvernight, String ValidityOfClaimDoubted, String WhatHappened, String SubstanceDirectlyHarmedEmployee, String NatureOfInjury, String CauseOfInjury, String EmployeeDoingJustBeforeIncident, String WorkerInEmployWhenInjured, String DateOfLastHire, String GrossEarningsOfEmployeePreceedingInjury, String SubmitterEmailAddress, String UploadFile) throws Exception 
	{

		driver.get(Constants.empoyersReportFormUrl);
		employerreport = EmployerReportFormElements.elements(driver);

		try 
		{

			// Employee

			employerreport.lastName.sendKeys(LastName);
			employerreport.firstName.sendKeys(FirstName);
			employerreport.socialSecurityNumber.sendKeys(SocialSecurityNumber);
			employerreport.birthDate.sendKeys(BirthDate);
			employerreport.homeAddress.sendKeys(HomeAddress);
			employerreport.homeCity.sendKeys(HomeCity);
			employerreport.homeState.sendKeys(HomeState);
			employerreport.homeZipCode.sendKeys(HomeZipCode);
			employerreport.homeTelephone.sendKeys(HomeTelephone);
			CommonActions.selectDropdownValue(employerreport.sex, Sex);
			CommonActions.selectDropdownValue(employerreport.maritalStatus, MaritalStatus);

			// Employer

			employerreport.employerName.sendKeys(EmployerName);
			employerreport.feinNumber.sendKeys(FeinNumber);
			employerreport.officeAddress.sendKeys(OficeAddress);
			employerreport.officeCity.sendKeys(OfficeCity);
			employerreport.officeState.sendKeys(OfficeState);
			employerreport.officeZipcode.sendKeys(OficeZipCode);
			employerreport.officeTelephone.sendKeys(OfficeTelephone);

			// Accident Details

			employerreport.dateOfInjury.sendKeys(DateOfInjury);
			employerreport.dateEmployerNotifiedofInjury.sendKeys(DateEmployerNotifiedOfInjury);
			employerreport.lastDayOfWorkAfterInjury.sendKeys(LastDayOfWorkAfterInjury);
			employerreport.employeeReturnedToWorkNo.click();
			employerreport.employeeOccupation.sendKeys(EmployerOccupationWhenInjured);
			CommonActions.selectDropdownValue(employerreport.injuryOccurOnEmployerPremises,
					InjuryOccursOnInjuryPremises);
			employerreport.whatWasTheInjury.sendKeys(WhatWasTheInjury);
			employerreport.partOfBodyInjured.sendKeys(PartOfBodyInjured);
			CommonActions.lookup(driver, employerreport.partOfBodyLookupTable, PartOfBodyInjuryTable);
			CommonActions.selectDropdownValue(employerreport.fatal, Fatal);
			CommonActions.selectDropdownValue(employerreport.treatedInEmergencyRoom, EmployeeTreatedInEmergencyRoom);
			CommonActions.selectDropdownValue(employerreport.hospitalizedOvernight, EmployeeHospitalizedOvernight);
			CommonActions.selectDropdownValue(employerreport.validityOfClaimDoubted, ValidityOfClaimDoubted);

			// Cause of Accident

			employerreport.whatHappened.sendKeys(WhatHappened);
			employerreport.substanceHarmedTheEmployee.sendKeys(SubstanceDirectlyHarmedEmployee);
			CommonActions.lookup(driver, employerreport.natureOfInjuryLookup, NatureOfInjury);
			CommonActions.lookup(driver, employerreport.causeOfInjuryLookup, CauseOfInjury);
			employerreport.employeeDoingJustBeforeIncident.sendKeys(EmployeeDoingJustBeforeIncident);
			CommonActions.selectDropdownValue(employerreport.yourEmployWhenInjured, WorkerInEmployWhenInjured);
			employerreport.dateOfLastHire.sendKeys(DateOfLastHire);

			// Employee's wage data

			employerreport.grossEarningsOfEmployee.sendKeys(GrossEarningsOfEmployeePreceedingInjury);

			// Authorized Signature

			employerreport.submitterEmailAddress.sendKeys(SubmitterEmailAddress);
			employerreport.FileUpload.click();
			CommonActions.fileUpload(UploadFile);
			employerreport.iAgree.click();
			employerreport.submit.click();
			Report.testStepStatus("Form submitted successfully", "Pass", "");
		}

		catch (ElementNotFoundException e) 
		{
			Report.testStepStatus("Form not submitted successfully", "Fail", e.getMessage());
		} 
		catch (Exception e) 
		{
			Report.testStepStatus("Form not submitted successfully", "Fail", e.getMessage());
		}

	}

	
	
	// Method is used to validate whether "Thank You"text is displayed once the form is submitted

	public boolean thankYouValidation(String expectedText) throws Exception 
	{
		boolean result = ValidationActions.textValidation(employerreport.thankYou, expectedText);
		if (result == true) 
		{
			Report.testStepStatus("Thank You message is correctly displayed", "Pass", "");
		} 
		else 
		{
			Report.testStepStatus("Message is incorrect", "Fail", "employerreport.thankYou");
		}
		return result;
	}

	
	// Method is used to validate whether "Important Note"content is displayed once the form is submitted
	
	public boolean importantNoteValidation(String expectedText) throws Exception 
	{
		boolean result = ValidationActions.textValidation(employerreport.importantNote, expectedText);
		if (result ==true) 
		{
			Report.testStepStatus("Important Note content is correctly displayed", "Pass", "");
		} 
		else 
		{
			Report.testStepStatus("Content is incorrect", "Fail", "employerreport.importantNote");
		}
		return result;
	}
	
}
