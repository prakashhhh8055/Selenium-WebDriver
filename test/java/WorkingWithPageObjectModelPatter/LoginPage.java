package WorkingWithPageObjectModelPatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	
	//constructor
	LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//locators
	By txt_PhoneNumber=By.xpath("//input[@id='phoneNumber']");
	By btn_Send_OTP=By.xpath("//button[normalize-space()='Send Verification Code']");
	
	
	//action-methods
	public void SetPhoneNumber(String PhoneNumber)
	{
		driver.findElement(txt_PhoneNumber).sendKeys(PhoneNumber);
	}
	
	public void ClickSendVerificationCodeBtn()
	{
		driver.findElement(btn_Send_OTP).click();
	}

}
