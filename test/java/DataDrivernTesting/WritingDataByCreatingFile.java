package DataDrivernTesting;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataByCreatingFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\pgm2.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("Contacts");
		XSSFRow row1=sheet.createRow(0);
			row1.createCell(0).setCellValue("Name");
			row1.createCell(1).setCellValue("Phone");
			row1.createCell(2).setCellValue("Role");
			
		XSSFRow row2=sheet.createRow(1);
			row2.createCell(0).setCellValue("Prakash");
			row2.createCell(1).setCellValue("+91 8123577835");
			row2.createCell(2).setCellValue("QA");
		
		XSSFRow row3=sheet.createRow(2);
			row3.createCell(0).setCellValue("Virat Kohli");
			row3.createCell(1).setCellValue("+91 7353227275");
			row3.createCell(2).setCellValue("Cricketer");
			
		XSSFRow row4=sheet.createRow(3);
			row4.createCell(0).setCellValue("Ranjeetha D V");
			row4.createCell(1).setCellValue("+91 9353615661");
			row4.createCell(2).setCellValue("Data Analyst");
			
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("File Created Sucessfuly");
		
			

	}

}
