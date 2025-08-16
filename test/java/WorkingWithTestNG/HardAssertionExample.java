package WorkingWithTestNG;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionExample {

	    @Test
	    public void testLogin() 
	    {
	        String actualTitle = "Dashboard";
	        String expectedTitle = "Home";

	        Assert.assertEquals(actualTitle, expectedTitle); // ❌ Fails here
	        System.out.println("This line will NOT be executed.");
	    }


}
