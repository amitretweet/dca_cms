package dcaCmsTests;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

//This is the Test Class for NPI_SortBySendDate Functionality.
import dcaCmsBase.Base;
import dcaCmsBase.Utility;
import dcaCmsPages.LoginPage;
import dcaCmsPages.NPI_Page;

public class NPI_SortBySendDate extends Base{
	
	@Test
	public void sortBySendDate() throws Exception
	{
		Logger logger = Logger.getLogger(NPI_SortBySendDate.class);
		PropertyConfigurator.configure("log4j.properties");
		logger.info("**This Test is verifying NPI_SortBySendDate functionality**");
		
		LoginPage.loginUser(driver);
		
		NPI_Page npi = new NPI_Page(driver);
		npi.clickOnNPITab();
		Thread.sleep(3000);
		
		npi.sortBySendDate();
		Thread.sleep(3000);
		
		Utility.captureScreenShot(driver, "NPI_SortBySendDate");
		
	}

}
