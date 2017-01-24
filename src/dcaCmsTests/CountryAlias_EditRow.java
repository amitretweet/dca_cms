package dcaCmsTests;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

//This is the Test Class for CountryAlias_EditRow functionality.
import dcaCmsBase.Base;
import dcaCmsBase.Utility;
import dcaCmsPages.CountryAliasPage;
import dcaCmsPages.LoginPage;

public class CountryAlias_EditRow extends Base{
	@Test
	public void aditRowRow() throws Exception
	{
		Logger logger = Logger.getLogger(CountryAlias_EditRow.class);
		PropertyConfigurator.configure("log4j.properties");
		logger.info("**This Test is verifying CountryAlias_EditRow functionality**");
		
		LoginPage.loginUser(driver);
		CountryAliasPage cap=new CountryAliasPage(driver);
		Thread.sleep(3000);
		cap.clickOncountryAliasLink();
		cap.editRow();
		Utility.captureScreenShot(driver, "CountryAlias_EditRow");
		
	}

}
