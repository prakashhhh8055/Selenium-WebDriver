package HandlingWebTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
		//List<WebElement> rows=driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr"));
		//System.out.println("Size of the rows -> "+rows.size());
		
		
		
		List<WebElement> totalpages=driver.findElements(By.xpath("//ul[@id='pagination']//li"));
		System.out.println("Total Number of Pages "+totalpages.size());
		
		for(int i=1;i<=totalpages.size();i++)
		{
			//total rows count in each page
			List<WebElement> rows=driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr"));
			System.out.println("Size of the rows -> "+rows.size());
			
			//each row data
			System.out.println("Page Number "+i);
			
			for(int r=1;r<=rows.size();r++)
			{
				String rows_Text=driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]")).getText();
				System.out.println(rows_Text);
				driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]//td[4]//input[@type='checkbox']")).click();
			}
			System.out.println("-----------------------------------");
			
			if(i<totalpages.size())
			{
				driver.findElement(By.xpath("//ul[@id='pagination']//li[" + (i + 1) + "]")).click();
                Thread.sleep(2000); // Add wait for page to load
			}
			
		}
		System.out.println("All checkboxes selected for all the pages");

	}

}
