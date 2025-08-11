package assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerificationHardAssert {
	@Test
	public void verifyTitle()
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String ExpectedTitle = "Facebook – log in or sign up";
		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		System.out.println("Excecution is processed");
		driver.quit();
	}
}
