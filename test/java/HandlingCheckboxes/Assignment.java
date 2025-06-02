package HandlingCheckboxes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		List<WebElement> checkboxes=driver.findElements(By.xpath("//div[@class='table-container']/table[@id='productTable']/tbody/tr/td//input[@type='checkbox']"));
		
		System.out.println("The count of checkboxes in the table is --> "+checkboxes.size());
		
		for(WebElement checkbox:checkboxes)
		{
			checkbox.click();
		}
	
	
		
	}
}
