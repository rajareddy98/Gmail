package com.ActTIme.Test;

import org.testng.annotations.Test;

import com.ActTIme.Generic.BaseTest;
import com.ActTIme.Generic.ExcelData;
import com.ActTIme.Pages.LoginPage;



public class TC01 extends BaseTest
{
	@Test(priority=1)
	public void ValidLoginLogout() throws InterruptedException
	{	
		
		LoginPage lp= new LoginPage(driver);
		lp.google();
		int rc = ExcelData.getRowCount(file_path, "Sheet1");
		for(int i=3; i<=rc; i++)
		{
		String name = ExcelData.getData(file_path, "Sheet1", i, 1);
//		String lname =ExcelData.getData(file_path, "Sheet1", i, 4);
		Thread.sleep(2000);
		String no = ExcelData.getData(file_path, "Sheet1", i, 0);
		System.out.println(no);
		lp.clickOnContacts();
		lp.enterfname(name);
//		lp.enterlastname(lname);
		lp.enterphoneno(no);
		lp.clickonSave();
		lp.clickonClose();
		Thread.sleep(2000);
		}
	}
}
