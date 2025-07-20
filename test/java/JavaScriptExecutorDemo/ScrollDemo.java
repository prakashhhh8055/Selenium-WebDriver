package JavaScriptExecutorDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		JavascriptExecutor js=(JavascriptExecutor)driver;

		//1) scroll down page by pixel number

	/*	js.executeScript("window.scrollBy(0,2000)");
		//Get the pixel its pointing after scroll
		System.out.println(js.executeScript("return window.pageYOffset;"));  */
		
		//2) scroll down page by Element to View
		WebElement scroller=driver.findElement(By.xpath("//h2[normalize-space()='Pagination Web Table']"));
		js.executeScript("arguments[0].scrollIntoView();",scroller);
		System.out.println(js.executeScript("return window.pageYOffset;")); //2772
		
        //3)Scroll to bottom
        js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
        System.out.println("Bottom of the screen pixel "+js.executeScript("return window.pageYOffset;"));
        Thread.sleep(5000);
        
        //4)Scroll to Top
        js.executeScript("window.scrollTo(0,0);");
        System.out.println("Top of the screen pixel "+js.executeScript("return window.pageYOffset;"));
        Thread.sleep(5000);
        
        //5) Horizantal Scroll to Last position
        js.executeScript("window.scrollTo(0,document.body.scrollWidth);");
        System.out.println("Horizantal Scroll to Last position "+js.executeScript("return window.pageYOffset;"));
        Thread.sleep(5000);

	}

}
