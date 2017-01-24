package dcaCmsBase;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class Utility {
	
	public static void captureScreenShot(WebDriver driver, String screenshotname) throws Exception{
		
		Logger logger = Logger.getLogger(Utility.class);
		PropertyConfigurator.configure("log4j.properties");
		logger.info("Capturing Screenshot");
		Thread.sleep(3000);
		try 
		{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=(File) ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./Screenshots/"+screenshotname+".png"));
		logger.info("Screenshot Captured");
		

		} 
		catch (WebDriverException e) 
		{
		System.out.println("Exception has occurred during taking screenshot "+ e.getMessage());
		}
		}
	
}
