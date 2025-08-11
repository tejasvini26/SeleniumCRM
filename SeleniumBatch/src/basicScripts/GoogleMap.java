package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleMap {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/maps/@12.9972877,77.548317,15z?entry=ttu&g_ep=EgoyMDI1MDUwNy4wIKXMDSoASAFQAw%3D%3D");
		driver.findElement(By.xpath("//span[@class='google-symbols NhBTye G47vBd']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Choose starting point, or click on the map...']")).sendKeys("Qspider Rajajinagar");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@data-tooltip='Search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Choose destination...' and @tooltip='Choose destination...']")).sendKeys("Indiranagar");

	}
}
