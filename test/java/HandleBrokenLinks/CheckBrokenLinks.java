package HandleBrokenLinks;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBrokenLinks {

	public static void main(String[] args) {
		//Check Broken Links and how Many Broken Links exist on a page 
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		//Fetch all <a> tags (links)
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total Number of Link -> "+links.size());
		int brokenlink=0;
		for(WebElement link:links)
		{
			String hrefAttValue = link.getAttribute("href");
			
			if(hrefAttValue==null || hrefAttValue.isEmpty())
			{
				System.out.println("URL is either not configured or empty");
				continue;
			}

			try {
				URL url=new URL(hrefAttValue);
				HttpURLConnection connection=(HttpURLConnection) url.openConnection();
				connection.connect();
				
				if(connection.getResponseCode()>=400)
				{
					System.out.println(hrefAttValue+" --> Link is Broken");
					brokenlink++;
				}
				else
				{
					System.out.println(hrefAttValue+" --> Link is Not broken");
				}
			} catch (Exception e) {

			}
			
		}
		System.out.println("Total Number of Broken Links -> "+brokenlink);
	}

}
