package dcaCmsPages;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Buttons {
	
	static WebDriver driver;
	public static void previousButton(WebDriver driver) throws Exception
	{
		Logger logger = Logger.getLogger(Buttons.class);
		PropertyConfigurator.configure("log4j.properties");
		
		driver.findElement(By.xpath("//div[@class='pager']/ul[@id='yw0']/li[7]/a")).click();
		logger.info("Clicking a specific page button to perform prev_button operation");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='pager']/ul[@id='yw0' and @class='yiiPager']/li[2]/a")).click();
		logger.info("Click on Previous Button");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='pager']/ul[@id='yw0' and @class='yiiPager']/li[2]/a")).click();
		logger.info("2nd time click on previous Button");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='pager']/ul[@id='yw0' and @class='yiiPager']/li[2]/a")).click();
		logger.info("3rd time click on previous Button");
	}
	public static void pageNumberButton(WebDriver driver) throws InterruptedException
	{
		Logger logger = Logger.getLogger(Buttons.class);
		PropertyConfigurator.configure("log4j.properties");
		
		driver.findElement(By.xpath("//div[@class='pager']/ul[@id='yw0']/li[4]/a")).click();
		logger.info("Click on any pageButton");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='pager']/ul[@id='yw0']/li[5]/a")).click();
		logger.info("Again click on any pageButton");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='pager']/ul[@id='yw0']/li[6]/a")).click();
		logger.info("Again click on another pageButton");
		Thread.sleep(4000);
	}
	public static void nextButton(WebDriver driver) throws InterruptedException
	{
		Logger logger = Logger.getLogger(Buttons.class);
		PropertyConfigurator.configure("log4j.properties");
		
		driver.findElement(By.xpath("//a[text()='Next >']")).click();
		logger.info("Click on NextButton");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Next >']")).click();
		logger.info("2nd time click on NextButton");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Next >']")).click();
		logger.info("3rd time click on NextButton");

		
	}

}
