package gov.mst.automation.ica.commonutility;

/*
 	* Author	 				: Nanthini PushpaRaja
 	* Created date			: Nov 26, 2018
 	* Last Edited by		: Nanthini PushpaRaja
 	* Last Edited date		: Dec 08, 2018
 	* Description			: Class is used to execute the failed test cases
*/ 

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer{
	
	private int retryCount = 0;
    private int maxRetryCount = 2;
        
    // Method is used to execute the failed test cases for number of times
    
    public boolean retry(ITestResult result) 							
    {
        if (retryCount < maxRetryCount) {
            retryCount++;
            return true;
        }
        return false;
    }

    
}
