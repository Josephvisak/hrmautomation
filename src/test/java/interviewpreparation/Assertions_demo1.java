package interviewpreparation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions_demo1 {

	
	
	@Test
	public void display()
	{
	
	int a =10;
	int b=10;
	
	Assert.assertEquals(a, b);
	}
	
	
	@Test
	public void print()
	{
	
	int a =10;
	int b=20;
	
Assert.assertTrue(a<b);
	
	}
	
	}
	
	
	

