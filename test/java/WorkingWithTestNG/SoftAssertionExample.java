package WorkingWithTestNG;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionExample {

	    @Test
	    public void testSoftAssertions() {
	        SoftAssert softAssert = new SoftAssert();

	        String actualTitle = "Dashboard";
	        String expectedTitle = "Home";

	        softAssert.assertEquals(actualTitle, expectedTitle, "Title mismatch");
	        System.out.println("This line WILL be executed, even after failure.");

	        softAssert.assertTrue(false, "Condition failed");
	        System.out.println("Still continues execution...");

	        softAssert.assertAll();  // 🔴 Important: Without this, failures won’t be reported
	    }


}
