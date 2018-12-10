package gov.mst.automation.ica.commonutility;

/*
	* Author	 				: Nanthini PushpaRaja
	* Created date			: Nov 26, 2018
	* Last Edited by		: Nanthini PushpaRaja
	* Last Edited date		: Dec 08, 2018
	* Description			: Class is used to get the failed test cases at the time of execution
*/ 

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class RetryListener implements IAnnotationTransformer{
	
	
	//	Method is used to get the failed test cases
	
	public void transform(ITestAnnotation testannotation, Class testClass, Constructor testConstructor, Method testMethod)	
	{
		IRetryAnalyzer retry = testannotation.getRetryAnalyzer();

		if (retry == null)	{
			testannotation.setRetryAnalyzer(Retry.class);
		}

	}

}
