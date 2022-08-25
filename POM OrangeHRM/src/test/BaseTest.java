package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import mainjava.LoginPage;
import mainjava.PIMPage;

public class BaseTest {
	
	public static WebDriver driver;
	protected LoginPage login;
	protected PIMPage pim;
	
	@BeforeClass
	public void launchbrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().getPageLoadTimeout();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@BeforeClass
	public void pageObject() {
		login = new LoginPage(driver);
		pim = new PIMPage(driver);
	}
	
	@AfterClass
	public void tearDownEnvironment() {
		driver.quit();
	}

}
