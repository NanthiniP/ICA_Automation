package gov.mst.automation.ica.browserutility;

/*
	* Author	 				: Nanthini PushpaRaja
	* Created date			: Nov 26, 2018
	* Last Edited by		: Nanthini PushpaRaja
	* Last Edited date		: Nov 26, 2018
	* Description			: Class is used to define the actions for browser
*/ 


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import gov.mst.automation.ica.commonutility.Log;
import gov.mst.automation.ica.constant.Constants;

public class BrowserUtility {
	
	
	WebDriver driver;
	String browserName;
	
	//	Constructor is used to get the browser name which the user needs to work
	
	public BrowserUtility(String browserName)						
	{
		this.browserName = browserName;
	}
	
		
	//	Method is used to launch the browser
	
	public WebDriver openBrowser() throws Exception					
	{
		if(browserName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", Constants.chromePath);
			driver = new ChromeDriver();
			Log.info("Browser launched");
			
		}
		else if(browserName.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", Constants.iePath);
			driver = new InternetExplorerDriver();
			Log.info("Browser launched");
			
		}
		else if(browserName.equalsIgnoreCase("Firefox"))
		{
			driver = new FirefoxDriver();
			Log.info("Browser launched");
			
		}
		else
		{
			Log.info("Invalid browser name");
			throw new Exception("Invalid Browser Name");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Log.info("Implicit wait applied to browser with 20 seconds");
		return driver;
	}
	
	
	//	Method is used to close the browser
	
	public void closeBrowser()										
	{
		driver.close();
		Log.info("Browser closed");
	}

}
