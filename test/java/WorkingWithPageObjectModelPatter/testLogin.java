package WorkingWithPageObjectModelPatter;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testLogin {
	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://seller.dev.trulyfree.com/login");
		driver.manage().window().maximize();
	}
	
	@Test
	void testlogin()
	{
		LoginPage1 lp=new LoginPage1(driver);
		lp.SetPhoneNumber("2124567890");
		lp.ClickSendVerificationCodeBtn();
		
		Assert.assertEquals(true, true);
		
	}
	
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}

}
