package DataDrivernTesting;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DDTReadAndWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\pgm4.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("Contacts");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("How many rows of data you would like to enter");
		int totalRows=sc.nextInt();
		
		System.out.println("How many cell of data you would like to enter");
		int totalCells=sc.nextInt();
		
		System.out.println("Please Enter the Data...");
		
		for(int r=0;r<=totalRows;r++)
		{
			XSSFRow currentRow=sheet.createRow(r);
			for(int c=0;c<totalCells;c++)
			{
				XSSFCell cell=currentRow.createCell(c);
				cell.setCellValue(sc.next());
			}
		}
		
		System.out.println("File Created Successfully...");
		workbook.write(file);
		workbook.close();
		file.close();

	}

}
