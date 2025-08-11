package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.redbus.in/");
		driver.findElement(By.xpath("//span[@class='doj___64c190']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='20']")).click();
	}
}
