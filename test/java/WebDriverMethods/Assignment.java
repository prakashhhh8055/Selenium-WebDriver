package WebDriverMethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		List<WebElement> we=driver.findElement(By.xpath("(//div[@id='wikipedia-search-result-link'])"));
		

	}

}
