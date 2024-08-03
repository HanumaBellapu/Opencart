package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC03_LoginDataDrivenTest extends BaseClass{
	
	
	@Test(dataProvider="LoginData" , dataProviderClass = DataProviders.class , groups= {"datadriven","master"})
	//getting data provider from different class.
	public void verify_LoginDDT(String Email,String Password,String Result) {
		
		logger.info("***** Stating TC03_LoginDataDrivenTest *****");
		
		try{
		HomePage hp  = new HomePage(driver);
		hp.myaccount();
		hp.clickLogin();
	
	
		LoginPage lp = new LoginPage(driver);
		lp.setEmail(Email);
		lp.setPassword(Password);
		lp.clickLogin();
		
		
		MyAccountPage map = new MyAccountPage(driver);		
		boolean targetPage = map.isMyAccountPageExists();
		
		if(Result.equalsIgnoreCase("valid")) {	
		
			if(targetPage==true) {
				map.clickLogout();
				Assert.assertTrue(targetPage);
			}
			else {
				Assert.assertTrue(false);
			}
		
		}
		else {
			
			if(targetPage==true) {
				map.clickLogout();
				Assert.assertTrue(false);
			}
			else {
				Assert.assertTrue(true);
			
			}
		}
		
	

		}
		catch(Exception e) {
			Assert.fail();
		}
		
		logger.info("***** Finished TC03LoginDataDrivenTest *****");
	
	}
}
