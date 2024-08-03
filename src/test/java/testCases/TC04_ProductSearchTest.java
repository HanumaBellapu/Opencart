package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ProductSearchPage;
import testBase.BaseClass;

public class TC04_ProductSearchTest extends BaseClass {
	
	@Test(groups= {"regression","master"})
	public void verify_product() throws InterruptedException {
		ProductSearchPage psp = new ProductSearchPage(driver);
		
		psp.text_search("mac");
		psp.btn_search();
		
		if(psp.result_Img()==true) {
			Thread.sleep(3000);
			psp.result_Img();
			Assert.assertEquals(psp.result_Img(), true);
		}
		else {
			Assert.fail();
		}
		
	
		
	}
	
	
}
