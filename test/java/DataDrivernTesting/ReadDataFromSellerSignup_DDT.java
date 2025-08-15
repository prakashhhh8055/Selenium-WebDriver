package DataDrivernTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromSellerSignup_DDT {

	public static void main(String[] args) throws IOException {
		//Read Data from XLSX
		FileInputStream file=new FileInputStream("C:\\Prakash_SeleniumWebDriver\\Prakash_SeleniumWebDriver\\testdata\\DataForDDT.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		int totalRows=sheet.getLastRowNum();
		 
		int totalCells=sheet.getRow(1).getLastCellNum();
		 
		System.out.println("Number of rows in the sheet "+totalRows); 
		
		System.out.println("Number of cells in the sheet "+totalCells); 
		
		for(int r=0;r<=totalRows;r++)
		{
			XSSFRow currentRow=sheet.getRow(r);
			
			for(int c=0;c<totalCells;c++)
			{
				XSSFCell cell=currentRow.getCell(c);
				System.out.print(cell.toString()+"\t");
			}
			System.out.println();
		}
		
		workbook.close();
		file.close();
		
	}

}
