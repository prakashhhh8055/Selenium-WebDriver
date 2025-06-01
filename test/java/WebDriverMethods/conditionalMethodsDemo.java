package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditionalMethodsDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
		System.out.println("Before Selection");
		WebElement male_Status=driver.findElement(By.xpath("//input[@id='gender-male']"));
		boolean male=male_Status.isEnabled();
		System.out.println("Is radio button enabled for men -> "+male);
		WebElement female_Status=driver.findElement(By.xpath("//input[@id='gender-female']"));
		boolean female=female_Status.isEnabled();
		System.out.println("Is radio button enabled for female -> "+female);
		
		
		male_Status.click();
		
		
		System.out.println("After Selection");
		
		male=male_Status.isEnabled();
		System.out.println("Is radio button enabled for men -> "+male);
		
		female=female_Status.isEnabled();
		System.out.println("Is radio button enabled for female -> "+female);
	}

}
