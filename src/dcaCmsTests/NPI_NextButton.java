package dcaCmsTests;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

//This is the Test Class for NPI_NextButton Functionality.
import dcaCmsBase.Base;
import dcaCmsBase.Utility;
import dcaCmsPages.Buttons;
import dcaCmsPages.LoginPage;
import dcaCmsPages.NPI_Page;

public class NPI_NextButton extends Base {
	
	@Test
	public void nextButton() throws Exception
	{
		Logger logger = Logger.getLogger(NPI_NextButton.class);
		PropertyConfigurator.configure("log4j.properties");
		logger.info("**This Test is verifying NPI_NextButton functionality**");
		
		LoginPage.loginUser(driver);
		Thread.sleep(4000);
		
		NPI_Page npi = new NPI_Page(driver);
		npi.clickOnNPITab();
		Thread.sleep(3000);
		Buttons.nextButton(driver);
		Thread.sleep(3000);
		
		Utility.captureScreenShot(driver, "NPI_NextButton");
	}
	
	

}
