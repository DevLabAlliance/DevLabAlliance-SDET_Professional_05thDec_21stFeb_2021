package com.devlabs.selenium.lab3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {
public static void main(String[] args) {
	// Creating an environment for the system to access chrome or any browser
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				
				// Open a Chrome Browser
				ChromeDriver driver = new ChromeDriver();
				
				// To Load an URL in the opened browser
				driver.get("https://jqueryui.com/selectable/");
				
				// To Maximise the window
				driver.manage().window().maximize();
				
				// Implicit wait
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
		/*
		 * driver.switchTo().frame("demoFrame"); WebElement frameElement =
		 * driver.findElement(By.id("demoFrame")); driver.switchTo().frame(frameElement)
		 */
				driver.switchTo().frame(0);
				WebElement element = driver.findElement(By.xpath("//li[@class='ui-widget-content ui-selectee']"));
				element.click();
				driver.switchTo().defaultContent();
				driver.findElement(By.linkText("Download")).click();
}
}
