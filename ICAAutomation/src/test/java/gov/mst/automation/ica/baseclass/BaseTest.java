package gov.mst.automation.ica.baseclass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import gov.mst.automation.ica.browserutility.BrowserUtility;
import gov.mst.automation.ica.report.Report;


public class BaseTest {
	
	public static WebDriver driver;
	BrowserUtility browser;
	 
	
	@BeforeSuite
	public static void startReport() 
	{
		Report.startReport();
	}
	
	
	@AfterMethod
	public void checkTestAfterExecution(ITestResult result) throws IOException
	{
		Report.checkTestAfterExecution(result, driver);
	}
	
	
	@AfterSuite
	public static void tearDown() {
		Report.tearDown();
	}
	
	
	
	@Parameters("browsername")
	@BeforeClass()
	public void openBrowser(String browsername) throws Exception
	{
		browser = new BrowserUtility(browsername);
		driver = browser.openBrowser();
		
	}
	
	
	@AfterClass
	public void closeBrowser()
	{
		browser.closeBrowser();
	}

}
