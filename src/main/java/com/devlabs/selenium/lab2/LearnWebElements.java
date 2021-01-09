package com.devlabs.selenium.lab2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebElements {
	public static void main(String[] args) {
		
		// Creating an environment for the system to access chrome or any browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		// Open a Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		
		// To Load an URL in the opened browser
		driver.get("https://www.amazon.in/");
		
		// To Maximise the window
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("OnePlus 8",Keys.ENTER);
		
		// To find multiple Elements in a single take
		 List<WebElement> elements = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		
		
		for (WebElement eachElement : elements) {
			System.out.println(eachElement.getText());
		}
	}
}
