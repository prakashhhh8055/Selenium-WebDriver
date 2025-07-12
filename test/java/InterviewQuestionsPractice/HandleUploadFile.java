package InterviewQuestionsPractice;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleUploadFile {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        WebElement upload = driver.findElement(By.id("singleFileInput"));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", upload);
        Thread.sleep(3000);       
        upload.sendKeys("C:\\Users\\3Embed\\Desktop\\cats.jpeg");
        driver.findElement(By.xpath("//form[@id='singleFileForm']//following-sibling::button")).click();
        

	}

}
