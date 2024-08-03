package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC01_AccountRegistration extends BaseClass{	
	
	@Test(groups= {"sanity","regression","master"})
	public void testRegistration() throws InterruptedException {
		
		
	logger.info("*****Starting registration test*****");
		
		try{
		HomePage hp= new HomePage(driver);
		hp.myaccount();
		logger.info("Clicked on my account.....");
		
		hp.register();
		logger.info("Cliked on register.....");
		
		AccountRegistrationPage regpage = new AccountRegistrationPage(driver);
		
		logger.info("Providing customer details.....");
		regpage.setFirstName(randomString().toUpperCase());
		regpage.setLastName(randomString().toUpperCase());
		regpage.setEmailId(randomString()+"@gmail.com");
		regpage.setTelephone(randomNumber());
		
		String pwd = randomAlphaNumberic();
		regpage.setPassword(pwd);
		regpage.setConfirmPassword(pwd);
		
		regpage.setAgree();

		regpage.clickContinue();
		
		logger.info("Validating expected message.....");
		String confmsg = regpage.getMsgConfirmation();
		Assert.assertEquals(confmsg, "Congratulations! Your new account has been successfully created!");
		}
		catch(Exception e) {
			logger.error("Test failed: " + e.getMessage());
			Assert.fail("Test failed: " + e.getMessage());
		}
		finally {
		logger.info("*****Finished the registration test*****");
		}
	}
}
