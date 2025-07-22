package ChromOptionsDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RemoveChromeIsBeingControlledByAutomatedTestSoftware {

	public static void main(String[] args) {
		//Remove Chrome Is Being Controlled By Automated Test Software Label
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("excludeSwitches",new String[] {"enable-automation"});
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		System.out.println("Test Exceution Passed");


	}

}
