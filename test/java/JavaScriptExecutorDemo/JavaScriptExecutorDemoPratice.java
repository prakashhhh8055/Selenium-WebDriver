package JavaScriptExecutorDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemoPratice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//ChromeDriver driver=new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		WebElement inputbox=driver.findElement(By.xpath("//input[@id='name']"));
		WebElement radiobtn=driver.findElement(By.xpath("//input[@id='male']"));

		JavascriptExecutor js=(JavascriptExecutor)driver;
		//JavascriptExecutor js=driver;
		
		js.executeScript("arguments[0].setAttribute('Value','Prakash')",inputbox);
		js.executeScript("arguments[0].click()",radiobtn);

		

	}

}
