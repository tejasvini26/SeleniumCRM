package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/account/create?specId=usernameregfreeformgender&intl=my&src=tumblr&done=https%3A%2F%2Flogin.yahoo.com%2Faccount%2Ftumblr-migration%3Fcombine%3D0%26done%3Dhttps%253A%252F%252Fapi.login.yahoo.com%252Foauth2%252Frequest_auth%253Fresponse_type%253Dcode%2526redirect_uri%253Dhttps%25253A%25252F%25252Fwww.tumblr.com%25252Fopenid%25252Fconnect%2526client_id%253Ddj0yJmk9WWQ4c29rQ1lsUExhJmQ9WVdrOVNFWkRhVTFsTkdFbWNHbzlNQS0tJnM9Y29uc3VtZXJzZWNyZXQmeD1jZg--%2526nonce%253D37cc48b6f1326d3d7bc02e12608ecb8e%2526state%253D99a510964941f8950d9b46e33d48e704%2526scope%253Dopenid%252Bsdpp-w&context=reg");
		Thread.sleep(2000);
		WebElement usn = driver.findElement(By.id("usernamereg-firstName"));
		usn.sendKeys("Tejasvini");
		WebElement sur = driver.findElement(By.name("lastName"));
		sur.sendKeys("Achar");
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("tejasviniachar@gmail.com");
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("te456");
	}
}
