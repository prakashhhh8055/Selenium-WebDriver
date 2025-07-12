package InterviewQuestionsPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleCombinedKeyboardAndMouseAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        Actions actions=new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//input[@id='name']")))
        						.click()
        						.keyDown(Keys.SHIFT)
        						.sendKeys("appscrip") //types in Uppercase
        						.keyUp(Keys.SHIFT)
        						.perform();
        

	}

}
