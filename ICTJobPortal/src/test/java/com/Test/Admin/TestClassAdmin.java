package com.Test.Admin;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Base.BaseClass;
import com.Pages.Admin.ApproveJobsAd;
import com.Pages.Admin.CreatePostAd;
import com.Pages.Admin.EditPostAd;
import com.Pages.Admin.LoginAd;
import com.Utilities.AlertMsg;
import com.Utilities.ExcelUtility;

public class TestClassAdmin extends BaseClass{

	
	LoginAd adloginobj;
	AlertMsg alertobj;
	CreatePostAd  postadobj;
	EditPostAd editobj;
	ApproveJobsAd approveobj;
	
	@Test(priority=1)
	public void AdminLoginVerification() throws IOException, InterruptedException
	{
		LoginAd adloginobj=new LoginAd(driver);
		adloginobj.clickLoginAsAdmin();
		Object  Email=ExcelUtility.GetCellData(0, 0, System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelActivity.xlsx", 1);
		Object  Pswd=ExcelUtility.GetCellData(0, 1, System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelActivity.xlsx", 1);
		adloginobj.EnterEmail(Email);
	
		 adloginobj.EnterPassword(Pswd);
		 Thread.sleep(2000);
		 
		 adloginobj.clickSubmit(); 
		 Thread.sleep(2000);
		AlertMsg alertobj= new AlertMsg();
		 alertobj.AcceptAlert(driver);
		 Thread.sleep(2000);
       }
	@Test(priority=2)
	public void CreateNewPostAdmin() throws InterruptedException, IOException
	{
		CreatePostAd  postadobj=new CreatePostAd(driver);
		 postadobj.clickCreatePost();
		 
		 String txt=postadobj.GetText();
			Assert.assertEquals(txt,"Create New Post");
			System.out.println("FORM HEADING IS : "+txt);
		 Object  Jname=ExcelUtility.GetCellData(0, 0, System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelActivity.xlsx", 2);
			Object cmpname=ExcelUtility.GetCellData(0, 1, System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelActivity.xlsx", 2);
			 Object  Jplace=ExcelUtility.GetCellData(0, 2, System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelActivity.xlsx", 2);
			Object Jsalary=ExcelUtility.GetCellData(0, 3, System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelActivity.xlsx", 2);
	
			 Object  Jtype=ExcelUtility.GetCellData(0, 4, System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelActivity.xlsx", 2);
				Object qlfcn=ExcelUtility.GetCellData(0, 5, System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelActivity.xlsx", 2);
				Object  exp=ExcelUtility.GetCellData(0, 6, System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelActivity.xlsx", 2);
				Object bnfts=ExcelUtility.GetCellData(0, 7, System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelActivity.xlsx", 2);
				Object  schdl=ExcelUtility.GetCellData(0, 8, System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelActivity.xlsx", 2);
				Object lng=ExcelUtility.GetCellData(0, 9, System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelActivity.xlsx", 2);
				Object  cntct=ExcelUtility.GetCellData(0, 10, System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelActivity.xlsx", 2);
				Object dscrptn =ExcelUtility.GetCellData(0, 11, System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelActivity.xlsx", 2);
	
				 postadobj.EnterJobName(Jname);
				 Thread.sleep(1000);
                  postadobj.EnterCompanyName(cmpname);
				 
                  Thread.sleep(1000);
				 postadobj.EnterJobPlace(Jplace);
				 Thread.sleep(1000);

				 postadobj.EnterSalary(Jsalary);
				 Thread.sleep(1000);
				 postadobj.EnterJobType(Jtype);
				 Thread.sleep(1000);
				 postadobj.EnterQualification(qlfcn);
				 
				 Thread.sleep(1000);
				 postadobj.EnterExperience(exp);
				 
				 Thread.sleep(1000);
				 postadobj.EnterBenefits(bnfts);
				 
				 Thread.sleep(1000);
				 postadobj.EnterSchedule(schdl);
				 Thread.sleep(1000);

				 postadobj.EnterLanguage(lng);
				 Thread.sleep(1000);

				 postadobj.EnterContactDetails(cntct);
				 
				 Thread.sleep(1000);
				 postadobj.EnterJobDescription(dscrptn);
				 
				 Thread.sleep(1000);
				 postadobj.clickSubmitPostt();
				 
				 AlertMsg alertobj= new AlertMsg();
				 alertobj.AcceptAlert(driver);
				 Thread.sleep(2000);
	
	
	
	}
	@Test(priority=3)
	public void EditPostByAdmin() throws InterruptedException, IOException
	{
		
		EditPostAd editobj=new EditPostAd(driver);
		editobj.clickEditJobPost();
		
		 Object  Jname=ExcelUtility.GetCellData(0, 0, System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelActivity.xlsx", 2);
			Object cmpname=ExcelUtility.GetCellData(0, 1, System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelActivity.xlsx", 2);
			 Object  Jplace=ExcelUtility.GetCellData(0, 2, System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelActivity.xlsx", 2);
			Object Jsalary=ExcelUtility.GetCellData(0, 3, System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelActivity.xlsx", 2);
		Object dscrptn =ExcelUtility.GetCellData(0, 11, System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelActivity.xlsx", 2);
	
				 editobj.EnterJobName(Jname);
				 Thread.sleep(1000);
                  editobj.EnterCompanyName(cmpname);
				 
                  Thread.sleep(1000);
                  editobj.EnterJobPlace(Jplace);
				 Thread.sleep(1000);

				 editobj.EnterSalary(Jsalary);
				 Thread.sleep(1000);
				 
                  editobj.EnterJobDescription(dscrptn);
				 Thread.sleep(1000);

				 editobj.clickSubmitPostt();
				 
				 AlertMsg alertobj= new AlertMsg();
				 alertobj.AcceptAlert(driver);
	
				
				
	}
@Test(priority=4)
public void DeleteJob() throws InterruptedException
{
	EditPostAd editobj=new EditPostAd(driver);
	editobj.clickDelete();
	 Thread.sleep(3000);
	 AlertMsg alertobj= new AlertMsg();
	 alertobj.AcceptAlert(driver);
	 editobj.clickReadMore();
	 
	 Thread.sleep(3000);
	 System.out.println("PAGE TITLE IS :" +driver.getTitle());
	 driver.navigate().back();
	 
	 }

@Test(priority=5)
public void ApproveRequestFromAlumni() throws InterruptedException
{
	ApproveJobsAd approveobj=new ApproveJobsAd(driver);
    approveobj.clickApproveRequestFromAlumni();
    approveobj.clickApprove();
    Thread.sleep(3000);
    AlertMsg alertobj= new AlertMsg();
	 alertobj.AcceptAlert(driver);
	 Thread.sleep(3000);
	 approveobj.clickReadmore();
	 Thread.sleep(3000);
	 driver.navigate().back();
	 approveobj.clickViewResume();
	 Thread.sleep(3000);
	 
	 Set<String> wnd1 = driver.getWindowHandles();
		
		//window handles iteration
		Iterator<String> i1 = wnd1.iterator();
		String prntw1 = i1.next();
		String popwnd1 = i1.next();
		//switching pop up window handle id
		driver.switchTo().window(popwnd1);
		driver.close();
		driver.switchTo().window(prntw1);
		Thread.sleep(2000);
		driver.navigate().back();

}

	
	
}
