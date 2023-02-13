package interviewpreparation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class demo1 {
  @Test
  public void student() {
	  System.out.println("i am from student test");
  }
  
	@Test
	public void Headmaster() {
		System.out.println("i am headmaster of the school");
	}
	
@BeforeMethod
public void beforemethod()
{	  
System.out.println("i am from before method");	  	  
}	  
	  
	

@AfterMethod  
public void Aftermethod()
{	  
System.out.println("i am from After method");	  	  
}	




@AfterClass 
public void Afterclass()
{	  
System.out.println("i am from After class");
}



@BeforeClass 
public void Beforeclass()
{	  
System.out.println("i am from Before class");
}




	  
  }

