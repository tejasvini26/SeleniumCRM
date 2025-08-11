package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchLinkTextForeach {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int countOfElements = links.size();
		System.out.println(countOfElements);
		for(WebElement link : links)
		{
				//links.get(i);
				String txt = link.getText();
				System.out.println(txt);	
		}
		driver.quit();
	}
}
