package Date_Pickers_Or_Calenders;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://dummy-tickets.com/");
        driver.manage().window().maximize();
        //Navigate to Both Tab
        driver.findElement(By.xpath("//a[normalize-space()='Both']")).click();
        //
        WebElement source = driver.findElement(By.xpath("(//input[@name='source[]'])[4]"));
        source.sendKeys("New");
        
        // Wait briefly for suggestions to appear (you can also use WebDriverWait)
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        
        List<WebElement> suggestions= driver.findElements(By.xpath("//ul[@style='display: block;']//div[@class='suggestion-block']"));
        
        for(WebElement SuggestionValue:suggestions)
        {
        	if(SuggestionValue.getText().contains("Newbery"))
        	{
        		SuggestionValue.click();
        		break;
        	}
        }
        
        //Select Destination
        WebElement destination = driver.findElement(By.xpath("(//input[@name='destination[]'])[4]"));
        destination.sendKeys("berlin");
        
        // Wait briefly for suggestions to appear (you can also use WebDriverWait)
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        List<WebElement> Destination_Suggestions= driver.findElements(By.xpath("//ul[@style='display: block;']//div[@class='suggestion-block']"));
        
        for(WebElement DestinationSuggestion:Destination_Suggestions)
        {
        	if(DestinationSuggestion.getText().contains("Berlin"))
        	{
        		DestinationSuggestion.click();
        		break;
        	}
        }
       
        
        WebElement DepartureDate=driver.findElement(By.xpath("(//input[@id='dp1752039780128'])[1]"));
        DepartureDate.click();
        
        String ExpectedYear="2026";
        String ExpectedMonth="June";
        WebElement YearDropdown=driver.findElement(By.xpath("//select[@aria-label='Select year']"));
        Select selectYear=new Select(YearDropdown);
        selectYear.selectByVisibleText(ExpectedYear);
        
        WebElement MonthDropdown=driver.findElement(By.xpath("//select[@aria-label='Select month']"));
        Select selectMonth=new Select(MonthDropdown);
        selectMonth.selectByVisibleText(ExpectedMonth);
      
        
        

	}

}
