package com.devlabs.serviceNow.pages;

import org.openqa.selenium.By;

import com.devlabs.testNG.lab2.ProjectGenericWrappers;

public class LoginPage extends ProjectGenericWrappers {

	public LoginPage enterUsername(String username) {
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.id("user_name")).sendKeys(username);
		driver.switchTo().defaultContent();
		return this;
	}
	public LoginPage enterPassword(String password) {
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.id("user_password")).sendKeys(password);
		driver.switchTo().defaultContent();
		return this;
	}
	public HomePage clickLoginButton_positive() {
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.id("sysverb_login")).click();
		return new HomePage();
	}
	
	public LoginPage clickLoginButton_negative() {
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.id("sysverb_login")).click();
		return this;
	}
	
	public void resetPassword() {
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.linkText("Forgot Password ?")).click();
	}
}
