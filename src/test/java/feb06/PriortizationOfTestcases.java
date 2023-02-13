package feb06;

import org.testng.annotations.Test;

public class PriortizationOfTestcases {

	
	@Test(description="Name of the school" ,priority=2)
	public void School() {
	
	System.out.println("i am from Delhi Public school");
	}
	
	
	@Test(priority=4)
	public void Students() {
	
	System.out.println("The students must have good communication skills");
	}
	
	@Test(priority=3)
	public void Teacher() {
		System.out.println("Minimum Graduation required for Teaching post");
	}	
	
	
	@Test(priority=1,enabled=false)
	public void principal() {
		
	System.out.println("The principal was having good vision in creating a good academic progress");	
		
	}	
		
		
		
		
	}
	

