package feb06;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void testx() {
	  
	  int a =5;
	  int b=56;
	  
	  Assert.assertTrue(a>b);
	  System.out.println("i am from X method");
	  
  }
	  
	  
	  
@Test(dependsOnMethods="testx",alwaysRun=true,invocationCount=5)	  
public void	 testy() { 
	  System.out.println("i am from Test y");
	  
}  
	  
	  
  }

