package com.Pages.Admin;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;

public class CreatePostAd extends BaseClass{
 WebDriver driver;
	
	public CreatePostAd(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		}
	
	@FindBy(xpath="//a[text()='Crate New Post']")
	private WebElement create;
	
	@FindBy(xpath="//input[@formcontrolname='Jobname']")
	private WebElement jobname;
	

	@FindBy(xpath="//input[@formcontrolname='CompanyName']")
	private WebElement companyname;
	
	@FindBy(xpath="//input[@formcontrolname='Place']")
	private WebElement place;
	
	@FindBy(xpath="//input[@formcontrolname='Salary']")
	private WebElement salary;
	
	@FindBy(xpath="//input[@formcontrolname='JobType']")
	private WebElement jobtype;
	
	@FindBy(xpath="//input[@formcontrolname='Qualifications']")
	private WebElement qualification;
	
	@FindBy(xpath="//input[@formcontrolname='Experience']")
	private WebElement experience;
	
	@FindBy(xpath="//input[@formcontrolname='Benefits']")
	private WebElement benefits;
	
	@FindBy(xpath="//input[@formcontrolname='Schedule']")
	private WebElement schedule;
	
	@FindBy(xpath="//input[@formcontrolname='Language']")
	private WebElement language;
	
	@FindBy(xpath="//input[@formcontrolname='Contact']")
	private WebElement contact;
	
	@FindBy(xpath="//textarea[@formcontrolname='JobDescription']")
	private WebElement description;
	
	@FindBy(xpath="//button[text()='Submit']")
	private WebElement submitpost;
	
	@FindBy(xpath="//h2[text()='Create New Post']")
	private WebElement formheading;
	
	
	public void clickCreatePost() throws InterruptedException
	{
		Thread.sleep(1000);
		create.click();
		
	}
	public String GetText()
	{
		String txt=formheading.getText();
		return txt;
		}
	
	
	public void EnterJobName(Object Jname) throws InterruptedException
	{
		jobname.sendKeys( Jname.toString() );
		Thread.sleep(2000);
	}
	
	public void EnterCompanyName(Object cmpname) throws InterruptedException
	{
		companyname.sendKeys( cmpname.toString() );
		Thread.sleep(2000);
	}
	public void EnterJobPlace(Object Jplace) throws InterruptedException
	{
		place.sendKeys( Jplace.toString() );
		Thread.sleep(2000);
	}
	
	public void EnterSalary(Object Jsalary) throws InterruptedException
	{
		salary.sendKeys( Jsalary.toString() );
		Thread.sleep(2000);
	}
	public void EnterJobType(Object Jtype) throws InterruptedException
	{
		jobtype.sendKeys( Jtype.toString() );
		Thread.sleep(2000);
	}
	public void EnterQualification(Object qlfcn) throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",qualification);
		qualification.sendKeys( qlfcn.toString() );
		Thread.sleep(2000);
	}
	public void EnterExperience(Object exp) throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",experience);
		experience.sendKeys(exp.toString() );
		Thread.sleep(2000);
	}
	
	public void EnterBenefits(Object bnfts) throws InterruptedException
	{
		benefits.sendKeys(bnfts.toString() );
		Thread.sleep(2000);
	}
	public void EnterSchedule(Object schdl) throws InterruptedException
	{
		schedule.sendKeys( schdl.toString() );
		Thread.sleep(2000);
	}
	
	public void EnterLanguage(Object lng) throws InterruptedException
	{
		language.sendKeys(lng.toString() );
		Thread.sleep(2000);
	}
	
	public void EnterContactDetails(Object cntct) throws InterruptedException
	{
		contact.sendKeys(cntct.toString() );
		Thread.sleep(2000);
	}
	
	public void EnterJobDescription(Object dscrptn) throws InterruptedException
	{
		description.sendKeys(dscrptn.toString() );
		Thread.sleep(2000);
	}
	public void clickSubmitPostt() throws InterruptedException
	{
		Thread.sleep(1000);
		submitpost.click();
		
	}
	
}



