package com.devlabs.testNG.lab2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectGenericWrappers {
	// Global variable for driver
	public RemoteWebDriver driver;

	@Parameters({"url","browserName"})
	@BeforeMethod
	public void openBrowser(String url, String browser) {
		
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if(browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		

		// To Load an URL in the opened browser
		driver.get(url);

		// To Maximise the window
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}
