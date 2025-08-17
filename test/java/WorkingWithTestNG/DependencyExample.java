package WorkingWithTestNG;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyExample {
	

	    @Test
	    public void loginTest() 
	    {
	        System.out.println("Login Test");
	        Assert.assertTrue(true);  // Passed
	    }

	    @Test(dependsOnMethods = {"loginTest"})
	    public void dashboardTest() 
	    {
	        System.out.println("Dashboard Test");
	        Assert.assertTrue(false);
	    }

	    @Test(dependsOnMethods = {"dashboardTest"})
	    public void logoutTest() 
	    {
	        System.out.println("Logout Test");
	    }


}
