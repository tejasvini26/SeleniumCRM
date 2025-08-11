package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoDropdown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		Thread.sleep(2000);
		WebElement Dropdown = driver.findElement(By.id("select-multiple-native"));
		Select s = new Select(Dropdown);
		if(s.isMultiple())
		{
			s.selectByVisibleText("Fjallraven - Foldsac...");
			
		} 
		else {
			System.out.println("It is a single select dropdown");
		}
	}
}
