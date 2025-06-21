package HandlingWebTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {
    public static void main(String[] args) {
        // Step 1: Launch browser and open site
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://blazedemo.com/");
        driver.manage().window().maximize();

        // Step 2: Select from "Portland"
        WebElement fromDropdown = driver.findElement(By.name("fromPort"));
        new Select(fromDropdown).selectByVisibleText("Portland");

        // Step 3: Select to "London"
        WebElement toDropdown = driver.findElement(By.name("toPort"));
        new Select(toDropdown).selectByVisibleText("London");

        // Step 4: Click "Find Flights"
        driver.findElement(By.xpath("//input[@value='Find Flights']")).click();

        // Step 5: Get all table rows
        List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));

        double lowestPrice = Double.MAX_VALUE;
        WebElement lowestRow = null;

        // Step 6: Loop through each row and get last column (price)
        for (WebElement row : rows) {
            WebElement priceCell = row.findElement(By.xpath("td[last()]"));
            String priceText = priceCell.getText().replace("$", "").trim();

            try {
                double price = Double.parseDouble(priceText);
                if (price < lowestPrice) {
                    lowestPrice = price;
                    lowestRow = row;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid price: " + priceText);
            }
        }

        // Step 7: Click "Choose This Flight" in the lowest price row
        if (lowestRow != null) {
            System.out.println("Lowest Price: $" + lowestPrice);
            lowestRow.findElement(By.xpath(".//input[@type='submit']")).click();
        }
        
        boolean title=driver.findElement(By.xpath("//h2[normalize-space()='Your flight from TLV to SFO has been reserved.']")).isDisplayed();
        System.out.println("Is title present-> "+title);
        
        driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Prakash G Malagi");
        driver.findElement(By.xpath("//input[@id='address']")).sendKeys("17 Battery UI 10024 Newyork USA");
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Karnataka");
        driver.findElement(By.xpath("//input[@id='state']")).sendKeys("New York");
        driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("10024");
        WebElement dropdown=driver.findElement(By.xpath("//select[@id='cardType']"));
        new Select(dropdown).selectByVisibleText("American Express");
        driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("4242 4242 4242 4242");
        WebElement Month= driver.findElement(By.xpath("//input[@id='creditCardMonth']"));
        Month.clear();
        Month.sendKeys("06");
        WebElement Year=driver.findElement(By.xpath("//input[@id='creditCardYear']"));
        Year.clear();
        Year.sendKeys("2025");
        driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("Prakash G");
        WebElement RememberMeCheckbox=driver.findElement(By.xpath("//input[@id='rememberMe']"));
        if(RememberMeCheckbox.isSelected()!=true)
        {
        	RememberMeCheckbox.click();
        }
        driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
        boolean isPresent= driver.findElement(By.xpath("/html/body/div[2]/div/h1")).isDisplayed();
        System.out.println("Confirmation message is displayed? "+isPresent);
        // driver.quit(); // Uncomment if you want to close the browser
    }
}
