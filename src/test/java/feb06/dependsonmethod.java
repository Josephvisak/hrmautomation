package feb06;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsonmethod {







	@Test(invocationCount =2)
	public void XYZ() {
	
	int a =5;
	int b=10;
	
	Assert.assertTrue(a<b);
	}	
	
	
	@Test()
	public void ABC_123() {
	
	String A="Hi";
	String B="Hello";
	
	Assert.assertEquals(A, B);
	}
	
	
	@Test(dependsOnMethods="ABC_123",alwaysRun=true)
	public void display() {
	System.out.println("i am a automation Engineer");
	}
}
