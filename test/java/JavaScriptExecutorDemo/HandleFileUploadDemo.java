package JavaScriptExecutorDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Date_Pickers_Or_Calenders.SelectDateMonthYearUsingOneUserFriendlyFun;

public class HandleFileUploadDemo {

	public static void main(String[] args) {
		// Handle Single file Upload
		WebDriver driver = new ChromeDriver();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		/*driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\3Embed\\Downloads\\Prakash_G_Malagi_Compact.docx");
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("Prakash_G_Malagi_Compact.docx"))
		{
			System.out.println("File uploaded succesfully");
		}
		else
		{
			System.out.println("File upload failed");
		} */
		
		//Multiple Files Upload
		String file1="C:\\Users\\3Embed\\Downloads\\Prakash_G_Malagi_Compact.docx";
		String file2="C:\\Users\\3Embed\\Downloads\\Prakash_G_Malagi_Professional_Resume.docx";
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
		
		int count=driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		System.out.println("Number of Files uploaded "+count);
		//Validate Uploaded Files count
		if(count==2)
		{
			System.out.println("Both files uploaded successfully");
		}
		else
		{
			System.out.println("Uploading failed");
		}
		
		//Validate File Names
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("Prakash_G_Malagi_Compact.docx")&&driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("Prakash_G_Malagi_Professional_Resume.docx"))
		{
			System.out.println("Files Names are Matching");
		}
		else
		{
			System.out.println("Files Names are not Matching");
		}
		
		
}

}
