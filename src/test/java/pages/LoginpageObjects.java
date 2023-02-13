package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginpageObjects {

	WebDriver driver;

	public LoginpageObjects(WebDriver driver) {
		// whenver we create the object for the page class it will activate the driver

		this.driver = driver;

	}

	By username = By.xpath("//input[@name=\"username\"]");
	By invalidusername = By.xpath("//input[@name=\"username\"]");
	By Password = By.xpath("//input[@name=\"password\"]");
	By invalidPassword = By.xpath("//input[@name=\"password\"]");
	By loginbtn = By.xpath("//button[@type=\"submit\"]");
	By invalidcredentials=By.xpath("//p[text()=\"Invalid credentials\"]");

	@Test
	public boolean isusernamedisplayed() {
		boolean result = driver.findElement(username).isDisplayed();
		return result;
	}

	@Test
	public boolean ispassworddisplayed() {

		boolean status = driver.findElement(Password).isDisplayed();
		return status;
	}
	
	@Test
	public boolean invalidpassworddisplayed() {
	
	boolean status=driver.findElement(invalidPassword).isDisplayed();
	      return status;
	}
	
	
	
	@Test
	public boolean invalidusernameisdisplayed() {
	
boolean status	=driver.findElement(invalidusername).isDisplayed();
	return status;
	}
	

	@Test
	public boolean isloginbtnenabled() {
		boolean report = driver.findElement(loginbtn).isEnabled();
		return report;
	}

	@Test
	public void setusername(String username) {

		driver.findElement(this.username).sendKeys(username);

	}
	@Test
	public void invalidusername(String invaliduname) {
	
		driver.findElement(invalidusername).sendKeys(invaliduname);
		
		
		
		
		
		
	}

	@Test
	public void setpassword(String password) {
		driver.findElement(Password).sendKeys(password);
	}
	
	@Test
	public void invalidpassword(String invalidpword) {
	
	driver.findElement(invalidPassword).sendKeys(invalidpword);
	
	}
	
	
	

	@Test
	public void clickloginbutton() {

		driver.findElement(loginbtn).click();

	}

	@Test
	public boolean errormessage() {
	
boolean status	=driver.findElement(invalidcredentials).isDisplayed();
	
	return status;
	
	
	
	}
	
	}
	
	
	
	
	
	
	
	
	
	

	

