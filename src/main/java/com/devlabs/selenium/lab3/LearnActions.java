package com.devlabs.selenium.lab3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnActions {

	public static void main(String[] args) {
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
		
		WebElement element1 = driver.findElement(By.xpath("//li[@class='ui-widget-content ui-selectee'][1]"));
		WebElement element2 = driver.findElement(By.xpath("//li[@class='ui-widget-content ui-selectee'][2]"));
		WebElement element3 = driver.findElement(By.xpath("//li[@class='ui-widget-content ui-selectee'][3]"));
		WebElement element4 = driver.findElement(By.xpath("//li[@class='ui-widget-content ui-selectee'][4]"));
		
		builder.keyDown(Keys.CONTROL)
		.click(element1)
		.click(element2)
		.click(element3)
		.click(element4)
		.keyUp(Keys.CONTROL)
		.perform();
	}

}
