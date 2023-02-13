package Listener;

import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Base.TestBase2;

public class Listeners extends TestBase2 implements ITestListener {
DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	
	
	public void onFinish(ITestContext Result) {
		LocalDateTime now = LocalDateTime.now();
		log.info(dtf.format(now)+" "+"On Finish: " + Result.getName());
	}

	public void onStart(ITestContext Result) {
		LocalDateTime now = LocalDateTime.now();
		log.info(dtf.format(now)+" "+"On Start: " + Result.getName());
	}

	// When Test case get failed, this method is called.
	public void onTestFailure(ITestResult Result) {
		LocalDateTime now = LocalDateTime.now();
	log.error(dtf.format(now)+" "+"The name of the testcase failed is :" + Result.getName());
	TestBase2.TakeScreenShot(Result.getName());

	}

	// When Test case get Skipped, this method is called.
	public void onTestSkipped(ITestResult Result) {
		LocalDateTime now = LocalDateTime.now();
		log.info(dtf.format(now)+" "+"The name of the testcase Skipped is :" + Result.getName());
	}

	// When Test case get Started, this method is called.
	public void onTestStart(ITestResult Result) {
		LocalDateTime now = LocalDateTime.now();
		log.info(dtf.format(now)+" "+Result.getName() + " test case started");
	}

	// When Test case get passed, this method is called.
	public void onTestSuccess(ITestResult Result) {
		LocalDateTime now = LocalDateTime.now();
		log.info(dtf.format(now)+" "+"The name of the testcase passed is :" + Result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {

	}
}