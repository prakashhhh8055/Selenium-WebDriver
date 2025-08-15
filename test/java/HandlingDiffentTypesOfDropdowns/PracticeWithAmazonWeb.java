package HandlingDiffentTypesOfDropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeWithAmazonWeb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement dropdown=driver.findElement(By.id("searchDropdownBox"));
		Select select=new Select(dropdown);
		List<WebElement> options=select.getOptions();
		System.out.println(options.size());
		System.out.println("All countries Values are : ");
		for(WebElement option:options)
		{
			System.out.println(option.getText());
		}
		select.selectByIndex(1);

	}

}
