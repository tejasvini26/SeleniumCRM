package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Location {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fb.com/");
		WebElement usn = driver.findElement(By.id("email"));
		Point loc = usn.getLocation();
		System.out.println(loc);
		System.out.println(loc.getX());
		System.out.println(loc.getY());
		WebElement login = driver.findElement(By.name("login"));
		Point loc1 = login.getLocation();
		System.out.println(loc1);
		driver.quit();
	}
}
