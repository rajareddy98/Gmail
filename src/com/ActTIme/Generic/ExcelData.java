package com.ActTIme.Generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData 
{
	public static String getData(String f_path,String sheetName,int rn,int cn)
	{
		try {
			FileInputStream file= new FileInputStream(new File("C:\\Users\\RAJAREDDY\\git\\Gmail\\Data\\input.xlsx"));
			Workbook wb=WorkbookFactory.create(file);
			String data=wb.getSheet(sheetName).getRow(rn).getCell(cn).toString();
			return data;
		} 
		catch (Exception e) 
		{
		 return " ";
		}
		
	}
	
	public static  int getRowCount(String f_path,String sheetName)
	{
		try 
		{
			FileInputStream file= new FileInputStream(new File("C:\\Users\\RAJAREDDY\\git\\Gmail\\Data\\input.xlsx"));
			int rc=WorkbookFactory.create(file).getSheet(sheetName).getLastRowNum();
			return rc;
		}
		catch (Exception e) 
		{
			return 0;
		}
		
	
	}
	 public static  int getCellCount(String f_path,String sheetName,int rn)
	 {
		 try
		 {
			 FileInputStream file= new FileInputStream(new File("C:\\Users\\RAJAREDDY\\git\\Gmail\\Data\\input.xlsx"));
			 int cc=WorkbookFactory.create(file).getSheet(sheetName).getRow(rn).getLastCellNum();
			 return cc;
		 }
		 catch (Exception e) 
		 {
			 return 0;
		 }
	 }
}
