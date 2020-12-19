package com.devlabs.java.lab4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {
public static void main(String[] args) {
	List<String> list = new ArrayList<>();
	list.add("Shobha");
	list.add("Sheena");
	list.add("Elvis");
	list.add("Karthik");
	list.add("Omar");
	list.add("Elvis");
	System.out.println(list.size());
	System.out.println(list);
	for (int i = 0; i < list.size(); i++) {
		System.out.println(list.get(i));		
	}
	for (String eachEntity : list) {
		System.out.println(eachEntity);
	}
	list.set(3, "Balaji");
	list.remove(0);
	list.remove("Karthik");
	System.out.println(list);
	boolean contains = list.contains("Elvis");
	list.clear();
	boolean empty = list.isEmpty();
	Collections.sort(list);
	
	Collections.reverse(list);
	
}
}
