package com.ActTIme.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ActTIme.Generic.BasePage;



public class LoginPage extends BasePage
{
	@FindBy(xpath="//a[text()='Gmail']/../../..//div[@class='gb_lf']")
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
	@FindBy(xpath="(//div[@class='bLQjSd mBvP5e']//*)[13]") private WebElement closeBT;
	@FindBy(xpath="(//input[@type='text'])[5]") private WebElement lastname;
	
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
		email.sendKeys("pradeepamr007",Keys.ENTER);
		Thread.sleep(2000);
		pass.sendKeys("Ravi@987",Keys.ENTER);
		Thread.sleep(20000);
	}
	public void clickOnContacts()
	{
		cr.click();
	}
	public void enterfname(String name)
	{
		fname.sendKeys(name);
	}
	public void enterphoneno(String no)
	{
		phone.sendKeys(no);
	}
	public void clickonSave()
	{
		save.click();
	}
	public void enterlastname(String lname)
	{
		lastname.sendKeys(lname);
	}
	public void clickonClose()
	{
		closeBT.click();
	}
	
}
