package DataDrivernTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoExcel {

	public static void main(String[] args) throws IOException {
		//Create and Write into the New Excel File
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("Writedata");
		XSSFRow row1=sheet.createRow(0);
		row1.createCell(0).setCellValue("Prakash G Malagi");
		row1.createCell(1).setCellValue("QA Engineer");
		row1.createCell(2).setCellValue("19-06-1997");
		row1.createCell(3).setCellValue(54360.50);
		
		XSSFRow row2=sheet.createRow(1);
		row2.createCell(0).setCellValue("Ranjeetha D V");
		row2.createCell(1).setCellValue("Data Analyst");
		row2.createCell(2).setCellValue("20-01-1998");
		row2.createCell(3).setCellValue(93000);
		
		XSSFRow row3=sheet.createRow(2);
		row3.createCell(0).setCellValue("Renuka G Malagi");
		row3.createCell(1).setCellValue("Hindi Teacher");
		row3.createCell(2).setCellValue("04-04-1993");
		row3.createCell(3).setCellValue(15000);
		
		XSSFRow row4=sheet.createRow(3);
		row4.createCell(0).setCellValue("Bhagya G Malagi");
		row4.createCell(1).setCellValue("English Lecturer");
		row4.createCell(2).setCellValue("01-01-1995");
		row4.createCell(3).setCellValue(18000);
		
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile2.xlsx");
		
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("File Writing Done....");
		
		
		

	}

}
