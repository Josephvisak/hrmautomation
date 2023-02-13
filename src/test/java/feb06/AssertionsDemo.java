package feb06;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemo {
@Test
	public void Validation() {
	String a="Hi";
	String b="Hi";
	
	Assert.assertEquals(a, b);
	}	
	
	@Test
	public void print() {
	
	int a=5;
	int b=10;
	
	Assert.assertTrue(a>b);
	}
	
	
	
	
	
}
