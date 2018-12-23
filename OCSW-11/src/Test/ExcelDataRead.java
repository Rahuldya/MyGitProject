package Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataRead {

	public static void main(String[] args) throws Exception {
		
		File f = new File("C:\\Users\\eyyvrrl\\Desktop\\My_Ericsson_Learning\\Selenium-Course\\Mysheet.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet  sheet = wb.getSheet("Sheet1");
		
		int row = sheet.getLastRowNum();
		int col = sheet.getRow(0).getLastCellNum();
		
		for(int i=0;i<row;i++)
		{
			
			for(int j=0;j<col;j++)
			{
				String data = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(data);
			}
		}
		wb.close();
	}

}
