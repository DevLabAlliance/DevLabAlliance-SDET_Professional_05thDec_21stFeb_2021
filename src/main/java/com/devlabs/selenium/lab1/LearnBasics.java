package com.devlabs.selenium.lab1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnBasics {
public static void main(String[] args) {
	
	// Creating an environment for the system to access chrome or any browser
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
	// Open a Chrome Browser
	ChromeDriver driver = new ChromeDriver();
	
	// To Load an URL in the opened browser
	driver.get("https://devlabs-860f0.web.app/edit");
	
	// To Maximise the window
	driver.manage().window().maximize();
	
	// To get the title from the browser
	String title = driver.getTitle();
	System.out.println(title);
	
	// To find the element and store it as a WebElement
	WebElement elementFirstNameTextBox = driver.findElement(By.id("fullName"));
	
	// Typing on a WebElement
	elementFirstNameTextBox.sendKeys("Devlabs");
	
	// Entering a keyboard key to the webpage
	driver.findElement(By.id("join")).sendKeys("human being",Keys.TAB);
	
	// Clear the text inside the textfield
	elementFirstNameTextBox.clear();
	
	WebElement button = driver.findElement(By.id("Button"));
	if (button.isDisplayed()) {
		button.click();
	}
	else {
		System.out.println("Button is not displayed");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

}
