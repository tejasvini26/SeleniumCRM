package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("file:///C:/Users/Tejasvini/OneDrive/Desktop/sel/dropdown.html");
		WebElement Dropdown = driver.findElement(By.id("celebrities"));
		Select s = new Select(Dropdown);
		if(s.isMultiple())
		{
			System.out.println("It is a multi select dropdown");
			s.selectByIndex(0);
			s.selectByValue("j");
			s.selectByVisibleText("Yash");
			s.selectByVisibleText("Dhoni");
			Thread.sleep(2000);
			s.deselectByIndex(0);
			s.deselectByValue("j");
			s.deselectByVisibleText("Yash");
			s.deselectAll();
		} 
		else 
		{
			System.out.println("It is a Single select dropdown");
		}
		//driver.quit();
	}
}
