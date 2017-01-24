package dcaCmsTests;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

//This is the Test Class for NPI_SortByReceivedDate Functionality.
import dcaCmsBase.Base;
import dcaCmsBase.Utility;
import dcaCmsPages.LoginPage;
import dcaCmsPages.NPI_Page;

public class NPI_SortByReceivedDate extends Base {
	
	public void sortByReceivedDate() throws Exception
	{
		Logger logger = Logger.getLogger(NPI_SortByReceivedDate.class);
		PropertyConfigurator.configure("log4j.properties");
		logger.info("**This Test is verifying NPI_SortByReceivedDate functionality**");
		
		LoginPage.loginUser(driver);
		Thread.sleep(3000);
		
		NPI_Page npi = new NPI_Page(driver);
		npi.clickOnNPITab();
		Thread.sleep(3000);
		
		npi.sortByReceivedDate();
		Thread.sleep(3000);
		
		Utility.captureScreenShot(driver, "NPI_SortByReceivedDate");
		
	}
}
