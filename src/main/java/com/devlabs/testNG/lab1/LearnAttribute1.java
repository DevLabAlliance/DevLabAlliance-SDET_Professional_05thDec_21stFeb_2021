package com.devlabs.testNG.lab1;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class LearnAttribute1 {
	@Test
	public void test2() {
		System.out.println("Test 2");
	}

	@Test(enabled = false)
	public void test1() {
		System.out.println("Test 1");
	}
	@Ignore
	@Test
	public void test3() {
		System.out.println("Test 3");
	}

}
