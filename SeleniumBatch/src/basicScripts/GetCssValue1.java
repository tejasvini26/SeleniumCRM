package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fb.com/");
		WebElement login = driver.findElement(By.name("login"));
		String val = login.getCssValue("color");
		System.out.println(val);
		String val1 = login.getCssValue("font-family");
		System.out.println(val1);
		driver.quit();
	}
}
