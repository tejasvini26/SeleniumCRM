package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(id="email")
	private WebElement usn;
	
	@FindBy(id="pass")
	private WebElement pwd;
	
	@FindBy(name="login")
	private WebElement loginBtn;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement GetusnTF()
	{
		return usn;
	}
	
	public WebElement GetpwdTF()
	{
		return pwd;
	} 
	
	public WebElement LoginBtn()
	{
		return loginBtn;
	}
}
