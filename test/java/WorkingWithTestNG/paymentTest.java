package WorkingWithTestNG;

import org.testng.annotations.Test;

public class paymentTest {
	
	@Test(priority=1,groups= {"sanity","regression","functional"})
	void paymentInINR()
	{
		System.out.println("Payment is sucessfull in INR");
	}
    
	@Test(priority=2,groups= {"sanity","regression","functional"})
	void paymentInUSD()
	{
		System.out.println("Payment is sucessfull in USD");
	}
	
	@Test(priority=3,groups= {"sanity","regression","functional"})
	void paymentInEURO()
	{
		System.out.println("Payment is sucessfull in EURO");
	}
}
