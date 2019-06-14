package com.ActTIme.Generic;

import java.io.File;
import java.io.FileInputStream;

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
}
