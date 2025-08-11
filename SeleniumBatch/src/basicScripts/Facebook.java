package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Tejasvini/OneDrive/Desktop/sel/BasicPage.html");
		driver.findElement(By.cssSelector("a[href='https://www.fb.com']")).click();
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("Tejasviniii");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("abcd@123");
		driver.findElement(By.cssSelector("button[name='login']")).click();		
		driver.quit();
	}
}