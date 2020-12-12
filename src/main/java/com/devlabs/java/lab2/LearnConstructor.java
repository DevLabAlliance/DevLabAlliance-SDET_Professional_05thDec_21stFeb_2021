package com.devlabs.java.lab2;

public class LearnConstructor {

	public LearnConstructor() {
		System.out.println("This is from a constructor");
	}

	public void printMyName() {
		System.out.println("Devlabs");
	}
	public static void main(String[] args) {
		LearnConstructor obj = new LearnConstructor();
		obj.printMyName();
	}
}
