package com.ActTIme.Test;

import org.testng.annotations.Test;

import com.ActTIme.Generic.BaseTest;
import com.ActTIme.Pages.LoginPage;



public class TC01 extends BaseTest
{
	@Test(priority=1)
	public void ValidLoginLogout() throws InterruptedException
	{	
		LoginPage lp= new LoginPage(driver);
		lp.google();
		Thread.sleep(5000);
	}

}
