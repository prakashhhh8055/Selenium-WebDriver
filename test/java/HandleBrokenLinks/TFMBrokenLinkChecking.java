package HandleBrokenLinks;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TFMBrokenLinkChecking {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://trulyfree.com/");
		driver.manage().window().maximize();
		
		// 1. Scroll to the bottom to load all lazy-loaded elements
        JavascriptExecutor js = (JavascriptExecutor) driver;
        long lastHeight = (long) js.executeScript("return document.body.scrollHeight");

        while (true) {
            js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
            Thread.sleep(2000); // wait for lazy content to load
            long newHeight = (long) js.executeScript("return document.body.scrollHeight");
            if (newHeight == lastHeight) break;
            lastHeight = newHeight;
        }

        
        // 2. Get all <a> tag elements
		List<WebElement> links=driver.findElements(By.xpath("//a[@href]"));
		System.out.println("Total Number of Link -> "+links.size());
		int brokenlink=0;
		
		
		// 3. Check each link
		for(WebElement link:links)
		{
			String hrefAttValue = link.getAttribute("href");
			
			if(hrefAttValue==null || hrefAttValue.isEmpty() || !hrefAttValue.startsWith("http"))
			{
				System.out.println("URL is either not configured or empty");
				continue;
			}

			try {
				URL url=new URL(hrefAttValue);
				HttpURLConnection connection=(HttpURLConnection) url.openConnection();
				connection.setRequestMethod("HEAD");
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
