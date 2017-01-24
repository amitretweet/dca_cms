package dcaCmsPages;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

import dcaCmsBase.ReadDataFromexls;
import dcaCmsBase.Utility;
/*
 * This is a page class for New Product Image Tab.
 * It contains scripting code for all the functionalities under this Tab
 */
public class NPI_Page {
	
	WebDriver driver;
	//This is the constructor for this Page class
	public NPI_Page(WebDriver driver)
	{
		this.driver=driver;
	}
	//This will Open New Product Image Tab
	public void clickOnNPITab() throws Exception
	{
		Logger logger = Logger.getLogger(NPI_Page.class);
		PropertyConfigurator.configure("log4j.properties");
		try
		{
		driver.findElement(By.xpath("//a[text()='New Product Images']")).click();
		logger.info("Moving to New Product Image Tab");
		}
		catch (WebDriverException e)
		{
			logger.info("Exception:Clicking NPI tab");
			Utility.captureScreenShot(driver, "Exception:clickingNPI_tab");
		}
	}
	//This will sort the whole NPI Page according to Id
	public void sortById() throws Exception
	{
		Logger logger = Logger.getLogger(NPI_Page.class);
		PropertyConfigurator.configure("log4j.properties");
		try
		{
		driver.findElement(By.xpath("//a[text()='Id']")).click();
		logger.info("Clicking on ID Tab for Sorting");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Id']")).click();
		logger.info("Everything is now sorted By ID");
		}
		catch(WebDriverException e)
		{
			logger.info("Exception in sorting by ID");
			Utility.captureScreenShot(driver, "Exception:sortByID");
		}
	}
	//This will sort the whole NPI Page according to Barcode.
	public void sortByBarcode() throws Exception
	{
		Logger logger = Logger.getLogger(NPI_Page.class);
		PropertyConfigurator.configure("log4j.properties");
		
		try
		{
		WebElement element=driver.findElement(By.xpath("//a[text()='Barcode']"));
		logger.info("Clicking on Barcode Tab and Sorting By Barcode");
		Thread.sleep(5000);
		element.click();
		}
		catch(WebDriverException e)
		{
			logger.info("Exception in sort by barcode");
			Utility.captureScreenShot(driver, "Exception:sortByBarcode");
		}
	}
	//This will sort the whole NPI Page according to Date Image Taken
	public void sortByDateImageTaken() throws Exception
	{
		Logger logger = Logger.getLogger(NPI_Page.class);
		PropertyConfigurator.configure("log4j.properties");
		try
		{
		driver.findElement(By.xpath("//th[@id='table_c2']/a")).click();
		logger.info("Clicking on DateImageTaken and Sorting By DateImageTaken");
		}
		catch(WebDriverException e)
		{
			logger.info("Exception in sort by date image taken");
			Utility.captureScreenShot(driver, "Exception:sortByDateImageTaken");
		}
		
	}
	//This will sort the whole NPI Page according to Sort By Latitude
	public void sortByLatitude() throws Exception
	{
		Logger logger = Logger.getLogger(NPI_Page.class);
		PropertyConfigurator.configure("log4j.properties");
		
		try
		{
		driver.findElement(By.xpath("//th[@id='table_c4']/a")).click();
		logger.info("Clicking On SortByLatitude and Sorting By SortByLatitude");
		}
		catch(WebDriverException e)
		{
			logger.info("Exception in sort by latitude");
			Utility.captureScreenShot(driver, "Exception:sortByLatitude");
			
		}
	}
	//This will sort the whole NPI Page according to Sort By Sort By Longitude
	public void sortByLongitude() throws Exception
	{
		Logger logger = Logger.getLogger(NPI_Page.class);
		PropertyConfigurator.configure("log4j.properties");
		
		try
		{
		driver.findElement(By.xpath("//th[@id='table_c5']/a")).click();		
		logger.info("Clicking On SortByLongitude and Sorting By SortByLongitude");		
		}
		catch(WebDriverException e)
		{
			logger.info("Exception in sort by longitude");
			Utility.captureScreenShot(driver, "Exception:sortByLatitude");			
		}
	}
	//This will sort the whole NPI Page according to Sort By Email Photo Taken
	public void sortByEmailPhotoTaken() throws Exception
	{
		Logger logger = Logger.getLogger(NPI_Page.class);
		PropertyConfigurator.configure("log4j.properties");
		
		try
		{
		WebElement scroll = driver.findElement(By.xpath("//th[@id='table_c6']/a"));
		JavascriptExecutor js = (JavascriptExecutor)driver; 
		js.executeScript("arguments[0].scrollIntoView()", scroll);
		logger.info("Scrolling To EmailPhotoTaken link");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//th[@id='table_c6']/a")).click();
		logger.info("Clicking On EmailPhotoTaken and Sorting By EmailPhotoTaken");
		}
		catch(WebDriverException e)
		{
			logger.info("Exception in sort by email photo taken");
			Utility.captureScreenShot(driver, "Exception:sortByEmailPhotoTaken");
		}
	}
	//This will sort the whole NPI Page according to Sort By Country Photo Taken
	public void sortByCountryPhotoTaken() throws Exception
	{
		Logger logger = Logger.getLogger(NPI_Page.class);
		PropertyConfigurator.configure("log4j.properties");
		
		try
		{
		WebElement scroll = driver.findElement(By.xpath("//th[@id='table_c7']/a"));
		JavascriptExecutor js = (JavascriptExecutor)driver; 
		js.executeScript("arguments[0].scrollIntoView()", scroll);
		logger.info("Scrolling To CountryPhotoTaken tab_link");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//th[@id='table_c7']/a")).click();
		logger.info("Clicking On CountryPhotoTaken and Sorting By CountryPhotoTaken");
		}
		catch(WebDriverException e)
		{
			logger.info("Exception in sort by country photo taken");
			Utility.captureScreenShot(driver, "Exception:sortByCountryPhotoTaken");
		}

	}
	//This will sort the whole NPI Page according to Sort By Send Date
	public void sortBySendDate() throws InterruptedException
	{
		Logger logger = Logger.getLogger(NPI_Page.class);
		PropertyConfigurator.configure("log4j.properties");
		try{
		WebElement scroll = driver.findElement(By.xpath("//th[@id='table_c8']/a"));
		JavascriptExecutor js = (JavascriptExecutor)driver; 
		js.executeScript("arguments[0].scrollIntoView()", scroll);
		logger.info("Scrolling To SendDate tab_link");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//th[@id='table_c8']/a")).click();
		logger.info("Clicking On SendDate and Sorting By SendDate");
		}
		catch(WebDriverException e)
		{
			logger.info("Exception in sort by send date");
		}

	}
	//This will sort the whole NPI Page according to Sort By Received Date
	public void sortByReceivedDate() throws InterruptedException
	{
		Logger logger = Logger.getLogger(NPI_Page.class);
		PropertyConfigurator.configure("log4j.properties");
		
		WebElement scroll = driver.findElement(By.xpath("//th[@id='table_c9']/a"));
		JavascriptExecutor js = (JavascriptExecutor)driver; 
		js.executeScript("arguments[0].scrollIntoView()", scroll);
		logger.info("Scrolling To ReceivedDate tab_link");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//th[@id='table_c9']/a")).click();
		logger.info("Clicking On ReceivedDate and Sorting By ReceivedDate");
	}
	//This will sort the whole NPI Page according to Sort By Email Photo Send
	public void sortByEmailPhotoSend() throws InterruptedException
	{
		Logger logger = Logger.getLogger(NPI_Page.class);
		PropertyConfigurator.configure("log4j.properties");
		
		WebElement scroll = driver.findElement(By.xpath("//th[@id='table_c10']/a"));
		JavascriptExecutor js = (JavascriptExecutor)driver; 
		js.executeScript("arguments[0].scrollIntoView()", scroll);
		logger.info("Scrolling To EmailPhotoSend tab_link");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//th[@id='table_c10']/a")).click();
		logger.info("Clicking On EmailPhotoSend and Sorting By EmailPhotoSend");
	}
	//This will sort the whole NPI Page according to Sort By Country Photo Send
	public void sortByCountryPhotoSend() throws InterruptedException
	{
		Logger logger = Logger.getLogger(NPI_Page.class);
		PropertyConfigurator.configure("log4j.properties");
		
		WebElement scroll = driver.findElement(By.xpath("//th[@id='table_c11']/a"));
		JavascriptExecutor js = (JavascriptExecutor)driver; 
		js.executeScript("arguments[0].scrollIntoView()", scroll);
		logger.info("Scrolling To CountryPhotoSend tab_link");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//th[@id='table_c11']/a")).click();
		logger.info("Clicking On CountryPhotoSend and Sorting By CountryPhotoSend");
	}
	//This will sort the whole NPI Page according to Sort By Is_Synchronized
	public void sortByIsSynchronized() throws InterruptedException
	{
		Logger logger = Logger.getLogger(NPI_Page.class);
		PropertyConfigurator.configure("log4j.properties");
		
		WebElement scroll = driver.findElement(By.xpath("//th[@id='table_c13']/a"));
		JavascriptExecutor js = (JavascriptExecutor)driver; 
		js.executeScript("arguments[0].scrollIntoView()", scroll);
		logger.info("Scrolling To IsSynchronized tab_link");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//th[@id='table_c13']/a")).click();
		logger.info("Clicking On IsSynchronized and Sorting By IsSynchronized");
	}
	//This will sort the whole NPI Page according to Sort By SyncDate
	public void sortBySyncDate() throws InterruptedException
	{
		Logger logger = Logger.getLogger(NPI_Page.class);
		PropertyConfigurator.configure("log4j.properties");
		
		WebElement scroll = driver.findElement(By.xpath("//th[@id='table_c14']/a"));
		JavascriptExecutor js = (JavascriptExecutor)driver; 
		js.executeScript("arguments[0].scrollIntoView()", scroll);
		logger.info("Scrolling To SyncDate tab_link");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//th[@id='table_c14']/a")).click();
		logger.info("Clicking On SyncDate and Sorting By SyncDate");
		
	}
	//This will work for ID Filter.
	public void searchById() throws InterruptedException
	{
		Logger logger = Logger.getLogger(NPI_Page.class);
		PropertyConfigurator.configure("log4j.properties");
		
		ReadDataFromexls readfile = new ReadDataFromexls("./Input data file/InputDataFile.xlsx");
		int id =readfile.getDataInt(0, 4, 1);
		String newid=Integer.toString(id);	
		logger.info("Reading ID from EXCEL File");
		
		WebElement idsearch = driver.findElement(By.xpath("//tr[@class='filters']/td[1]/input"));
		idsearch.click();
		idsearch.sendKeys(newid);
		Thread.sleep(4000);
		logger.info("Entering ID into ID_FILTERBOX...");
		idsearch.sendKeys(Keys.ENTER);
		logger.info("Pressing Enter and Getting Data");
	}
	//This will work for Barcode Filter.
	public void searchByBarcode() throws InterruptedException
	{
		Logger logger = Logger.getLogger(NPI_Page.class);
		PropertyConfigurator.configure("log4j.properties");
		
		ReadDataFromexls readfile = new ReadDataFromexls("./Input data file/InputDataFile.xlsx");
		Long barcode = readfile.getDataLong(0, 5, 1);		
		System.out.println(barcode);
		String bar = String.valueOf(barcode);
		logger.info("Reading BARCODE from EXCEL File");

		WebElement barcodeSearch=driver.findElement(By.xpath("//tr[@class='filters']/td[2]/input"));
		barcodeSearch.click();
		barcodeSearch.sendKeys(bar);
		logger.info("Entering BARCODE into BARCODE_FILTERBOX...");
		Thread.sleep(4000);
		barcodeSearch.sendKeys(Keys.ENTER);
		logger.info("Pressing Enter and Getting Data");
	}
	//This will work for DateImageTaken Filter.
	public void searchByDateImageTaken() throws InterruptedException
	{
		Logger logger = Logger.getLogger(NPI_Page.class);
		PropertyConfigurator.configure("log4j.properties");
		
		WebElement dateSearch=driver.findElement(By.xpath("//tr[@class='filters']/td[3]/input"));
		dateSearch.click();
		dateSearch.sendKeys("07/10/16"+Keys.ENTER);
		Thread.sleep(4000);
		dateSearch.sendKeys(Keys.ENTER);
		logger.info("Select DATE and Press ENTER");
	}
	//This will work for Latitude Filter.
	public void searchByLatitude() throws InterruptedException
	{
		Logger logger = Logger.getLogger(NPI_Page.class);
		PropertyConfigurator.configure("log4j.properties");
		
		ReadDataFromexls readfile = new ReadDataFromexls("./Input data file/InputDataFile.xlsx");
		float latitude = readfile.getDataFloat(0, 7, 1);
		String lat = String.valueOf(latitude);
		logger.info("Reading LATITUDE from EXCEL File");
		Thread.sleep(3000);
		
		WebElement latitudesearch=driver.findElement(By.xpath("//tr[@class='filters']/td[5]/input"));
		latitudesearch.click();
		latitudesearch.sendKeys(lat);
		logger.info("Entering LATITUDE into LATITUDE_FILTERBOX...");
		latitudesearch.sendKeys(Keys.ENTER);
		logger.info("Pressing Enter and Getting Data");
	}
	//This will work for Longitude Filter.
	public void searchByLongitude()
	{
		Logger logger = Logger.getLogger(NPI_Page.class);
		PropertyConfigurator.configure("log4j.properties");
		
		ReadDataFromexls readfile = new ReadDataFromexls("./Input data file/InputDataFile.xlsx");
		float longitude = readfile.getDataFloat(0, 8, 1);
		String newlongitude = String.valueOf(longitude);	
		logger.info("Reading LONGITUDE from EXCEL File");
		WebElement longitudesearch = driver.findElement(By.xpath("//tr[@class='filters']/td[6]/input"));
		longitudesearch.click();
		longitudesearch.sendKeys(newlongitude);
		logger.info("Entering LATITUDE into LATITUDE_FILTERBOX...");
		longitudesearch.sendKeys(Keys.ENTER);
		logger.info("Pressing ENTER and Getting Data");

	}
	//This will work for EmailPhotoTaken Filter.
	public void searchByEmailPhotoTaken() throws InterruptedException
	{
		Logger logger = Logger.getLogger(NPI_Page.class);
		PropertyConfigurator.configure("log4j.properties");
		
		ReadDataFromexls readfile = new ReadDataFromexls("./Input data file/InputDataFile.xlsx");
		String email = readfile.getData(0, 9, 1);
		logger.info("Reading EmailPhotoTaken from EXCEL File");
		WebElement emailsearch = driver.findElement(By.xpath("//tr[@class='filters']/td[7]/input"));
		emailsearch.click();
		emailsearch.sendKeys(email);
		logger.info("Entering EmailPhotoTaken into EmailPhotoTaken_FILTERBOX...");
		Thread.sleep(3000);
		emailsearch.sendKeys(Keys.ENTER);
		logger.info("Pressing ENTER and Getting Data");
	}
	//This will work for CountryPhotoTaken Filter.
	public void searchByCountryPhotoTaken() throws InterruptedException
	{
		Logger logger = Logger.getLogger(NPI_Page.class);
		PropertyConfigurator.configure("log4j.properties");
		
		ReadDataFromexls readfile = new ReadDataFromexls("./Input data file/InputDataFile.xlsx");
		String countryphototaken = readfile.getData(0, 10, 1);
		logger.info("Reading CountryPhotoTaken from EXCEL File");
		
		WebElement countryphototakensearch = driver.findElement(By.xpath("//tr[@class='filters']/td[8]/input"));
		countryphototakensearch.click();
		countryphototakensearch.sendKeys(countryphototaken);
		logger.info("Entering CountryPhotoTaken into CountryPhotoTaken_FILTERBOX...");
		Thread.sleep(3000);
		
		countryphototakensearch.sendKeys(Keys.ENTER);
		logger.info("Pressing ENTER and Getting Data");		
	}
	
	//This will work for SendDate Filter.
	public void searchBySendDate() throws InterruptedException
	{
		Logger logger = Logger.getLogger(NPI_Page.class);
		PropertyConfigurator.configure("log4j.properties");
		
		WebElement senddateSearch=driver.findElement(By.xpath("//input[@id='date_photo_send']"));
		senddateSearch.click();
		senddateSearch.sendKeys("23/10/14"+Keys.ENTER);
		logger.info("Selecting Date for Send Date Filter");
		Thread.sleep(3000);
		senddateSearch.sendKeys(Keys.ENTER);
		logger.info("Pressing ENTER and Getting Data");				
	}
	
	//This will work for ReceivedDate Filter.
	public void searchByReceivedDate() throws InterruptedException
	{
		Logger logger = Logger.getLogger(NPI_Page.class);
		PropertyConfigurator.configure("log4j.properties");
		
		WebElement receiveddateSearch=driver.findElement(By.xpath("//input[@id='date_photo_received']"));
		receiveddateSearch.click();
		receiveddateSearch.sendKeys("07/12/16"+Keys.ENTER);
		logger.info("Selecting Date for Received Date Filter");
		Thread.sleep(3000);

		receiveddateSearch.sendKeys(Keys.ENTER);
		logger.info("Pressing ENTER and Getting Data");				
	}
	//This will work for EmailPhotoSend Filter.
	public void searchByEmailPhotoSend() throws InterruptedException
	{
		Logger logger = Logger.getLogger(NPI_Page.class);
		PropertyConfigurator.configure("log4j.properties");
				
		ReadDataFromexls readfile = new ReadDataFromexls("./Input data file/InputDataFile.xlsx");
		String email = readfile.getData(0, 11, 1);
		logger.info("Reading EmailPhotoSend from EXCEL File");
		WebElement emailsearch = driver.findElement(By.xpath("//tr[@class='filters']/td[11]/input"));
		emailsearch.click();
		emailsearch.sendKeys(email);
		logger.info("Entering EmailPhotoSend into EmailPhotoSend_FILTERBOX...");
		Thread.sleep(4000);		
		emailsearch.sendKeys(Keys.ENTER);
		logger.info("Pressing ENTER and Getting Data");				
	}
	//This will work for CountryPhotoSend Filter.
	public void searchByCountryPhotoSend() throws InterruptedException
	{
		Logger logger = Logger.getLogger(NPI_Page.class);
		PropertyConfigurator.configure("log4j.properties");
		
		ReadDataFromexls readfile = new ReadDataFromexls("./Input data file/InputDataFile.xlsx");
		String countryphotosend = readfile.getData(0, 12, 1);
		logger.info("Reading CountryPhotoSend from EXCEL File");
		
		WebElement countryphotosendsearch = driver.findElement(By.xpath("//tr[@class='filters']/td[12]/input"));
		countryphotosendsearch.click();
		countryphotosendsearch.sendKeys(countryphotosend);
		logger.info("Entering CountryPhotoSend into CountryPhotoSend_FILTERBOX...");

		Thread.sleep(4000);
		countryphotosendsearch.sendKeys(Keys.ENTER);
		logger.info("Pressing ENTER and Getting Data");				
	}
	public void searchByComment() throws InterruptedException
	{
		Logger logger = Logger.getLogger(NPI_Page.class);
		PropertyConfigurator.configure("log4j.properties");
		
		ReadDataFromexls readfile = new ReadDataFromexls("./Input data file/InputDataFile.xlsx");
		String countryphotosend = readfile.getData(0, 6, 1);
		logger.info("Reading Comment from EXCEL File");

		WebElement countryphotosendsearch = driver.findElement(By.xpath("//tr[@class='filters']/td[13]/input"));
		countryphotosendsearch.click();
		countryphotosendsearch.sendKeys(countryphotosend);
		logger.info("Entering Comment into Comment_FILTERBOX...");
		Thread.sleep(4000);
		countryphotosendsearch.sendKeys(Keys.ENTER);
		logger.info("Pressing ENTER and Getting Data");				
	}
	public void searchByIsSynchronized() throws InterruptedException
	{
		Logger logger = Logger.getLogger(NPI_Page.class);
		PropertyConfigurator.configure("log4j.properties");
		
		ReadDataFromexls readfile = new ReadDataFromexls("./Input data file/InputDataFile.xlsx");
		int IsSynchronized =readfile.getDataInt(0, 13, 1);
		String newIsSynchronized=Integer.toString(IsSynchronized);	
		logger.info("Reading IsSynchronized from EXCEL File");
		
		WebElement isSynchronizedsearch = driver.findElement(By.xpath("//tr[@class='filters']/td[14]/input"));
		isSynchronizedsearch.clear();
		isSynchronizedsearch.click();
		isSynchronizedsearch.sendKeys(newIsSynchronized);
		logger.info("Entering IsSynchronized into IsSynchronized_FILTERBOX...");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//tr[@class='filters']/td[14]/input")).sendKeys(Keys.ENTER);
		logger.info("Pressing ENTER and Getting Data");	
	}
	public void SearchBySyncDate() throws InterruptedException
	{
		Logger logger = Logger.getLogger(NPI_Page.class);
		PropertyConfigurator.configure("log4j.properties");
		
		WebElement syncdateSearch=driver.findElement(By.xpath("//input[@id='date_synchronized']"));
		syncdateSearch.click();
		syncdateSearch.sendKeys("02/03/15"+Keys.ENTER);
		logger.info("Selecting Date for Received Date Filter");		
		Thread.sleep(4000);
		
		syncdateSearch.sendKeys(Keys.ENTER);
		logger.info("Pressing ENTER and Getting Data");				
	}
	public void dataExportFunctionality() throws Exception
	{
		Logger logger = Logger.getLogger(NPI_Page.class);
		PropertyConfigurator.configure("log4j.properties");
		try
		{
		driver.findElement(By.xpath("//input[@id='newproductimagessearch_button']")).click();
		logger.info("Clicking On DataExport Icon");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='newproductimagessearch_button1']")).click();
		logger.info("Clicking on Export");
		}
		catch (WebDriverException e)
		{
			logger.info("Exception in Data Export");
			Utility.captureScreenShot(driver, "Exception:dataExport");
			driver.findElement(By.xpath("//input[@id='newproductimagessearch_button1']"));
		}
		
	}
}
