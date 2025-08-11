package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchUrl 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int countOfElements = links.size();
		System.out.println(countOfElements);
		for(int i=0; i<countOfElements; i++)
		{
			WebElement link = links.get(i);
			String url = link.getAttribute("href");
			System.out.println(i + " " + url);
		}
		driver.quit();
	}
}
