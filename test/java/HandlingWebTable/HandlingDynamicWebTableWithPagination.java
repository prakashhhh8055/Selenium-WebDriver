package HandlingWebTable;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingDynamicWebTableWithPagination {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-infobars");
		options.setExperimentalOption("prefs", new HashMap<String, Object>() {{
		    put("credentials_enable_service", false);
		    put("profile.password_manager_enabled", false);
		}});
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://superadmin.trulyfreehome.dev/index.php?/Superadmin");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("superadmin@gmail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("superadmin");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//li[@class='menuPageName_products']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[normalize-space()='STORE PRODUCTS']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//li[@id='1']")).click();
        Thread.sleep(5000);
        String text = driver.findElement(By.xpath("//div[@id='big_table_info']")).getText();

        // Example text: "Showing 1 to 20 of 843 entries"
        int total_Pages = Integer.parseInt(
        text.substring(text.indexOf("of ") + 3, text.indexOf("entries")).trim()
        		);

        System.out.println(total_Pages); // Outputs: 843

        for(int i=2;i<=4;i++)
        {
        	driver.findElement(By.xpath("//div[@id='big_table_paginate']//a[.='"+i+"']")).click();
        	Thread.sleep(3000);
        }
        
        List<WebElement> rows=driver.findElements(By.xpath("//table[@id='big_table']//tbody/tr"));
        System.out.println("Size of the rows-> "+rows.size());
        
        //Get all the Products Name.
        System.out.println("Product Name");
        for(int r=1;r<=rows.size();r++)	
        {
            String product_Name=driver.findElement(By.xpath("//table[@id='big_table']//tbody/tr["+r+"]//td[3]")).getText();
            System.out.println(product_Name);
        }
       
       
        
        

	}

}
