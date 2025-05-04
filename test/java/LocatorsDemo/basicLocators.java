package LocatorsDemo;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class basicLocators {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoblaze.com/");
		driver.manage().window().maximize();
		
		//name
		//driver.findElement(By.name("search")).sendKeys("laptop");
		
		//id
		boolean logoStatus= driver.findElement(By.id("nava")).isDisplayed();
		System.out.println(logoStatus);
		
		//link text and partial link text
		//driver.findElement(By.linkText("Contact")).click();
		//driver.findElement(By.partialLinkText("art")).click();
		
		//Tag name
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		System.out.println("Number of links present on the header--"+allLinks.size());
		
		//Class
		List<WebElement> noOfProds=driver.findElements(By.className("carousel-item"));
		System.out.println("Number of links present on the header--"+noOfProds.size());
		
		List<WebElement> NoOfImages=driver.findElements(By.tagName("img"));
		System.out.println("Number of images present--"+NoOfImages.size());
		
		driver.findElement(By.partialLinkText("Samsung galaxy")).click();
		

	}

}
