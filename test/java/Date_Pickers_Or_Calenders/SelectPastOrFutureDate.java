package Date_Pickers_Or_Calenders;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectPastOrFutureDate {
	
	      //Select Future Date, Month and Year
			static void SelectFutureDate(WebDriver driver,String date,String month,String year)
			{
				while(true)
		        {
		            String current_month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		            String current_year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		        	if(current_month.equals(month) && current_year.equals(year))
		        	{
		        		break;
		        	}
		        	driver.findElement(By.xpath("//a[@title='Next']")).click(); //next
		        }
				
				List<WebElement> AllDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		        
		        for(WebElement dd:AllDates)
		        {
		        	if(dd.getText().equals(date))
		        	{
		        		dd.click();
		        		break;
		        	}
		        }
			  }
			
		      //Select Past/Previous Date, Month and Year
				static void SelectPastDate(WebDriver driver,String date,String month,String year)
				{
					while(true)
			        {
			            String current_month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			            String current_year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			        	if(current_month.equals(month) && current_year.equals(year))
			        	{
			        		break;
			        	}
			        	driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); //Previous/past
			        }
					
					List<WebElement> AllDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
			        
			        for(WebElement dd:AllDates)
			        {
			        	if(dd.getText().equals(date))
			        	{
			        		dd.click();
			        		break;
			        	}
			        }
				  }


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//input[@id='datepicker']")).click(); //Open Date picker/Calender
        //SelectPastDate(driver,"23","June","2025");
        //Thread.sleep(2000);
        SelectFutureDate(driver,"2","June","2026");
	}

}
