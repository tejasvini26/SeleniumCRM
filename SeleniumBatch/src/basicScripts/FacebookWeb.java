package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookWeb {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement usn = driver.findElement(By.id("email"));
		if(usn.isDisplayed())
		{
			System.out.println("USN is displayed");
			if(usn.isEnabled())
			{
				System.out.println("USN is enabled");
				if(usn.isSelected())
				{
					System.out.println("USN is selected");
				}
				else {
					System.out.println("USN is not selected");
				}
			}
			else {
				System.out.println("USN is not enabled");
			}
		}
		else {
			System.out.println("USN is not displayed");
		}
		driver.quit();
	}
}
