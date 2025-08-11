package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fb.com/");
		WebElement login = driver.findElement(By.name("login"));
		int H = login.getSize().getHeight();
		System.out.println(H);
		int W = login.getSize().getWidth();
		System.out.println(W);
		driver.quit();
	}
}
