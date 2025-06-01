package HandlingCheckboxes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HandlingCheckboxesExample {

	public static void main(String[] args) throws InterruptedException {
		
		        WebDriver driver = new ChromeDriver();
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		        driver.get("https://testautomationpractice.blogspot.com/");
		        driver.manage().window().maximize();

		        // Locate all checkboxes on the page
		        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and  @type='checkbox']"));

		        System.out.println("Total checkboxes: " + checkboxes.size());

		        // Check all checkboxes
		        for (WebElement checkbox : checkboxes) {
		            if (!checkbox.isSelected()) {
		                checkbox.click();
		            }
		        }
		        
		        Thread.sleep(5000);

		        // Uncheck all checkboxes
		        for (WebElement checkbox : checkboxes) {
		            if (checkbox.isSelected()) {
		                checkbox.click();
		            }
		        }
		        
		        Thread.sleep(5000);
		        
		        for(int i=3;i<checkboxes.size();i++)
		        {
		        	checkboxes.get(i).click();
		        }
		        
		        Thread.sleep(5000);

		        driver.quit();
		    }
	}
