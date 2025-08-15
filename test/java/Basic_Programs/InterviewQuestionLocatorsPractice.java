package Basic_Programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InterviewQuestionLocatorsPractice {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		//driver.findElement(By.name("field-keywords")).sendKeys("sunscreen");
		//driver.findElement(By.id("nav-search-submit-button")).click();
		//driver.findElement(By.linkText("Fresh")).click();
		//driver.findElement(By.partialLinkText("Player")).click();
		//driver.findElement(By.cssSelector(".ico-register")).click();
		driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("prakashgmalagi@gmail.com");

	}

}
