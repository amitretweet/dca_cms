package dcaCmsTests;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

//This is the Test Class for CountryAlias_DeleteRow functionality.
import dcaCmsBase.Base;
import dcaCmsBase.Utility;
import dcaCmsPages.CountryAliasPage;
import dcaCmsPages.LoginPage;

public class CountryAlias_DeleteRow extends Base {
	
	@Test
	public void deleteRow() throws Exception
	{
		Logger logger = Logger.getLogger(CountryAlias_DeleteRow.class);
		PropertyConfigurator.configure("log4j.properties");
		logger.info("**This Test is verifying CountryAlias_DeleteRow functionality**");
		
		LoginPage.loginUser(driver);
		Thread.sleep(4000);
		CountryAliasPage cap = new CountryAliasPage(driver);
		cap.clickOncountryAliasLink();
		Thread.sleep(3000);
		cap.deleteRow();
		Thread.sleep(4000);
		
		Utility.captureScreenShot(driver, "CountryAlias_DeleteRow");
		
	}

}
