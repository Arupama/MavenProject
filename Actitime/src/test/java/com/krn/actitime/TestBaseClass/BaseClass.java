package com.krn.actitime.TestBaseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.krn.actitime.pageclasses.TasksPage;
public class BaseClass {
  public WebDriver driver;
  public ExcelLibrary xlib;
  public TasksPage tp;
  @BeforeClass
  public void OpenBrowser()
  {
	  driver=new FirefoxDriver();
	   tp=new TasksPage();
	  driver.manage().window().maximize();
	  driver.get("https://demo.actitime.com/login.do");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
  @BeforeMethod
  public void Login()
  {
	  
	  xlib=new ExcelLibrary();
	  String UN=xlib.getExcelData("Login", 1, 0);
	  String pwd=xlib.getExcelData("Login", 1, 1);
	  driver.findElement(By.id("username")).sendKeys(UN);
	  driver.findElement(By.name("pwd")).sendKeys(pwd);
	  driver.findElement(By.id("loginButton")).click();
  }
  @AfterMethod
  public void Logout()
  {
	  driver.findElement(By.id("logoutLink")).click();
  }
  @AfterClass
  public void CloseBrowser()
  {
	  driver.close();
  }
}
