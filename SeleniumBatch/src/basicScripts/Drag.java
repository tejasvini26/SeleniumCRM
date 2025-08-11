package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoapps.qspiders.com/ui/dragDrop?sublist=0");
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("(//div[.='Drag Me'])[5]"));
		Thread.sleep(2000);
		a.clickAndHold(ele).moveByOffset(154, -112).release(ele).perform();
	}
}
