package HandlingDiffentTypesOfDropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeWithAmazonWeb1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@id=\"icp-touch-link-country\"]")).click();
		driver.findElement(By.xpath("//span[@id=\"icp-dropdown\"]//span")).click();
		List<WebElement> dropdown=driver.findElements(By.xpath("//div[@class=\"a-popover-inner a-lgtbox-vertical-scroll\"]//ul//li//a[@class=\"a-dropdown-link\"]"));
		System.out.println("Total Number of Dropdown Values size -> "+dropdown.size());
		//Read all the dropdown Values
		for(WebElement option:dropdown)
		{
			System.out.println(option.getText());
		}
		
	}

}
