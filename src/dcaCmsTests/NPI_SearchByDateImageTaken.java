package dcaCmsTests;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

//This is the Test Class for NPI_SearchByDateImageTaken Functionality.
import dcaCmsBase.Base;
import dcaCmsBase.Utility;
import dcaCmsPages.LoginPage;
import dcaCmsPages.NPI_Page;

public class NPI_SearchByDateImageTaken extends Base {
	
	public void searchByDateImageTaken() throws Exception
	{
		Logger logger = Logger.getLogger(NPI_SearchByDateImageTaken.class);
		PropertyConfigurator.configure("log4j.properties");
		logger.info("**This Test is verifying NPI_SearchByDateImageTaken functionality**");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		LoginPage.loginUser(driver);
		Thread.sleep(3000);
		
		NPI_Page npi = new NPI_Page(driver);
		npi.clickOnNPITab();
		Thread.sleep(3000);
		
		npi.searchByDateImageTaken();
		Thread.sleep(3000);
		
		Utility.captureScreenShot(driver, "NPI_SearchByDateImageTaken");		
	}

}
