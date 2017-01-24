package dcaCmsTests;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

//This is the Test Class for CountryAlias_PageSearch functionality.
import dcaCmsBase.Base;
import dcaCmsBase.Utility;
import dcaCmsPages.CountryAliasPage;
import dcaCmsPages.LoginPage;

public class CountryAlias_PageSearch extends Base {
	
	@Test
	public void pageSearch() throws Exception
	{
		Logger logger = Logger.getLogger(CountryAlias_PageSearch.class);
		PropertyConfigurator.configure("log4j.properties");
		logger.info("**This Test is verifying CountryAlias_PageSearch functionality**");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		LoginPage.loginUser(driver);	
		Thread.sleep(3000);
		
		CountryAliasPage cap = new CountryAliasPage(driver);
		cap.clickOncountryAliasLink();
				
		cap.pageSearch();
		Thread.sleep(3000);
		
		Utility.captureScreenShot(driver, "CountryAlias_PageSearch");
		
		
	}

}
