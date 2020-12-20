package com.devlabs.java.lab5;

import java.util.*;
import java.util.Map.Entry;

public class LearnMap {
public static void main(String[] args) {
	Map<Integer, String> map = new TreeMap<>();
	map.put(10004, "Sergio");
	map.put(10001, "Karthik");
	map.put(10005, "Sheena");
	map.put(10002, "Elvis");
	map.put(10003, "Shobha");
	map.put(10006, "Balaji");
	map.put(10001, "Dom");
	
	String value = map.get(10001);
	boolean containsKey = map.containsKey(10002);
	boolean containsValue = map.containsValue("Balaji");
	
	map.replace(10005, "Letty");
	Set<Integer> keySet = map.keySet();
	for (Integer eachKey : keySet) {
		System.out.println("Key: "+eachKey+" Values: "+ map.get(eachKey));
	}
	Collection<String> values = map.values();
	System.out.println(map);
	System.out.println(value);
	
	
	
	// Set<Entry<Integer, String>> entrySet = map.entrySet();
	for (Entry<Integer, String> entry : map.entrySet()) {
		System.out.println(entry.getKey()+" -> "+entry.getValue());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
