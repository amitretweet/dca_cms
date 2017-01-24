package dcaCmsPages;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import dcaCmsBase.ReadDataFromexls;

public class LoginPage {
	public WebDriver driver;
	static ReadDataFromexls readfile =new ReadDataFromexls("./Input data file/InputDataFile.xlsx");
	String username=readfile.getData(0, 1, 1);
	String password=readfile.getData(0, 2, 1);
	
	String userinvalid=readfile.getData(0, 1, 2);
	String passinvalid=readfile.getData(0, 2, 2);
	
	public LoginPage(WebDriver driver)
	{
		
		this.driver=driver;
	}
	public void enterUserName()
	{
		driver.findElement(By.xpath("//input[@id='LoginForm_username']")).sendKeys(username);

	}
	public void enterPasswoed()
	{
		driver.findElement(By.xpath("//input[@id='LoginForm_password']")).sendKeys(password);

	}
	public void clickEnterButton()
	{
		driver.findElement(By.xpath("//input[@type='submit' and @value='Enter']")).click();

	}
	public static void loginUser(WebDriver driver) throws InterruptedException
	{
		Logger logger = Logger.getLogger(LoginPage.class);
		PropertyConfigurator.configure("log4j.properties");
		
		LoginPage login=new LoginPage(driver);
		logger.info("Opening Login Page");
		
		login.enterUserName();
		logger.info("Entering UserName");
		Thread.sleep(2000);
		login.enterPasswoed();
		logger.info("Entering PassWord");
		login.clickEnterButton();
		Thread.sleep(2000);
		logger.info("Clicking Enter Button");
	}
	
	public void loginUserInvalid() throws InterruptedException
	{
		Logger logger = Logger.getLogger(LoginPage.class);
		PropertyConfigurator.configure("log4j.properties");
		
		driver.findElement(By.xpath("//input[@id='LoginForm_username']")).sendKeys(userinvalid);
		logger.info("Entering Invalid UserName");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='LoginForm_password']")).sendKeys(passinvalid);
		logger.info("Entering Invalid PassWord");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit' and @value='Enter']")).click();
		logger.info("Clicking Enter Button");		
	}

}
