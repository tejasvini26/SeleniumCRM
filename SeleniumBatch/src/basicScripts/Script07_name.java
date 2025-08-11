package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script07_name {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Tejasvini/OneDrive/Desktop/sel/BasicLink.html");
		driver.findElement(By.name("link")).click();
		driver.quit();
		}
}
