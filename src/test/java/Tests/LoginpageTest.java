package Tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import testbase.Testbase;

public class LoginpageTest extends Testbase {

	@Test(priority=1)
	public void loginwithvalidcredentials() throws InterruptedException {

		System.out.println("Entering the username");
		Assert.assertTrue(loginpage.isusernamedisplayed(), "username is not displayed");

		loginpage.setusername("Admin");

		System.out.println("Entering the password");
		Assert.assertTrue(loginpage.ispassworddisplayed(), "password inputbox isnot presnt on the UI");

		loginpage.setpassword("admin123");

		System.out.println("click on the login button");
		Assert.assertTrue(loginpage.isloginbtnenabled(), "loginbtnnotenabled");

		loginpage.clickloginbutton();

		System.out.println(" To verify the Dashboard is present on the UI");

		Assert.assertTrue(dashboardpage.toverifydashboardtext(), "Dashboard text presnt on the UI");

		String result = dashboardpage.getTextdashboard();
		System.out.println(result);

		dashboardpage.clickadminbtn();

		dashboardpage.userinput("Admin");

		dashboardpage.clicksearchbox();

		dashboardpage.clickprofilebox();

		dashboardpage.clicklogout();

	}
	// login with invalid password

	@Test(priority=2)
	public void logincredentialswithinvalidpassword() throws InterruptedException {

		System.out.println("Enter the username");
		Assert.assertTrue(loginpage.isusernamedisplayed(), "username is not displayed on UI");

		loginpage.setusername("Admin");
         Thread.sleep(5000);
		System.out.println("Enter the password");
		Assert.assertTrue(loginpage.invalidpassworddisplayed(), "invalidpassword is displayed on Ui");
		loginpage.invalidpassword("admin132");

		System.out.println("click on login button");
		loginpage.clickloginbutton();

		Assert.assertTrue(loginpage.errormessage());
	}

	@Test(priority=3)
	public void loginwithinvalidusername() throws InterruptedException {

		System.out.println("Enter the username");
		Assert.assertTrue(loginpage.invalidusernameisdisplayed(), "invalid user entered on login page");
		Thread.sleep(5000);
		loginpage.invalidusername("addmin");
		Assert.assertTrue(loginpage.ispassworddisplayed(), "password displayed on UI");
		System.out.println("Enter the password");
		loginpage.setpassword("admin123");
		System.out.println("click on login button");
		loginpage.clickloginbutton();
        Assert.assertTrue(loginpage.errormessage());
		
	}
}