package com.devlabs.java.lab5;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractise {
public static void main(String[] args) {
	String text = "java";
	Map<Character,Integer> map = new LinkedHashMap<>();
	for (int i = 0; i < text.length(); i++) {
		char eachCharacter = text.charAt(i);
		if(map.containsKey(eachCharacter)) {
			int value = map.get(eachCharacter)+1;
			map.replace(eachCharacter, value);
		}
		else {
		map.put(eachCharacter, 1);
		}
	}
	System.out.println(map);
}
}
