package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC02_LoginTest extends BaseClass{
	
	@Test(groups= {"sanity","master"})
	public void verify_login() {
		logger.info("*****Stating TC02_LoginTest*****");
		try{
		HomePage hp  = new HomePage(driver);
		hp.myaccount();
		hp.clickLogin();


		LoginPage lp = new LoginPage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clickLogin();
		
		MyAccountPage map = new MyAccountPage(driver);
		boolean targetPage = map.isMyAccountPageExists();
		Assert.assertTrue(targetPage);
		}
		catch(Exception e) {
			Assert.fail();
		}
		
		logger.info("***** Finished TC02 *****");
	}
}
