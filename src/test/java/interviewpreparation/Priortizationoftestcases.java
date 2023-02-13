package interviewpreparation;

import org.testng.annotations.Test;

public class Priortizationoftestcases {

	
	
	@Test(priority=1)
	public void Test_abc()
	{
	
	System.out.println("i am from abc method");
	}
	
	
	@Test(priority=4)
	public void xyz_()
	{
	
	System.out.println("i am from xyz method");
	}
	
	
	@Test(priority=3, enabled =false)
	public void test()
	{
	System.out.println("i am from test method");
	}
	
	
	@Test(priority=2)
	public void print()
	{
	System.out.println("iam from print method");
	}
	
	
	
	
	
	
	
	
	
}
