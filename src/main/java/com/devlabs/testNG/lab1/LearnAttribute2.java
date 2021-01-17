package com.devlabs.testNG.lab1;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class LearnAttribute2 {
	@Test(priority = -1)
	public void test2() {
		System.out.println("Test 2");
	}

	@Test()
	public void test1() {
		System.out.println("Test 1");
	}
	@Test
	public void test3() {
		System.out.println("Test 3");
	}
}
