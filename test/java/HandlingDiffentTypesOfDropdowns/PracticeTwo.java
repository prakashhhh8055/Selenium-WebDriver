package HandlingDiffentTypesOfDropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
		driver.manage().window().maximize();
		driver.findElement(By.id("dropdownMenuButton")).click();
		List<WebElement> dropdown=driver.findElements(By.xpath("//div[@class=\"dropdown-menu show\"]//a"));
		System.out.println(dropdown.size());
		
		//Read all dropdown values
		for(WebElement Values:dropdown)
		{
			System.out.println(Values.getText());
		}

	}

}
