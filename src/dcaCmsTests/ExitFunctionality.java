package dcaCmsTests;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

//This is the Test Class for Exit functionality.
import dcaCmsBase.Base;
import dcaCmsBase.Utility;
import dcaCmsPages.LoginPage;

public class ExitFunctionality extends Base {
	
	@Test
	public void exitFunctionality() throws Exception
	{
		Logger logger = Logger.getLogger(ExitFunctionality.class);
		PropertyConfigurator.configure("log4j.properties");
		logger.info("**This Test is verifying EXIT functionality**");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		LoginPage.loginUser(driver);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Exit']")).click();
		logger.info("Clicking Exit link and exiting");
		Thread.sleep(3000);
		
		Utility.captureScreenShot(driver, "ExitFunctionality");
	}

}
