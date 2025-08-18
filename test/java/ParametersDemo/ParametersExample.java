package ParametersDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersExample {
	
	WebDriver driver;
	@BeforeClass
	@Parameters({"browser"})
	void setup(String br) throws InterruptedException
	{
		switch(br.toLowerCase())
		{
		case "chrome": driver=new ChromeDriver();break;
		case "edge": driver=new EdgeDriver();break;
		case "firefox": driver=new FirefoxDriver();break;
		default: System.out.println("Invalid Browser");return;
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	@Test(priority=0)
	void titleTest()
	{
		String title=driver.getTitle();
		Assert.assertEquals(title,"OrangeHRM");	
	}
	
	@Test(priority=1)
	void logoTest() throws InterruptedException
	{
		Thread.sleep(3000);
		Boolean logo=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertTrue(logo);
	}
	
	@Test(priority=2)
	void urlTest()
	{
		Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test(priority=3)
	void loginTest() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		Thread.sleep(2000);
		Boolean status=driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();
		Assert.assertTrue(status);
	}
	
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}

}
