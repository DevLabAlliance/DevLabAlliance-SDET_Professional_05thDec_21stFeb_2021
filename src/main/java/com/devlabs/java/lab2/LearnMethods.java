package com.devlabs.java.lab2;

public class LearnMethods {
// Access Modifier Return type method name (Parameters)
	public int addTwoNumbers(int a, int b) {
		int c = 0;
		c = a+b;
		return c;
	}
	private void printCalculatorName() {
		System.out.println("Devlabs Calculator");
	}
	String getCalculatorColor() {
		return "Red";
	}
	public static void main(String[] args) {
		// ClassName object = new Constructor;
		LearnMethods myObject = new LearnMethods();
		
		// object.methodName();
		// object.variableName; 
		int result = myObject.addTwoNumbers(13, 24);
		System.out.println(result);
		
		myObject.printCalculatorName();
		
		String color = myObject.getCalculatorColor();
		System.out.println(color);
	}
	
	
	
	
	
	
	
	
	
	
	
}
