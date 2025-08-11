package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Tejasvini");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("tejasvini@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("t123456");
		driver.findElement(By.xpath("//input[@name='email']")).clear();
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		driver.quit();
	}	
}
