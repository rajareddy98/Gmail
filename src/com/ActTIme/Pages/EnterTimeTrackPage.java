package com.ActTIme.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ActTIme.Generic.BasePage;


public class EnterTimeTrackPage extends BasePage
{
	@FindBy(id="logoutLink")
	private WebElement lgOut;

	public EnterTimeTrackPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnLogOut()
	{
		lgOut.click();
	}
	
	
}
