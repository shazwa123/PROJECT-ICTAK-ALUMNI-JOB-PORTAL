package com.Test.Faculty;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Base.BaseClass;
import com.Pages.Faculty.LoginpageFac;
import com.Pages.Faculty.SignoutFac;
import com.Pages.Faculty.SignupFac;
import com.Utilities.ExcelUtility;

public class TestClassFac extends BaseClass {
SignupFac objSignup;
LoginpageFac objLog;
SignoutFac objSignout;

@Test(priority=1)
public void Signupverification() throws InterruptedException, IOException {
	

objSignup=new SignupFac(driver);
objSignup.clickonloginasFaculty();
objSignup.clickonSignup();
Object enterName=ExcelUtility.GetCellData(1, 3,System.getProperty("user.dir")+ "\\src\\main\\resources\\ExcelHome.xlsx", 0);
Object enterEmail=ExcelUtility.GetCellData(1, 1, System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelHome.xlsx", 0);
Object enterPassword=ExcelUtility.GetCellData(1,2, System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelHome.xlsx", 0);

objSignup.enterName(enterName);
objSignup.enterEmail(enterEmail);
objSignup.enterPassword(enterPassword);
objSignup.clicksubmit();}

@Test(priority=2)
public void Loginverification() throws IOException, InterruptedException {
	objLog=new LoginpageFac(driver);
	
	Object enterEmail=ExcelUtility.GetCellData(2, 1,System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelHome.xlsx", 0);
	Object enterPassword=ExcelUtility.GetCellData(2, 2,System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelHome.xlsx", 0);
	objLog.enterEmail(enterEmail);
	objLog.enterPassword(enterPassword);
	
	
	objLog.clicksubmit();
}

@Test(priority=3)
public void Logoutverification()
{objSignout=new SignoutFac(driver);
	objSignout.clicksignout();}
}

