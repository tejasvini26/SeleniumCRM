package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/Tejasvini/OneDrive/Desktop/sel/Page.html");
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		Thread.sleep(2000);
		a.keyDown(ele, Keys.CONTROL).sendKeys("a").keyUp(ele, Keys.CONTROL).perform();
		Thread.sleep(2000);
		a.sendKeys(Keys.DELETE).perform();
	}
}
