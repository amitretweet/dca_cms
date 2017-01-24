package dcaCmsTests;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

//This is the Test Class for NPI_PreviousButton Functionality.
import dcaCmsBase.Base;
import dcaCmsBase.Utility;
import dcaCmsPages.Buttons;
import dcaCmsPages.LoginPage;
import dcaCmsPages.NPI_Page;

public class NPI_PreviousButton extends Base{
	
	@Test
	public void previousButton() throws Exception
	{
		Logger logger = Logger.getLogger(NPI_PreviousButton.class);
		PropertyConfigurator.configure("log4j.properties");
		logger.info("**This Test is verifying NPI_PreviousButton functionality**");
		
		LoginPage.loginUser(driver);
		Thread.sleep(3000);
		
		NPI_Page npi = new NPI_Page(driver);
		npi.clickOnNPITab();
		Buttons.previousButton(driver);
		Thread.sleep(3000);
		
		Utility.captureScreenShot(driver, "NPI_PreviousButton");
	}
	

}
