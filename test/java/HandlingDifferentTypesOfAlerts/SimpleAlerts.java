package HandlingDifferentTypesOfAlerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlerts {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	        driver.manage().window().maximize();
	        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
	        //switch to Alert window and click on Ok button
	        //driver.switchTo().alert().accept();
	        
	      //switch to Alert window, capture the text present in th alert window and click on Ok button
	        Alert myalert=driver.switchTo().alert();
	        System.out.println(myalert.getText());
	        myalert.accept();
	        
	}

}
