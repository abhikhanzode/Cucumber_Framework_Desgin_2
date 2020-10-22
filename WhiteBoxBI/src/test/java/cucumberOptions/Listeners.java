package cucumberOptions;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case is successfully pass: "+result.getName());
	}
	
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case is failed due to some error: "+result.getName());
	}
	
	
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case is skipped due null exception: "+result.getName());
	}


	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
