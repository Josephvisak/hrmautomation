package feb07;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class Hrmwebsiteadminmodule {

	public void toverifyusername() throws InterruptedException {
	
		System.out.println("setup the browser");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\driver\\chromedriver.exe");
		System.out.println("navigate to https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		System.out.println("enter the vaalid user name");
		WebElement username = driver.findElement(By.xpath("//input[@name=\"username\"]"));
		username.sendKeys("Admin");
		System.out.println("enter the valid password");
		WebElement password = driver.findElement(By.xpath("//input[@name=\"password\"]"));
		password.sendKeys("admin123");
		System.out.println("click on the login button");

		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

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
		
		


		System.out.println("click on the profile menu and log out");

		WebElement profilemenu = driver.findElement(By.xpath("//p[@class=\"oxd-userdropdown-name\"]"));
		profilemenu.click();

		System.out.println("close the browser");

		driver.close();
		
		
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
