package gov.mst.automation.ica.pagemodel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import gov.mst.automation.ica.baseclass.BaseTest;
import gov.mst.automation.ica.constant.Constant;
import gov.mst.automation.ica.report.Report;

public class EmployersReportForm extends BaseTest {
	
	EmployersReportForm employerreport;
	
	@FindBy(how = How.ID , using = "j_id0:j_id5:j_id9:j_id14:j_id15:last")
	public WebElement LastName;
	
	@FindBy(how = How.ID , using = "j_id0:j_id5:j_id9:j_id14:j_id18:first")
	public WebElement FirstName;
	
	@FindBy(how = How.ID , using = "j_id0:j_id5:j_id9:j_id14:j_id23:social")
	public WebElement SocialSecurityNumber;
	
	@FindBy(how = How.ID , using = "j_id0:j_id5:j_id9:j_id14:j_id26:birth")
	public WebElement BirthDate;
	
	@FindBy(how = How.ID , using = "calMonthPicker")
	public WebElement Months;
	
	@FindBy(how = How.ID , using = "calYearPicker")
	public WebElement Year;
	
	@FindBy(how = How.XPATH , using = ".//*[@id='calRow5']/td[3]")
	public WebElement Day;
	
	@FindBy(how = How.ID , using = "j_id0:j_id5:j_id9:j_id14:j_id29:home")
	public WebElement HomeAddress;
	
	@FindBy(how = How.ID , using = "j_id0:j_id5:j_id9:j_id14:j_id32:CITY")
	public WebElement HomeCity;
	
	@FindBy(how = How.ID , using = "j_id0:j_id5:j_id9:j_id14:j_id35:STATE")
	public WebElement HomeState;
	
	@FindBy(how = How.ID , using = "j_id0:j_id5:j_id9:j_id14:j_id38:ZIPCODE")
	public WebElement HomeZipCode;
	
	@FindBy(how = How.ID , using = "j_id0:j_id5:j_id9:j_id14:j_id41:TELEPHONE")
	public WebElement HomeTelephone;
	
	@FindBy(how = How.ID , using = "j_id0:j_id5:j_id9:j_id14:j_id44:SEX")
	public WebElement Sex;
	
	@FindBy(how = How.ID , using = "j_id0:j_id5:j_id9:j_id14:j_id46:MARITALSTATUS")
	public WebElement MaritalStatus;
	
	@FindBy(how = How.ID , using = "j_id0:j_id5:j_id9:j_id48:j_id49:EMPLOYERNAME")
	public WebElement EmployerName;
	
	@FindBy(how = How.ID , using = "j_id0:j_id5:j_id9:j_id48:j_id52:FEINNUMBER")
	public WebElement FeinNumber;
	
	@FindBy(how = How.ID , using = "j_id0:j_id5:j_id9:j_id48:j_id57:officeadd")
	public WebElement OfficeAddress;
	
	@FindBy(how = How.ID , using = "j_id0:j_id5:j_id9:j_id48:j_id60:officecity")
	public WebElement OfficeCity;
	
	@FindBy(how = How.ID , using = "j_id0:j_id5:j_id9:j_id48:j_id63:officstate")
	public WebElement OfficeState;
	
	@FindBy(how = How.ID , using = "j_id0:j_id5:j_id9:j_id48:j_id66:officzip")
	public WebElement OfficeZipcode;
	
	@FindBy(how = How.ID , using = "j_id0:j_id5:j_id9:j_id48:j_id69:telephone")
	public WebElement OfficeTelephone;
	
	@FindBy(how = How.ID , using = "j_id0:j_id5:j_id9:j_id72:j_id73:doi")
	public WebElement InjuryIllnessDate;
	
	@FindBy(how = How.ID , using = "j_id0:j_id5:j_id9:j_id72:j_id76:empnotif")
	public WebElement EmployerInjuryNotifiedDate;
	
	@FindBy(how = How.ID , using = "j_id0:j_id5:j_id9:j_id72:j_id81:lastday")
	public WebElement LastDayWorkAfterInjury;
	
	@FindBy(how = How.ID , using = "j_id0:j_id5:j_id9:j_id72:j_id84:0")
	public WebElement EmployeeReturnedWorkYes;
	
	@FindBy(how = How.ID , using = "j_id0:j_id5:j_id9:j_id72:j_id84:1")
	public WebElement EmployeeReturnedWorkNo;
		
	@FindBy(how = How.ID , using = "j_id0:j_id5:j_id9:j_id72:j_id88:empcontri")
	public WebElement EmployeeOccupation;
	
	@FindBy(how = How.ID , using = "j_id0:j_id5:j_id9:j_id72:j_id96:empconpre")
	public WebElement EmployerPremises;
	
	@FindBy(how = How.ID , using = "j_id0:j_id5:j_id9:j_id72:j_id109:injurill")
	public WebElement WhatInjury;
	
	@FindBy(how = How.ID , using = "j_id0:j_id5:j_id9:j_id72:j_id112:partofbody")
	public WebElement PartOfBodyInjured;
	
	@FindBy(how = How.ID , using = "j_id0:j_id5:j_id9:j_id72:j_id121:fatal")
	public WebElement Fatal;
	
	@FindBy(how = How.ID , using = "j_id0:j_id5:j_id9:j_id72:j_id126:empemergency")
	public WebElement EmergencyRoom;
	
	@FindBy(how = How.ID , using = "j_id0:j_id5:j_id9:j_id72:j_id139:overnight")
	public WebElement OvernightHospitalized;
	
	@FindBy(how = How.ID , using = "j_id0:j_id5:j_id9:j_id72:j_id152")
	public WebElement ValidityofClaimDoubted;
	
	@FindBy(how = How.ID , using = "j_id0:j_id5:j_id9:j_id155:j_id156:what")
	public WebElement WhatHappened;
	
	@FindBy(how = How.ID , using = "j_id0:j_id5:j_id9:j_id155:j_id159:whatsus")
	public WebElement SubstanceHarmedTheEmployee;	
	
	@FindBy(how = How.ID , using = "j_id0:j_id5:j_id9:j_id155:j_id172:empdoing")
	public WebElement EmployeeDoingJustBeforeIncident;	
	
	@FindBy(how = How.ID , using = "j_id0:j_id5:j_id9:j_id155:j_id177:workemp")
	public WebElement InEmployWhenInjured;	
	
	@FindBy(how = How.ID , using = "j_id0:j_id5:j_id9:j_id155:j_id179:datehire")
	public WebElement DateHire;	
	
	@FindBy(how = How.ID , using = "j_id0:j_id5:j_id9:j_id181:j_id200:datehire")
	public WebElement GrossEarningsPreceedingInjury;	
	
	@FindBy(how = How.ID , using = "j_id0:j_id5:j_id9:j_id227:j_id228:subemail")
	public WebElement SubmitterEmail;
	
	@FindBy(how = How.CSS , using = "img[title='Part of Body Injured Lookup (New Window)']")
	public WebElement PartOfBodyLookup;
	
	@FindBy(how = How.CSS , using = "img[title='Nature of Injury Lookup (New Window)']")
	public WebElement NatureOfInjuryLookup;
	
	@FindBy(how = How.CSS , using = "img[title='Cause of Injury Lookup (New Window)']")
	public WebElement CauseOfInjuryLookup;
	
	@FindBy(how = How.ID , using = "lksrch")
	public WebElement SearchText;
	
	@FindBy(how = How.NAME , using = "go")
	public WebElement GoButton;
	
	@FindBy(how = How.XPATH , using = ".//*[@id='new']/div/div[3]/div/div[2]/table/tbody/tr")
	public List<WebElement> LookupItems;
	
	@FindBy(how = How.ID , using = "j_id0:j_id5:j_id9:j_id227:j_id228:subemail")
	public WebElement SubmitterEmailAddress;
	
	@FindBy(how = How.ID , using = "j_id0:j_id5:j_id9:j_id227:j_id234:j_id236")
	public WebElement FileUpload;
	
	@FindBy(how = How.NAME , using = "j_id0:j_id5:j_id9:j_id247")
	public WebElement I_Agree;
	
	@FindBy(how = How.NAME , using = "j_id0:j_id5:j_id9:j_id11:j_id13")
	public WebElement Submit;
	
	@FindBy(how = How.XPATH , using = "//*[@id=\"j_id0:j_id2:j_id3\"]/div/table/tbody/tr/td/p")
	public WebElement ThankYou;
	
	@FindBy(how = How.XPATH , using = "//*[@id=\"j_id0:j_id2:j_id6\"]/div/table/tbody/tr[2]/td")
	public WebElement ImportntNote;
	
		
	
	public void formFill(String LastName, String FirstName, String SocialSecurityNumber, String BirthDate, String HomeAddress, String HomeCity, String HomeState, String HomeZipCode, String HomeTelephone, String Sex, String MaritalStatus, String EmployerName, String FeinNumber, String OficeAddress, String OfficeCity, String OfficeState, String OficeZipCode, String OfficeTelephone, String DateOfInjury, String DateEmployerNotifiedOfInjury, String LastDayOfWorkAfterInjury, String EmployerOccupationWhenInjured, String InjuryOccursOnInjuryPremises, String WhatWasTheInjury, String PartOfBodyInjured, String PartOfBodyInjuryTable, String Fatal, String EmployeeTreatedInEmergencyRoom, String EmployeeHospitalizedOvernight, String ValidityOfClaimDoubted, String WhatHappened, String SubstanceDirectlyHarmedEmployee, String NatureOfInjury, String CauseOfInjury, String EmployeeDoingJustBeforeIncident, String WorkerInEmployWhenInjured, String DateOfLastHire, String GrossEarningsOfEmployeePreceedingInjury, String SubmitterEmailAddress, String UploadFile) throws Exception 
	{
		Report.startTest("Emloyer Report Form", "Verify filling Employer Report Form", "Nanthini", "Smoke");
		driver.get(Constant.EmpoyersReportVFPageUrl);
		employerreport = PageFactory.initElements(driver, EmployersReportForm.class);
		
		//Employee
		
		employerreport.LastName.sendKeys(LastName);  
		employerreport.FirstName.sendKeys(FirstName);  
		employerreport.SocialSecurityNumber.sendKeys(SocialSecurityNumber); 
		
		/*employerreport.BirthDate.click();  // Birth Date
		selectDropdownValue(employerreport.Months, "December");
		selectDropdownValue(employerreport.Year, "2018");
		employerreport.Day.click();*/
		
		employerreport.BirthDate.sendKeys(BirthDate);  
		
		employerreport.HomeAddress.sendKeys(HomeAddress);
		employerreport.HomeCity.sendKeys(HomeCity);
		employerreport.HomeState.sendKeys(HomeState);
		employerreport.HomeZipCode.sendKeys(HomeZipCode);
		employerreport.HomeTelephone.sendKeys(HomeTelephone);
		selectDropdownValue(employerreport.Sex, Sex);
		selectDropdownValue(employerreport.MaritalStatus, MaritalStatus);
		
		
		
		// Employer
		
		employerreport.EmployerName.sendKeys(EmployerName);
		employerreport.FeinNumber.sendKeys(FeinNumber);
		employerreport.OfficeAddress.sendKeys(OficeAddress);
		employerreport.OfficeCity.sendKeys(OfficeCity);
		employerreport.OfficeState.sendKeys(OfficeState);
		employerreport.OfficeZipcode.sendKeys(OficeZipCode);
		employerreport.OfficeTelephone.sendKeys(OfficeTelephone);
		
		
		//Accident Details
		
		
		employerreport.InjuryIllnessDate.sendKeys(DateOfInjury);   // Date Of Injury
		
			
		employerreport.EmployerInjuryNotifiedDate.sendKeys(DateEmployerNotifiedOfInjury);  // Date Employer Notified Of Injury
		
				
		employerreport.LastDayWorkAfterInjury.sendKeys(LastDayOfWorkAfterInjury);  //LastDayOfWorkAfterInjury
		
		employerreport.EmployeeReturnedWorkNo.click();
		
		employerreport.EmployeeOccupation.sendKeys(EmployerOccupationWhenInjured);			// Employer's Occupation When Injured
		selectDropdownValue(employerreport.EmployerPremises,InjuryOccursOnInjuryPremises);		//Injury Occurs On Injury Premises
		employerreport.WhatInjury.sendKeys(WhatWasTheInjury);			// What Was The Injury
		employerreport.PartOfBodyInjured.sendKeys(PartOfBodyInjured);			//Part Of Body Injured	
		lookup(employerreport.PartOfBodyLookup,PartOfBodyInjuryTable);			// Part Of Body Injury Table
		selectDropdownValue(employerreport.Fatal,Fatal);		// Fatal
		selectDropdownValue(employerreport.EmergencyRoom,EmployeeTreatedInEmergencyRoom);		//EmployeeTreatedInEmergencyRoom
		selectDropdownValue(employerreport.OvernightHospitalized,EmployeeHospitalizedOvernight);  //EmployeeHospitalizedOvernight
		selectDropdownValue(employerreport.ValidityofClaimDoubted,ValidityOfClaimDoubted);		//ValidityOfClaimDoubted
		
		
		//Cause of Accident
		
		employerreport.WhatHappened.sendKeys(WhatHappened);
		employerreport.SubstanceHarmedTheEmployee.sendKeys(SubstanceDirectlyHarmedEmployee);  //Substance Directly Harmed Employee
		lookup(employerreport.NatureOfInjuryLookup,NatureOfInjury);
		lookup(employerreport.CauseOfInjuryLookup,CauseOfInjury);
		employerreport.EmployeeDoingJustBeforeIncident.sendKeys(EmployeeDoingJustBeforeIncident);
		selectDropdownValue(employerreport.InEmployWhenInjured,WorkerInEmployWhenInjured);  //WorkerInEmployWhenInjured
							
		employerreport.DateHire.sendKeys(DateOfLastHire);    // Date Of Last Hire
		
		// Employee's wage data
		
		employerreport.GrossEarningsPreceedingInjury.sendKeys(GrossEarningsOfEmployeePreceedingInjury);
		
		
		// Authorized Signature
		
		employerreport.SubmitterEmail.sendKeys(SubmitterEmailAddress);
		
		employerreport.FileUpload.click();
		fileUpload(UploadFile);
		
		employerreport.I_Agree.click();
		employerreport.Submit.click();
		
		
		Report.testStepStatus("FormFilled", "Pass", "Filled the values in all the fields");

	}
	
	
	public boolean thankyouValidation()
	{
		boolean result = textValidation(employerreport.ThankYou, "Thank you for your submission!");
		return result;
	}
	
	public boolean importantNotevalidation()
	{
		boolean result = textValidation(employerreport.ThankYou, "IMPORTANT NOTE: THIS FORM IS NOT CONSIDERED SUBMITTED AND WILL NOT BE PROCESSED BY THE INDUSTRIAL COMMISSION OF ARIZONA UNTIL SIGNED. TO COMPLETE THE ELECTRONIC SIGNATURE PROCESS, FOLLOW THE INSTRUCTIONS SENT TO THE E-MAIL ADDRESS YOU PROVIDED. THE ELECTRONIC SIGNATURE PROCESS WILL BE AVAILABLE FOR 7 DAYS AFTER A FORM IS SUBMITTED.");
		return result;
	}
	
	public void fileUpload(String UploadFilePath) throws AWTException, InterruptedException
	{
		StringSelection uploadfile = new StringSelection(UploadFilePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(uploadfile, null);
		
		Robot robot = new Robot();
		
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_V);
				
		Thread.sleep(1000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyRelease(KeyEvent.VK_V);
				
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	
	
	void lookup(WebElement LookupField, String lookupvalue)
	{
		LookupField.click();
		Set<String> windows = driver.getWindowHandles();
		for(String window:windows)
		{
			String Currentwindow = driver.getWindowHandle();
			if(!(window.equals(Currentwindow)))
			{
				driver.switchTo().window(window);
				driver.switchTo().frame("searchFrame");
				employerreport.SearchText.sendKeys(lookupvalue);
				employerreport.GoButton.click();
				driver.switchTo().defaultContent();
				driver.switchTo().frame("resultsFrame");
				int totalitems = employerreport.LookupItems.size();
				for(int n=1;n<=totalitems;n++)
				{
					String actual = driver.findElement(By.xpath(".//*[@id='new']/div/div[3]/div/div[2]/table/tbody/tr["+n+"]/th")).getText();
					if(actual.equals(lookupvalue))
					{
						driver.findElement(By.xpath(".//*[@id='new']/div/div[3]/div/div[2]/table/tbody/tr["+n+"]/th/a")).click();
						driver.switchTo().window(Currentwindow);
						break;
					}
				}
				
			}
		}
	}
	
	
	public void selectDropdownValue(WebElement DropdownElement, String DropdownValue)
	{
		Select s = new Select(DropdownElement); 
		s.selectByVisibleText(DropdownValue);
	}
	
	
	public boolean textValidation(WebElement ElementName, String ExpectedValue)
	{
		String Actual = ElementName.getText();
		if(ExpectedValue.equals(Actual))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
}
