package runnerScripts;

import org.testng.annotations.Test;

import baseScript.BasePage;

public class TestCase03 extends BasePage
{
	@Test
	public void CheckForUsn()
	{
		System.out.println(lp.GetusnTF().isDisplayed());
	}
}
