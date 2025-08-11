package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions opts = new ChromeOptions();
		opts.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "./softwares/chromeDriver.exe");
		WebDriver driver = new ChromeDriver(opts);
		driver.navigate().to("https://demoapps.qspiders.com/ui/browserNot?sublist=0");
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.id("browNotButton"));
		Thread.sleep(2000);
		button.click();
		System.out.println("Execution is success");
	}
}
