package WorkingWithPageObjectModelPatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {
	WebDriver driver;
	
	//constructor
	LoginPage1(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//input[@id='phoneNumber']")
	WebElement txt_PhoneNumber;
	@FindBy(xpath="//button[normalize-space()='Send Verification Code']")
	WebElement btn_Send_OTP;
	
	
	//action-methods
	public void SetPhoneNumber(String PhoneNumber)
	{
		txt_PhoneNumber.sendKeys(PhoneNumber);
	}
	
	public void ClickSendVerificationCodeBtn()
	{
		btn_Send_OTP.click();
	}

}

