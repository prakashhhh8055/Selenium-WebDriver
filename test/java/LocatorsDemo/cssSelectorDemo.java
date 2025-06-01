package LocatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class cssSelectorDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://trulyfree.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Retry logic to avoid stale element
        int attempts = 0;
        while (attempts < 3) {
            try {
                WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(
                        By.cssSelector("input[placeholder='Search Truly Free']")));
                searchBox.clear();  // Optional: clear existing text
                searchBox.sendKeys("T-Shirt");
                break; // Exit loop if successful
            } catch (org.openqa.selenium.StaleElementReferenceException e) {
                System.out.println("Retrying due to stale element...");
                attempts++;
            }
        }
    }
}
