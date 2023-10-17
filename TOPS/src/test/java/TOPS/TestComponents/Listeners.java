package TOPS.TestComponents;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import TOPS.resources.ExtentReporterNG;

public class Listeners implements ITestListener
{
	ExtentTest test;
	ExtentReports extent = ExtentReporterNG.getReportObject();
	ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();   //Thead safe	
	
	
	@Override
	public void onTestStart(ITestResult result) {
		test = extent.createTest(result.getMethod().getMethodName());
		extentTest.set(test);  //Unique Thread id
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		extentTest.get().log(Status.PASS, "Test Passed");
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		extentTest.get().fail(result.getThrowable());
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		
	}
	
//	@Override
//	public void onTestFailedButWithSuceesPercentage(ITestResult result) {
//		
//	}
	
	
	@Override
	public void onStart(ITestContext context) {
		
	}
	
	
	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
	}
}
