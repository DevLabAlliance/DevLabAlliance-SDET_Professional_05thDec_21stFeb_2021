package com.devlabs.java.lab3;

public class LearnStatic {
	static int num1 = 5;
	int num2 = 5;
	public void raiseNum1() {
		LearnStatic.num1+=1;
	}
	public void raiseNum2() {
		num2+=1;
	}
public static void main(String[] args) {
	System.out.println("Static value - Initial "+LearnStatic.num1);
	LearnStatic obj = new LearnStatic();
	obj.raiseNum1();
	System.out.println("Static value - After Change "+LearnStatic.num1);
	System.out.println("Non-Static value - Initial "+obj.num2);
	obj.raiseNum2();
	System.out.println("Non-Static value - After Change "+obj.num2);
	
	LearnStatic obj2 = new LearnStatic();
	System.out.println("Non-Static value  "+obj2.num2);
	obj2.raiseNum1();
	System.out.println("Static value - After Change "+LearnStatic.num1);
	
	
	
	
	
	
	
	
	
	
	
	
}
}
