package com.devlabs.java.lab2;

public class LearnString {

	public static void main(String[] args) {
		
		String name1 = " DevLabs is in Pune "; // String Literal
		
		String name2 = new String("Devlabs"); // String Object
		
		String lowerCase = name1.toLowerCase();
		System.out.println(lowerCase);
		
		String upperCase = name1.toUpperCase();
		System.out.println(upperCase);
		
		int length = name1.length();
		System.out.println(length);
		
		String trim = name1.trim();
		System.out.println(trim);
		
		String text1 = "Devlabs";
		String text2 = "devlabs";
		
		if(text1.equals(text2)) {
			System.out.println("Text is equal");
		}
		else {
			System.out.println("Text is unequal");
		}
		if(text1.equalsIgnoreCase(text2)) {
			System.out.println("Text is equal");
		}
		else {
			System.out.println("Text is unequal");
		}
		
		String text3 = "Devlabs is in Pune";
		String text4 = "devlabs";
		
		if(text3.contains(text4)) {
			System.out.println("Text available");
		}
		else {
			System.out.println("Text unavailable");
		}
		
		String text5 = "Devlabs";
		for (int i = 0; i < text5.length(); i++) {
			char charAt = text5.charAt(i);
			System.out.println(charAt);
		}
		char[] array1 = text5.toCharArray();
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
		
		String text6 = "Devlabs is in Pune";
		String[] split = text6.split(" ");
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
		
		String txt = "Devlabs";
		String substring = txt.substring(3);
		System.out.println(substring);
		
		String substring2 = txt.substring(1, 5);
		System.out.println(substring2);
		
		String concat = txt.concat(" alliance");
		System.out.println(concat);
		
		String concat1 = txt+" alliance";
		System.out.println(concat1);
		
		boolean startsWith = txt.startsWith("Dev");
		System.out.println(startsWith);
		
		boolean endsWith = txt.endsWith("labs");
		System.out.println(endsWith);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
