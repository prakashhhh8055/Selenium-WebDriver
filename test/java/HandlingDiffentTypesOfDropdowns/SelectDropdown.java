package HandlingDiffentTypesOfDropdowns;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement  dropdownElement=driver.findElement(By.xpath("//select[@id='country']"));
		Select dropdown=new Select(dropdownElement);
		//dropdown.selectByVisibleText("India"); //India Selected from COuntry Drop-down
		//dropdown.selectByIndex(8); //Brazil Selected from COuntry Drop-down
		//dropdown.selectByValue("uk"); //United Kingdom selected from country drop-down
		dropdown.selectByContainsVisibleText("States"); //United States selected from the Country Drop-down
		
		//Find the size of the Dropdown Values
		List<WebElement> options=dropdown.getOptions();
		System.out.println("Numebr of Options in the Country Dropdown "+options.size());
		
		//Print or Access all the Dropdown Values using Enhanced For Loop
		System.out.println("Country Dropdown Options are: ");
		for(WebElement option:options)
		{
			System.out.println(option.getText());
		}
		System.out.println("---------------------------------------------------");
		//Print or Access all the Dropdown Values using For Loop
		System.out.println("Country Dropdown Options are: ");
		for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
	}

}
