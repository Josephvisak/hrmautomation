package testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Dashboardpageobjects;
import pages.LoginpageObjects;

public class Testbase {

	protected static WebDriver driver;
	protected LoginpageObjects loginpage;
	protected Dashboardpageobjects dashboardpage;


	public static void initializebrowser(String browseroption) {

		if (browseroption.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\driver\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if (browseroption.equalsIgnoreCase("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\josep\\eclipse-workspace\\hrmautomation\\drivers\\firefox\\geckodriver.exe");

			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}

	}

	@BeforeMethod
	public void setupbrowser() {

		System.out.println("initialize the browser");
		
		initializebrowser("firefox");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		loginpage = new LoginpageObjects(driver);
		dashboardpage = new Dashboardpageobjects(driver);

	}

	@AfterMethod
	public void closethebrowser() {
		System.out.println("***************AfterClass******************");

		System.out.println("close the Browser ");

		driver.quit();
		System.out.println("***************End of AfterClass******************");
		
	
	}
	
	}

