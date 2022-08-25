package test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;


public class LoginTest extends BaseTest {
	
	
	@Test(priority=0, groups="smoke")
	public void verifyURL() {
		Assert.assertEquals(login.loginURL(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test(priority=1)
	public void verifyTitle() {
		Assert.assertEquals(login.loginTitle(), "OrangeHRM");
	}
	
	@Test(priority=2, groups={"smoke","regression"})
	public void verifyLogin() {
		login.loginMethod();
		String title = pim.pimPageTitle();
		Assert.assertEquals(title, "PIM");
	}
	
	

}
