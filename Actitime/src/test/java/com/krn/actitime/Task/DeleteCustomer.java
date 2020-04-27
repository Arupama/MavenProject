package com.krn.actitime.Task;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.krn.actitime.TestBaseClass.BaseClass;

public class DeleteCustomer extends BaseClass{
	
	@Test
	public void testDeleteCustomer() {
	     
		
		String custName=xlib.getExcelData("DeleteCustomer", 1, 0);
		driver.findElement(By.xpath("(//input[@placeholder='Start typing name ...'])[1]")).sendKeys(custName);
		driver.findElement(By.xpath("//span[text()='"+custName+"' and @class='highlightToken']/../../..//div[@class='editButton']")).click();
		driver.findElement(By.xpath("(//div[text()='ACTIONS'])[1]")).click();
		driver.findElement(By.xpath("(//div[text()='Delete'])[2]")).click();
		driver.findElement(By.xpath("//span[text()='Delete permanently']")).click();
	}
	
}
