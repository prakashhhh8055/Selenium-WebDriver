package TakeScreenshotDemo;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureSpecifiAreaScreenshot {

	public static void main(String[] args) throws InterruptedException {
		//Capture News Section Screenshot
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement NewsSection=driver.findElement(By.xpath("//div[@class='news-list-homepage']"));
		
		File Souce=NewsSection.getScreenshotAs(OutputType.FILE);
		
		File Target=new File(System.getProperty("user.dir")+"\\Screenshots\\NewsSection.png");
		
		Souce.renameTo(Target);

	}

}
