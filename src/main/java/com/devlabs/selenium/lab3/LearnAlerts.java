package com.devlabs.selenium.lab3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlerts {
public static void main(String[] args) {
	// Creating an environment for the system to access chrome or any browser
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
			// Open a Chrome Browser
			ChromeDriver driver = new ChromeDriver();
			
			// To Load an URL in the opened browser
			driver.get("https://devlabs-860f0.web.app/alert");
			
			// To Maximise the window
			driver.manage().window().maximize();
			
			// Implicit wait
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.findElement(By.id("aswdefr")).click();
			
			Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			
			alert.sendKeys("Devlabs");
			
			alert.accept();
			
			//alert.dismiss();
			
			
			
			
			
			
			
			
			
			
			
}
}
