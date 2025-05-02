package Basic_Programs;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Test1 {

	public static void main(String[] args) {
		//Declaration
		
		//Step 1- Launch the Browser
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		
		//Step 2- Open the url https://trulyfree.com/
		driver.get("https://trulyfree.com/");
		
		//System.out.println("Title of the Website Landing Page is "+driver.getTitle()); //Truly Free
		
		//Step 3- Get the title of the Landing page
		String title=driver.getTitle();
		
		//Step 4- Validate the Actual Title with Expected title
		if(title.equals("Truly Free"))
		{
			System.out.println("Test is passed");
		}
		else
		{
			System.out.println("Test is failed");
		}
		
		//Step 5- Close the browser
		driver.close();

	}

}
