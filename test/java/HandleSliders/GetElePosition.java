package HandleSliders;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetElePosition {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://trulyfree.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            // Wait for and click the popup close button
            WebElement button = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div/div/button"))
            );
            Thread.sleep(2000); // Must handle or throw InterruptedException
            button.click();

            // Click "Shop Now" banner
            driver.findElement(By.xpath("//div[@class='jsx-709164312 banner_sections_wrapper']//a")).click();

            // Scroll to the price slider and click
            WebElement priceSlider = driver.findElement(By.xpath("(//div[@class='jsx-1647782637 filter__label my-2 d-flex align-items-center justify-content-between cursor-pointer'])[1]"));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView(true);", priceSlider);
            priceSlider.click();

            // Locate the slider element
            WebElement element = driver.findElement(By.xpath("(//div[@role='slider'])[1]"));

            // Get coordinates
            Point point = element.getLocation();
            int x = point.getX();
            int y = point.getY();

            System.out.println("Element X Position: " + x);
            System.out.println("Element Y Position: " + y);

        } catch (InterruptedException e) {
            e.printStackTrace(); // Handle or log the exception
        } finally {
            driver.quit(); // Always close browser in the end
        }
    }
}
