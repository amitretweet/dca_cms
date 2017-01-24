package dcaCmsTests;



import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

import dcaCmsBase.Base;
import dcaCmsBase.Utility;
import dcaCmsPages.LoginPage;
/*******This class covers login functionality************/
public class LoginFunctionality extends Base {

	@Test (priority=1)
	public void loginTest() throws Exception
	{
		Logger logger = Logger.getLogger(LoginFunctionality.class);
		PropertyConfigurator.configure("log4j.properties");
		logger.info("**This Test is verifying LOGIN functionality**");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		LoginPage.loginUser(driver);
		Thread.sleep(4000);
		Utility.captureScreenShot(driver, "login Successful");
		
	}
	@Test(priority=2)
	public void loginTestInvalid() throws Exception
	{
		Logger logger = Logger.getLogger(LoginFunctionality.class);
		PropertyConfigurator.configure("log4j.properties");
		logger.info("**This Test is verifying LOGIN functionality with invalid credentials**");

		LoginPage login = new LoginPage(driver);
		login.loginUserInvalid();
		Thread.sleep(4000);
		
		Utility.captureScreenShot(driver, "Invalid Login");
		
	}
}
