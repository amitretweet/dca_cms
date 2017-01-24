package dcaCmsPages;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import dcaCmsBase.ReadDataFromexls;
import dcaCmsBase.Utility;

public class CountryAliasPage {
	WebDriver driver;
	
	//This is the constructor of this class
	public CountryAliasPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//This is the thread for country alias page
	public void clickOncountryAliasLink()
	{
		Logger logger = Logger.getLogger(CountryAliasPage.class);
		PropertyConfigurator.configure("log4j.properties");
		logger.info("Moving to Countryalias Tab");
		driver.findElement(By.xpath("//a[text()='Countries Alias']")).click();
	}
	//This is the thread working for page search under country alias Page
	public void pageSearch() throws InterruptedException
	{
		Logger logger = Logger.getLogger(CountryAliasPage.class);
		PropertyConfigurator.configure("log4j.properties");
		
		ReadDataFromexls readfile = new ReadDataFromexls("./Input data file/InputDataFile.xlsx");
		logger.info("Reading Page number from excel file");
		int page =readfile.getDataInt(0, 3, 1);
		String newpage=Integer.toString(page);
		WebElement ele = driver.findElement(By.xpath("//input[@type='text' and @role='textbox']"));
		logger.info("Locating pagesearch box");
		ele.clear();
		ele.sendKeys(newpage);
		logger.info("Entering Page number coming from excel file into searchbox");
		Thread.sleep(2000);
		ele.sendKeys(Keys.ENTER);
		logger.info("Clickin Enter");
	}
	
	//This is the thread working for adding row under countryAlias Tab
	public void addRow() throws InterruptedException
	{
		Logger logger = Logger.getLogger(CountryAliasPage.class);
		PropertyConfigurator.configure("log4j.properties");
		
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-plus']")).click();
		logger.info("Clicking on Add Icon");
		Thread.sleep(4000);
		
		WebElement alias=driver.findElement(By.xpath("//table[@class='addedit_form']/tbody/tr[1]/td[2]/select"));
		Select dropdown = new Select(alias);
		dropdown.selectByValue("India");
		logger.info("Selecting Alias Value");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//table[@class='addedit_form']/tbody/tr[2]/td[2]/input")).sendKeys("india");
		logger.info("Entering value in Name textbox");
		driver.findElement(By.xpath("//table[@class='addedit_form']/tbody/tr[3]/td[2]/select/option[@value='']")).click();
		logger.info("Selecting Code");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@role='button' and @type='submit' and starts-with(@id, 'bottomSubmit')]")).click();
		logger.info("Clickong Add button");		
	}
	
	//This is the thread working for editRow under country alias Tab
	public void editRow() throws Exception
	{
		Logger logger = Logger.getLogger(CountryAliasPage.class);
		PropertyConfigurator.configure("log4j.properties");
		
		WebElement ele=driver.findElement(By.xpath("//tr[starts-with(@class, 'ui-jqgrid-labels')]/th[2]/div"));
		ele.click();
		Thread.sleep(3000);
		ele.click();
		logger.info("Ready to edit row");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='ui-jqgrid-bdiv']/div/table/tbody/tr[2]")).click();
		logger.info("Selecting Row to Edit");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='ui-pg-div']/span[contains(@class, 'ui-icon-pencil')]")).click();
		logger.info("Clicking on Edit Icon");
		Thread.sleep(3000);
		Utility.captureScreenShot(driver, "CountryAlias_EditRow");
		//Select Alias Value
		WebElement alias= driver.findElement(By.xpath("//table[@class='addedit_form']/tbody/tr[2]/td[2]/select"));
		Select dropdown1 = new Select(alias);
		logger.info("Selecting Alias Value");
		Thread.sleep(4000);
		dropdown1.selectByValue("Australia");
		//Change Name
		WebElement name=driver.findElement(By.xpath("//table[@class='addedit_form']/tbody/tr[3]/td[2]/input"));
		name.clear();
		Thread.sleep(2000);
		name.sendKeys("Australia");
		logger.info("Entering Name in textbox");
		//Select Code
		WebElement code=driver.findElement(By.xpath("//table[@class='addedit_form']/tbody/tr[4]/td[2]/select"));
		Select dropdown2 = new Select(code);
		dropdown2.selectByValue("");
		logger.info("Selecting Code");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[starts-with(@id, 'bottomSubmit')]")).click();
		logger.info("Submitting Edit");	
	}
	//This function deletes the row under country alias page
	public void deleteRow() throws InterruptedException
	{
		Logger logger = Logger.getLogger(CountryAliasPage.class);
		PropertyConfigurator.configure("log4j.properties");
				
		WebElement element=driver.findElement(By.xpath("//tr[starts-with(@class, 'ui-jqgrid-labels')]/th[2]/div"));
		element.click();
		Thread.sleep(3000);
		element.click();
		logger.info("Selecting Row to Delete");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='ui-jqgrid-bdiv']/div/table/tbody/tr[2]")).click();
		logger.info("Row Selected");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//table[@class='ui-jqgrid-btable']/tbody/tr[2]/td[6]/a/span")).click();
		logger.info("Submitting Delete");
		driver.switchTo().alert().accept();
		logger.info("Accepting popup and finalizing Delete Task");
	}
	

}
