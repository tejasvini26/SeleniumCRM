package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		WebElement Fashion = driver.findElement(By.xpath("//span[.='Beauty, Toys & More']"));
		Actions a = new Actions(driver);
		Thread.sleep(2000);
		a.moveToElement(Fashion).perform();
	}
}
