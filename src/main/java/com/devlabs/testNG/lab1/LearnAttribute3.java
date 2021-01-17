package com.devlabs.testNG.lab1;

import org.testng.annotations.Test;

public class LearnAttribute3 {
	@Test(dependsOnMethods = {"com.devlabs.testNG.lab1.LearnAttribute3.test1"},alwaysRun = true)
	public void test2() {
		System.out.println("Test 2");
	}

	@Test()
	public void test1() {
	throw new RuntimeException();
	}
	@Test
	public void test3() {
		System.out.println("Test 3");
	}
}
