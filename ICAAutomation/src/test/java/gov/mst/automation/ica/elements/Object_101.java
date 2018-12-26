package gov.mst.automation.ica.elements;

/*
	* Author	 				: Nanthini PushpaRaja
	* Created date			: Dec 15, 2018
	* Last Edited by		: Nanthini PushpaRaja
	* Last Edited date		: Dec 24, 2018
	* Description			: Class is used to define the elements in 101 object in Salesforce
*/ 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Object_101 {
	
	@FindBy(how = How.XPATH, using = ".//div[@class='bBottom']//child::button")
	public WebElement appLauncherIcon;
	
	@FindBy(how = How.XPATH, using = ".//h2[text()='App Launcher']")
	public WebElement appLauncherWindow;
		
	@FindBy(how = How.XPATH, using = ".//ul//child::span[text()='101']")
	public WebElement object_101;
	
	@FindBy(how = How.XPATH, using = ".//div[@id='brandBand_1']//child::h1//child::span[text()='Recently Viewed']")
	public WebElement recentlyView;;
		
	@FindBy(how = How.XPATH, using = ".//div[@id='brandBand_1']//child::h1//child::a")
	public WebElement listView;
	
	@FindBy(how = How.XPATH, using = ".//div[@class='listContent']//child::span[text()='All']")
	public WebElement list_All;
	
	@FindBy(how = How.XPATH, using = ".//div[contains(@class,'listViewContent')]//child::table/tbody/tr[1]/td[4]//a")
	public WebElement firstRecord;
	
	/*@FindBy(how = How.XPATH, using = ".//div[contains(@class,'forceListViewManagerGrid')]//child::table/tbody/tr[1]//a")
	public WebElement firstRecord;*/
	
	
	
	// EMPLOYEE
	
	@FindBy(how = How.XPATH, using = ".//span[text()='Last Name']/following::span[1]/child::span[1]")
	public WebElement lastName;
	
	@FindBy(how = How.XPATH, using = ".//span[text()='First Name']/following::span[1]/child::span[1]")
	public WebElement firstName;
	
	@FindBy(how = How.XPATH, using = ".//span[text()='Social Security Number']/following::span[2]/child::span")
	public WebElement socialSecurityNumber;
	
	@FindBy(how = How.XPATH, using = ".//span[text()='Date of Birth']/following::span[1]/child::span")
	public WebElement dateOfBirth;
	
	@FindBy(how = How.XPATH, using = ".//span[text()='Home Address']/following::span[1]/child::span")
	public WebElement homeAddress;
	
	@FindBy(how = How.XPATH, using = ".//span[text()='City']/following::span[1]/child::span")
	public WebElement homeCity;

	@FindBy(how = How.XPATH, using = ".//span[text()='State']/following::span[1]/child::span")
	public WebElement homeState;
	
	@FindBy(how = How.XPATH, using = ".//span[text()='Zip Code']/following::span[1]/child::span")
	public WebElement homeZipCode;
	
	@FindBy(how = How.XPATH, using = ".//span[text()='Telephone']/following::span[1]/child::span")
	public WebElement homeTelephone;
	
	@FindBy(how = How.XPATH, using = ".//span[text()='Sex']/following::span[1]/child::span")
	public WebElement sex;
	
	@FindBy(how = How.XPATH, using = ".//span[text()='Marital Status']/following::span[1]/child::span")
	public WebElement maritalStatus;
	
	
	
	// EMPLOYER
	
	@FindBy(how = How.XPATH, using = ".//span[text()=\"Employer's Name\"]/following::span[1]/child::span")
	public WebElement employerName;
	
	@FindBy(how = How.XPATH, using = ".//span[text()='FEIN Number']/following::span[1]/child::span")
	public WebElement feinNumber;
	
	@FindBy(how = How.XPATH, using = ".//span[text()='Office Address']/following::span[1]/child::span")
	public WebElement officeAddress;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Employer']//following::div[1]//child::span[text()='City']//following::span[1]")
	public WebElement officeCity;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Employer']//following::div[1]//child::span[text()='State']//following::span[1]")
	public WebElement officeState;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Employer']//following::div[1]//child::span[text()='Zip Code']//following::span[1]")
	public WebElement officeZipCode;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Employer']//following::div[1]//child::span[text()='Telephone']//following::span[1]")
	public WebElement officeTelephone;
	
	
	// ACCIDENT DETAILS
	
	@FindBy(how = How.XPATH , using = "//span[text()='Accident Information']//following::div[1]//child::span[text()='Date of Injury']//following::span[3]")
	public WebElement dateOfInjury;
	
	@FindBy(how = How.XPATH , using = "//span[text()='Accident Information']//following::div[1]//child::span[text()='Date Employer notified of Injury']//following::span[2]")
	public WebElement dateEmployerNotifiedofInjury;
	
	@FindBy(how = How.XPATH , using = "//span[text()='Accident Information']//following::div[1]//child::span[text()='Last Day of Work after Injury']//following::span[2]")
	public WebElement lastDayOfWorkAfterInjury;
	
	@FindBy(how = How.XPATH , using = "//span[text()='Accident Information']//following::div[1]//child::span[text()='Has Employee returned to work?']//following::img[1]")
	public WebElement employeeReturnedToWork;
			
	@FindBy(how = How.XPATH , using = "//span[text()='Accident Information']//following::div[1]//child::span[contains(text(),\"Employee's Job Title When Injured\")]//following::span[3]")
	public WebElement employeeJobTitle;
	
	@FindBy(how = How.XPATH , using = "//span[text()='Accident Information']//following::div[1]//child::span[contains(text(),'Injury occur on Employer Premises')]//following::span[2]")
	public WebElement injuryOccurOnEmployerPremises;
	
	@FindBy(how = How.XPATH , using = "//span[text()='Accident Information']//following::div[1]//child::span[contains(text(),'What was the Injury')]//following::span[3]")
	public WebElement whatWasTheInjury;
	
	@FindBy(how = How.XPATH , using = "//span[text()='Accident Information']//following::div[1]//child::span[contains(text(),'Part of Body Injured')]//following::span[2]")
	public WebElement partOfBodyInjured;
	
	@FindBy(how = How.XPATH , using = "//span[text()='Accident Information']//following::div[1]//child::span[contains(text(),'Part of Body Injured')]//following::a[1]")
	public WebElement partOfBodyLookupTable;
	
	@FindBy(how = How.XPATH , using = "//span[text()='Accident Information']//following::div[1]//child::span[contains(text(),'Fatal')]//following::span[2]")
	public WebElement fatal;
	
	@FindBy(how = How.XPATH , using = "//span[text()='Accident Information']//following::div[1]//child::span[contains(text(),'Treated in an Emergency Room')]//following::span[3]")
	public WebElement treatedInEmergencyRoom;
	
	@FindBy(how = How.XPATH , using = "//span[text()='Accident Information']//following::div[1]//child::span[contains(text(),'Hospitalized Overnight')]//following::span[3]")
	public WebElement hospitalizedOvernight;
	
	@FindBy(how = How.XPATH , using = "//span[text()='Accident Information']//following::div[1]//child::span[contains(text(),'Validity of Claim Doubted')]//following::span[2]")
	public WebElement validityOfClaimDoubted;
	
	
	
	//	CAUSE OF ACCIDENT
	
	
	@FindBy(how = How.XPATH , using = "//span[text()='Cause of Accident']//following::div[1]//child::span[contains(text(),'What Happened')]//following::span[3]")
	public WebElement whatHappened;
	
	@FindBy(how = How.XPATH , using = "//span[text()='Cause of Accident']//following::div[1]//child::span[contains(text(),'Substance That Harmed the EE')]//following::span[3]")
	public WebElement substanceHarmedTheEmployee;	
	
	@FindBy(how = How.XPATH , using = "//span[text()='Cause of Accident']//following::div[1]//child::span[contains(text(),'Nature of Injury')]//following::a[1]")
	public WebElement natureOfInjuryLookup;
	
	@FindBy(how = How.XPATH , using = "//span[text()='Cause of Accident']//following::div[1]//child::span[contains(text(),'Cause of Injury')]//following::a[1]")
	public WebElement causeOfInjuryLookup;
	
	@FindBy(how = How.XPATH , using = "//span[text()='Cause of Accident']//following::div[1]//child::span[contains(text(),'EE Doing Before Incident')]//following::span[3]")
	public WebElement employeeDoingJustBeforeIncident;	
	
	@FindBy(how = How.XPATH , using = "//span[text()='Cause of Accident']//following::div[1]//child::span[contains(text(),'your Employ When Injured')]//following::span[3]")
	public WebElement yourEmployWhenInjured;	
	
	@FindBy(how = How.XPATH , using = "//span[text()='Cause of Accident']//following::div[1]//child::span[contains(text(),'Date of Last Hire')]//following::span[2]")
	public WebElement dateOfLastHire;	
	
	
	
	//	EMPLOYEE'S WAGE DATA
	
	
	@FindBy(how = How.XPATH , using = "//span[contains(text(),'Wage Data')]//following::div[1]//child::span[contains(text(),\"Earnings for 30Days Before Injury\")]//following::span[3]")
	public WebElement grossEarningsOfEmployee;	
	
	
	
	//	AUTHORIZED SIGNATURE
	
	
	@FindBy(how = How.XPATH , using = "//span[contains(text(),'Authorized Signature')]//following::div[1]//child::span[contains(text(),\"Submitter Email\")]//following::a[1]")
	public WebElement submitterEmailAddress;
	
	
	//	Method is used to initialize and returns all the elements in object_101
	
	public static Object_101 elements(WebDriver driver)										
	{
		Object_101 elements = PageFactory.initElements(driver, Object_101.class);
		return elements;
	}
	
	
	
}
