package WorkingWithTestNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest1 {
	WebDriver driver;
  @Test(priority=1)
  void openwebsite() {
	  driver=new ChromeDriver();
	  driver.get("https://seller.dev.trulyfree.com/login");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.manage().window().maximize();
  }
  
  @Test(priority=2)
  void verifyLogo()
  {
	  Boolean logo=driver.findElement(By.xpath("//img[@class='w-10 h-10']")).isDisplayed();
	  if(logo)
	  {
		  System.out.println("Is logo displyed? -> "+logo);
	  }
	  else
	  {
		  System.out.println("Is logo displayed? -> "+logo);
	  }
  }
  
  @Test(priority=3)
  void verifyLogin() throws InterruptedException
  {
	  driver.findElement(By.id("phoneNumber")).sendKeys("2025172611");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  Thread.sleep(3000);
	  List<WebElement> OTP=driver.findElements(By.xpath("//div[@class=\"relative\"]//input"));
	  for(WebElement singleotp:OTP)
	  {
		  singleotp.sendKeys("1");
	  }
  }
}
