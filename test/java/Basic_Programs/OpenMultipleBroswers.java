package Basic_Programs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenMultipleBroswers {

	public static void main(String[] args) {
		
				//Browsers Opens Sequential
		        // Launch Chrome
		        WebDriver chrome = new ChromeDriver();           // starts Chrome session&#8203;:contentReference[oaicite:6]{index=6}
		        chrome.get("https://trulyfree.com/");               // navigate to URL&#8203;:contentReference[oaicite:7]{index=7}
		        chrome.quit();                                   // close Chrome and end session&#8203;:contentReference[oaicite:8]{index=8}

		        // Launch Firefox
		        WebDriver firefox = new FirefoxDriver();
		        firefox.get("https://trulyfree.com/");
		        firefox.quit();                                  // close Firefox

		        // Launch Edge
		        WebDriver edge = new EdgeDriver();
		        edge.get("https://trulyfree.com/");
		        edge.quit();                                     // close Edge

	}

}
