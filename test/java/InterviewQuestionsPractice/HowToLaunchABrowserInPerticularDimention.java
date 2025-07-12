package InterviewQuestionsPractice;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HowToLaunchABrowserInPerticularDimention {

	public static void main(String[] args) {
		//Launch website in 360,740 Dimention
		ChromeOptions options=new ChromeOptions();
		options.addArguments("window-size=360,740");
		WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://trulyfree.com/");
        //After Lunch In below way we can adjust the Window Size
        driver.manage().window().setSize(new Dimension(1280,800));

	}

}
