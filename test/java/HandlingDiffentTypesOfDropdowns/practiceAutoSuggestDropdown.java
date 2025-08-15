package HandlingDiffentTypesOfDropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceAutoSuggestDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.w3schools.com/howto/howto_js_autocomplete.asp");
		driver.manage().window().maximize();
		driver.findElement(By.id("myInput")).sendKeys("j");
		List<WebElement> countries=driver.findElements(By.xpath("//div[@id=\"myInputautocomplete-list\"]//div"));
		for(WebElement value:countries)
		{
			System.out.println(value.getText());
			
			if(value.getText().equals("Japan"))
			{
				value.click();
				break;
			}
			
		}
		String s="Madam";
		s.e

	}

}
