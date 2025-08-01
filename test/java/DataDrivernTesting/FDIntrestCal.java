package DataDrivernTesting;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FDIntrestCal {

	public static void main(String[] args) throws IOException, InterruptedException {
		// FD Intrest Calculation
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().window().maximize();
		
		String filepath=System.getProperty("user.dir")+"\\testdata\\InterestCalculationTestData2.xlsx";
		
		int rowsCount=ExcelUtil.getRowCount(filepath, "DDT");
		
		for(int i=1;i<=rowsCount;i++)
		{
			//Read all the data from Excel Sheet
			String Principal=ExcelUtil.getCellData(filepath,"DDT", rowsCount, 0);
			String Interest=ExcelUtil.getCellData(filepath,"DDT", rowsCount, 1);
			String Period=ExcelUtil.getCellData(filepath,"DDT", rowsCount, 2);
			String Period_Type=ExcelUtil.getCellData(filepath,"DDT", rowsCount, 3);
			String Frequency=ExcelUtil.getCellData(filepath,"DDT", rowsCount, 4);
			String Expected_Maturity_Value=ExcelUtil.getCellData(filepath,"DDT", rowsCount, 5);
			
			//Pass or Add Values/data into the All the fields in the website 
			driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(Principal);
			driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(Interest);
			driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(Period);
			
			Select period_type_dropdown=new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
			period_type_dropdown.selectByContainsVisibleText(Period_Type);
			
			Select Frequency_Dropdown=new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
			Frequency_Dropdown.selectByContainsVisibleText(Frequency);
			
			//Click on the Calculate Button
			driver.findElement(By.xpath("//img[@src='https://images.moneycontrol.com/images/mf_revamp/btn_calcutate.gif']")).click();
			
			String Actual_Output=driver.findElement(By.xpath("//span[@id='resp_matval']")).getText();
			
			//Compare Maturity Value with Actual Output
			if(Double.parseDouble(Expected_Maturity_Value)==Double.parseDouble(Actual_Output))
			{
				System.out.println("Passed");
				ExcelUtil.setCellData(filepath,"DDT",i,7,"Passed");
				ExcelUtil.fillGreenColor(filepath,"DDT",i,7);
			}
			else
			{
				System.out.println("Failed");
				ExcelUtil.setCellData(filepath,"DDT",i,7,"Failed");
				ExcelUtil.fillRedColor(filepath,"DDT",i,7);
			}
			
			Thread.sleep(3000);
			//Click on Clear button to clear all the field with entered values
			driver.findElement(By.xpath("img[class='PL5']")).click();	
		}
		
		driver.quit();
	}

}
