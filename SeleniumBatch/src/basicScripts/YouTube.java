package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.findElement(By.cssSelector("input[name='search_query']")).sendKeys("Sapthasagara song");
		driver.findElement(By.cssSelector("button[title='Search']")).click();
	}
}
