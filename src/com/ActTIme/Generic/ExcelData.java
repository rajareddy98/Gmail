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
	public static String getData(String pathname,String SheetName, int rn, int cn)
	{
		try 
		{
			FileInputStream file = new FileInputStream(new File(pathname));
			String data =WorkbookFactory.create(file).getSheet(SheetName).getRow(rn).getCell(cn).toString();
			return data;
		}
		catch (Exception e)
		{

			return " ";
		}
	}
	public static String getintno(String pathname,String SheetName, int rn, int cn)
	{
		try 
		{
			FileInputStream file = new FileInputStream(new File(pathname));
			String no = new DataFormatter().formatCellValue(WorkbookFactory.create(file).getSheet(SheetName).getRow(rn).getCell(cn));
			return no;
		}
		catch (Exception e)
		{

			return " " ;
		}
		
	}
	public static int getRowCount(String pathname,String SheetName)
	{
		try 
		{
			FileInputStream file = new FileInputStream(new File(pathname));
			int rc  =WorkbookFactory.create(file).getSheet(SheetName).getLastRowNum();
			return rc;
		}
		catch (Exception e)
		{

			return 0;
		}
		
	}
	
	public static int getCellCount(String pathname,String SheetName,int rn)
	{
		try 
		{
			FileInputStream file = new FileInputStream(new File(pathname));
			int cc  =WorkbookFactory.create(file).getSheet(SheetName).getRow(rn).getLastCellNum();
			return cc;
		}
		catch (Exception e)
		{

			return 0;
		}
	}
	public static void putData(String pathname,String SheetName, int rn, int cn,String value)
	{
			try 
			{
				FileInputStream file = new FileInputStream(new File(pathname));
				Workbook wb = WorkbookFactory.create(file);
				 Sheet sh = wb.getSheet(SheetName);
				 Row r=sh.getRow(rn);
				Cell c = r.getCell(cn);
				c.setCellValue(value);
				FileOutputStream fos =  new FileOutputStream(new File(pathname));
				wb.write(fos);
				wb.close();
				
			}
			catch (Exception e)
			{
				
			}
	}	
	
}
