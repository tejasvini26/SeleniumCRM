package runnerScripts;

import org.testng.annotations.Test;
import baseScript.BasePage;

public class TestCase04 extends BasePage
{
	@Test
	public void LoginTestCase()
	{
		lp.GetusnTF().sendKeys("admin");
		lp.GetpwdTF().sendKeys("admin@123");
		lp.LoginBtn().click();
	}
}
