package HandlingFrames_iFrames_NestediFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesAndiFrames {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Hello Prakash");
		driver.switchTo().defaultContent();
		
		WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Hello Ranjeetha");
		driver.switchTo().defaultContent();
		
		WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Hello Dear Family");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("(//div[@class='AB7Lab Id5V1'])[2]")).click();
		driver.switchTo().defaultContent();
		
		WebElement frame5=driver.findElement(By.cssSelector("frame[src='frame_5.html']"));
		driver.switchTo().frame(frame5);
		driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("Hello Parent");
		Thread.sleep(3000);	
		driver.findElement(By.cssSelector("a[href='https://a9t9.com']")).click();
		Thread.sleep(2000);
		boolean status=driver.findElement(By.xpath("//img[@alt='Ui.Vision by a9t9 software - Image-Driven Automation']")).isDisplayed();
		System.out.println("Is logo disaplayed..?"+status);
		driver.switchTo().defaultContent();
		
		
		

	}

}
