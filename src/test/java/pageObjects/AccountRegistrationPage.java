package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AccountRegistrationPage extends BasePage{

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
	}
	

	@FindBy(xpath="//input[@id='input-firstname']") WebElement txt_firstName;
	@FindBy(xpath="//input[@id='input-lastname']") WebElement txt_lastName;
	@FindBy(xpath="//input[@id='input-email']") WebElement txt_email;
	@FindBy(xpath="//input[@id='input-telephone']") WebElement txt_telephone;
	@FindBy(xpath="//input[@id='input-password']") WebElement txt_password;
	@FindBy(xpath="//input[@id='input-confirm']") WebElement txt_confirmPassword;
	@FindBy(xpath="//input[@name='agree']") WebElement chk_agree;
	@FindBy(xpath="//input[@value='Continue']") WebElement btn_click;
	@FindBy(xpath="//div[@id='content']//p[1]") WebElement msgConfirmation;
		
		
	public void setFirstName(String fname) {	
		txt_firstName.sendKeys(fname);
	}
		
	public void setLastName(String lname) {	
		txt_lastName.sendKeys(lname);
	}
	
	public void setEmailId(String email) {	
		txt_email.sendKeys(email);
	}
		
	public void setTelephone(String teleph) {	
		txt_telephone.sendKeys(teleph);
	}	
		
	public void setPassword(String pwd) {	
		txt_password.sendKeys(pwd);
	}	
		
	public void setConfirmPassword(String pwd) {	
		txt_confirmPassword.sendKeys(pwd);
	}	
	
	public void setAgree() {	
		chk_agree.click();
	}	
	
	public void clickContinue() {	
		btn_click.click();
	}	
	
	
	public String getMsgConfirmation() {	
		try{
			return (msgConfirmation.getText());
		}
		catch(Exception e) {
			return (e.getMessage());
		}
		
	}
	
	
	
	
	
	
	
	
}
