package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxBrowser {
	public static void main(String[] args) throws InterruptedException 
	{
		FirefoxOptions opts = new FirefoxOptions();
		//opts.addArguments("--disable-notifications");
		opts.addPreference("dom.webnotifications.enabled", false);
		System.setProperty("webdriver.gecko.driver", "./softwares/geckoDriver.exe");
		WebDriver driver = new FirefoxDriver(opts);
		driver.navigate().to("https://demoapps.qspiders.com/ui/browserNot?sublist=0");
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.id("browNotButton"));
		Thread.sleep(2000);
		button.click();
		System.out.println("Execution is success");
	}
}
