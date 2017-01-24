package dcaCmsTests;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

//This is the Test Class for NPI_DataExportFunctionality.
import dcaCmsBase.Base;
import dcaCmsBase.Utility;
import dcaCmsPages.LoginPage;
import dcaCmsPages.NPI_Page;

public class NPI_DataExportFunctionality extends Base {
	
	@Test
	public void dataExportFunctionality() throws Exception
	{
		Logger logger = Logger.getLogger(NPI_DataExportFunctionality.class);
		PropertyConfigurator.configure("log4j.properties");
		logger.info("**This Test is verifying NPI_DataExportFunctionality functionality**");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		LoginPage.loginUser(driver);
		Thread.sleep(3000);
		
		NPI_Page npi = new NPI_Page(driver);
		npi.clickOnNPITab();
		Thread.sleep(3000);
		
		npi.dataExportFunctionality();
		Thread.sleep(3000);
		
		Utility.captureScreenShot(driver, "NPI_DataExportFunctionality");
		
	}

}
