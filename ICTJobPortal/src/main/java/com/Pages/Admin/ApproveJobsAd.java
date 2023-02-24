package com.Pages.Admin;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;

public class ApproveJobsAd  extends BaseClass{
	
	WebDriver driver;
	public  ApproveJobsAd (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		}
	@FindBy(xpath="//a[text()='Approve Req From Alumni']")
	private WebElement approve ;
	
	@FindBy(xpath="//button[text()='Approve']")
	private WebElement approvebutton ;
	
	@FindBy(xpath="//button[text()='ReadMore']")
	private WebElement readmore;
	
	@FindBy(xpath="//button[text()='ViewResume']")
	private WebElement viewresume ;
	
	public void clickApproveRequestFromAlumni() throws InterruptedException
	{
		Thread.sleep(1000);
		approve.click();
		
	}
	
	public void clickApprove() throws InterruptedException
	{
		Thread.sleep(1000);
		approvebutton.click();
		
	}
	public void clickReadmore() throws InterruptedException
	{
		Thread.sleep(1000);
		readmore.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,350)", "");
		
		
	}
	public void clickViewResume() throws InterruptedException
	{
		Thread.sleep(1000);
		viewresume.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,500)", "");
		
		
	}
	
	
		
}



	

