package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.cssSelector("input[name='q']")).sendKeys("samsung 5g mobile");
		driver.findElement(By.cssSelector("svg[xmlns='http://www.w3.org/2000/svg']")).click();
		driver.findElement(By.cssSelector("div[class='KzDlHZ']")).click();
		driver.findElement(By.cssSelector("button[class='QqFHMw cNEU5Q J9Kkbj _7Pd1Fp']")).click();
		
		//driver.findElement(By.cssSelector("button[title='Search']")).click();
	}
}
