package gov.mst.automation.ica.elements;

/*
 	* Author	 				: Nanthini PushpaRaja
 	* Created date			: Nov 26, 2018
 	* Last Edited by		: Nanthini PushpaRaja
 	* Last Edited date		: Dec 08, 2018
 	* Description			: Class is used to define the elements in the Lookup window
 */ 

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LookupWindow {
	
	
	//  LOOKUP WINDOW
			
	
	@FindBy(how = How.XPATH , using = ".//input[@type=\"text\"]")
	public WebElement searchText;
	
	@FindBy(how = How.XPATH , using = ".//input[@name=\"go\"]")
	public WebElement goButton;

	@FindBy(how = How.XPATH , using = ".//table/tbody/tr")
	public List<WebElement> lookupItems;
	
	
	//	Method is used to initialize all the elements in the Lookup Window and returns all the elements
	
	public static LookupWindow elements(WebDriver driver)										
	{
		LookupWindow lookupWindow = PageFactory.initElements(driver, LookupWindow.class);
		return lookupWindow;
	}
	
}
