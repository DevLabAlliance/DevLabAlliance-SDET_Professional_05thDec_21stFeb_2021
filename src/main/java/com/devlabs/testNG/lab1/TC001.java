package com.devlabs.testNG.lab1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC001 {
@Test
public void tc001() {
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
		driver.close();
}
}
