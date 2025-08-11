package testNGScripts;

import org.testng.annotations.Test;

public class FacebookPriority {
	public class Facebook {
		@Test(priority = 1)
		public void signup()
		{
			System.out.println("Successfuly signed up");
		}
		@Test(priority = 2)
		public void login()
		{
			System.out.println("Successfuly logged in");
		}
		@Test(priority = 3)
		public void homepage()
		{
			System.out.println("Successfuly accessed homepage");
		}
		@Test(priority = 4)
		public void profile()
		{
			System.out.println("Successfuly updated profile");
		}
		@Test(priority = 5)
		public void logout()
		{
			System.out.println("Successfuly signed up");
		}
	}
}
