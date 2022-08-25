package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;


public class PIMTest extends BaseTest {
	
	@BeforeClass
	public void login() {
		login.loginMethod();
	}
	
	@Test(priority = 4)
	public void verifyURL() {	
		Assert.assertEquals(pim.pimURL(), "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
	}
	
	@Test(priority = 5)
	public void verifyPim() {
		Assert.assertEquals(pim.pimPageTitle(), "PIM");
	}
	
	@Test(priority = 6)
	public void verifyCheckBoxSelected() {
		pim.selectPimCheckBox();
		Assert.assertEquals(pim.CheckBoxSelected(), true);
	}
	

}
