package dcaCmsTests;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

//This is the Test Class for NPI_SortByCountryPhotoSend Functionality.
import dcaCmsBase.Base;
import dcaCmsBase.Utility;
import dcaCmsPages.LoginPage;
import dcaCmsPages.NPI_Page;

public class NPI_SortByCountryPhotoSend extends Base{
	@Test
	public void sortByCountryPhotoSend() throws Exception
	{
		Logger logger = Logger.getLogger(NPI_SortByCountryPhotoSend.class);
		PropertyConfigurator.configure("log4j.properties");
		logger.info("**This Test is verifying NPI_SortByCountryPhotoSend functionality**");
		
		LoginPage.loginUser(driver);
		Thread.sleep(3000);
		
		NPI_Page npi = new NPI_Page(driver);
		npi.clickOnNPITab();
		Thread.sleep(3000);
		
		npi.sortByCountryPhotoSend();
		Thread.sleep(3000);
		
		Utility.captureScreenShot(driver, "NPI_SortByCountryPhotoSend");
		
	}

}
