package TakeScreenshotDemo;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShotPractice {

	public static void main(String[] args) throws InterruptedException {
		//Take full page screenshot
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		
		File source=screenshot.getScreenshotAs(OutputType.FILE); //Take Screenshot output type as file type
	
		File Target=new File(System.getProperty("user.dir")+"\\Screenshots\\fullpagescreenshot1.png");
		
		source.renameTo(Target);
		
		

	}

}
