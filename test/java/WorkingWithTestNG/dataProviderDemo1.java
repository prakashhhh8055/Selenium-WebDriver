package WorkingWithTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderDemo1 {
	
	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@Test(priority=1,dataProvider="DP")
	void testLogin(String email,String pwd)
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Boolean status=driver.findElement(By.xpath("//p[text()='manda Akki']")).isDisplayed();
		if(status==true)
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.fail();
		}
	}
	
	
	@AfterClass
	void tearDown()
	{
		driver.close();
	}
	
	@DataProvider(name="DP")
	Object[][] loginData()
	{
		Object data[][]= {
				{"prakashgmalagi@gmail.com","Dboss@8055"},
				{"7406203273","Prakash@8055"},
				{"ranjeethaammu201@gmail.com","Ranju@123"},
				{"8123577835","Dboss@8055"},
				{"Admin","admin123"}
				};
		return data;
		
	}

}
