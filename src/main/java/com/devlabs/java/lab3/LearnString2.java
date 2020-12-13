package com.devlabs.java.lab3;

public class LearnString2 {

	public static void main(String[] args) {
		String txt = "Devlabs alliance";
		String replace = txt.replace('a', '@');
		System.out.println(replace);
		
		String text = "Since 1990";
		String replaceAll = text.replaceAll("\\D", "");
		System.out.println(replaceAll);
	}

}
