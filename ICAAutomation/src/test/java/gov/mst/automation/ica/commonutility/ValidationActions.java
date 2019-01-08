package gov.mst.automation.ica.commonutility;

/*
	* Author	 				: Nanthini PushpaRaja
	* Created date			: Dec 08, 2018
	* Last Edited by		: Nanthini PushpaRaja
	* Last Edited date		: Dec 24, 2018
	* Description			: Class is used to define the validation actions
*/

import org.openqa.selenium.WebElement;
import java.util.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import gov.mst.automation.ica.report.Log;
import gov.mst.automation.ica.report.Report;

public class ValidationActions {
	
	
	//	Method is used to compare two elements text value and returns the boolean value
			
	public static boolean  textValidation(WebElement element1, WebElement element2) throws Exception
	{
		boolean result = false;
		try
		{
			String expected = element1.getText();
			Log.info("Got the text value from an element1");
			
			String actual = element2.getText();
			Log.info("Got the text value from an element2");
			
			if(expected.equals(actual))
			{
				Log.info("Both values same, returns True");
				return true;
			}
			else
			{
				Log.info("Both values not same, returns False");
				return false;
			}
		}
		catch(NoSuchElementException e)
		{
			Report.testStepStatus("Exception while finding an element", "Fail", e.getMessage());
			return result;
		}
		catch(Exception e)
		{
			Report.testStepStatus("Exception while validating text", "Fail", e.getMessage());
			return result;
		}
		
	}
	
	
	//	Method is used to compare element text with expected text value and returns the boolean value
	
		public static boolean textValidation(WebElement element, String expectedValue) throws Exception
		{
			boolean result = false;
			try
			{
				String actual = element.getText();
				Log.info("Got the text value from an element");
				
				if(expectedValue.equals(actual))
				{
					Log.info("Both values same, returns True");
					return result =  true;
					
				}
				else
				{
					Log.info("Both values not same, returns False");
					return result =  false;
				}
			}
			catch(NoSuchElementException e)
			{
				Report.testStepStatus("Exception while finding an element", "Fail", e.getMessage());
				return result;
			}
			catch(Exception e)
			{
				Report.testStepStatus("Exception while validating text", "Fail", e.getMessage());
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
						Log.info("Both values same. returns true");
						return true;
					}
					else
					{
						Log.info("Both values not same. returns false");
						return false;
					}
				}
				catch(Exception e)
				{
					Report.testStepStatus("Exception while validating text", "Fail", e.getMessage());
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
				Log.info("Got the page title");
				
				if(actualTitle.equals(ExpectedTitle))
				{
					Log.info("Both values same. returns true");
					return true;
				}
				else
				{
					Log.info("Both values not same. returns false");
					return false;
				}
			}
			catch(Exception e)
			{
				Report.testStepStatus("Exception while validating the page title", "Fail", e.getMessage());
				return result;
			}
		}
		
		
		// Method is used to validate whether element is displayed in web page and returns the boolean values
		
		public static boolean elementDisplayed(WebDriver driver, WebElement element) throws Exception
		{
			boolean result = false;
			try
			{
				
				Thread.sleep(10000);			
				result = element.isDisplayed();
				Log.info("Got the result for whether element is displayed");
				
				if(result==true)
				{
					Log.info("Both values same, returns True");
					return true;
				}
				else
				{
					Log.info("Both values not same, returns False");
					return false;
				}
			}
			catch(NoSuchElementException e)
			{
				Report.testStepStatus("Exception while finding an element", "Fail", e.getMessage());
				return result;
			}
			catch(Exception e)
			{
				Report.testStepStatus("Exception while validating the element", "Fail", e.getMessage());
				return result;
			}
			
		}
		
		
		
}
