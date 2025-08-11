package tasks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium 
{
	public static void main(String[] args) throws AWTException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.xpath("(//a[.='4.33.0 (May 23, 2025)'])[1]"));
		Actions a = new Actions(driver);
		a.contextClick(ele).perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement ele2 = driver.findElement(By.xpath("(//a[.='4.33.0 (May 23, 2025)'])[2]"));
		Actions a2 = new Actions(driver);
		a2.contextClick(ele2).perform();
		Robot r2 = new Robot();
		r2.keyPress(KeyEvent.VK_DOWN);
		r2.keyRelease(KeyEvent.VK_DOWN);
		r2.keyPress(KeyEvent.VK_ENTER);
		r2.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement ele3 = driver.findElement(By.xpath("(//a[.='4.33.0 (May 23, 2025)'])[2]"));
		Actions a3 = new Actions(driver);
		a3.contextClick(ele3).perform();
		Robot r3 = new Robot();
		r3.keyPress(KeyEvent.VK_DOWN);
		r3.keyRelease(KeyEvent.VK_DOWN);
		r3.keyPress(KeyEvent.VK_ENTER);
		r3.keyRelease(KeyEvent.VK_ENTER);
	}
}
