package gov.mst.automation.ica.commonutility;

/*
	* Author	 				: Nanthini PushpaRaja
	* Created date			: Dec 08, 2018
	* Last Edited by		: Nanthini PushpaRaja
	* Last Edited date		: Dec 08, 2018
	* Description			: Class is used to define the validation actions
*/

import org.openqa.selenium.WebElement;
import java.util.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import gov.mst.automation.ica.report.Report;

public class ValidationActions {
	
	
	//	Method is used to compare two elements text value and returns the boolean value
	
	public static boolean  textValidation(WebElement element1, WebElement element2) throws Exception
	{
		boolean result = false;
		try
		{
			String expected = CommonActions.getElementText(element1);
			String actual = CommonActions.getElementText(element2);
			if(expected.equals(actual))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NoSuchElementException e)
		{
			Report.testStepStatus("Message is incorrect", "Fail", e.getMessage());
			return result;
		}
		catch(Exception e)
		{
			Report.testStepStatus("Message is incorrect", "Fail", e.getMessage());
			return result;
		}
		
	}
	
	
	//	Method is used to compare element text with expected text value and returns the boolean value
	
		public static boolean textValidation(WebElement element, String expectedValue) throws Exception
		{
			boolean result = false;
			try
			{
				String actual = CommonActions.getElementText(element);
				
				if(expectedValue.equals(actual))
				{
					return result =  true;
					
				}
				else
				{
					return result =  false;
				}
			}
			catch(NoSuchElementException e)
			{
				Report.testStepStatus("Exception while validating an element", "Fail", e.getMessage());
				return result;
			}
			catch(Exception e)
			{
				Report.testStepStatus("Exception while validating an element", "Fail", e.getMessage());
				return result;
			}
						
		}
		
		
		//		Method is used to compare two text values and returns the boolean value
		
			public static boolean textValidation(String text1, String text2) throws Exception
			{
				boolean result = false;
				try
				{
					if(text1.equals(text2))
					{
						return true;
					}
					else
					{
						return false;
					}
				}
				catch(Exception e)
				{
					Report.testStepStatus("Exception while validating an element", "Fail", e.getMessage());
					return result;
				}
			}
		
			
		// Method is used to validate the page title
			
		public static boolean pageTileValidation(WebDriver driver, String ExpectedTitle) throws Exception
		{
			boolean result = false;
			try
			{
				String actualTitle = driver.getTitle();
				if(actualTitle.equals(ExpectedTitle))
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			catch(Exception e)
			{
				Report.testStepStatus("Exception while validating an element", "Fail", e.getMessage());
				return result;
			}
		}

}
