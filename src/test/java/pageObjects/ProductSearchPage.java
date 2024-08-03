package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductSearchPage extends BasePage{
	public ProductSearchPage(WebDriver driver){
		super(driver);
	}
	

	@FindBy(xpath="//input[@placeholder='Search']") WebElement txt_Search; 

	@FindBy(xpath="//button[@class='btn btn-default btn-lg']") WebElement btn_search;
	
	@FindBy(xpath="//a[normalize-space()='iMac']") WebElement result_img;
	
	public void text_search(String product) {
		txt_Search.sendKeys(product);
	}
	
	public void btn_search() {
		btn_search.click();
	}
	
	
	public boolean result_Img() {
		boolean status = result_img.isDisplayed();
		result_img.click();
		return status;
	}
	
	
	
	
	
}
