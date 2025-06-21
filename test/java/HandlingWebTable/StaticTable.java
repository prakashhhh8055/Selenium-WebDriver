package HandlingWebTable;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		//Handle Static Table
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//Get Table Name
		String TableName=driver.findElement(By.xpath("//*[@id=\"HTML1\"]/h2")).getText();
		System.out.println("Name of the Static Web Table-> "+TableName);
		
		//Get Table Rows count
		int rows= driver.findElements(By.xpath("//table[@name='BookTable']//tbody/tr")).size();
		System.out.println("The Number of Rows-> "+rows);
		
		//Get Table Columns count
		int columns=driver.findElements(By.xpath("//table[@name='BookTable']//tr//th")).size();
		System.out.println("The Number of Columns-> "+columns);
		
		//Get a data from any specific rowXcolumn
		String Value=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[2]")).getText();
		System.out.println("5th Row 2nd Column Value-> "+Value);
		
		//Get All the rows and Columns Data from this Static Web Table
	/*	for(int r=2;r<=rows;r++)
		{
			for(int c=1;c<=columns;c++)
			{
				String data=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(data+"\t");
			}
			System.out.println(); 
		} */
		
		//Get All Book_Name and Author Name by Mukesh
	/*	for(int r=2;r<=rows;r++)
		{
			String Author_Name=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			if(Author_Name.equalsIgnoreCase("Mukesh"))
			{
				String Book_Name=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
				System.out.println(Book_Name+"\t"+Author_Name);
			}
		} */
		
		//Total of all the book prices
		long total=0;
		for(int r=2;r<=rows;r++)
		{
			String number= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
			int price = Integer.parseInt(number);
			total=total+price;
		}
		System.out.println("Total of all the books prices"+total);
		
		
		
		

	}

}
