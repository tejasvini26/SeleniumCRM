package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script09 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Tejasvini/OneDrive/Desktop/sel/BasicPage.html");
		driver.findElement(By.id("u1")).sendKeys("ahusjxkx");
		driver.findElement(By.name("p1")).sendKeys("gsw856");
		driver.findElement(By.tagName("a")).click();
		driver.quit();
	}
}
