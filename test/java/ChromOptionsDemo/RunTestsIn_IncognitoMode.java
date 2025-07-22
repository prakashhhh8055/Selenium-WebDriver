package ChromOptionsDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RunTestsIn_IncognitoMode {

	public static void main(String[] args) {
		//Run Test in Incognito Mode
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		System.out.println("Test Exceution Passed");

	}

}
