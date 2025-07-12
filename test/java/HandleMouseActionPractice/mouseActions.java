package HandleMouseActionPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
        driver.manage().window().maximize();
        driver.switchTo().frame("iframeResult");
        WebElement Box1=driver.findElement(By.xpath("//input[@id='field1']"));
        WebElement Box2=driver.findElement(By.xpath("//input[@id='field2']"));
        WebElement btn=driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
        Box1.clear();
        Box1.sendKeys("APPSCRIP");
        Actions action=new Actions(driver);
        action.doubleClick(btn).build().perform();
        String text=Box2.getAttribute("value");
        if(text.equals("APPSCRIP"))
        {
        	System.out.println("Text Copied Correctly");
        }
        
        
      

	}

}
