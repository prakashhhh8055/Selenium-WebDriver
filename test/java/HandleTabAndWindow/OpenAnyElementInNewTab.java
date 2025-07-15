package HandleTabAndWindow;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenAnyElementInNewTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.opencart.com/");
        driver.manage().window().maximize();
        
        WebElement Reglink=driver.findElement(By.xpath("//a[@class='btn btn-black navbar-btn']"));
        Actions actions=new Actions(driver);
        //Click on Registration Button to open in new tab
        actions.keyDown(Keys.CONTROL).click(Reglink).keyUp(Keys.CONTROL).perform();
        
        //Switching to Registration page
        List<String> ids= new ArrayList(driver.getWindowHandles());
        
        driver.switchTo().window(ids.get(1));
        
        

	}

}
