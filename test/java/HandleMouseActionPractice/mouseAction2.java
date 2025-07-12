package HandleMouseActionPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class mouseAction2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub 
		
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://trulyfree.com/");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement button = wait.until(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div/div/button"))
        );
        Thread.sleep(2000);
        button.click();
        WebElement MegamenuOption=driver.findElement(By.xpath("//div[@class='jsx-1740569320 megamenu_container']//ul//span[normalize-space()='Clothing']"));
        //WebElement MegamenuValue=driver.findElement(By.xpath("//div[contains(@class,'jsx-1740569320 megamenu_container')]//li[6]//ul//div//a[.='Accessories']"));
        Actions actions=new Actions(driver);
        actions.moveToElement(MegamenuOption).build().perform();
        //Thread.sleep(2000);
        //MegamenuValue.click();
        


	}

}
