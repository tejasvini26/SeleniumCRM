package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jio {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jio.com/");
		driver.findElement(By.xpath("//a[.='Mobile' and @class='j-link j-text-body-s is-text header_item-links_link']")).click();
		driver.findElement(By.xpath("//div[.='Recharge' and @data-testid='JDSLink-jds-text']")).click();
		driver.findElement(By.xpath("//input[@id='submitNumber']")).sendKeys("6360443997");
		driver.findElement(By.xpath("//div[.='Recharge' and @data-testid='JDSLink-jds-text']")).click();
	}
}
