package ChromOptionsDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class sslHandling {

	public static void main(String[] args) {
		//SSL Certificate error Handling
		ChromeOptions options=new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://expired.badssl.com/");
		driver.manage().window().maximize();
		System.out.println("Title of the Page is "+driver.getTitle());
		

	}

}
