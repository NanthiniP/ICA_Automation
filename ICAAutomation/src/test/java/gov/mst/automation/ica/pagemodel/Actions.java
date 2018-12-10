package gov.mst.automation.ica.pagemodel;

/*
	* Author	 				: Nanthini PushpaRaja
	* Created date			: Nov 26, 2018
	* Last Edited by		: Nanthini PushpaRaja
	* Last Edited date		: Dec 08, 2018
	* Description			: Class is used to define the methods for common actions for the project
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
import org.openqa.selenium.support.ui.Select;

import gov.mst.sutomation.ica.elements.LookupWindowElements;

public class Actions {
	
	WebDriver driver;
	LookupWindowElements lookupwindow;
		
	
	// Constructor is used to initialize the driver
	
	public Actions(WebDriver driver)													
	{
		this.driver = driver;
	}
	
	
	// Method is used to upload a file
	
	public void fileUpload(String UploadFilePath) throws AWTException, InterruptedException
	{
		StringSelection uploadfile = new StringSelection(UploadFilePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(uploadfile, null);
		
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
	}
	
	
	
	// Method is used to search and select a value from lookup window
	
	public void lookup(WebElement lookupField, String lookupvalue)
	{
		lookupwindow = LookupWindowElements.elements(driver);
		lookupField.click();
		Set<String> windows = driver.getWindowHandles();
		for(String window:windows)
		{
			String Currentwindow = driver.getWindowHandle();
			if(!(window.equals(Currentwindow)))
			{
				driver.switchTo().window(window);
				driver.switchTo().frame("searchFrame");
				lookupwindow.searchText.sendKeys(lookupvalue);
				lookupwindow.goButton.click();
				driver.switchTo().defaultContent();
				driver.switchTo().frame("resultsFrame");
				int totalitems = lookupwindow.lookupItems.size();
				for(int n=1;n<=totalitems;n++)
				{
					String actual = driver.findElement(By.xpath(".//*[@id='new']/div/div[3]/div/div[2]/table/tbody/tr["+n+"]/th")).getText();
					if(actual.equals(lookupvalue))
					{
						driver.findElement(By.xpath(".//*[@id='new']/div/div[3]/div/div[2]/table/tbody/tr["+n+"]/th/a")).click();
						driver.switchTo().window(Currentwindow);
						break;
					}
				}
				
			}
		}
	}
	
	
	
	// Method is used to select a value from Drop down
	
	public void selectDropdownValue(WebElement DropdownElement, String DropdownValue)
	{
		Select s = new Select(DropdownElement); 
		s.selectByVisibleText(DropdownValue);
	}
		

}
