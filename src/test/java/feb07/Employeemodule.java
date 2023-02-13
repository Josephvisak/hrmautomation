package feb07;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Employeemodule {

	@Test
	public void toverifyemployeemodule() {
		System.out.println("set up the browser");

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		System.out.println("Navigate to https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		System.out.println("Enter the valid username");
		WebElement username = driver.findElement(By.name("username"));
			driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();username.sendKeys("Admin");
		System.out.println("Enter the valid password");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		System.out.println("click on the login button");
	

		System.out.println("verify the user is displayed with dashboard page");
		WebElement dashboardtext = driver.findElement(By.xpath("//h6[text()=\"Dashboard\"]"));

		Assert.assertTrue(dashboardtext.isDisplayed(), "dasboard is not displayed");

		System.out.println(dashboardtext.isDisplayed());
		String result = dashboardtext.getText();
		System.out.println(result);

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

		System.out.println("click on profile menu");

		WebElement prf = driver.findElement(By.xpath("//p[text()=\"Dusty Dump\"]"));
		prf.click();
		System.out.println("log out from the application");

		driver.findElement(By.xpath("//a[text()=\"Logout\"]")).click();

		System.out.println("close the browser");

		driver.close();
	
	
	}
	
	
	
	
	
}
