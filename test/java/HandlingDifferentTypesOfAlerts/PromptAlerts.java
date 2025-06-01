package HandlingDifferentTypesOfAlerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlerts {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        Alert promptAlert = driver.switchTo().alert();

     // Get alert text
     System.out.println("Prompt: " + promptAlert.getText());

     // Enter text in the alert textbox
     promptAlert.sendKeys("Selenium User");

     // Accept the prompt (click OK)
     promptAlert.accept();

     // OR dismiss (click Cancel)
     //promptAlert.dismiss();

	}

}
