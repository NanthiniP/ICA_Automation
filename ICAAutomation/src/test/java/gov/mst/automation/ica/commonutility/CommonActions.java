package gov.mst.automation.ica.commonutility;

/*
 	* Author	 				: Nanthini PushpaRaja
 	* Created date			: Nov 26, 2018
	* Last Edited by		: Nanthini PushpaRaja
	* Last Edited date		: Dec 08, 2018
	* Description			: Class is used to define the general actions executed in the project
*/ 

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import gov.mst.automation.ica.elements.LookupWindow;
import gov.mst.automation.ica.report.Log;

public class CommonActions {
			
	// Method is used to upload a file
	
	public static void fileUpload(String UploadFilePath) throws AWTException, InterruptedException
	{
		StringSelection uploadfile = new StringSelection(UploadFilePath);
		Log.info("Upload File path selected");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(uploadfile, null);
		Log.info("Upload File path copied");
		
		Robot robot = new Robot();
		
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_V);
				
		Thread.sleep(1000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyRelease(KeyEvent.VK_V);
				
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Log.info("File Uploaded");
	}
	
	
		
	// Method is used to search and select a value from lookup window
	
	public static void lookup(WebDriver driver, WebElement lookupField, String lookupvalue)
	{
		LookupWindow lookupwindow = LookupWindow.elements(driver);
		
		lookupField.click();
		Log.info("Clicked on lookup icon");
		
		Set<String> windows = driver.getWindowHandles();
		Log.info("Get all the browser windows");
		
		for(String window:windows)
		{
			String Currentwindow = driver.getWindowHandle();
			Log.info("Get the main window");
			
			if(!(window.equals(Currentwindow)))
			{
				Log.info("Lookup window selected");
				
				driver.switchTo().window(window);
				Log.info("Tab to Lookup window");
				
				driver.switchTo().frame("searchFrame");
				Log.info("Tab to search frame");
				
				lookupwindow.searchText.sendKeys(lookupvalue);
				Log.info("search text entered");
				
				lookupwindow.goButton.click();
				Log.info("Click Go button");
				
				driver.switchTo().defaultContent();
				
				driver.switchTo().frame("resultsFrame");
				Log.info("Tab to results frame");
				
				int totalitems = lookupwindow.lookupItems.size();
				Log.info("Get all the search items");
				
				for(int n=1;n<=totalitems;n++)
				{
					String actual = driver.findElement(By.xpath(".//*[@id='new']/div/div[3]/div/div[2]/table/tbody/tr["+n+"]/th")).getText();
					Log.info("Value needs to selected from lookup window");
					
					if(actual.equals(lookupvalue))
					{
						driver.findElement(By.xpath(".//*[@id='new']/div/div[3]/div/div[2]/table/tbody/tr["+n+"]/th/a")).click();
						Log.info("Value selected from lookup");
						
						driver.switchTo().window(Currentwindow);
						Log.info("Tab to main browser window");
						
						break;
					}
				}
				
			}
		}
	}

		
	
	// Method is used to select a value from Drop down
	
	public static void selectDropdownValue(WebElement DropdownElement, String DropdownValue)
	{
		Select s = new Select(DropdownElement); 
		s.selectByVisibleText(DropdownValue);
		Log.info("Value selected from dropdown");
	}
	
	
	// Method is used to wait until the element visibility
	
	public static void wait(WebDriver driver, WebElement element)
	{
			WebDriverWait wait = new WebDriverWait(driver, 120);
			wait.until(ExpectedConditions.visibilityOf(element));
			Log.info("wait completed for 120 seconds");
	}
	
			
	// Method is used to press the escape button
			
	public static void pressEscape() throws AWTException, InterruptedException
	{
		Robot robot = new Robot();
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(1000);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
	}

}
