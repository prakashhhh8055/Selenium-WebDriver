package HandlingCheckboxes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.findElement(By.name("q")).sendKeys("Virat Kohli");
        List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
        System.out.println("Size of the Auto-Suggestion is "+list.size());
        //driver.findElement(By.xpath("//ul[@role='listbox']//li//div[@role='option']//span[.='virat kohli net worth']")).click();
        for(int i=0;i<list.size();i++)
        {           	
        	System.out.println(list.get(i).getText());
        	if(list.get(i).getText().equalsIgnoreCase("Virat kohli Net Worth"))
    	    {
    		list.get(i).click();
    		break;
    	    }
        }
        
        

	}

}
