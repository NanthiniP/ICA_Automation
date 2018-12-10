package gov.mst.automation.ica.commonutility;

import org.openqa.selenium.WebDriver;

/*
	* Author	 				: Nanthini PushpaRaja
	* Created date			: Dec 08, 2018
	* Last Edited by		: Nanthini PushpaRaja
	* Last Edited date		: Dec 08, 2018
	* Description			: Class is used to define the validation actions
*/

import org.openqa.selenium.WebElement;

public class ValidationActions {
	
	
	//	Method is used to compare two elements text value and returns the boolean value
	
	public static boolean  textValidation(WebElement element1, WebElement element2)
	{
		String expected = element1.getText();
		String actual = element2.getText();
		if(expected.equals(actual))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	//	Method is used to compare element text with expected text value and returns the boolean value
	
		public static boolean textValidation(WebElement element, String expectedValue)
		{
			String actual = element.getText();
			if(expectedValue.equals(actual))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		
		//		Method is used to compare two text values and returns the boolean value
		
			public static boolean textValidation(String text1, String text2)
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
		
			
		// Method is used to validate the page title
			
		public static boolean pageTileValidation(WebDriver driver, String ExpectedTitle)
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

}
