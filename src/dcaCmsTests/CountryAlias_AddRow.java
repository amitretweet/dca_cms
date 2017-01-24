package dcaCmsTests;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

//This is the Test Class for CountryAlias_AddRow functionality.
import dcaCmsBase.Base;
import dcaCmsBase.Utility;
import dcaCmsPages.CountryAliasPage;
import dcaCmsPages.LoginPage;

public class CountryAlias_AddRow extends Base{
	
	@Test
	public void addRow() throws Exception
	{
		Logger logger = Logger.getLogger(CountryAlias_AddRow.class);
		PropertyConfigurator.configure("log4j.properties");
		logger.info("**This Test is verifying CountryAlias_AddRow functionality**");
		
		LoginPage.loginUser(driver);
		Thread.sleep(3000);
		
		CountryAliasPage cap = new CountryAliasPage(driver);
		cap.clickOncountryAliasLink();
		cap.addRow();
		
		Utility.captureScreenShot(driver, "CountryAlias_AddRow");
	}

}
