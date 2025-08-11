package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action 
{
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver", "./softwares/chromeDriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	WebElement ele = driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]"));
	Actions a = new Actions(driver);
	a.moveToElement(ele).build().perform();
	
	}
}
