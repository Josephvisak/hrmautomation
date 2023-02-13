package feb07;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datadriventesting {

	
@DataProvider
public Object[][] testdata() {

		Object data[][] = {{"Admin","admin123"},{ "Admin", "adminn143" },{ "Admen", "admen" }};
		return data;
	}
	
	
	@Test(dataProvider ="testdata")
	public void setuploginpage(String username,String password) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		System.out.println("Launching the browser");

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
	     System.out.println("Entering the username");
	     
	driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys(username);
		System.out.println("Entering the password");
		
    driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(password);
		
		System.out.println("click on the login button");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
		
		
		
		
				
	}
	
}
