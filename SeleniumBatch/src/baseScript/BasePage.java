package baseScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pageObjects.LoginPage;

public class BasePage 
{
	public WebDriver driver;
	public LoginPage lp;
	@BeforeMethod
	public void LaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fb.com");
		lp = new LoginPage(driver);
	}
	@AfterMethod
	public void CloseBrowser()
	{
		driver.quit();
	}
}
