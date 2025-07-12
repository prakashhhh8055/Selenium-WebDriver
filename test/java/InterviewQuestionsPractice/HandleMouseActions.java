package InterviewQuestionsPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleMouseActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='input1']")).sendKeys("Hey Hello");
        WebElement element=driver.findElement(By.xpath("//button[@id='btn1']"));
        Actions actions=new Actions(driver);
        //hovering on element using mouse action
        //actions.moveToElement(element).perform();
        //Thread.sleep(3000);
        //actions.click(element).perform();
       // Thread.sleep(3000);
        //Mouse Right Click(Context Click)
        //actions.contextClick(element).perform();  
        //Mouse Double Click
        //actions.doubleClick(driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"))).perform();
        WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement destination=driver.findElement(By.xpath("//div[@id='droppable']"));
        actions.dragAndDrop(source, destination).perform();
        

	}

}
