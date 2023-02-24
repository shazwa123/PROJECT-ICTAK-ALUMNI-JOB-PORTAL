package com.Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	 public WebDriver driver;
	
	public static Properties prop=null;
@BeforeTest
public void onSetup() throws IOException 
{
	prop=new Properties();
	FileInputStream	pFile=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");
 prop.load(pFile);
 driver=new ChromeDriver();
 driver.get(prop.getProperty("Url"));
 driver.manage().window().maximize();
}
@AfterTest
public void closeWindow()
{
	driver.quit();
	}

}
