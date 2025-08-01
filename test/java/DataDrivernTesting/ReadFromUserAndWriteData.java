package DataDrivernTesting;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromUserAndWriteData {

	public static void main(String[] args) throws IOException {
		//Accept Input From User/Console and Then write the same to Excel
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("Writedata");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("How Many rows you want to Enter");
		int NumberOfRows=sc.nextInt();
		
		System.out.println("How Many Cells you want to Enter");
		int NumberOfCells=sc.nextInt();
		
		for(int r=1;r<=NumberOfRows;r++)
		{
			XSSFRow currentRow=sheet.createRow(r);
			System.out.println("Please Enter the cell data");
			for(int c=0;c<NumberOfCells;c++)
			{
				XSSFCell currentCell=currentRow.createCell(c);
				currentCell.setCellValue(sc.next());
			}
		}
		
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\OwnFile12.xlsx");
		
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("File Writing Done....");
		
		

	}

}
