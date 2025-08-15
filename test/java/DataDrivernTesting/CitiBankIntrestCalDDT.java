package DataDrivernTesting;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CitiBankIntrestCalDDT {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
		driver.manage().window().maximize();
		
		String filepath=System.getProperty("user.dir")+"\\testdata\\Citi_DDT_Test1.xlsx";
		int rownum=ExcelUtil.getRowCount(filepath,"Sheet1");
		
		for(int i=1;i<=rownum;i++)
		{
			//Read data from Excel
			String Initial_Dep_Amount=ExcelUtil.getCellData(filepath,"Sheet1",i,0);
			String Length_of_CD=ExcelUtil.getCellData(filepath,"Sheet1",i,1);
			String Interest_Rate=ExcelUtil.getCellData(filepath,"Sheet1",i,2);
			String Compounding=ExcelUtil.getCellData(filepath,"Sheet1",i,3);
			String ExpectedValue=ExcelUtil.getCellData(filepath,"Sheet1",i,4);
			
			//send data to the each fields in the web application
			WebElement IDA=driver.findElement(By.xpath("//input[@id='mat-input-0']"));
			IDA.clear();
			IDA.sendKeys(Initial_Dep_Amount);
			
			WebElement LOC=driver.findElement(By.xpath("//input[@id='mat-input-1']"));
			LOC.clear();
			LOC.sendKeys(Length_of_CD);
			
			WebElement IR=driver.findElement(By.xpath("//input[@id='mat-input-2']"));
			IR.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			IR.sendKeys(Keys.BACK_SPACE);
			IR.sendKeys(Interest_Rate);
			
			driver.findElement(By.id("mat-select-value-1")).click();
			List<WebElement> options = new WebDriverWait(driver, Duration.ofSeconds(5))
			        .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
			                By.xpath("//span[@class='mdc-list-item__primary-text']")
			        ));
			
			for(WebElement option:options)
			{
				if (option.getText().equalsIgnoreCase(Compounding)) {
			        option.click();
			        break;
			    }
			}

			
			driver.findElement(By.id("CIT-chart-submit")).click();
			
			//Validation
			String value=driver.findElement(By.xpath("//span[@id='displayTotalValue']")).getText();
			String ActualValue = value.replace("$", "").trim();
			System.out.println(ActualValue);
			
			if(ActualValue.equals(ExpectedValue))
			{
				System.out.println("Test is Passed");
				ExcelUtil.setCellData(filepath,"Sheet1",i,5,"Passed");
				ExcelUtil.fillGreenColor(filepath,"Sheet1",i,5);
				
			}
			else
			{
				System.out.println("Test is Failed");
				ExcelUtil.setCellData(filepath,"Sheet1",i,5,"Failed");
				ExcelUtil.fillRedColor(filepath,"Sheet1",i,5);
			}

		}

	}

}
