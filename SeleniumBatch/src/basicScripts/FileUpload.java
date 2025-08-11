package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		Thread.sleep(2000);
		WebElement upload = driver.findElement(By.id("resume"));
		Thread.sleep(2000);
		upload.sendKeys("C:\\Users\\Tejasvini\\OneDrive\\Desktop\\Admin.txt");
	}
}
