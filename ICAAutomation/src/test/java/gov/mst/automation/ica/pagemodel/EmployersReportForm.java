package gov.mst.automation.ica.pagemodel;

/*
	* Author	 				: Nanthini PushpaRaja
	* Created date			: Nov 26, 2018
	* Last Edited by		: Nanthini PushpaRaja
	* Last Edited date		: Dec 08, 2018
	* Description			: Class is used to define the actions in Employer Report Form
*/ 

import org.openqa.selenium.WebDriver;
import gov.mst.automation.ica.constant.ApplicationConstants;
import gov.mst.automation.ica.validationmodel.Validations;
import gov.mst.sutomation.ica.elements.EmployerReportFormElements;

public class EmployersReportForm  {
		
	WebDriver driver;
	Actions action;
	EmployerReportFormElements employerreport;
		
	// Constructor is used to initialize the browser
	
	public EmployersReportForm(WebDriver driver)
	{
		this.driver = driver;
	}
		
	
	// Method is used to fill the Employer Report Form
	
	public void formFill(String LastName, String FirstName, String SocialSecurityNumber, String BirthDate, String HomeAddress, String HomeCity, String HomeState, String HomeZipCode, String HomeTelephone, String Sex, String MaritalStatus, String EmployerName, String FeinNumber, String OficeAddress, String OfficeCity, String OfficeState, String OficeZipCode, String OfficeTelephone, String DateOfInjury, String DateEmployerNotifiedOfInjury, String LastDayOfWorkAfterInjury, String EmployerOccupationWhenInjured, String InjuryOccursOnInjuryPremises, String WhatWasTheInjury, String PartOfBodyInjured, String PartOfBodyInjuryTable, String Fatal, String EmployeeTreatedInEmergencyRoom, String EmployeeHospitalizedOvernight, String ValidityOfClaimDoubted, String WhatHappened, String SubstanceDirectlyHarmedEmployee, String NatureOfInjury, String CauseOfInjury, String EmployeeDoingJustBeforeIncident, String WorkerInEmployWhenInjured, String DateOfLastHire, String GrossEarningsOfEmployeePreceedingInjury, String SubmitterEmailAddress, String UploadFile) throws Exception 
	{
		
		driver.get(ApplicationConstants.empoyersReportFormUrl);
		employerreport = EmployerReportFormElements.elements(driver);
		action = new Actions(driver);
		
		//Employee
		
		employerreport.lastName.sendKeys(LastName);  
		employerreport.firstName.sendKeys(FirstName);  
		employerreport.socialSecurityNumber.sendKeys(SocialSecurityNumber); 
		employerreport.birthDate.sendKeys(BirthDate);  
		employerreport.homeAddress.sendKeys(HomeAddress);
		employerreport.homeCity.sendKeys(HomeCity);
		employerreport.homeState.sendKeys(HomeState);
		employerreport.homeZipCode.sendKeys(HomeZipCode);
		employerreport.homeTelephone.sendKeys(HomeTelephone);
		action.selectDropdownValue(employerreport.sex, Sex);
		action.selectDropdownValue(employerreport.maritalStatus, MaritalStatus);
				
		
		// Employer
		
		employerreport.employerName.sendKeys(EmployerName);
		employerreport.feinNumber.sendKeys(FeinNumber);
		employerreport.officeAddress.sendKeys(OficeAddress);
		employerreport.officeCity.sendKeys(OfficeCity);
		employerreport.officeState.sendKeys(OfficeState);
		employerreport.officeZipcode.sendKeys(OficeZipCode);
		employerreport.officeTelephone.sendKeys(OfficeTelephone);
		
		
		//Accident Details
				
		employerreport.dateOfInjury.sendKeys(DateOfInjury);   
		employerreport.dateEmployerNotifiedofInjury.sendKeys(DateEmployerNotifiedOfInjury);  
		employerreport.lastDayOfWorkAfterInjury.sendKeys(LastDayOfWorkAfterInjury);  
		employerreport.employeeReturnedToWorkNo.click();
		employerreport.employeeOccupation.sendKeys(EmployerOccupationWhenInjured);			
		action.selectDropdownValue(employerreport.injuryOccurOnEmployerPremises,InjuryOccursOnInjuryPremises);		
		employerreport.whatWasTheInjury.sendKeys(WhatWasTheInjury);			
		employerreport.partOfBodyInjured.sendKeys(PartOfBodyInjured);				
		action.lookup(employerreport.partOfBodyLookupTable,PartOfBodyInjuryTable);			
		action.selectDropdownValue(employerreport.fatal,Fatal);		
		action.selectDropdownValue(employerreport.treatedInEmergencyRoom,EmployeeTreatedInEmergencyRoom);		
		action.selectDropdownValue(employerreport.hospitalizedOvernight,EmployeeHospitalizedOvernight); 
		action.selectDropdownValue(employerreport.validityOfClaimDoubted,ValidityOfClaimDoubted);		
		
		
		//Cause of Accident
		
		employerreport.whatHappened.sendKeys(WhatHappened);
		employerreport.substanceHarmedTheEmployee.sendKeys(SubstanceDirectlyHarmedEmployee);  
		action.lookup(employerreport.natureOfInjuryLookup,NatureOfInjury);
		action.lookup(employerreport.causeOfInjuryLookup,CauseOfInjury);
		employerreport.employeeDoingJustBeforeIncident.sendKeys(EmployeeDoingJustBeforeIncident);
		action.selectDropdownValue(employerreport.yourEmployWhenInjured,WorkerInEmployWhenInjured);  
		employerreport.dateOfLastHire.sendKeys(DateOfLastHire);    
		
		
		// Employee's wage data
		
		employerreport.grossEarningsOfEmployee.sendKeys(GrossEarningsOfEmployeePreceedingInjury);
		
		
		// Authorized Signature
		
		employerreport.submitterEmailAddress.sendKeys(SubmitterEmailAddress);
		employerreport.FileUpload.click();
		action.fileUpload(UploadFile);
		employerreport.iAgree.click();
		employerreport.submit.click();
		
				

	}
	
	
	// Method is used to validate whether "Thank You"text is displayed once the form is submitted
	
	public boolean thankYouValidation(String expectedText)
	{
		return Validations.textValidation(employerreport.thankYou, expectedText);
	}
	
	
	public boolean importantNoteValidation(String expectedText)
	{
		return Validations.textValidation(employerreport.importantNote, expectedText);
	}
	
}
