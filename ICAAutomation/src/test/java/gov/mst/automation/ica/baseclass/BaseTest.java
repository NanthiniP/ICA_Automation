package gov.mst.automation.ica.baseclass;

/*
 	* Author	 				: Nanthini PushpaRaja
 	* Created date			: Nov 26, 2018
 	* Last Edited by		: Nanthini PushpaRaja
 	* Last Edited date		: Dec 25, 2018
 	* Description			: Class is used to execute the Pre and Post steps for the test cases
*/ 

import java.io.IOException;

import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import gov.mst.automation.ica.browserutility.BrowserUtility;
import gov.mst.automation.ica.email.EmailReport;
import gov.mst.automation.ica.report.Report;

public class BaseTest {
	
	public WebDriver driver;
	BrowserUtility browser;
	 
	
	//	Report will be initialized at the beginning of test case execution
	
	@BeforeSuite													
	public static void startReport() 
	{
		PropertyConfigurator.configure("log4j.properties");
		Report.initReport();
	}
		
	
	//  Browser will be launched at the beginning of every test class
	
	@Parameters("browserName")							
	@BeforeMethod()
	public void openBrowser(String browserName) throws Exception
	{
		browser = new BrowserUtility(browserName);
		driver = browser.openBrowser();
		
	}
		
	
	//After executing every test, browser will be closed and the result will be updated in report for the test
	
	@AfterMethod                            					
	public void checkTestAfterExecution(ITestResult result) throws IOException
	{
		browser.closeBrowser();
		Report.checkTestAfterExecution(result, driver);
	}
	
		
	//	Report will be created at the end of test case execution
	
	@AfterSuite												
	public static void tearDown() {
		Report.closeReport();
		EmailReport.send_report();
	}
	
	
}
