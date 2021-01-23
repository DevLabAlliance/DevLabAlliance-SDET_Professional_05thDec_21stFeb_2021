package com.devlabs.testNG.lab2;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC001 extends ProjectGenericWrappers{
	
	@BeforeTest
	public void testSheetName() {
		excelFileName  = "TC001";
	}
	
	@Test(dataProvider = "testdata")
	public void tc001(String fullName, String join) {
		driver.findElement(By.xpath("//span[text()='Inputs']")).click();
		driver.findElement(By.id("fullName")).sendKeys(fullName);
		driver.findElement(By.id("join")).sendKeys(join);
		// To get the title from the browser
		String title = driver.getTitle();
		System.out.println(title);
	}

}
