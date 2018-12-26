package gov.mst.automation.ica.elements;

/*
 	* Author	 				: Nanthini PushpaRaja
 	* Created date			: Nov 26, 2018
 	* Last Edited by		: Nanthini PushpaRaja
 	* Last Edited date		: Dec 08, 2018
 	* Description			: Class is used to define the elements in the Employer Report Form
 */ 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EmployerReportForm {
	  
																				
	//	EMPLOYEE			
		
	
	@FindBy(how = How.XPATH , using = ".//h3[text()='EMPLOYEE']//following::label[contains(text(),'LAST NAME')]/following::input[1]")
	public WebElement lastName;
	
	@FindBy(how = How.XPATH , using = ".//h3[text()='EMPLOYEE']//following::label[contains(text(),'FIRST')]/following::input[1]")
	public WebElement firstName;
	
	@FindBy(how = How.XPATH , using = ".//h3[text()='EMPLOYEE']//following::label[contains(text(),'SOCIAL SECURITY NUMBER')]/following::input[1]")
	public WebElement socialSecurityNumber;
	
	@FindBy(how = How.XPATH , using = ".//h3[text()='EMPLOYEE']//following::label[contains(text(),'BIRTH DATE')]/following::input[1]")
	public WebElement birthDate;
	
	@FindBy(how = How.XPATH , using = ".//h3[text()='EMPLOYEE']//following::label[contains(text(),'HOME ADDRESS')]/following::input[1]")
	public WebElement homeAddress;
	
	@FindBy(how = How.XPATH , using = ".//h3[text()='EMPLOYEE']//following::label[contains(text(),'CITY')]/following::input[1]")
	public WebElement homeCity;
	
	@FindBy(how = How.XPATH , using = ".//h3[text()='EMPLOYEE']//following::label[contains(text(),'STATE')]/following::input[1]")
	public WebElement homeState;
	
	@FindBy(how = How.XPATH , using = ".//h3[text()='EMPLOYEE']//following::label[contains(text(),'ZIP CODE')]/following::input[1]")
	public WebElement homeZipCode;
	
	@FindBy(how = How.XPATH , using = ".//h3[text()='EMPLOYEE']//following::label[contains(text(),'TELEPHONE')]/following::input[1]")
	public WebElement homeTelephone;
	
	@FindBy(how = How.XPATH , using = ".//h3[text()='EMPLOYEE']//following::label[contains(text(),'SEX')]/following::select[1]")
	public WebElement sex;
	
	@FindBy(how = How.XPATH , using = ".//h3[text()='EMPLOYEE']//following::label[contains(text(),'MARITAL STATUS')]/following::select[1]")
	public WebElement maritalStatus;
	
	
	
	//	EMPLOYER
	
	
	@FindBy(how = How.XPATH , using = ".//h3[text()='EMPLOYER']//following::label[contains(text(),\"EMPLOYER'S NAME\")]/following::input[1]")
	public WebElement employerName;
	
	@FindBy(how = How.XPATH , using = ".//h3[text()='EMPLOYER']//following::label[contains(text(),\"FEIN NUMBER\")]/following::input[1]")
	public WebElement feinNumber;
	
	@FindBy(how = How.XPATH , using = ".//h3[text()='EMPLOYER']//following::label[contains(text(),\"OFFICE ADDRESS\")]/following::input[1]")
	public WebElement officeAddress;
	
	@FindBy(how = How.XPATH , using = ".//h3[text()='EMPLOYER']//following::label[contains(text(),\"CITY\")]/following::input[1]")
	public WebElement officeCity;
	
	@FindBy(how = How.XPATH , using = ".//h3[text()='EMPLOYER']//following::label[contains(text(),\"STATE\")]/following::input[1]")
	public WebElement officeState;
	
	@FindBy(how = How.XPATH , using = ".//h3[text()='EMPLOYER']//following::label[contains(text(),\"ZIP CODE\")]/following::input[1]")
	public WebElement officeZipcode;
	
	@FindBy(how = How.XPATH , using = ".//h3[text()='EMPLOYER']//following::label[contains(text(),\"TELEPHONE\")]/following::input[1]")
	public WebElement officeTelephone;
	
	
	
	//	ACCIDENT DETAILS
	
	
	@FindBy(how = How.XPATH , using = ".//h3[text()='ACCIDENT DETAILS']//following::label[contains(text(),\"DATE OF INJURY\")]/following::input[1]")
	public WebElement dateOfInjury;
	
	@FindBy(how = How.XPATH , using = ".//h3[text()='ACCIDENT DETAILS']//following::label[contains(text(),\"DATE EMPLOYER NOTIFIED OF INJURY\")]/following::input[1]")
	public WebElement dateEmployerNotifiedofInjury;
	
	@FindBy(how = How.XPATH , using = ".//h3[text()='ACCIDENT DETAILS']//following::label[contains(text(),\"LAST DAY OF WORK AFTER INJURY\")]/following::input[1]")
	public WebElement lastDayOfWorkAfterInjury;
	
	@FindBy(how = How.XPATH , using = ".//h3[text()='ACCIDENT DETAILS']//following::label[contains(text(),\"EMPLOYEE RETURNED TO WORK\")]/following::input[@value='True']")
	public WebElement employeeReturnedToWorkYes;
	
	@FindBy(how = How.XPATH , using = ".//h3[text()='ACCIDENT DETAILS']//following::label[contains(text(),\"EMPLOYEE RETURNED TO WORK\")]/following::input[@value='False']")
	public WebElement employeeReturnedToWorkNo;
		
	@FindBy(how = How.XPATH , using = ".//h3[text()='ACCIDENT DETAILS']//following::label[contains(text(),\"EMPLOYEE'S OCCUPATION\")]/following::input[1]")
	public WebElement employeeOccupation;
	
	@FindBy(how = How.XPATH , using = ".//h3[text()='ACCIDENT DETAILS']//following::label[contains(text(),\"INJURY OCCUR ON EMPLOYER PREMISES\")]/following::select[1]")
	public WebElement injuryOccurOnEmployerPremises;
	
	@FindBy(how = How.XPATH , using = ".//h3[text()='ACCIDENT DETAILS']//following::label[contains(text(),\"WHAT WAS THE INJURY\")]/following::textarea[1]")
	public WebElement whatWasTheInjury;
	
	@FindBy(how = How.XPATH , using = ".//h3[text()='ACCIDENT DETAILS']//following::label[contains(text(),'PART OF BODY INJURED')]/following::input[1]")
	public WebElement partOfBodyInjured;
	
	@FindBy(how = How.XPATH , using = ".//h3[text()='ACCIDENT DETAILS']//following::label[contains(text(),'PART OF BODY INJURED')]/following::img[@class='lookupIcon']")
	public WebElement partOfBodyLookupTable;
	
	@FindBy(how = How.XPATH , using = ".//h3[text()='ACCIDENT DETAILS']//following::label[contains(text(),'FATAL')]/following::select[1]")
	public WebElement fatal;
	
	@FindBy(how = How.XPATH , using = ".//h3[text()='ACCIDENT DETAILS']//following::label[contains(text(),'ROOM')]/following::select[1]")
	public WebElement treatedInEmergencyRoom;
	
	@FindBy(how = How.XPATH , using = ".//h3[text()='ACCIDENT DETAILS']//following::label[contains(text(),'HOSPITALIZED OVERNIGHT')]/following::select[1]")
	public WebElement hospitalizedOvernight;
	
	@FindBy(how = How.XPATH , using = ".//h3[text()='ACCIDENT DETAILS']//following::label[contains(text(),'CLAIM DOUBTED')]/following::select[1]")
	public WebElement validityOfClaimDoubted;
	
	
	
	//	CAUSE OF ACCIDENT
	
	
	@FindBy(how = How.XPATH , using = ".//h3[text()='CAUSE OF ACCIDENT']//following::label[contains(text(),'WHAT HAPPENED')]/following::textarea[1]")
	public WebElement whatHappened;
	
	@FindBy(how = How.XPATH , using = ".//h3[text()='CAUSE OF ACCIDENT']//following::label[contains(text(),'SUBSTANCE DIRECTLY HARMED')]/following::textarea[1]")
	public WebElement substanceHarmedTheEmployee;	
	
	@FindBy(how = How.XPATH , using = ".//h3[text()='CAUSE OF ACCIDENT']//following::label[contains(text(),'NATURE OF INJURY')]/following::img[@class=\"lookupIcon\"]")
	public WebElement natureOfInjuryLookup;
	
	@FindBy(how = How.XPATH , using = ".//h3[text()='CAUSE OF ACCIDENT']//following::label[contains(text(),'CAUSE OF INJURY')]/following::img[@class=\"lookupIcon\"]")
	public WebElement causeOfInjuryLookup;
	
	@FindBy(how = How.XPATH , using = ".//h3[text()='CAUSE OF ACCIDENT']//following::label[contains(text(),'DOING JUST BEFORE THE INCIDENT')]/following::textarea[1]")
	public WebElement employeeDoingJustBeforeIncident;	
	
	@FindBy(how = How.XPATH , using = ".//h3[text()='CAUSE OF ACCIDENT']//following::label[contains(text(),'YOUR EMPLOY WHEN INJURED')]/following::select[1]")
	public WebElement yourEmployWhenInjured;	
	
	@FindBy(how = How.XPATH , using = ".//h3[text()='CAUSE OF ACCIDENT']//following::label[contains(text(),'DATE OF LAST HIRE')]/following::input[1]")
	public WebElement dateOfLastHire;	
	
	
	
	//	EMPLOYEE'S WAGE DATA
	
	
	@FindBy(how = How.XPATH , using = ".//h3[contains(text(),'WAGE DATA')]//following::label[contains(text(),'GROSS EARNINGS OF EMPLOYEE')]/following::input[1]")
	public WebElement grossEarningsOfEmployee;	
	
	
	
	//	AUTHORIZED SIGNATURE
	
	
	@FindBy(how = How.XPATH , using = ".//h3[text()='AUTHORIZED SIGNATURE']//following::label[contains(text(),\"SUBMITTER EMAIL ADDRESS\")]/following::input[1]")
	public WebElement submitterEmailAddress;
			
	@FindBy(how = How.XPATH , using = ".//h3[text()='AUTHORIZED SIGNATURE']//following::label[contains(text(),'UPLOAD FILE')]/following::input[1]")
	public WebElement FileUpload;
	
	@FindBy(how = How.XPATH , using = ".//h3[text()='AUTHORIZED SIGNATURE']//following::p[text()='I agree']//preceding::input[@type=\"checkbox\"]")
	public WebElement iAgree;
	
	@FindBy(how = How.XPATH , using = ".//h3[text()='AUTHORIZED SIGNATURE']//following::input[@type='submit']")
	public WebElement submit;
		
		
	// EROR MESSAGE
	
	@FindBy(how = How.XPATH , using = ".//ul[@role='alert']/li[1]")
	public WebElement ErrorMessageList;
	
	
	//	Method is used to initialize and returns all the elements in the Employer Report Form
	
	public static EmployerReportForm elements(WebDriver driver)										
	{
		EmployerReportForm elements = PageFactory.initElements(driver, EmployerReportForm.class);
		return elements;
	}

	
}
