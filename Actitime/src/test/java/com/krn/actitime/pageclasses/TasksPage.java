package com.krn.actitime.pageclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class TasksPage {
	
	
	@FindBy(xpath="//a[@href='/tasks/tasklist.do']")
	WebElement tasks;
	
	@FindBy(xpath="//div[text()='Add New']")
	WebElement addNew;
	@Test
	public void clickOnTasks(WebDriver driver) {
		tasks.click();
	}
	
	public void clickOnAddNew(WebDriver driver) 
	{
		addNew.click();
	}
}
