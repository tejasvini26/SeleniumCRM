package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClickAndHold 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoapps.qspiders.com/ui/clickHold");
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		WebElement ele = driver.findElement(By.id("circle"));
		Thread.sleep(2000);
		a.clickAndHold(ele).perform();
		Thread.sleep(2000);
		a.release(ele).perform();
	}
}
