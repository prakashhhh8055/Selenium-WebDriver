package WorkingWithListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener
{
	  public void onStart(ITestContext context) {
		    System.out.println("----Start Execution----");
		  }
	
	  public void onTestStart(ITestResult result) {
		  System.out.println("Test Started Executing....");
		  }
	 
	  public void onTestSuccess(ITestResult result) {
		  System.out.println("Test Successfully Executed....");
		  }
	  
	  public void onTestFailure(ITestResult result) {
		  System.out.println("Test Execution Failed....");
		  }
	  
	  public void onTestSkipped(ITestResult result) {
		  System.out.println("Test Execution Skipped....");
		  }
	  
	  public void onFinish(ITestContext context) {
		  System.out.println("Test Execution Finished....");
		  }
	  
	  

}
