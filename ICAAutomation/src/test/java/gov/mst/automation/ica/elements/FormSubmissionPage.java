package gov.mst.automation.ica.elements;

/*
	* Author	 				: Nanthini PushpaRaja
	* Created date			: Dec 25, 2018
	* Last Edited by		: Nanthini PushpaRaja
	* Last Edited date		: Dec 25, 2018
	* Description			: Class is used to define the elements in the Employer Report Form Submission page
*/ 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FormSubmissionPage {
	
	//	SUBMISSION PAGE
		
	@FindBy(how = How.XPATH , using = ".//p[text()=' Thank you for your submission!']")
	public WebElement thankYou;
	
	@FindBy(how = How.XPATH , using = ".//p[text()=' Thank you for your submission!']//following::td[2]")
	public WebElement importantNote;
	
	
	//	Method is used to initialize and returns all the elements in the Employer Report Form Submission page
	
	public static FormSubmissionPage elements(WebDriver driver)										
	{
		FormSubmissionPage elements = PageFactory.initElements(driver, FormSubmissionPage.class);
		return elements;
	}


}
