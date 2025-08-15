package HandlingDiffentTypesOfDropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practiceOne {

	public static void main(String[] args) {
		//Practice Select Dropdown 
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement dropdown=driver.findElement(By.id("country"));
		Select select=new Select(dropdown);
		select.selectByVisibleText("Canada");
		
		//Find the size of the drop-down values
		List<WebElement> options=select.getOptions();
		System.out.println("total values of the dropdown is "+options.size());
		
		//Read all the Dropdown Values
		for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
		
		//Another way to Read All the Dropdown Values
		for(WebElement option:options)
		{
			System.out.println(option.getText());
		}
		
		
		
		

	}

}
