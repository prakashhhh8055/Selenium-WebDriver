package HandleTabAndWindow;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenInNewWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.opencart.com/");
        driver.manage().window().maximize();
        
        //Opening the Another URL in New Tab
        //driver.switchTo().newWindow(WindowType.TAB);
        
        //Open the below URL in NEW Tab
        driver.switchTo().newWindow(WindowType.WINDOW);
        
        driver.get("https://text-compare.com/");
        

	}

}
