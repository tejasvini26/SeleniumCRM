package testNGScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Facebook {
	@Test
	public void signup()
	{
		System.out.println("Successfuly signed up");
	}
	@Test(dependsOnMethods = "signup")
	public void login()
	{
		System.out.println("Successfuly signed up");
	}
	@Test(dependsOnMethods = "login")
	public void homepage()
	{
		Assert.fail();
		System.out.println("Successfuly signed up");
	}
	@Test(dependsOnMethods = "homepage")
	public void profile()
	{
		System.out.println("Successfuly signed up");
	}
	@Test(dependsOnMethods = "profile")
	public void logout()
	{
		System.out.println("Successfuly signed up");
	}
}
