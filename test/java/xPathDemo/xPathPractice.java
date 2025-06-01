package xPathDemo;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class xPathPractice {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver=new ChromeDriver();
		driver.get("https://trulyfreehome.dev/");
		driver.manage().window().maximize();
		
		driver.wait(5000);
		
		driver.findElement(By.xpath("//input[@placeholder='Search Truly Free']")).sendKeys("Laundry");
		
		//Xpath with Multiple Attributes
		driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search Truly Free']")).sendKeys("Laundry Wash");
		
		//Xpath using Or & And Condition
		driver.findElement(By.xpath("//input[@name='search' And @placeholder='Search Truly Free']")).sendKeys("Laundry Wash");
		driver.findElement(By.xpath("//input[@name='search' Or @placeholder='Search Truly Free']")).sendKeys("Laundry Wash");
		
		//Xpath using text()-->inner text
		driver.findElement(By.xpath("//*[text()='About Us']")).click();
		boolean Status=driver.findElement(By.xpath("//h2[text()='Trending on Social']")).isDisplayed();
		System.out.println(Status);
		String Value=driver.findElement(By.xpath("//*[text()='Trending on Social']")).getText();
		System.out.println(Value);
		
		//Xpath using contains()
		driver.findElement(By.xpath("//*[contains(@placeholder, 'Truly')]")).sendKeys("Cleaners");
		
		//Xpath using Starts-with()
		String Value1=driver.findElement(By.xpath("//h2[starts-with(text(), 'Top')]")).getText();
		System.out.println(Value1);
		
		//Xpath using both contains and text
		String Value2= driver.findElement(By.xpath("//h2[contains(text(), 'Top Member Savings')]")).getText();
		System.out.println(Value2);
	}
	

}
