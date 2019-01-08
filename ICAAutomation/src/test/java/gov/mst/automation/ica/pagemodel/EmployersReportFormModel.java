package gov.mst.automation.ica.pagemodel;

/*
	* Author	 				: Nanthini PushpaRaja
	* Created date			: Nov 26, 2018
	* Last Edited by		: Nanthini PushpaRaja
	* Last Edited date		: Dec 25, 2018
	* Description			: Class is used to define the actions for Employer Report Form
*/ 

import org.openqa.selenium.WebDriver;
import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import gov.mst.automation.ica.commonutility.CommonActions;
import gov.mst.automation.ica.commonutility.ValidationActions;
import gov.mst.automation.ica.constant.Constants;
import gov.mst.automation.ica.elements.EmployerReportForm;
import gov.mst.automation.ica.report.Log;
import gov.mst.automation.ica.report.Report;
import java.util.Set;
import org.openqa.selenium.By;

public class EmployersReportFormModel  {
		
	WebDriver driver;
	 EmployerReportForm employerReportForm;
		
	 
	// Constructor is used to initialize the browser
	
	public EmployersReportFormModel(WebDriver driver)
	{
		this.driver = driver;
		employerReportForm = EmployerReportForm.elements(driver);
	}
		
	
	// Method is used to fill the Employer Report Form
	
	public void formFill(String LastName, String FirstName, String SocialSecurityNumber, String BirthDate, String HomeAddress, String HomeCity, String HomeState, String HomeZipCode, String HomeTelephone, String Sex, String MaritalStatus, String EmployerName, String FeinNumber, String OfficeAddress, String OfficeCity, String OfficeState, String OfficeZipCode, String OfficeTelephone, String DateOfInjury, String DateEmployerNotifiedOfInjury, String LastDayOfWorkAfterInjury, String EmployerOccupationWhenInjured, String InjuryOccursOnInjuryPremises, String WhatWasTheInjury, String PartOfBodyInjured, String PartOfBodyInjuryTable, String Fatal, String EmployeeTreatedInEmergencyRoom, String EmployeeHospitalizedOvernight, String ValidityOfClaimDoubted, String WhatHappened, String SubstanceDirectlyHarmedEmployee, String NatureOfInjury, String CauseOfInjury, String EmployeeDoingJustBeforeIncident, String WorkerInEmployWhenInjured, String DateOfLastHire, String GrossEarningsOfEmployeePreceedingInjury, String SubmitterEmailAddress, String UploadFile) throws Exception 
	{
				
		driver.get(Constants.empoyersReportFormUrl);
		
		try {

			// Employee
			
			
			employerReportForm.lastName.sendKeys(LastName);
			Log.info("Last name entered");

			employerReportForm.firstName.sendKeys(FirstName);
			Log.info("First name entered");

			employerReportForm.socialSecurityNumber.sendKeys(SocialSecurityNumber);
			Log.info("Social Security Number entered");

			employerReportForm.birthDate.sendKeys(BirthDate);
			Log.info("Birth date entered");

			employerReportForm.homeAddress.sendKeys(HomeAddress);
			Log.info("HomeAddress entered");

			employerReportForm.homeCity.sendKeys(HomeCity);
			Log.info("HomeCity entered");

			employerReportForm.homeState.sendKeys(HomeState);
			Log.info("HomeState entered");

			employerReportForm.homeZipCode.sendKeys(HomeZipCode);
			Log.info("HomeZipCode entered");

			employerReportForm.homeTelephone.sendKeys(HomeTelephone);
			Log.info("HomeTelephone entered");

			CommonActions.selectDropdownValue(employerReportForm.sex, Sex);
			Log.info("Sex entered");

			CommonActions.selectDropdownValue(employerReportForm.maritalStatus, MaritalStatus);
			Log.info("MaritalStatus entered");

			
			// Employer

			
			employerReportForm.employerName.sendKeys(EmployerName);
			Log.info("EmployerName entered");

			employerReportForm.feinNumber.sendKeys(FeinNumber);
			Log.info("FeinNumber entered");

			employerReportForm.officeAddress.sendKeys(OfficeAddress);
			Log.info("OfficeAddress entered");

			employerReportForm.officeCity.sendKeys(OfficeCity);
			Log.info("OfficeCity entered");

			employerReportForm.officeState.sendKeys(OfficeState);
			Log.info("OfficeState entered");

			employerReportForm.officeZipcode.sendKeys(OfficeZipCode);
			Log.info("OfficeZipCode entered");

			employerReportForm.officeTelephone.sendKeys(OfficeTelephone);
			Log.info("OfficeTelephone entered");

			
			// Accident Details

			
		   employerReportForm.dateOfInjury.sendKeys(DateOfInjury);
			Log.info("DateOfInjury entered");
			
			 employerReportForm.dateEmployerNotifiedofInjury.sendKeys(DateEmployerNotifiedOfInjury);
			Log.info("DateEmployerNotifiedOfInjury entered");

			employerReportForm.lastDayOfWorkAfterInjury.sendKeys(LastDayOfWorkAfterInjury);
			Log.info("LastDayOfWorkAfterInjury entered");
			
			CommonActions.pressEscape();

			employerReportForm.employeeReturnedToWorkNo.click();
			Log.info("employeeReturnedToWorkNo selected");

			employerReportForm.employeeOccupation.sendKeys(EmployerOccupationWhenInjured);
			Log.info("EmployerOccupationWhenInjured entered");

			CommonActions.selectDropdownValue(employerReportForm.injuryOccurOnEmployerPremises, InjuryOccursOnInjuryPremises);
			Log.info("injuryOccurOnEmployerPremises entered");

			employerReportForm.whatWasTheInjury.sendKeys(WhatWasTheInjury);
			Log.info("WhatWasTheInjury entered");

			employerReportForm.partOfBodyInjured.sendKeys(PartOfBodyInjured);
			Log.info("PartOfBodyInjured entered");

			CommonActions.lookup(driver, employerReportForm.partOfBodyLookupTable, PartOfBodyInjuryTable);
			Log.info("partOfBodyLookupTable entered");

			CommonActions.selectDropdownValue(employerReportForm.fatal, Fatal);
			Log.info("Fatal entered");

			CommonActions.selectDropdownValue(employerReportForm.treatedInEmergencyRoom, EmployeeTreatedInEmergencyRoom);
			Log.info("EmployeeTreatedInEmergencyRoom entered");

			CommonActions.selectDropdownValue(employerReportForm.hospitalizedOvernight, EmployeeHospitalizedOvernight);
			Log.info("EmployeeHospitalizedOvernight entered");

			CommonActions.selectDropdownValue(employerReportForm.validityOfClaimDoubted, ValidityOfClaimDoubted);
			Log.info("ValidityOfClaimDoubted entered");

			
			// Cause of Accident

			
			employerReportForm.whatHappened.sendKeys(WhatHappened);
			Log.info("WhatHappened entered");

			employerReportForm.substanceHarmedTheEmployee.sendKeys(SubstanceDirectlyHarmedEmployee);
			Log.info("SubstanceDirectlyHarmedEmployee entered");

			CommonActions.lookup(driver, employerReportForm.natureOfInjuryLookup, NatureOfInjury);
			Log.info("NatureOfInjury entered");

			CommonActions.lookup(driver, employerReportForm.causeOfInjuryLookup, CauseOfInjury);
			Log.info("CauseOfInjury entered");

			employerReportForm.employeeDoingJustBeforeIncident.sendKeys(EmployeeDoingJustBeforeIncident);
			Log.info("EmployeeDoingJustBeforeIncident entered");

			CommonActions.selectDropdownValue(employerReportForm.yourEmployWhenInjured, WorkerInEmployWhenInjured);
			Log.info("WorkerInEmployWhenInjured entered");

			employerReportForm.dateOfLastHire.sendKeys(DateOfLastHire);
			Log.info("DateOfLastHire entered");

			
			// Employee's wage data

			
			employerReportForm.grossEarningsOfEmployee.sendKeys(GrossEarningsOfEmployeePreceedingInjury);
			Log.info("GrossEarningsOfEmployeePreceedingInjury entered");

			
			// Authorized Signature

			employerReportForm.submitterEmailAddress.sendKeys(SubmitterEmailAddress);
			Log.info("SubmitterEmailAddress entered");

			employerReportForm.FileUpload.click();
			CommonActions.fileUpload(UploadFile);
			Log.info("UploadFile done");

			employerReportForm.iAgree.click();
			Log.info("I Agree checked");

			employerReportForm.submit.click();
			Log.info("Submit button clicked");

			
			// Result Update
			
			Report.testStepStatus("All the values are entered in Employer Report Form successfully", "Pass", "");
			
		}
		catch (ElementNotFoundException e) 
		{
			Report.testStepStatus("Exception while filling the Employer Report Form", "Fail", e.getMessage());
		} 
		catch (Exception e) 
		{
			Report.testStepStatus("Exception while filling the Employer Report Form", "Fail", e.getMessage());
		}

	}
	
	
	// Method is used to check the items on click "ParOfBody link
	
	public void links(String item1, String item2,  String item3, String item4, String item5, String item6, String item7, String item8, String item9, String item10, String item11, String item12) throws Exception
	{
		driver.get(Constants.empoyersReportFormUrl);
		employerReportForm.partOfBodyLink.click();
		Log.info("Part Of Body link clicked");
		
		String currentWindow = driver.getWindowHandle();

		Set<String> windows = driver.getWindowHandles();
		Log.info("Get all the browser windows");

		for (String window : windows) {

			if (!(window.equals(currentWindow))) {

				driver.switchTo().window(window);
				Log.info("Tab to next window");

				int totalitems = employerReportForm.tableItems.size();
				Log.info("Got all the table items");

				String item[] = { item1, item2, item3, item4, item5, item6, item7, item8, item9, item10, item11,
						item12 };

				for (int n = 1; n < totalitems; n++) {
					String actual = driver.findElement(By.xpath(".//table//tr[" + n + "]/td[1]/span")).getText();
					String expected = item[n - 1];

					if (actual.equals(expected)) {
						Report.testStepStatus("Both items are same", "Pass", "");
						Log.info("Values same");
					} else {
						Report.testStepStatus("Items difered", "Fail",
								"Expected : " + expected + "  Actual : " + actual);
						Log.info("Vales not same");
					}

				}

				driver.close();

				break;
			}

		}

		driver.switchTo().window(currentWindow);

	}
	
	
	// Method is used to check the error message for mandatory field
	
	public void requiredFieldValidation() throws Exception
	{
		
		driver.get(Constants.empoyersReportFormUrl);
		Log.info("Url navigated");
		
		employerReportForm.submit.click();
		Log.info("Submit button clicked");
		
		String actual = employerReportForm.lastNameRequiredFieldError.getText();
		Log.info("Got the actual text");
		
		String expected = "Error: You must enter a value";
		
		ValidationActions.textValidation(actual, expected);
		Log.info("Validation done");
		
		Report.testStepStatus("Showing error to enter the value in mandatory field", "Pass", "");
		
	}

}
