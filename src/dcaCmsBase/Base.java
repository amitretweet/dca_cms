package dcaCmsBase;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/******This is Base class for this project.All common functionalities are defined here*******/

public class Base {
	
	public WebDriver driver;
	
	//Perform Browser opening...
	@BeforeMethod
	public void openBrowser()
	{		
		this.setBrowser("firefox");
		driver.manage().window().maximize();
		driver.get("https://dca.techletsolutions.com/admin/index/login");
	}
	//Sets Browser in case of cross-browser testing.
	public void setBrowser(String browserName)
	{
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
			driver=new ChromeDriver();
		}
		else if (browserName.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
	}
	

	@AfterMethod
	public void closeBrowser()
	{
		Logger logger = Logger.getLogger(Base.class);
		PropertyConfigurator.configure("log4j.properties");
		logger.info("****This Test is completed****Moving to next Test****");
		driver.quit();
	}
	

}
