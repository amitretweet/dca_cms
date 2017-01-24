package dcaCmsTests;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

//This is the Test Class for NPI_SortByEmailPhotoTaken Functionality.
import dcaCmsBase.Base;
import dcaCmsBase.Utility;
import dcaCmsPages.LoginPage;
import dcaCmsPages.NPI_Page;

public class NPI_SortByEmailPhotoTaken extends Base{
	
	public void sortByEmailPhotoTaken() throws Exception
	{
		Logger logger = Logger.getLogger(NPI_SortByEmailPhotoTaken.class);
		PropertyConfigurator.configure("log4j.properties");
		logger.info("**This Test is verifying NPI_SortByEmailPhotoTaken functionality**");
		
		LoginPage.loginUser(driver);
		Thread.sleep(3000);
		
		NPI_Page npi = new NPI_Page(driver);
		npi.clickOnNPITab();
		Thread.sleep(3000);
		
		npi.sortByEmailPhotoTaken();
		Thread.sleep(3000);
		
		Utility.captureScreenShot(driver, "NPI_SortByEmailPhotoTaken");
	}

}
