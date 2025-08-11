package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fb.com/");
		WebElement usn = driver.findElement(By.id("email"));
		String tag = usn.getTagName();
		System.out.println(tag);
		WebElement login = driver.findElement(By.name("login"));
		String tag1 = login.getTagName();
		System.out.println(tag1);
		driver.quit();
	}
}
