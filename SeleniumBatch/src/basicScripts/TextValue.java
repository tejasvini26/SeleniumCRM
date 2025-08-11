package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextValue {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fb.com/");
		WebElement login = driver.findElement(By.name("login"));
		String txt = login.getText();
		System.out.println(txt);
		WebElement link = driver.findElement(By.xpath("//a[.='Forgotten password?']"));
		System.out.println(link.getText());
		driver.quit();
	}
}
