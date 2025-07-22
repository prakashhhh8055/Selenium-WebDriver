package ChromOptionsDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessMode {

	public static void main(String[] args) {
		//Headless mode Opening the url on chrome browser
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless=New--");
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		System.out.println("Test Exceution Passed");

	}

}
