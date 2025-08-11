package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebDriverWait ew = new WebDriverWait(driver,10);
		//TC1
		ew.until(ExpectedConditions.titleContains("log in"));
		String title = driver.getTitle();
		System.out.println(title);
		//TC2
		ew.until(ExpectedConditions.urlContains("facebook.com"));
		String url = driver.getCurrentUrl();
		System.out.println(url);
		//TC2
		WebElement ele = driver.findElement(By.id("email"));
		ew.until(ExpectedConditions.visibilityOf(ele));
		ele.sendKeys("admin@gmail.com");
	}
}
