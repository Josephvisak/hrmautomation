package feb06;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MethodsInTEstng {

	@BeforeMethod
	public void student1() {
		System.out.println("iam from Before method");
	}

	@AfterMethod
	public void school() {
		System.out.println("iam from After Method");
	}

	@BeforeClass
	public void beforeclass() {
		System.out.println("i am from a Before class");
	}

	@AfterClass
	public void afterclass() {
		System.out.println("iam from  After class ");
	}

	@BeforeSuite
	public void beforesuite() {
		System.out.println("iam from Before suite");

	}

	@AfterSuite
	public void aftersuite() {
		System.out.println("i am from After suite");
	}

	@Test
	public void student() {
		System.out.println("i am from Annotation of test");
	}
	
	
	@BeforeTest
	public void beforeTest() {
	
	System.out.println("iam from Before test");
	}
	
	@AfterTest
	public void aftertest()
	{
	System.out.println("i am from After Test");
	
	}
}
