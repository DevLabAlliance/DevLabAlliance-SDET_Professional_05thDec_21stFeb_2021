package com.devlabs.java.lab2;

public class LearnAccessModifier {

	public static void main(String[] args) {
		LearnMethods obj = new LearnMethods();
		int result = obj.addTwoNumbers(23, 45);
		System.out.println(result);
		/*
		 * private members can not be accessed outside the class
		 * obj.printCalculatorName();
		 */
		String color = obj.getCalculatorColor();
		System.out.println(color);
	}

}
