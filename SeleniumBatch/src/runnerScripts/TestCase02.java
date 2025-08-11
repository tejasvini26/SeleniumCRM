package runnerScripts;

import org.testng.annotations.Test;

import baseScript.BasePage;

public class TestCase02 extends BasePage
{
	@Test
	public void FetchCurrentUrl()
	{
		System.out.println(driver.getCurrentUrl());
	}
}
