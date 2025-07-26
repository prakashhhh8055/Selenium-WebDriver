package DataDrivernTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {
		//Excel File --- >Workbook --- >Sheets --- >Rows ---- Cells
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\DDT_Test_Data.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		int TotalRowsCount=sheet.getLastRowNum();
		
		int TotalCellsCount=sheet.getRow(1).getLastCellNum();
		
		System.out.println("Total number of rows count "+TotalRowsCount);
		
		System.out.println("Total Number of Columns Count "+TotalCellsCount);
		
		for(int r=0;r<=TotalRowsCount;r++)
		{
			XSSFRow CurrentRow=sheet.getRow(r);
			
			for(int c=0;c<TotalCellsCount;c++)
			{
				XSSFCell cell=CurrentRow.getCell(c);
				System.out.print(cell.toString()+"\t");
			}
			System.out.println();
		}
		
		
		workbook.close();
		file.close();
		
		

	}

}
