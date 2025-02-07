package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath="//h2[normalize-space()='My Account']") WebElement msg_myaccount;
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']") WebElement link_logout;
	
	
	
	
	
	
	public boolean isMyAccountPageExists() {
		try {
		return (msg_myaccount.isDisplayed());
		}
		catch(Exception e) {
			return false;
		}
	}
	
	
	public void clickLogout() {
		link_logout.click();
	}
	
	
	
	
	
	
}
