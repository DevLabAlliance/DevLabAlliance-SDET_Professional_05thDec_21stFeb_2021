package com.devlabs.selenium.lab2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnTable {
public static void main(String[] args) {
	// Creating an environment for the system to access chrome or any browser
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				
				// Open a Chrome Browser
				ChromeDriver driver = new ChromeDriver();
				
				// To Load an URL in the opened browser
				driver.get("https://erail.in/");
				
				// To Maximise the window
				driver.manage().window().maximize();
				
				// Implicit wait
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				WebElement from = driver.findElement(By.id("txtStationFrom"));
				from.clear();
				from.sendKeys("MS",Keys.TAB);
				
				WebElement to = driver.findElement(By.id("txtStationTo"));
				to.clear();
				to.sendKeys("TPJ",Keys.TAB);
				
				driver.findElement(By.id("chkSelectDateOnly")).click();
				
				WebElement table = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']"));
				
				List<WebElement> rows = table.findElements(By.tagName("tr"));
				
				for (int i = 0; i < rows.size(); i++) {
					WebElement eachRow = rows.get(i);
					List<WebElement> cols = eachRow.findElements(By.tagName("td"));
					if(!cols.get(1).getText().startsWith("M")) {
						System.out.println(cols.get(1).getText()+"->"+cols.get(0).getText());
					}
				}




}
}
