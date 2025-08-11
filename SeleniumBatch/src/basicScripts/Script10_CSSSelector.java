package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script10_CSSSelector {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Tejasvini/OneDrive/Desktop/sel/BasicPage.html");
		driver.findElement(By.cssSelector("input[id='u1']")).sendKeys("ahusjxkx");
		driver.findElement(By.cssSelector("input[name='p1']")).sendKeys("ahusjxkx");
		driver.findElement(By.cssSelector("input[type='radio']")).click();
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		driver.findElement(By.cssSelector("a[href='https://www.fb.com']")).click();
		driver.quit();
	}
}
