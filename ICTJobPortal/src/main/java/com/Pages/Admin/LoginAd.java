package com.Pages.Admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;

public class LoginAd extends BaseClass {
	WebDriver driver;
	
	public LoginAd(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		}
	@FindBy(xpath="//a[text()='Log In As Admin']")
	private WebElement loginasadmin;
	
	@FindBy(xpath="//input[@placeholder='Enter your Email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@placeholder='Enter your Password']")
	private WebElement password;
	
	@FindBy(xpath="//button[text()='Submit']")
	private WebElement submitbutton;
	
	public void clickLoginAsAdmin() throws InterruptedException
	{
		Thread.sleep(1000);
		loginasadmin.click();
		
	}
	
	
	public void EnterEmail(Object Email) throws InterruptedException
	{
		email.sendKeys( Email.toString() );
		Thread.sleep(3000);
	}
	
	
	

	public void EnterPassword(Object Paswd)throws InterruptedException
	{
		password.sendKeys( Paswd.toString() );
		Thread.sleep(3000);
	}
	public void clickSubmit() throws InterruptedException
	{
		submitbutton.click();
		Thread.sleep(3000);
	}
	

	
}
