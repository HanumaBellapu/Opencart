package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage{
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath="//span[normalize-space()='My Account']") WebElement link_myaccount;
	@FindBy(xpath="//a[normalize-space()='Register']") WebElement link_register;
	@FindBy(xpath="//a[normalize-space()='Login']") WebElement link_login;
	
	public void myaccount() {
		link_myaccount.click();
	}
	
	public void register() {
		link_register.click();
	}

	public void clickLogin() {
		link_login.click();
	}
	
}
