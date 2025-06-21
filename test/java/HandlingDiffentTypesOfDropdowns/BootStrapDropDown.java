package HandlingDiffentTypesOfDropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		//Select any one Value from Dropdown
		driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']")).click();
		driver.findElement(By.xpath("//input[@value='Python']")).click();
		
		//size of the bootstrap Dropdown
		List<WebElement> options=driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//li//a//label"));
		System.out.println("The total size of the Dropdown "+options.size());
		
		System.out.println("-----------------------------------------------");
		
		//Print All the drop-down values using Enhanced for Loop
		System.out.println("The Bootstrap Drop-down Values are: ");
		for(WebElement value:options)
		{
			System.out.println(value.getText());
			
		}
		
		System.out.println("-----------------------------------------------");
		
		//Select and print only Java and MySQL Values from Dropdown
		System.out.println("Select and print only Java and MySQL Values from Dropdown: ");
		for(WebElement value:options)
		{
			String op=value.getText();
			if(op.equals("Java")||op.equals("MySQL"))
             {
				value.click();
				System.out.println(value.getText());
             }

			
		}
		
		System.out.println("-----------------------------------------------");
		
		//Print All the Selected Values
		System.out.println("Print All the Selected Values: ");
		List<WebElement> option=driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//li//a//label//input"));
		for(WebElement op:option)
		{
			if(op.isSelected())
			{
                // To get the text of the corresponding label
                WebElement label = op.findElement(By.xpath("./parent::label"));
                System.out.println(label.getText());
			}
		}
	}

}
