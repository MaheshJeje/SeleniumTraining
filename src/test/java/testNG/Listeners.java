package testNG;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listeners extends TestListenerAdapter{


	public void onTestStart(ITestResult result) {
			System.out.println("Test Started...");
	}
	
	public void onTestSuccess(ITestResult tr) {
		System.out.println("Test Passed...");
	}
	

	public void onTestFailure(ITestResult tr) {
		System.out.println("Test Failed...");
	}
	

	public void onTestSkipped(ITestResult tr) {
		System.out.println("Test Skipped...");
	}
}
