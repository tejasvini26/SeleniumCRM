package basicScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOneByOneClose 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Shop Now']")).click();
		Set<String> wins = driver.getWindowHandles();
		for(String win : wins)
		{
			WebDriver tab = driver.switchTo().window(win);
			System.out.println(tab.getTitle());
			Thread.sleep(2000);
			tab.close();
		}
	}
}
