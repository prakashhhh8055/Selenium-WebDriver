package HandleKeyboardActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Actions {

	public static void main(String[] args) {
		//KeyBoard Actions Practice
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://text-compare.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("welcome");
        Actions actions=new Actions(driver);
        //Select All Text from input field
        actions.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		//Press control c to copy the selected text
        actions.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
        //Press Tab to switch to Another input field
        actions.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
        //Press Control V to paste the Text to another text field
        actions.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
        

	}

}
