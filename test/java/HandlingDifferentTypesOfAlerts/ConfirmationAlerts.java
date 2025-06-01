package HandlingDifferentTypesOfAlerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlerts {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	        driver.manage().window().maximize();
	        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
	        //switch to Alert window and click on Ok button
	        //driver.switchTo().alert().dismiss();
	        
	        Alert confirmationAlert = driver.switchTo().alert();

	     // Get alert text
	     System.out.println("Confirmation Alert: " + confirmationAlert.getText());

	     // Accept the alert (click OK)
	     //confirmationAlert.accept();

	     // OR dismiss the alert (click Cancel)
	     confirmationAlert.dismiss();

	        
	     

	}

}
