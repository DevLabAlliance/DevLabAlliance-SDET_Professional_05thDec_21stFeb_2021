package com.devlabs.java.lab3;

public class ChromeBrowser extends BaseClass{
	public void uploadImage() {
		System.out.println("Upload JPG");
	}
	public static void main(String[] args) {
		ChromeBrowser obj1 = new ChromeBrowser();
		BaseClass obj2 = new BaseClass();
		obj1.uploadImage();
		obj2.uploadImage();
	}
}
