package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleFrame 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Tejasvini/OneDrive/Desktop/sel/multipleframe/mainpage.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("u1")).sendKeys("admin");
		driver.switchTo().parentFrame()
		driver.switchTo().defaultContent();
		driver.findElement(By.name("psw")).sendKeys("admin@123");
		driver.switchTo().frame("f2");
		driver.findElement(By.name("cpsw")).sendKeys("admin@123");
		
	}
	
}
