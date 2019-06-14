package com.ActTIme.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.ActTIme.Generic.BasePage;



public class LoginPage extends BasePage
{
	@FindBy(xpath="//a[@class='gb_x gb_1b']")
	private WebElement appsBT;	
	@FindBy(xpath="(//span[@class='gb_k'])[8]")
	private WebElement clickOnCont;
	@FindBy(xpath="//input[@type='email']")
	private WebElement email;
	@FindBy(xpath="//input[@type='password']")
	private WebElement pass;
	@FindBy(xpath="//span[.='Create contact']")
	private WebElement cr;
	@FindBy(xpath="//input[@aria-label='First name']")
	private WebElement fname;
	@FindBy(xpath="//input[@aria-label='Phone']")
	private WebElement phone;
	@FindBy(xpath="(//button[@class='VfPpkd-LgbsSe ksBjEc'])[2]")
	private WebElement save;
	
	//intlization
	public LoginPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver,this);
		
	}
	
	//utlization
	public void google() throws InterruptedException
	{
		appsBT.click();
		Thread.sleep(2000);
		clickOnCont.click();
		email.sendKeys("",Keys.ENTER);
		Thread.sleep(2000);
		pass.sendKeys("",Keys.ENTER);
		cr.click();
		fname.sendKeys("abc");
		phone.sendKeys("4546254545");
		save.click();
	}
	
	
}
