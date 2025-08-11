package basicScripts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DescendingDropdown {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		Thread.sleep(2000);
		WebElement Dropdown = driver.findElement(By.id("select-multiple-native"));
		Select s = new Select(Dropdown);
		ArrayList<String> optlist = new ArrayList<String>();
		List<WebElement> opts = s.getOptions();
		for(WebElement opt:opts)
		{
			String txt = opt.getText();
			optlist.add(txt);
		}
		Collections.sort(optlist, Collections.reverseOrder());
		for(String list:optlist)
		{
			System.out.println(list);
		}
		driver.quit();
	}
}
