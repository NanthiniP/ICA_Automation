package gov.mst.automation.ica.pagemodel;

/*
	* Author	 				: Nanthini PushpaRaja
	* Created date			: Nov 26, 2018
	* Last Edited by		: Nanthini PushpaRaja
	* Last Edited date		: Dec 24, 2018
	* Description			: Class is used to define the actions for Employer Report Form
*/ 


import org.openqa.selenium.WebDriver;
import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import gov.mst.automation.ica.commonutility.CommonActions;
import gov.mst.automation.ica.commonutility.Log;
import gov.mst.automation.ica.commonutility.ValidationActions;
import gov.mst.automation.ica.constant.Constants;
import gov.mst.automation.ica.elements.EmployerReportFormElements;
import gov.mst.automation.ica.report.Report;


public class EmployersReportForm  {
		
	WebDriver driver;
	 EmployerReportFormElements elements;
		
	 
	// Constructor is used to initialize the browser
	
	public EmployersReportForm(WebDriver driver)
	{
		this.driver = driver;
	}
		
	
	// Method is used to fill the Employer Report Form
	
	public void formFill(String LastName, String FirstName, String SocialSecurityNumber, String BirthDate, String HomeAddress, String HomeCity, String HomeState, String HomeZipCode, String HomeTelephone, String Sex, String MaritalStatus, String EmployerName, String FeinNumber, String OfficeAddress, String OfficeCity, String OfficeState, String OfficeZipCode, String OfficeTelephone, String DateOfInjury, String DateEmployerNotifiedOfInjury, String LastDayOfWorkAfterInjury, String EmployerOccupationWhenInjured, String InjuryOccursOnInjuryPremises, String WhatWasTheInjury, String PartOfBodyInjured, String PartOfBodyInjuryTable, String Fatal, String EmployeeTreatedInEmergencyRoom, String EmployeeHospitalizedOvernight, String ValidityOfClaimDoubted, String WhatHappened, String SubstanceDirectlyHarmedEmployee, String NatureOfInjury, String CauseOfInjury, String EmployeeDoingJustBeforeIncident, String WorkerInEmployWhenInjured, String DateOfLastHire, String GrossEarningsOfEmployeePreceedingInjury, String SubmitterEmailAddress, String UploadFile) throws Exception 
	{
				
		driver.get(Constants.empoyersReportFormUrl);
		elements = EmployerReportFormElements.elements(driver);
			
		try 
		{

			// Employee
			
			Log.info("*********  Employee  Section  *********");
			Log.info(" ");
						
			elements.lastName.sendKeys(LastName);
			Log.info("Last name entered");
			
			elements.firstName.sendKeys(FirstName);
			Log.info("First name entered");
			
			elements.socialSecurityNumber.sendKeys(SocialSecurityNumber);
			Log.info("Social Security Number entered");
			
			elements.birthDate.sendKeys(BirthDate);
			Log.info("Birth date entered");
			
			elements.homeAddress.sendKeys(HomeAddress);
			Log.info("HomeAddress entered");
			
			elements.homeCity.sendKeys(HomeCity);
			Log.info("HomeCity entered");
			
			elements.homeState.sendKeys(HomeState);
			Log.info("HomeState entered");
			
			elements.homeZipCode.sendKeys(HomeZipCode);
			Log.info("HomeZipCode entered");
			
			elements.homeTelephone.sendKeys(HomeTelephone);
			Log.info("HomeTelephone entered");
			
			CommonActions.selectDropdownValue(elements.sex, Sex);
			Log.info("Sex entered");
			
			CommonActions.selectDropdownValue(elements.maritalStatus, MaritalStatus);
			Log.info("MaritalStatus entered");

			
			// Employer

			Log.info(" ");
			Log.info("*********  Employer  Section  *********");
			Log.info(" ");
			
			elements.employerName.sendKeys(EmployerName);
			Log.info("EmployerName entered");
			
			elements.feinNumber.sendKeys(FeinNumber);
			Log.info("FeinNumber entered");
			
			elements.officeAddress.sendKeys(OfficeAddress);
			Log.info("OfficeAddress entered");
			
			elements.officeCity.sendKeys(OfficeCity);
			Log.info("OfficeCity entered");
			
			elements.officeState.sendKeys(OfficeState);
			Log.info("OfficeState entered");
			
			elements.officeZipcode.sendKeys(OfficeZipCode);
			Log.info("OfficeZipCode entered");
			
			elements.officeTelephone.sendKeys(OfficeTelephone);
			Log.info("OfficeTelephone entered");
			
			

			// Accident Details

			Log.info(" ");
			Log.info("*********  Accident Details  Section  *********");
			Log.info(" ");
			
			elements.dateOfInjury.sendKeys(DateOfInjury);
			Log.info("DateOfInjury entered");
			
			elements.dateEmployerNotifiedofInjury.sendKeys(DateEmployerNotifiedOfInjury);
			Log.info("DateEmployerNotifiedOfInjury entered");
			
			elements.lastDayOfWorkAfterInjury.sendKeys(LastDayOfWorkAfterInjury);
			Log.info("LastDayOfWorkAfterInjury entered");
			
			elements.employeeReturnedToWorkNo.click();
			Log.info("employeeReturnedToWorkNo selected");
			
			elements.employeeOccupation.sendKeys(EmployerOccupationWhenInjured);
			Log.info("EmployerOccupationWhenInjured entered");
			
			CommonActions.selectDropdownValue(elements.injuryOccurOnEmployerPremises, InjuryOccursOnInjuryPremises);
			Log.info("injuryOccurOnEmployerPremises entered");
			
			elements.whatWasTheInjury.sendKeys(WhatWasTheInjury);
			Log.info("WhatWasTheInjury entered");
			
			elements.partOfBodyInjured.sendKeys(PartOfBodyInjured);
			Log.info("PartOfBodyInjured entered");
			
			CommonActions.lookup(driver, elements.partOfBodyLookupTable, PartOfBodyInjuryTable);
			Log.info("partOfBodyLookupTable entered");
			
			CommonActions.selectDropdownValue(elements.fatal, Fatal);
			Log.info("Fatal entered");
			
			CommonActions.selectDropdownValue(elements.treatedInEmergencyRoom, EmployeeTreatedInEmergencyRoom);
			Log.info("EmployeeTreatedInEmergencyRoom entered");
			
			CommonActions.selectDropdownValue(elements.hospitalizedOvernight, EmployeeHospitalizedOvernight);
			Log.info("EmployeeHospitalizedOvernight entered");
			
			CommonActions.selectDropdownValue(elements.validityOfClaimDoubted, ValidityOfClaimDoubted);
			Log.info("ValidityOfClaimDoubted entered");
			

			
			// Cause of Accident

			Log.info(" ");
			Log.info("*********  Cause of Accident  Section  *********");
			Log.info(" ");
			
			elements.whatHappened.sendKeys(WhatHappened);
			Log.info("WhatHappened entered");
			
			elements.substanceHarmedTheEmployee.sendKeys(SubstanceDirectlyHarmedEmployee);
			Log.info("SubstanceDirectlyHarmedEmployee entered");
			
			CommonActions.lookup(driver, elements.natureOfInjuryLookup, NatureOfInjury);
			Log.info("NatureOfInjury entered");
			
			CommonActions.lookup(driver, elements.causeOfInjuryLookup, CauseOfInjury);
			Log.info("CauseOfInjury entered");
			
			elements.employeeDoingJustBeforeIncident.sendKeys(EmployeeDoingJustBeforeIncident);
			Log.info("EmployeeDoingJustBeforeIncident entered");
			
			CommonActions.selectDropdownValue(elements.yourEmployWhenInjured, WorkerInEmployWhenInjured);
			Log.info("WorkerInEmployWhenInjured entered");
			
			elements.dateOfLastHire.sendKeys(DateOfLastHire);
			Log.info("DateOfLastHire entered");
			
			

			// Employee's wage data

			Log.info(" ");
			Log.info("*********  Employee's wage data  Section  *********");
			Log.info(" ");
			
			elements.grossEarningsOfEmployee.sendKeys(GrossEarningsOfEmployeePreceedingInjury);
			Log.info("GrossEarningsOfEmployeePreceedingInjury entered");
			

			
			// Authorized Signature

			Log.info(" ");
			Log.info("*********  Authorized Signature Section  *********");
			Log.info(" ");
			
			elements.submitterEmailAddress.sendKeys(SubmitterEmailAddress);
			Log.info("SubmitterEmailAddress entered");
			
			elements.FileUpload.click();
			CommonActions.fileUpload(UploadFile);
			Log.info("UploadFile done");
			
			elements.iAgree.click();
			Log.info("I Agree checked");
			
			elements.submit.click();
			Log.info("Submit button clicked");
			
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

	public void thankYouValidation(String expectedText) throws Exception 
	{
		boolean result = ValidationActions.textValidation(elements.thankYou, expectedText);
		if (result == true) 
		{
			Report.testStepStatus("Thank You message is correctly displayed", "Pass", "");
		} 
		else 
		{
			Report.testStepStatus("Message is incorrect", "Fail", elements.thankYou.getText());
		}
		
	}

	
	// Method is used to validate whether "Important Note"content is displayed once the form is submitted
	
	public void importantNoteValidation(String expectedText) throws Exception 
	{
		boolean result = ValidationActions.textValidation(elements.importantNote, expectedText);
		if (result ==true) 
		{
			Report.testStepStatus("Important Note content is correctly displayed", "Pass", "");
		} 
		else 
		{
			Report.testStepStatus("Content is incorrect", "Fail", "elements.importantNote");
		}
		
	}
	
}
