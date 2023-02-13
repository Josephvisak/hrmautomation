package feb08;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsinTestng {
 WebDriver driver ;
	
	@BeforeClass
	public void setupbrowser() {
	System.out.println("***************BeforeClass******************");
	System.out.println("setup the browser");
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\driver\\chromedriver.exe");
	 driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
    System.out.println("Launching the browser");

	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	System.out.println("*************** End of BeforeClass******************");

	
	
	
	}
	
	
	@AfterClass
	public void closethebrowser() {
		System.out.println("***************AfterClass******************");

		System.out.println("close the Browser ");
		WebDriver driver = new ChromeDriver();
		driver.close();
		System.out.println("***************End of AfterClass******************");

	}
	
	
	
	@BeforeMethod(description="pre configuration")
	public void login() throws InterruptedException {
	
		System.out.println("Enter the valid username");

		Thread.sleep(5000);
		WebElement username = driver.findElement(By.xpath("//input[@name=\"username\"]"));

		username.sendKeys("Admin");
		System.out.println(username.getAttribute("name"));

		 
		System.out.println("Enter the valid password");
		driver.findElement(By.name("password")).sendKeys("admin123");
		System.out.println("click on the login button");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		System.out.println("verify the user is displayed with dashboard page");
		WebElement dashboardtext = driver.findElement(By.xpath("//h6[text()=\"Dashboard\"]"));
          Thread.sleep(5000); 
		Assert.assertTrue(dashboardtext.isDisplayed(), "dasboard is not displayed");

		System.out.println(dashboardtext.isDisplayed());
		String result = dashboardtext.getText();
		System.out.println(result);
		
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	
	}
	
	
	@AfterMethod
	public void postconfiguration() {
	
		System.out.println("click on the profile menu and log out");

		//WebElement profilemenu = driver.findElement(By.xpath("//p[text()=\"Mohammad aaa Abbas2\"]"));
		WebElement profilemenu =driver.findElement(By.xpath("//p[@class=\"oxd-userdropdown-name\"]"));
		profilemenu.click();
	
		System.out.println("log out from the application");

		driver.findElement(By.xpath("//a[text()=\"Logout\"]")).click();
	
	}
	
	
	@Test
	public void verifytheemployeename() {
	
	

		System.out.println("click on admin module");

		WebElement adminmodule = driver.findElement(By.xpath("//a[@href=\"/web/index.php/admin/viewAdminModule\"]"));
		adminmodule.click();

		System.out.println("user is displayed with Admin/usermanagement");

		WebElement mgmtxt = driver.findElement(By.xpath("//h6[text()=\"User Management\"]"));
		String result1 = mgmtxt.getText();

		System.out.println(result1);

		System.out.println("verify the employee name is exit or not");

		WebElement inputtxt = driver.findElement(By.xpath("//input[@placeholder=\"Type for hints...\"]"));
		inputtxt.sendKeys("Admin");

		System.out.println("click on search button");

		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

		System.out.println("verify the name is found in the records or not");

		WebElement record = driver.findElement(By.xpath("//span[@class=\"oxd-text oxd-text--span\"]"));

		System.out.println(record.getText());




	}
	@Test(description= "To verify the username on admin module")
	public void toverifyusername() throws InterruptedException {
		
		

		System.out.println("verify the user is displayed with dashboard page");

		WebElement dashboardtext = driver.findElement(By.xpath("//h6[text()=\"Dashboard\"]"));

		System.out.println(dashboardtext.getText());

		Assert.assertTrue(dashboardtext.isDisplayed(), "dashoboard page not displayed");

		System.out.println("click on admin module");

		WebElement adminmodule = driver.findElement(By.xpath("//a[@href=\"/web/index.php/admin/viewAdminModule\"]"));
		adminmodule.click();

		System.out.println("user is displayed with Admin/usermanagement");

		WebElement admintext = driver.findElement(By.xpath("//h6[text()=\"User Management\"]"));

		Assert.assertTrue(admintext.isDisplayed(), "Admin/usermanagement is not present");

		System.out.println("enter valid username under username fied");
        Thread.sleep(5000);
		
		WebElement adminusernamefield = driver.findElement(By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[2]"));
		adminusernamefield.sendKeys("Admin");
		
		
		System.out.println("click on search");
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		


		
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
}
