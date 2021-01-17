package com.devlabs.testNG.lab2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC002 extends ProjectGenericWrappers{
	
	@DataProvider(name = "Data Source")
	public String[][] testdata() {
		String[][] data = new String[2][2];
		// Data set - I
		data[0][0] = "Apple";
		data[0][1] = "Good";
		// Data set - II
		data[1][0] = "Mango";
		data[1][1] = "Bad";
		
		return data;
	}

	@Test(dataProvider = "Data Source")
	public void tc002(String fruit, String life) {
		driver.findElement(By.xpath("//span[text()='Dropdown']")).click();
		
		WebElement dd1 = driver.findElement(By.id("Index"));
		new Select(dd1).selectByVisibleText(fruit);
		
		WebElement dd2 = driver.findElement(By.name("text"));
		new Select(dd2).selectByVisibleText(life); 	
		// To get the title from the browser
		String title = driver.getTitle();
		System.out.println(title);
	}

}
