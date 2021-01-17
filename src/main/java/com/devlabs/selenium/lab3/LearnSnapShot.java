package com.devlabs.selenium.lab3;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnSnapShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// Creating an environment for the system to access chrome or any browser
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				
				// Open a Chrome Browser
				ChromeDriver driver = new ChromeDriver();
				
				// To Load an URL in the opened browser
				driver.get("https://devlabs-860f0.web.app/aui");
				
				// To Maximise the window
				driver.manage().window().maximize();
				
				// Implicit wait
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				// Finding the object
				WebElement element = driver.findElement(By.id("draggable"));
				
				// Finding the drop point
				WebElement target = driver.findElement(By.id("droppable"));
				
				// Creating an object for the Actions Class
				Actions builder = new Actions(driver);
				
				builder.keyDown(Keys.CONTROL).dragAndDrop(element, target).perform();
				
				//Taking a snap and moving it to the temp
				File temp = driver.getScreenshotAs(OutputType.FILE);
				// Creating an empty image file
				File img = new File("./snaps/img001.png");
				// Paste the clipboard file in the Created image
				FileUtils.copyFile(temp, img);
				
				//Element snap
				File temp1 = target.getScreenshotAs(OutputType.FILE);
				File img1 = new File("./snaps/img002.png");
				FileUtils.copyFile(temp1, img1);
	}

}
