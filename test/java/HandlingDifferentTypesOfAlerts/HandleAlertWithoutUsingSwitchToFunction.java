package HandlingDifferentTypesOfAlerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlertWithoutUsingSwitchToFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        Alert myalert = mywait.until(ExpectedConditions.alertIsPresent());
        System.out.println("Prompt: " + myalert.getText());
        myalert.sendKeys("Selenium User");
        myalert.accept();



	}

}
