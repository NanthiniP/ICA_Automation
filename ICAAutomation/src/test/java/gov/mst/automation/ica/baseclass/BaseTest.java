package gov.mst.automation.ica.baseclass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import gov.mst.automation.ica.browserutility.BrowserUtility;
import gov.mst.automation.ica.constant.Constant;

public class BaseTest {
	
	public static WebDriver driver;
	 
	
	@Parameters("browsername")
	@BeforeClass()
	public void openBrowser(String browsername) throws Exception
	{
		BrowserUtility driver = new BrowserUtility(browsername);
		this.driver = driver.openBrowser(Constant.url);
		
	}
	
	@AfterClass
	public void closeBrowser()
	{
		BrowserUtility.closeBrowser();
	}

}
