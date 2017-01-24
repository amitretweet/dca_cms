package dcaCmsTests;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

//This is the Test Class for NPI_SortByIsSynchronized Functionality.
import dcaCmsBase.Base;
import dcaCmsBase.Utility;
import dcaCmsPages.LoginPage;
import dcaCmsPages.NPI_Page;

public class NPI_SortByIsSynchronized extends Base{
	
	@Test
	public void sortByIsSynchronized() throws Exception
	{
		Logger logger = Logger.getLogger(NPI_SortByIsSynchronized.class);
		PropertyConfigurator.configure("log4j.properties");
		logger.info("**This Test is verifying NPI_SortByIsSynchronized functionality**");
		
		LoginPage.loginUser(driver);
		Thread.sleep(3000);
		
		NPI_Page npi = new NPI_Page(driver);
		npi.clickOnNPITab();
		Thread.sleep(3000);
		
		npi.sortByIsSynchronized();
		Thread.sleep(3000);
		
		Utility.captureScreenShot(driver, "NPI_SortByIsSynchronized");
		
	}

}
