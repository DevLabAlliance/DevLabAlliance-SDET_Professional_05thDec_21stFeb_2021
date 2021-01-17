package com.devlabs.testNG.lab2;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC001 extends ProjectGenericWrappers{
	
	@DataProvider
	public String[][] testdata() {
		// String[][] data = new String[Row Size][Column Size];
		String[][] data = new String[3][2];
		// Data set - I
		data[0][0] = "Devlabs";
		data[0][1] = " Tester";
		// Data set - II
		data[1][0] = "Dipendra";
		data[1][1] = " Developer";
		// Data set - III
		data[2][0] = "Sheena";
		data[2][1] = " Devops";
		return data;
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
