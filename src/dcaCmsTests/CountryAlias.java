package dcaCmsTests;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

//This is the Test Class for CountryAlias tab link.
import dcaCmsBase.Base;
import dcaCmsBase.Utility;
import dcaCmsPages.CountryAliasPage;
import dcaCmsPages.LoginPage;

public class CountryAlias extends Base {
	
	@Test
	public void countryAlias() throws Exception
	{
		Logger logger = Logger.getLogger(CountryAlias.class);
		PropertyConfigurator.configure("log4j.properties");
		logger.info("**This Test is verifying CountryAlias_Tab_Click functionality**");
		
		LoginPage.loginUser(driver);
		Thread.sleep(2000);
		
		CountryAliasPage cap=new CountryAliasPage(driver);
		cap.clickOncountryAliasLink();
		Thread.sleep(4000);
		
		Utility.captureScreenShot(driver, "CountryAlias");
		
	}

}
