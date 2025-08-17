package WorkingWithTestNG;

import org.testng.annotations.Test;

public class loginTest {
	
	@Test(priority=1, groups= {"sanity"})
	void loginWithEmail()
	{
		System.out.println("Login With Email Successfull");
	}

	@Test(priority=2, groups= {"sanity"})
	void loginWithFacebook()
	{
		System.out.println("Login With Facebook Successfull");
	}
	
	@Test(priority=3, groups= {"sanity"})
	void loginWithInstagram()
	{
		System.out.println("Login With Instagram Successfull");
	}
}
