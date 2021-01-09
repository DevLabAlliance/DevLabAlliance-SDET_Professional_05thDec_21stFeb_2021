package com.devlabs.selenium.lab2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDWait {
public static void main(String[] args) {
		
		// Creating an environment for the system to access chrome or any browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		// Open a Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		
		// To Load an URL in the opened browser
		driver.get("https://www.amazon.in/");
		
		// To Maximise the window
		driver.manage().window().maximize();
		
		
		
		// Creating obj for webdriverwait class -> one time 
		WebDriverWait wait = new WebDriverWait(driver, 15);
		
		wait.until(ExpectedConditions.visibilityOf(element));
		
		
		
		
		
}
}
