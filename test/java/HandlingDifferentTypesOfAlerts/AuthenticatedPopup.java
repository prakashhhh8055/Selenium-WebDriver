package HandlingDifferentTypesOfAlerts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium. chrome.ChromeDriver;

public class AuthenticatedPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		WebDriver driver=new ChromeDriver();

		//driver.get("http://the-internet.herokuapp.com/basic_auth");

		//Syntax:
		//http://username:password@the-internet.herokuapp.com/basic_auth

		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");

		}

	}

