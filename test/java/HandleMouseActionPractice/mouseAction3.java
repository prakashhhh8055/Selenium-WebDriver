package HandleMouseActionPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseAction3 {

	public static void main(String[] args) {
		//Handle Right Click from mouse
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        driver.manage().window().maximize();
        WebElement ele=driver.findElement(By.xpath("(//span[@class='context-menu-one btn btn-neutral'])[1]"));
        Actions actions=new Actions(driver);
        actions.contextClick(ele).build().perform();
        driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();
        driver.switchTo().alert().accept();

	}

}
