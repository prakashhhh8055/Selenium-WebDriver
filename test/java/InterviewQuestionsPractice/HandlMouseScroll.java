package InterviewQuestionsPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlMouseScroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        //locate to the element
        //WebElement ele=driver.findElement(By.xpath("//input[@id='datepicker']"));
        //scroll to the element
        JavascriptExecutor js=(JavascriptExecutor) driver;
        //scrollIntoView(true) to see the element on the top of the window/screen after scroll
        //scrollIntoView(false) to see the element on the bottom of the window/screen after scroll
        //js.executeScript("arguments[0].scrollIntoView(true);",ele);
        //ele.click();
        
        //Scroll to bottom
        js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
        Thread.sleep(5000);
        //Scroll to Top
        js.executeScript("window.scrollTo(0,0);");
        Thread.sleep(5000);
        
        //Scroll till Dynamic Table using pixel value 
        //window.scrollY -> How much has already been scrolled vertically
        js.executeScript("window.scrollBy(0,2208);");
        

	}

}
