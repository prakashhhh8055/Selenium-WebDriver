package xPathDemo;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class xPathAxesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		
		driver.manage().window().maximize();
		//self -selects the current node
		String text= driver.findElement(By.xpath("//a[contains(text(),'SBI')]/self::a")).getText();
		System.out.println("Self node -> "+text);

		//Selects the parent of current node (always one)
		text=driver.findElement(By.xpath("//a[contains(text(),'SBI')]/parent::td")).getText();
		System.out.println("Parent -> "+text);
		
		//Selects all the childrens
		List<WebElement> childs =driver.findElements(By.xpath("//a[contains(text(),'SBI')]/ancestor::tr/child::td"));
		System.out.println("Size of the Children -> "+childs.size());
		
		//all the ancestors from parent, grandfather, etc
		text=driver.findElement(By.xpath("//a[contains(text(),'SBI')]/ancestor::td")).getText();
		System.out.println("All the ancesstor -> "+text);
		
		//Print number of proceding element of the ancestors
		List<WebElement> count=driver.findElements(By.xpath("//a[contains(text(),'SBI')]/ancestor::tr/preceding::tr"));
		System.out.println("Number of Procedin elements for Current node Ancesstor -> "+count.size());
		
		//Print number of Following elements of the ancestors
		List<WebElement> count2 = driver.findElements(By.xpath("//a[contains(text(),'SBI')]/ancestor::tr/following-sibling::tr"));
		System.out.println("Number of following siblings or the current node ancestor -> "+count2.size());
		
		//Print all the desendents of the current node
		List<WebElement> count3 = driver.findElements(By.xpath("//a[contains(text(),'SBI')]/ancestor::tr/descendant::*"));
		System.out.println("Number of desendants of the current node -> "+count3.size());
		
	}

}
