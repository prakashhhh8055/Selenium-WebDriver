package WebDriverMethods;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class getMethodsDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoblaze.com/");
		driver.manage().window().maximize();
		System.out.println("Title: "+driver.getTitle());
		System.out.println("URL: "+driver.getCurrentUrl());
		System.out.println("Page Source Length: "+driver.getPageSource().length());
		String WindowsId =driver.getWindowHandle();
		System.out.println("Browser Unique ID -> "+WindowsId);


	}

}
