package com.devlabs.java.lab3;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {	
		
		String[] names = new String[4];
		names[0] = "Shobha";
		names[1] = "Dipendra";
		names[2] = "Sheena";
		names[3] = "Elvis";
		for(String eachName:names) {
			System.out.println(eachName);
		}
		Arrays.sort(names);
		
		System.out.println("_____________________");
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		
		
		/*
		 * String[] names = {"Elvis","Dipendra","Sheena"}; int length = names.length;
		 * for (int i = 0; i < length; i++) { System.out.println(names[i]); }
		 */
		
		
	}

}
