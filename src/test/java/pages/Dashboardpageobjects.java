package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Dashboardpageobjects {

	WebDriver driver;

	

	public Dashboardpageobjects(WebDriver driver) {

		this.driver = driver;
	}

	By Dashboardtext = By.xpath("//h6[@class=\"oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module\"]");
	By adminbtn = By.xpath("//a[@href=\"/web/index.php/admin/viewAdminModule\"]");

	By userinputbox = By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[2]");

	By searchbox = By.xpath("//button[@type=\"submit\"]");

	By profilebox = By.xpath("//p[@class=\"oxd-userdropdown-name\"]");

	By logout = By.xpath("//a[text()=\"Logout\"]");

	public boolean toverifydashboardtext() {

		boolean status = driver.findElement(Dashboardtext).isDisplayed();

		return status;
	}

	@Test
	public String getTextdashboard() {

		String result = driver.findElement(Dashboardtext).getText();

		System.out.println(result);
		return result;

	}

	@Test
	public void clickadminbtn() {

		driver.findElement(adminbtn).click();
	}

	@Test
	public void userinput(String uname) {

		driver.findElement(userinputbox).sendKeys(uname);

	}

	@Test
	public void clicksearchbox() {

		driver.findElement(searchbox).click();

	}

	@Test
	public void clickprofilebox() {
		driver.findElement(profilebox).click();

	}

	@Test
	public void clicklogout() {

		driver.findElement(logout).click();


}


}
