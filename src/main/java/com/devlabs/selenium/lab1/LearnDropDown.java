package com.devlabs.selenium.lab1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {
public static void main(String[] args) {
	// Creating an environment for the system to access chrome or any browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		// Open a Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		
		// To Load an URL in the opened browser
		driver.get("https://devlabs-860f0.web.app/dropdown");
		
		// To Maximise the window
		driver.manage().window().maximize();
		
		// To locate the drop down select tag
		WebElement elementDropDown = driver.findElement(By.id("Index"));
		
		// Type - I -> using sendKeys()
		// elementDropDown.sendKeys("Mango");
		
		// Type - II -> using Select Class
		// Creating an Obj for Select class and showing the drop down to that
		Select dd = new Select(elementDropDown);
		
		// Select using Index
		// dd.selectByIndex(2);
		
		// Select using Visible Text
		// dd.selectByVisibleText("Orange");
		
		// Select using value
		dd.selectByValue("1");
		List<WebElement> options = dd.getOptions();
		System.out.println("No. of options available: "+ options.size());
		for (WebElement eachOption : options) {
			System.out.println(eachOption.getText());
		}
		
		
		
		
		
		
		
		
		
		
		
}
}
