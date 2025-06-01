package NavigationMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        WebDriver driver = new ChromeDriver();

		        // 1. Open the first page
		        driver.get("https://trulyfree.com/");

		        // 2. Navigate to another page
		        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		        // 3. Go back to Google
		        driver.navigate().back();

		        // 4. Go forward to Bing
		        driver.navigate().forward();

		        // 5. Refresh the current page
		        driver.navigate().refresh();

		        driver.quit();
		    
		


	}

}
