package com.adx.qa.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.adx.qa.base.PageGeneric;
import com.adx.qa.pages.DataProviderMain;

public class DataProviderUsingExcelSheet extends PageGeneric {
	
	DataProviderMain db1;
		
	
	@Test(dataProvider="getData")
	public void getDataFromDataProvider(String un,String pw)
	{
		initialiaztion();
		db1= new DataProviderMain();
		db1.logintest(un, pw);
	}
	

	@DataProvider(name="getData")
	public Object[][] generateData() throws Exception
	{

		
		File f1 = new File("C:\\Users\\eyyvrrl\\workspace\\ADXProject\\src\\main\\java\\com\\adx\\qa\\testData\\Mysheet.xlsx");
		
		FileInputStream fis = new FileInputStream(f1);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheet("Sheet1");
		
		int row=sh.getLastRowNum();
		int col = sh.getRow(0).getLastCellNum();
		Object[][] obj1=new Object[row][col];
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				obj1[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
			}
		}
		return obj1;
		
	}

}
