package InterviewQuestionsPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleKeyboardInteractions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        //type simple text
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Prakash G Malagi");
        //Actions actions=new Actions(driver);
        //perform actions using keyboard keys
        WebElement element=driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']"));
        element.click();
        element.sendKeys("selenium");
        element.sendKeys(Keys.ENTER);     
        Thread.sleep(3000);
        element.sendKeys(Keys.CONTROL+"a");
        element.sendKeys(Keys.DELETE);
        
        
        

	}

}
