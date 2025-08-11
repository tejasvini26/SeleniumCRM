package testNGScripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTestCase2 {
	@Test
	public void testCase()
	{
		Reporter.log("GOOD AFTERNOON", true);
	}
}
