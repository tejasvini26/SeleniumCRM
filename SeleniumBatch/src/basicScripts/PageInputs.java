package basicScripts;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageInputs 
{
	public static void main(String[] args) throws InterruptedException 
	{
			System.setProperty("webdriver.chrome.driver", "./softwares/chromeDriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.navigate().to("file:///C:/Users/Tejasvini/OneDrive/Desktop/sel/Page.html");
			WebElement usn = driver.findElement(By.id("u1"));
			usn.sendKeys(Keys.CONTROL+"a");
			usn.sendKeys(Keys.CONTROL+"x");
			Thread.sleep(2000);
			WebElement email = driver.findElement(By.name("e1"));
			email.sendKeys(Keys.CONTROL+"v");
			Thread.sleep(2000);
			WebElement pwd = driver.findElement(By.name("p1"));
			pwd.sendKeys(Keys.CONTROL+"a");
			pwd.sendKeys(Keys.CONTROL+"x");
			Thread.sleep(2000);
			usn.sendKeys(Keys.CONTROL+"v");
			Thread.sleep(2000);
			email.sendKeys(Keys.CONTROL+"a");
			email.sendKeys(Keys.CONTROL+"x");
			Thread.sleep(2000);
			pwd.sendKeys(Keys.CONTROL+"v");
			driver.quit();
	}
}
