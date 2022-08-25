package mainjava;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseTest;

public class PIMPage extends BaseTest{
	
	@FindBy(xpath = "//h6[text()='PIM']")
	WebElement titleOfPage;
	
	@FindBy(xpath = "//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")
	List<WebElement>  allCheckBox;
	
	@FindBy(xpath = "//*[@type='checkbox']")
	List<WebElement> check;
	
	
	
	public PIMPage(WebDriver driver) {
		BaseTest.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	public String pimPageTitle() {
		return titleOfPage.getText();
	}
	
	public String pimURL() {
		return driver.getCurrentUrl();
	}
	
	public void selectPimCheckBox() {
		allCheckBox.get(0).click();
	}
	
	public boolean CheckBoxSelected() {
		return check.get(0).isSelected();
	}

}
