package basicScripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartMouseAction {
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com");
		Actions a = new Actions(driver);
		
		WebElement ele = driver.findElement(By.xpath("//span[.='Kilos']"));
		Thread.sleep(2000);
		a.contextClick(ele).perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		
		WebElement mob = driver.findElement(By.xpath("//span[.='Mobiles']"));
		Thread.sleep(3000);
		a.contextClick(mob).perform();
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		WebElement app = driver.findElement(By.xpath("//span[.='Appliances']"));
		Thread.sleep(4000);
		a.contextClick(app).perform();
		Robot r2 = new Robot();
		r2.keyPress(KeyEvent.VK_DOWN);
		r2.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(4000);
		r2.keyPress(KeyEvent.VK_ENTER);
		r2.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		WebElement flight = driver.findElement(By.xpath("//span[.='Flight Bookings']"));
		Thread.sleep(4000);
		a.contextClick(flight).perform();
		Robot r3 = new Robot();
		r3.keyPress(KeyEvent.VK_DOWN);
		r3.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r3.keyPress(KeyEvent.VK_ENTER);
		r3.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		
		Robot r4 = new Robot();
		r4.keyPress(KeyEvent.VK_CONTROL);
		r4.keyPress(KeyEvent.VK_TAB);
		r4.keyRelease(KeyEvent.VK_TAB);
		r4.keyPress(KeyEvent.VK_TAB);
		r4.keyRelease(KeyEvent.VK_TAB);
		r4.keyRelease(KeyEvent.VK_CONTROL);
	}
}
