package HandleSliders;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HorizantalSliders {

	public static void main(String[] args) {
		//price slider
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		//Min Slider
		WebElement Min_range=driver.findElement(By.xpath("//span[1]"));
		System.out.println("Current Location of the Min Slider Icon-> "+Min_range.getLocation()); //(59,250)
		Actions actions=new Actions(driver);
		actions.dragAndDropBy(Min_range,100,250).perform();
		System.out.println("Current Location After drag and drop of the Min Slider Icon-> "+Min_range.getLocation()); //(158, 250)
		
		//Max Slider
		WebElement Max_range=driver.findElement(By.xpath("//span[2]"));
		System.out.println("Current Location of the Max Slider Icon-> "+Max_range.getLocation()); //(613, 250)
		actions.dragAndDropBy(Max_range,-100,250).perform();
		System.out.println("Current Location After drag and drop of the Max Slider Icon-> "+Max_range.getLocation()); //(513, 250)


		
		

	}

}
