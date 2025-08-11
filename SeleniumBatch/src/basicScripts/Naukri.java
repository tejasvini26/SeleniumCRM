package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		WebElement fn = driver.findElement(By.id("name"));
		fn.sendKeys("Tejasvini");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("teju234@gmail.com");
		WebElement pswd = driver.findElement(By.id("password"));
		pswd.sendKeys("abcd@123");
		WebElement mob = driver.findElement(By.id("mobile"));
		mob.sendKeys("8974561231");
		WebElement e = driver.findElement(By.xpath("//p[.='  I have work experience (excluding internships)']"));
		e.click();
		WebElement box = driver.findElement(By.xpath("//i[@class = \"ico resman-icon resman-icon-check-box\"]"));
		box.click();
		WebElement reg = driver.findElement(By.xpath("//button[.='Register now']"));
		reg.click();
	}
}
