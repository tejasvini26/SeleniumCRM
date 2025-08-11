package runnerScripts;

import org.testng.annotations.Test;

import baseScript.BasePage;

public class TestCase01 extends BasePage
{
	@Test
	public void FetchTitle()
	{
		System.out.println(driver.getTitle());
	}
}
