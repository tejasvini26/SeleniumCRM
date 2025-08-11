package basicScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoapps.qspiders.com/ui/alert/prompt?sublist=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.id("deleteButton")).click();
		Alert popup = driver.switchTo().alert();
		System.out.println(popup.getText());
		popup.sendKeys("Qspiders Rajajinagar");
		popup.accept();
	}
}
