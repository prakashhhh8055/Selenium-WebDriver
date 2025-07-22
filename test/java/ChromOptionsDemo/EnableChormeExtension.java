package ChromOptionsDemo;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EnableChormeExtension {

	public static void main(String[] args) {
		/*Enable extensions in browser
			step 1: Add CRX Extractor/Downloader to chrome Browser ( manually)
			Step2 : Add SelectorsHub plugin to chrome browser (manually)
			step3 : Capture crx file for selectorshub extension
			Step4: pass crx file path in automation script in Chrome Options  */
		
		ChromeOptions options=new ChromeOptions();
		File file=new File("C:\\Users\\3Embed\\Documents\\Automation\\SelectorsHub-Chrome-Web-Store.crx");
		options.addExtensions(file);
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();


	}

}
