package gov.mst.automation.ica.browserutility;

/**
 * 
 * @author Nanthini PushpaRaja
 * Created date: Nov 26, 2018
 * Last Edited by: Nanthini PushpaRaja
 * Last Edited date: Nov 26, 2018
 * Description: This BrowserUtility is used to define open and close the browser methods
 */ 


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import gov.mst.automation.ica.constant.Constant;

public class BrowserUtility {
	
	WebDriver driver;
	String browsername;
	
	
	public BrowserUtility(String browsername)
	{
		this.browsername = browsername;
	}
	
	
	public WebDriver openBrowser() throws Exception
	{
		if(browsername.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", Constant.chromepath);
			driver = new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", Constant.iepath);
			driver = new InternetExplorerDriver();
		}
		else if(browsername.equalsIgnoreCase("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		else
		{
			throw new Exception("Invalid browser name");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}
	
	
	public void closeBrowser()
	{
		driver.close();
	}

}
