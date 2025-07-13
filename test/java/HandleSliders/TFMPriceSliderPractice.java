package HandleSliders;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TFMPriceSliderPractice {

	public static void main(String[] args) throws InterruptedException {
		//TFM PLP price Slider Practice
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
        
        driver.findElement(By.xpath("//div[@class='jsx-709164312 banner_sections_wrapper']//a")).click();
        WebElement Price_Slider=driver.findElement(By.xpath("(//div[@class='jsx-1647782637 filter__label my-2 d-flex align-items-center justify-content-between cursor-pointer'])[1]"));
        Actions actions=new Actions(driver);
        //scroll to the element
        JavascriptExecutor js=(JavascriptExecutor) driver;
        //scrollIntoView(true) to see the element on the top of the window/screen after scroll
        js.executeScript("arguments[0].scrollIntoView(true);",Price_Slider);
        Price_Slider.click();
        
        //Move Min Price Slider
        WebElement Min_Price_Slider=driver.findElement(By.xpath("(//div[@role='slider'])[1]"));
        System.out.println("Current Min location of the price slider "+Min_Price_Slider.getLocation()); //(111, 1206)
        actions.clickAndHold(Min_Price_Slider).moveByOffset(50, 0).release().perform();        
        System.out.println("Current Min location After the Drag and Drop "+Min_Price_Slider.getLocation()); //(160, 817)
        
        //Move Max Price Slider
        WebElement Max_Price_Slider=driver.findElement(By.xpath("(//div[contains(@role,'slider')])[2]"));
        System.out.println("Current Max location of the price slider "+Max_Price_Slider.getLocation()); //(366, 818)
        actions.clickAndHold(Max_Price_Slider).moveByOffset(-50, 0).release().perform();        
        System.out.println("Current Max location After the Drag and Drop "+Max_Price_Slider.getLocation()); //(315, 817)
        

        
        
       
		
	}

}
