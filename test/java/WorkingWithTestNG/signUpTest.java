package WorkingWithTestNG;

import org.testng.annotations.Test;

public class signUpTest {
	
	@Test(priority=1, groups={"regression"})
	void signupWithEmail()
	{
		System.out.println("Signup with email is successfull");
	}
	
	@Test(priority=2, groups={"regression"})
	void signupWithFacebook()
	{
		System.out.println("Signup with facebook is successfull");
	}
	
	@Test(priority=3, groups={"regression"})
	void signupWithInstagram()
	{
		System.out.println("Signup with instagram is successfull");
	}

}
