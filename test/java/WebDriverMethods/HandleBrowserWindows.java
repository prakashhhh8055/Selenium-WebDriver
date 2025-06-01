package WebDriverMethods;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		//handle single window
		//System.out.println(driver.getWindowHandle());
		
		
		//Handle Multi Windows
		Set<String> WindowsIDs=driver.getWindowHandles();
		List<String> WindowsList=new ArrayList(WindowsIDs);
		
		String parentID=WindowsList.get(0);
		String childID=WindowsList.get(1);
		
		//Switch to Child
		driver.switchTo().window(childID);
		System.out.println(driver.getTitle());
		
		//switch back to Parent
		driver.switchTo().window(parentID);
		System.out.println(driver.getTitle());

		

	}

}
