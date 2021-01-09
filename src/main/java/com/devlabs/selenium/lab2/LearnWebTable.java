package com.devlabs.selenium.lab2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {
public static void main(String[] args) {
	// Creating an environment for the system to access chrome or any browser
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
			// Open a Chrome Browser
			ChromeDriver driver = new ChromeDriver();
			
			// To Load an URL in the opened browser
			driver.get("https://devlabs-860f0.web.app/table");
			
			// To Maximise the window
			driver.manage().window().maximize();
			
			// Finding the Table
			WebElement elementTable = driver.findElement(By.id("table"));
			
			// Finding the rows inside the table
			List<WebElement> elementRows = elementTable.findElements(By.tagName("tr"));
			System.out.println("No. of Rows: "+elementRows.size());
			
			// Iterating over the list of rows to get each out of it
			for (int i = 0; i < elementRows.size(); i++) {
				// Getting each Row out of the List
				WebElement eachRow = elementRows.get(i);
				// Getting Columns of each row
				List<WebElement> elementColumns = eachRow.findElements(By.tagName("td"));
				for (int j = 0; j < elementColumns.size(); j++) {
					System.out.println(elementColumns.get(j).getText());
				}
			}
			
			
			
			
			
			
}
}
