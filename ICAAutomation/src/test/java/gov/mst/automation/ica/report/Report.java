package gov.mst.automation.ica.report;

/*
 	* Author	 				: Nanthini PushpaRaja
 	* Created date			: Nov 26, 2018
 	* Last Edited by		: Nanthini PushpaRaja
 	* Last Edited date		: Dec 08, 2018
 	* Description			: Class is used to define the methods for common actions for the project
*/ 

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class Report {

	static ExtentHtmlReporter extentHtmlReporter;
	static ExtentReports extentReport;
	static ExtentTest parentTest;
	static ExtentTest childTest;
		
	
	// Method is used to initialize the report
	
	public static void initReport() 
	{
		String projectRootDirectory = System.getProperty("user.dir");
		extentHtmlReporter = new ExtentHtmlReporter(projectRootDirectory+"\\src\\test\\resources\\Reports\\extentreport.html");
		extentReport = new ExtentReports();
		extentReport.attachReporter(extentHtmlReporter);
		
		extentReport.setSystemInfo("OS", "Windows");
		extentReport.setSystemInfo("Environment", "QA");
		extentReport.setSystemInfo("Username", "Manual tester");
		extentReport.setSystemInfo("Selenium Version", "3.0");
		extentReport.setSystemInfo("Java Version", "1.8");
		
		extentHtmlReporter.config().setDocumentTitle("Automation Report");
		extentHtmlReporter.config().setReportName("Demo");
		extentHtmlReporter.config().setTestViewChartLocation(ChartLocation.BOTTOM);
		extentHtmlReporter.config().setTheme(Theme.STANDARD);
	}
	
	
	// Method is used to create the test name in the report
	
	public static void startTest(String testId, String description, String author, String testCategory)
	{
		parentTest = extentReport.createTest(testId, description);
		parentTest.assignAuthor(author);
		parentTest.assignCategory(testCategory);
	}
	
	
	// Method is used to create the test step in the report
	
	public static void testStepStatus(String testStep, String status, String description) throws Exception
	{
		childTest = parentTest.createNode(testStep);
		
		if(status.equalsIgnoreCase("Pass"))
		{
			childTest.log(Status.PASS, description);
		}
		else if(status.equalsIgnoreCase("Fail"))
		{
			childTest.log(Status.FAIL, description);
		}
		else if(status.equalsIgnoreCase("Skip"))
		{
			childTest.log(Status.SKIP, description);
		}
		else if(status.equalsIgnoreCase("Info"))
		{
			childTest.log(Status.INFO, description);
		}
		else
		{
			throw new Exception("Invalid Status");
		}
		
	}
	
	
	// Method is used to evaluate whether the test is passed or failed and send the status to report
		
	public static void checkTestAfterExecution(ITestResult result, WebDriver driver) throws IOException {
		String methodName = result.getMethod().getMethodName();
		
		if(result.getStatus()==ITestResult.SUCCESS) {
			parentTest.log(Status.PASS,	MarkupHelper.createLabel("Test Case Passed", ExtentColor.GREEN));
						
		} else if(result.getStatus()==ITestResult.FAILURE) {
			String res = result.getThrowable().getMessage();
			parentTest.log(Status.FAIL,	MarkupHelper.createLabel("Test Case Failed", ExtentColor.RED));
			logScreenshot(driver, methodName, res);
			//extentTest.fail(result.getThrowable());
			
		}
		
	}
	
	
	// Method is used to create the report
	
	public static void closeReport() 
	{
		extentReport.flush();
	}
	
	
	// Method is used to take scrrenshot if the test is failed
	
	public static void logScreenshot(WebDriver screenDriver, String testCaseName, String res) throws IOException {
		File file = ((TakesScreenshot) screenDriver).getScreenshotAs(OutputType.FILE);
		String workspace = ((new File(".").getAbsolutePath()).replace("\\", "/")).replace(".", "");
		String fileName = workspace + "/" + testCaseName + ".jpg";
		FileUtils.copyFile(file, new File(fileName));
		childTest.fail(res.toString());
		childTest.fail("Attached screen shot").addScreenCaptureFromPath(testCaseName + ".jpg");
	}
	
}
