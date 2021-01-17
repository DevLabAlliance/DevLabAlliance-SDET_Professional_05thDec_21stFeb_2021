package com.devlabs.selenium.lab3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindows {
public static void main(String[] args) {
	// Creating an environment for the system to access chrome or any browser
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
	// Open a Chrome Browser
	ChromeDriver driver = new ChromeDriver();
	
	// To Load an URL in the opened browser
	driver.get("https://www.naukri.com/");
	
	// To Maximise the window
	driver.manage().window().maximize();
	
	// Implicit wait
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	// To find the unique locator of the current page
	String currentWindow = driver.getWindowHandle();
	
	System.out.println(currentWindow);
	
	// To find the unique locator of all the pages opened
	Set<String> allWindows = driver.getWindowHandles();
	
	System.out.println(allWindows.size());
	
	// Add the set values in to the List
	List<String> list = new ArrayList<String>(allWindows);
	
	// Getting unique value from the List
	String uniqueRef = list.get(1);
	driver.switchTo().window(uniqueRef);
	
	
	System.out.println(driver.getTitle());
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
