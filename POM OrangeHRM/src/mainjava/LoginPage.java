package mainjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseTest;

public class LoginPage extends BaseTest {
	
	// All Locators Of Page
	@FindBy(name="username")
	WebElement userName;
	
	@FindBy(name="password")
	WebElement passWord;
	
	@FindBy(xpath="//*[text()=' Login ']")
	WebElement btnLogin;
	
	
	// Initialization of locators/variables
	public LoginPage(WebDriver driver) {
		BaseTest.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void loginMethod() {
		userName.sendKeys("Admin");
		passWord.sendKeys("admin123");
		btnLogin.click();
	}
	
	public String loginURL() {
		return driver.getCurrentUrl();
	}
	
	public String loginTitle() {
		return driver.getTitle();
	}
	
	

}
